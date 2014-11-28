package com.citibank.tests;

import com.citibank.testsuites.RegressionTests;
import com.citibank.testsuites.SmokeTests;
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Created by Srikanth on 11/27/14.
 */

@RunWith(Categories.class)
@Categories.IncludeCategory(SmokeTests.class)
@Suite.SuiteClasses({UserLoginTest.class,UserLogoutTest.class,VerifyMenuOptionsTest.class})
public class JunitTestSuite {


}
