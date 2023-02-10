package com.orangehrmlive.demo.testsuite;

import com.orangehrmlive.demo.pages.HomePage;
import com.orangehrmlive.demo.pages.LoginPage;
import com.orangehrmlive.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {
    LoginPage loginPage;

    HomePage homepage;


    @BeforeMethod
    public void inIt(){
        loginPage=new LoginPage();
        homepage = new HomePage();


    }
    @Test
    public void verifyUserShouldLoginSuccessFully(){
        loginPage.EnterEmailId("Admin");
        loginPage.EnterPassword("admin123");
        loginPage.clickOnLoginButton();

    }

    @Test
    public  void verifyThatTheLogoDisplayOnHomePage(){
        loginPage.EnterEmailId("Admin");
        loginPage.EnterPassword("admin123");
        loginPage.clickOnLoginButton();

    }

    @Test
    public void verifyUserShouldLogOutSuccessFully(){
        loginPage.EnterEmailId("Admin");
        loginPage.EnterPassword("admin123");
        loginPage.clickOnLoginButton();
        homepage.ClickonProfile();
        homepage.mousehover();
        homepage.ClickonLogout();
        String actual=loginPage.VerifyText();
        String expected= "Login";
        Assert.assertEquals(expected, loginPage.VerifyText());

    }
}
