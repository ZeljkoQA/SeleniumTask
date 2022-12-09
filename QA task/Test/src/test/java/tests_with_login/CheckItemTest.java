package tests_with_login;

import methods.LoggedInMethods;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.VerificationPage;

public class CheckItemTest extends BaseTestWithLogin{

    @Test
    public void itemCheck(){
        LoggedInMethods loggedInMethods = new LoggedInMethods(driver);
        VerificationPage verificationPage = new VerificationPage(driver);

        loggedInMethods.itemCheck();

        try{
            verificationPage.itemCheck("Sauce Labs Backpack");
            System.out.print("that item");
        }catch (Exception e){
            Assert.fail("not that item");
        }
    }
}
