package com.citibank.tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Created by Srikanth on 11/27/14.
 */

@RunWith(Suite.class)
@Suite.SuiteClasses({
        UserLoginTest.class,
        UserLogoutTest.class,
        VerifyMenuOptionsTest.class
})
public class JunitTestSuite {


}
