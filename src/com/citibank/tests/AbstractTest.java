package com.citibank.tests;

import com.citibank.pages.LoginPage;
import com.citibank.pages.TermsAndConditionsPage;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.uiautomation.ios.IOSCapabilities;
import org.uiautomation.ios.IOSServer;
import org.uiautomation.ios.IOSServerConfiguration;

import java.net.URL;
import java.util.concurrent.TimeUnit;

/**
 * Created by Srikanth on 11/27/14.
 */
public class AbstractTest {


    private static final String[] args = {"-port", "4444", "-host", "localhost","-aut",System.getProperty("user.dir")+"/resources/R1GM225V05SIT.app"};
    private static final IOSServerConfiguration config = IOSServerConfiguration.create(args);
    private static final String url = "http://" + config.getHost() + ":" + config.getPort() + "/wd/hub";
    public static RemoteWebDriver driver;

    private static IOSServer server;
    private static DesiredCapabilities cap;
    protected static TermsAndConditionsPage tc;

    @BeforeClass
    public static void createEnvironment() throws Exception{
        stopIOSServer();
        startIOSServer();
        cap= IOSCapabilities.iphone("R1GM225V05SIT");
        cap.setCapability(IOSCapabilities.LANGUAGE,"en-US");
        driver=new RemoteWebDriver(new URL(url),cap);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        tc=PageFactory.initElements(driver,TermsAndConditionsPage.class);
    }

    @AfterClass
    public static void tearEnvironment(){
        driver.quit();
        stopIOSServer();
    }

    private static void startIOSServer() throws Exception {
        server = new IOSServer(config);
        server.start();
    }

    private static void stopIOSServer() {
        if (server != null) {
            try {
                server.stop();
            } catch (Exception e) {
                System.err.println("cannot stop IOServer propery: " + e);
            }
            server = null;
        }
    }

}
