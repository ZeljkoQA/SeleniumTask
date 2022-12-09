package tests;

import methods.LoginMethods;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.VerificationPage;
import utilities.PropertyManager;

public class FailedPasswordTest extends BaseTest{

    @Test
    public void failedLoginPassword() {
        LoginPage loginPage = new LoginPage(driver);
        LoginMethods loginMethods = new LoginMethods(driver);
        VerificationPage verificationPage = new VerificationPage(driver);

        loginPage.basePage();
        loginMethods.failPassword(PropertyManager.getInstance().getLogin_name(),PropertyManager.getInstance().getBlank_password());


        try {
            verificationPage.verifyFailedLogin("Epic sadface: Password is required");
            System.out.print("User is not logged in");
        } catch (Exception e) {
            Assert.fail("User is logged in!");
        }
    }
}
