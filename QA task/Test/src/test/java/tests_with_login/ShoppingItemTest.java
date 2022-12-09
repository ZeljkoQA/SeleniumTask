package tests_with_login;

import methods.LoggedInMethods;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.VerificationPage;
import utilities.PropertyManager;

public class ShoppingItemTest extends BaseTestWithLogin{

    @Test
    public void buyItem(){
        LoggedInMethods loggedInMethods = new LoggedInMethods(driver);
        VerificationPage verificationPage = new VerificationPage(driver);


        loggedInMethods.buyItem(PropertyManager.getInstance().getFirstName(),PropertyManager.getInstance().getLastName(),PropertyManager.getInstance().getZip());


        try{
            verificationPage.successfulShopping("THANK YOU FOR YOUR ORDER");
            System.out.print("User is logged out!!");
        }catch (Exception e){
            Assert.fail("User is not logged out");
        }
    }
}
