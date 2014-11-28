package com.citibank.tests;

import com.citibank.pages.*;
import com.citibank.testsuites.SmokeTests;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Srikanth on 11/27/14.
 */
public class UserLoginTest extends AbstractTest{

    @Category(SmokeTests.class)
    @Test
    public void testUserLogin() throws Exception{
        LoginPage lp=tc.clickAcceptButton().clickSignOnButton();
        lp.setUserName("jpt31_7213");
        lp.setPassword("ist123");
        HomePage hp=lp.clickLoginButton().clickCloseTutorialButton();
        Assert.assertTrue(hp.verifyMenuIcon());
    }

}
