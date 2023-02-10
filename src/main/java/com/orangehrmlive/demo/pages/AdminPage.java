package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminPage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public AdminPage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//span[text()='User Management ']")
    WebElement UserManagement;
    //By UserManagement = By.xpath("//span[text()='User Management ']");


    @FindBy(xpath = "//span[text()='Job ']")
    WebElement Job;
    //By Job = By.xpath("//span[text()='Job ']");


    @FindBy(xpath = "//span[text()='Organization ']")
    WebElement Organization;
    //By Organization = By.xpath("//span[text()='Organization ']");

    public void ClickonUserManagement(){
        this.clickOnElement(this.UserManagement);
    }

}
