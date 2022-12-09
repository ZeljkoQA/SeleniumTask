package methods;

import org.openqa.selenium.WebDriver;
import pages.LoginPage;

public class LoginMethods extends LoginPage{

    public LoginMethods(WebDriver driver){
        super(driver);
    }
    public LoginMethods login(String name, String password) {
        clickOnNameLine();
        writeLoginName(name);
        clickOnPasswordLine();
        writeLoginPassword(password);
        clickOnLogInButton();
        return this;
    }

    public LoginMethods fail(String empty_name, String password) {
        clickOnNameLine();
        leaveNameBlank(empty_name);
        clickOnPasswordLine();
        writeLoginPassword(password);
        clickOnLogInButton();
        return this;
    }

    public LoginMethods failPassword(String name, String empty_password) {
        clickOnNameLine();
        writeLoginName(name);
        clickOnNameLine();
        leavePasswordBlank(empty_password);
        clickOnLogInButton();
        return this;
    }

    public LoginMethods failAll(String wrongName, String wrongPassword) {
        clickOnNameLine();
        writeLoginName(wrongName);
        clickOnPasswordLine();
        writeLoginPassword(wrongPassword);
        clickOnLogInButton();
        return this;
    }
}
