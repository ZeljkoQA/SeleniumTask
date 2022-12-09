package tests_with_login;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoggedInPage;
import pages.VerificationPage;

public class LogOutTest extends BaseTestWithLogin{

    @Test
    public void logout(){
        LoggedInPage loggedInPage = new LoggedInPage(driver);
        VerificationPage verificationPage = new VerificationPage(driver);

        loggedInPage.logout();

        try{
            verificationPage.verifyLogout("Password for all users:");
            System.out.print("User is logged out!!");
        }catch (Exception e){
            Assert.fail("User is not logged out");
        }
    }
}
