package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddUserPage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public AddUserPage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//div[@class='oxd-form-row']/div/div[1]/div/div[2]/div/div/div")
    WebElement UserRoleDropDown;
    //By UserRoleDropDown = By.xpath("//div[@class='oxd-form-row']/div/div[1]/div/div[2]/div/div/div");


    @FindBy(xpath = "//div[@class='oxd-select-wrapper']/child::div/div[text()='Admin']")
    WebElement userrole;
    //By userrole = By.xpath("//div[@class='oxd-select-wrapper']/child::div/div[text()='Admin']");

    @FindBy(xpath = "//div[@class='oxd-form-row']/div/div[2]/div/div[2]/div/div/input")
    WebElement EmployeeName;
    //By EmployeeName =By.xpath("//div[@class='oxd-form-row']/div/div[2]/div/div[2]/div/div/input");


    @FindBy(xpath = "//div[@class='oxd-form-row']/div/div[3]/div/div[2]/div/div/div[2]/i")
    WebElement Status;
    //By Status = By.xpath("//div[@class='oxd-form-row']/div/div[3]/div/div[2]/div/div/div[2]/i");

    @FindBy(xpath = "//div[@class='oxd-form-row']/div/div[4]/div/div[2]/input")
    WebElement Username;
    //By Username =By.xpath("//div[@class='oxd-form-row']/div/div[4]/div/div[2]/input");


    @FindBy(xpath = "//div[@class='oxd-form-row user-password-row']//div[@class='oxd-grid-2 orangehrm-full-width-grid']/div[1]/div/div[2]/input")
    WebElement Password;
    //By Password =By.xpath("//div[@class='oxd-form-row user-password-row']//div[@class='oxd-grid-2 orangehrm-full-width-grid']/div[1]/div/div[2]/input");


    @FindBy(xpath = "//div[@class='oxd-form-row user-password-row']//div[@class='oxd-grid-2 orangehrm-full-width-grid']/div[2]/div/div[2]/input")
    WebElement ConfirmPassword;
    // By ConfirmPassword=By.xpath("//div[@class='oxd-form-row user-password-row']//div[@class='oxd-grid-2 orangehrm-full-width-grid']/div[2]/div/div[2]/input");


    @FindBy(xpath = "//div[@class='oxd-form-actions']/button[1]")
    WebElement CancelButton;
    //By CancelButton =By.xpath("//div[@class='oxd-form-actions']/button[1]");


    @FindBy(xpath = "//div[@class='oxd-form-actions']/button[1]")
    WebElement SaveButton;
    //By SaveButton =By.xpath("//div[@class='oxd-form-actions']/button[1]");


    @FindBy(xpath = "//div[@class='oxd-layout-context']/div/div/h6")
    WebElement AddUSerText;
    //By AddUSerText =By.xpath("//div[@class='oxd-layout-context']/div/div/h6");


    @FindBy(xpath = "//div[@class='oxd-select-text oxd-select-text--active']/div[text()='Enabled']")
    WebElement Enable;
    //By Enable =By.xpath("//div[@class='oxd-select-text oxd-select-text--active']/div[text()='Enabled']");
    public String VerifyAddUSerText(){
        return getTextFromElement(AddUSerText);
    }

    public void ClickUserr(){
        this.clickOnElement(UserRoleDropDown);
    }

    public void ClickonAdmin(){
        this.clickOnElement(userrole);
    }

    public void EnterEmployeeName(String email){
        sendTextToElement(EmployeeName,email);
    }

    public void ClickonStatus(){
        this.clickOnElement(this.Status);
        this.mouseHoverToElement(Enable);
        this.clickOnElement(this.Enable);
    }

    public void Enterpassword(String pass){
        sendTextToElement(Password,pass);
    }

    public void EnterConfirmpassword(String password){
        sendTextToElement(ConfirmPassword,password);
    }

    public  void ClickonSaveButton(){
        this.clickOnElement(this.SaveButton);
    }
    public void EnterUsername(String uname){
        sendTextToElement(Username,uname);
    }

    public void ClickonUserrole(){
        this.clickOnElement(this.UserRoleDropDown);
        this.mouseHoverToElement(userrole);
        this.clickOnElement(this.userrole);

    }

    public void mousehover(){

        this.mouseHoverToElement(this.userrole);
    }
}
