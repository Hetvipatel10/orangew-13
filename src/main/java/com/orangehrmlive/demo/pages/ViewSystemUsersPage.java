package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ViewSystemUsersPage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public ViewSystemUsersPage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//div[@class='oxd-table-filter-header-title']")
    WebElement SystemUser  ;
    //By SystemUser = By.xpath("//div[@class='oxd-table-filter-header-title']");


    @FindBy(xpath = "//div[@class='oxd-form-row']/div/div/div/div[2]/input")
    WebElement Usernamefiled  ;
    //By Usernamefiled = By.xpath("//div[@class='oxd-form-row']/div/div/div/div[2]/input");



    @FindBy(xpath = "//form[@class='oxd-form']/div[@class='oxd-form-row']/div/div[2]/div/div[2]/div/div")
    WebElement  UserRole ;
    //By UserRole =By.xpath("//form[@class='oxd-form']/div[@class='oxd-form-row']/div/div[2]/div/div[2]/div/div");



    @FindBy(xpath = "//div[@class='oxd-form-row']/div/div[3]/div/div[2]/div/div/input")
    WebElement EmplopyeeName  ;
    //By EmplopyeeName =By.xpath("//div[@class='oxd-form-row']/div/div[3]/div/div[2]/div/div/input");



    @FindBy(xpath = "//form[@class='oxd-form']/div[@class='oxd-form-row']/div/div[4]/div/div[2]/div/div")
    WebElement Status  ;
    // By Status =By.xpath("//form[@class='oxd-form']/div[@class='oxd-form-row']/div/div[4]/div/div[2]/div/div");



    @FindBy(xpath = "//button[text()=' Reset ']")
    WebElement  ResetButton ;
    //By ResetButton = By.xpath("//button[text()=' Reset ']");


    @FindBy(xpath = "//button[text()=' Search '")
    WebElement  SearchButton ;
    //By SearchButton = By.xpath("//button[text()=' Search ']");



    @FindBy(xpath = "//button[text()=' Add ']")
    WebElement AddButton  ;
    //By AddButton = By.xpath("//button[text()=' Add ']");


    @FindBy(xpath = "//div[@class='oxd-table-card']/div/div[6]/div/button[1]/i")
    WebElement DeleteIcon  ;
    //By DeleteIcon = By.xpath("//div[@class='oxd-table-card']/div/div[6]/div/button[1]/i");


    @FindBy(xpath = "//div[@class='orangehrm-modal-footer']/button[2]/i")
    WebElement YesDelete   ;
    //By YesDelete = By.xpath("//div[@class='orangehrm-modal-footer']/button[2]/i");


    @FindBy(xpath = "//div[@class='oxd-table-card-cell-checkbox']/div/label/span/i")
    WebElement  CheckBox  ;
    //By CheckBox = By.xpath("//div[@class='oxd-table-card-cell-checkbox']/div/label/span/i");

    @FindBy(xpath = "//*[@id=\\\"app\\\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[1]/div/div[2]/div/div/div[1]")
    WebElement userrole  ;
    //By userrole = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[1]/div/div[2]/div/div/div[1]");


    @FindBy(xpath = "//span[text()='No Records Found']")
    WebElement NoRecordFound  ;
    //By NoRecordFound =By.xpath("//span[text()='No Records Found']");
    public String VerifySystemUserText(){
        return getTextFromElement(SystemUser);
    }

    public void ClickonAddButton(){
        this.clickOnElement(this.AddButton);
    }

    public void EnterUsern(String user){
        sendTextToElement(Usernamefiled,user);
    }

    public void ClickonUserR( ){
        this.clickOnElement(this.UserRole);
        this.mouseHoverToElement(userrole);
        this.mouseHoverToElement(this.userrole);

    }
    public void EnterEmployeename(String ename){
        sendTextToElement(EmplopyeeName,ename);
    }

    public void Selectsta(String status){
        selectByVisibleTextFromDropDown(Status,status);
    }

    public  void ClickonSearchButton(){
        this.clickOnElement(this.SearchButton);
    }

    public void ClickonResetButton(){
        this.clickOnElement(this.ResetButton);
    }
    public void ClickonCheckBox(){
        this.clickOnElement(this.CheckBox);
    }

    public void ClickOnDeleteIcon(){
        this.clickOnElement(this.DeleteIcon);
    }
    public void ClickOnConfirmDelete(){
        this.clickOnElement(this.YesDelete);
    }

    public String VerifyMsg(){
        return getTextFromElement(NoRecordFound);
    }

}
