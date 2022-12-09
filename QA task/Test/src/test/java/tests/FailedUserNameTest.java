package tests;

import methods.LoginMethods;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.VerificationPage;
import utilities.PropertyManager;

public class FailedUserNameTest extends BaseTest{

    @Test
    public void failedLoginName() {
        LoginPage loginPage = new LoginPage(driver);
        LoginMethods loginMethods = new LoginMethods(driver);
        VerificationPage verificationPage = new VerificationPage(driver);

        loginPage.basePage();
        loginMethods.fail(PropertyManager.getInstance().getBlank_name(),PropertyManager.getInstance().getLogin_password());


        try {
            verificationPage.verifyFailedLogin("Epic sadface: Username is required");
            System.out.print("User is not logged in");
        } catch (Exception e) {
            Assert.fail("User is logged in!");
        }
    }
}
