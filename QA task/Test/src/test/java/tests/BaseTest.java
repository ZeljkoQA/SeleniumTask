package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class BaseTest{

    protected WebDriver driver;

    @BeforeMethod
    public void setup(){

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(new ChromeOptions().addArguments("--disable-notifications").addArguments("--start-maximized"));
        /*WebDriverManager.firefoxdriver().setup();*/
       /* driver = new FirefoxDriver(new FirefoxOptions().addArguments("--disable-notifications").addArguments("--start-maximized"));*/
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @AfterMethod
    public void teardown(){
        driver.quit();
    }
    public WebDriver getDriver(){
        return driver;
    }

}
