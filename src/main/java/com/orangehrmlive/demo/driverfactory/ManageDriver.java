package com.orangehrmlive.demo.driverfactory;

import com.orangehrmlive.demo.propertyreader.PropertyReader;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class ManageDriver {
    public static WebDriver driver;
    public String baseUrl = PropertyReader.getInstance().getProperty("baseUrl");
    public ManageDriver(){
        PageFactory.initElements(driver,this);
       // PropertyConfigurator.configure(System.getProperty("user.dir")+"/src/test/java/resources/propertiesfile/log4j2.properties");
    }
    public void TestMaven()
    {
        WebDriverManager.chromedriver().setup();
        System.setProperty("webdriver.chrome.driver", "C:\\Homework\\orange13\\src\\main\\java\\com\\orangehrmlive\\demo\\webdriver\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("http://testng.org/doc/maven.html");
        driver.manage().window().maximize();
    }


    public void selectBrowser(String browser) {
        if (browser.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("ie")) {
            WebDriverManager.iedriver().setup();
            driver = new InternetExplorerDriver();
        } else {
            System.out.println("Wrong browser name");
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get(baseUrl);
    }

    public void closeBrowser() {
        if (driver != null) {
            driver.quit();
        }
    }
}
