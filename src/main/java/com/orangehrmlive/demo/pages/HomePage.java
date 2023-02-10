package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage(){
        PageFactory.initElements(driver,this);
    }


    //By logoLink= By.xpath("//img[@alt='profile picture']");


    @FindBy(xpath = "//div[@class='oxd-sidepanel-body']/ul/li[1]/a")
    WebElement AdminLink;
    //By AdminLink=By.xpath("//div[@class='oxd-sidepanel-body']/ul/li[1]/a");


    @FindBy(xpath = "//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name']")
    WebElement PimLink;
    //By PimLink=By.xpath("//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name']");

    @FindBy(xpath = "//a[@class='oxd-main-menu-item']")
    WebElement LeaveLink;
    //By LeaveLink=By.xpath("//a[@class='oxd-main-menu-item']");

    @FindBy(xpath = "//a[@class='oxd-main-menu-item active']")
    WebElement DashboardLink;
    //By DashboardLink=By.xpath("//a[@class='oxd-main-menu-item active']");


    @FindBy(xpath = "//header[@class='oxd-topbar']/div/div[2]/ul/li/span")
    WebElement Profile;
    //By Profile = By.xpath("//header[@class='oxd-topbar']/div/div[2]/ul/li/span");

    @FindBy(xpath = "//header[@class='oxd-topbar']/div/div[2]/ul/li/ul/li[4]/a")
    WebElement LogoutLink;
    //By LogoutLink =By.xpath("//header[@class='oxd-topbar']/div/div[2]/ul/li/ul/li[4]/a");


    public void ClickonAdminLink(){
        this.clickOnElement(this.AdminLink);
    }
    public void ClickonPimLink(){

        this.clickOnElement(this.PimLink);
    }
    public void ClickonLeaveLink(){
        this.clickOnElement(this.LeaveLink);
    }
    public void ClickonDashboardLink(){
        this.clickOnElement(this.DashboardLink);
    }

    public void ClickonProfile(){
        this.clickOnElement(this.Profile);
    }

    public void ClickonLogout(){
        this.clickOnElement(this.LogoutLink);
    }

    public void mousehover(){

        this.mouseHoverToElement(this.LogoutLink);
    }

}
