package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.PropertyManager;

public class LoggedInPage extends BasePage{

    public LoggedInPage(WebDriver driver) {
        super(driver);
    }

    By singOutButtonBy = By.id("logout_sidebar_link");
    By menuButtonBy = By.id("react-burger-menu-btn");
    By addItemButtonBy = By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]");
    By addItem2ButtonBy = By.id("add-to-cart-sauce-labs-bike-light");
    By shoppingCartButtonBy = By.xpath("//*[@id=\"shopping_cart_container\"]/a");
    By checkOutButtonBy = By.id("checkout");
    By firstNameButtonBy = By.id("first-name");
    By lastNameButtonBy = By.id("last-name");
    By zipCodeBy = By.id("postal-code");
    By continueButtonBy = By.id("continue");
    By finishButtonBy = By.id("finish");
    By removeItemButtonBy = By.xpath("//*[@id=\"remove-sauce-labs-backpack\"]");

    public LoggedInPage basePage(){
        driver.get(PropertyManager.getInstance().getUrl());
        return this;
    }


    public LoggedInPage logout() {
        click(menuButtonBy);
        click(singOutButtonBy);
        return this;
    }

    public void clickAddItem(){
        click(addItemButtonBy);
    }
    public void clickAddItem2(){
        click(addItem2ButtonBy);
    }
    public void clickShoppingCart(){
        click(shoppingCartButtonBy);
    }
    public void clickCheckOut(){
        click(checkOutButtonBy);
    }
    public void clickFirstNameLine(){
        click(firstNameButtonBy);
    }
    public void writeFirstName(String firstName){
        writeText(firstNameButtonBy, firstName);
    }
    public void clickLastNameLine(){
        click(lastNameButtonBy);
    }
    public void writeLastName(String lastName){
        writeText(lastNameButtonBy, lastName);
    }
    public void clickZip(){
        click(zipCodeBy);
    }
    public void writeZip(String zip){
        writeText(zipCodeBy,zip);
    }
    public void clickContinue(){
        click(continueButtonBy);
    }
    public void clickFinish(){
        click(finishButtonBy);
    }
    public void clickRemoveItem(){
        click(removeItemButtonBy);
    }
}
