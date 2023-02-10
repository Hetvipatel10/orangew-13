package com.orangehrmlive.demo.testsuite;

import com.orangehrmlive.demo.pages.*;
import com.orangehrmlive.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UsersTest extends TestBase {
    LoginPage loginPage;

    AddUserPage addUserPage;

    HomePage homePage;
    ViewSystemUsersPage viewSystemUsersPage;
    Dashboardpage dashboardPage;
    AdminPage adminPage;

    @BeforeMethod
    public void inIt(){
        loginPage=new LoginPage();
        addUserPage=new AddUserPage();
        homePage = new HomePage();
        viewSystemUsersPage=new ViewSystemUsersPage();
        dashboardPage=new Dashboardpage();
        adminPage=new AdminPage();

    }


    @Test
    public void adminShouldAddUserSuccessFully(){
        loginPage.EnterEmailId("Admin");
        loginPage.EnterPassword("admin123");
        loginPage.clickOnLoginButton();
        homePage.ClickonAdminLink();
        String expected="System Users";
        Assert.assertEquals(expected, viewSystemUsersPage.VerifySystemUserText());
        viewSystemUsersPage.ClickonAddButton();
        String expectedadduser="Add User";
        Assert.assertEquals(expectedadduser, addUserPage.VerifyAddUSerText());
        addUserPage.ClickonUserrole();
        addUserPage.EnterEmployeeName("Ananya Dash");
        addUserPage.EnterUsername("maonfpd");
        addUserPage.ClickonStatus();
        addUserPage.Enterpassword("Mona@1234");
        addUserPage.EnterConfirmpassword("Mona@1234");
        addUserPage.ClickonSaveButton();
    }

    @Test
    public void searchTheUserCreatedAndVerifyIt(){
        loginPage.EnterEmailId("Admin");
        loginPage.EnterPassword("admin123");
        loginPage.clickOnLoginButton();
        homePage.ClickonAdminLink();
        String expected="System Users";
        Assert.assertEquals(expected, viewSystemUsersPage.VerifySystemUserText());
        viewSystemUsersPage.EnterUsern("testing");
        viewSystemUsersPage.ClickonUserR();
        viewSystemUsersPage.Selectsta("Enabled");
        viewSystemUsersPage.ClickonSearchButton();
    }

    @Test
    public void verifyThatAdminShouldDeleteTheUserSuccessFully(){
        loginPage.EnterEmailId("Admin");
        loginPage.EnterPassword("admin123");
        loginPage.clickOnLoginButton();
        homePage.ClickonAdminLink();
        String expected="System Users";
        Assert.assertEquals(expected, viewSystemUsersPage.VerifySystemUserText());
        viewSystemUsersPage.EnterUsern("testing");
        viewSystemUsersPage.ClickonUserR();
        viewSystemUsersPage.Selectsta("Enabled");
        viewSystemUsersPage.ClickonSearchButton();

    }

    @Test
    public void searchTheDeletedUserAndVerifyTheMessageNoRecordFound(){
        loginPage.EnterEmailId("Admin");
        loginPage.EnterPassword("admin123");
        loginPage.clickOnLoginButton();
        homePage.ClickonAdminLink();
        String expected="System Users";
        Assert.assertEquals(expected, viewSystemUsersPage.VerifySystemUserText());
        viewSystemUsersPage.EnterUsern("testing");
        viewSystemUsersPage.ClickonUserR();
        viewSystemUsersPage.Selectsta("Enabled");
        viewSystemUsersPage.ClickonSearchButton();

    }
}
