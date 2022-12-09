package tests_with_login;

import methods.LoggedInMethods;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoggedInPage;
import pages.VerificationPage;

public class RemoveItemTest extends BaseTestWithLogin{

    @Test
    public void remove(){

        LoggedInPage loggedInPage = new LoggedInPage(driver);
        VerificationPage verificationPage = new VerificationPage(driver);
        LoggedInMethods loggedInMethods = new LoggedInMethods(driver);

        loggedInMethods.removeItem();

        try{
            verificationPage.itemRemoved("QTY");
            System.out.print("Item removed");
        }catch (Exception e){
            Assert.fail("item not removed");
        }
    }
}
