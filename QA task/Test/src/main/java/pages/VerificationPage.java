package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class VerificationPage extends BasePage{

    public VerificationPage(WebDriver driver) {
        super(driver);
    }
    By errorNotificationBy = By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]/h3");
    By signOutButtonBy = By.className("logout");
    By signInButtonBy = By.className("login");
    By menuButtonBy = By.id("react-burger-menu-btn");
    By headerDisplay = By.xpath("/html/body/div/div/div/div[1]/div[2]/span");
    By startPage = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div[2]/h4");
    By endPage = By.xpath("//*[@id=\"checkout_complete_container\"]/h2");
    By qty = By.xpath("//*[@id=\"cart_contents_container\"]/div/div[1]/div[1]");
    By itemCheck = By.xpath("/html/body/div/div/div/div[2]/div/div[1]/div[3]/div[2]/a/div");

    public VerificationPage verifyFailedLogin(String expectedText){
        String alert = readText(errorNotificationBy);
        assertStringEquals(alert, expectedText);
        return this;
    }
    public VerificationPage verifyLogin(String expectedText){
        String header = readText(headerDisplay);
        assertStringEquals(header,expectedText);
        return this;
    }
    public VerificationPage verifyLogout(String expectedText){
        String start = readText(startPage);
        assertStringEquals(start, expectedText);
        return this;
    }
    public VerificationPage successfulShopping(String expectedText){
        String end = readText(endPage);
        assertStringEquals(end,expectedText);
        return this;
    }
    public VerificationPage itemRemoved(String expectedText){
        String empty = readText(qty);
        assertStringEquals(empty,expectedText);
        return this;
    }
    public VerificationPage itemCheck(String expectedText){
        String check = readText(itemCheck);
        assertStringEquals(check, expectedText);
        return this;
    }
}
