package com.herokuapp.internet.testsuite;

import com.herokuapp.internet.pages.LoginPage;
import com.herokuapp.internet.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    LoginPage loginPage = new LoginPage();


    @Test
    public void verifyUserShouldNavigateWithValidCredentials() {
        loginPage.enterUserName("tomsmith");
        loginPage.enterPassword("SuperSecretPassword!");
        loginPage.clickOnLoginButton();
        loginPage.getsecureText();
        String expectedMessage = "Secure Area";
        String actualMessage = loginPage.getsecureText();
        Assert.assertEquals(actualMessage, expectedMessage, "Text is not displyed");

    }

    @Test
    public void verifyTheUsernameErrorMessage() {
        loginPage.enterUserName("tomsmith1");
        loginPage.enterPassword("SuperSecretPassword!");
        loginPage.clickOnLoginButton();
        loginPage.getsecureText();

        String expectedMessage = "Your username is invalid!\n" + "×";
        String actualMessage = loginPage.getUsernameErrorMessage();
        Assert.assertEquals(actualMessage, expectedMessage, "Incorrect text");

    }

    @Test
    public void verifyPasswordErrorMessage() {
        loginPage.enterUserName("tomsmith");
        loginPage.enterPassword("SuperSecretPassword1");
        loginPage.clickOnLoginButton();
        String expectedMessage = "Your password is invalid!\n" + "×";
        String actualMessage = loginPage.getPasswordErrorMessage();
        Assert.assertEquals(actualMessage, expectedMessage, "Message is not displyed");


    }
}
