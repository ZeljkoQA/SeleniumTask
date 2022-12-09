package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.PropertyManager;

public class LoginPage extends  BasePage{

    public LoginPage(WebDriver driver){
        super(driver);
    }
    By userNameInputField = By.id("user-name");
    By passwordInputField = By.id("password");
    By clickOnLoginButtonBy = By.id("login-button");

    public LoginPage basePage(){
        driver.get(PropertyManager.getInstance().getUrl());
        return this;
    }

    public void writeLoginName(String name){
        writeText(userNameInputField,name);
    }
    public void writeLoginPassword(String password){
        writeText(passwordInputField,password);
    }
    public void clickOnNameLine(){
        click(clickOnLoginButtonBy);
    }
    public void clickOnPasswordLine(){
        click(passwordInputField);
    }
    public void clickOnLogInButton(){
        click(clickOnLoginButtonBy);
    }
    public void leaveNameBlank(String empty_name) {
        writeText(userNameInputField, empty_name);
    }
    public void leavePasswordBlank(String empty_password) {
        writeText(passwordInputField, empty_password);
    }
}
