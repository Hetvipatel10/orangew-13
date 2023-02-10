package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public LoginPage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(name="username")
    WebElement emailfield;
    //By emailfield = By.name("username");

    @FindBy(name = "password")
    WebElement passwordField;
    //By passwordField = By.name("password");

    @FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")
    WebElement loginButton;
    //By loginButton = By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']");


    @FindBy(xpath = "//h5[text()='Login']")
    WebElement    loginText;
    //By loginText = By.xpath("//h5[text()='Login']");

    public void EnterEmailId(String email) {
        this.sendTextToElement(this.emailfield, email);
    }

    public void EnterPassword(String Password) {
        this.sendTextToElement(this.passwordField, Password);
    }

    public void clickOnLoginButton() {
        this.clickOnElement(this.loginButton);
    }

    public String VerifyLoginButton(String logo){
        return getTextFromElement(loginButton);
    }



    public String VerifyText() {
        return getTextFromElement(loginText);
    }
}
