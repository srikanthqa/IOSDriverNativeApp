package com.citibank.tests;


import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Created by Srikanth on 11/27/14.
 */
interface RegressionTests {
}

interface SmokeTests{
}


@RunWith(Categories.class)
@Categories.IncludeCategory(SmokeTests.class)
@Suite.SuiteClasses({UserLoginTest.class,UserLogoutTest.class,VerifyMenuOptionsTest.class})
public class JunitTestSuite {


}
