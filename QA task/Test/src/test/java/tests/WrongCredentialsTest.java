package tests;

import methods.LoginMethods;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.VerificationPage;
import utilities.PropertyManager;

public class WrongCredentialsTest extends BaseTest{

    @Test
    public void failedLoginAll() {
        LoginPage loginPage = new LoginPage(driver);
        LoginMethods loginMethods = new LoginMethods(driver);
        VerificationPage verificationPage = new VerificationPage(driver);

        loginPage.basePage();
        loginMethods.failAll(PropertyManager.getInstance().getWrongName(),PropertyManager.getInstance().getWrongPassword());


        try {
            verificationPage.verifyFailedLogin("Epic sadface: Username and password do not match any user in this service");
            System.out.print("User is not logged in");
        } catch (Exception e) {
            Assert.fail("User is logged in!");
        }
    }
}
