package methods;

import org.openqa.selenium.WebDriver;
import pages.LoggedInPage;

public class LoggedInMethods extends LoggedInPage{

    public LoggedInMethods(WebDriver driver){
        super(driver);
    }
    public LoggedInMethods buyItem(String firstName, String lastName,String zip){

        clickAddItem();
        clickAddItem2();
        clickShoppingCart();
        clickCheckOut();
        clickFirstNameLine();
        writeFirstName(firstName);
        clickLastNameLine();
        writeLastName(lastName);
        clickZip();
        writeZip(zip);
        clickContinue();
        clickFinish();
        return this;
    }
    public LoggedInMethods removeItem(){
        clickAddItem();
        clickShoppingCart();
        clickRemoveItem();
        return this;
    }
    public LoggedInMethods itemCheck(){
        clickAddItem();
        clickShoppingCart();
        return this;
    }
}
