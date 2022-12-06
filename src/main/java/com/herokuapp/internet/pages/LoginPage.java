package com.herokuapp.internet.pages;

import com.herokuapp.internet.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {
    By usernameField = By.id("username");
    By passwordField = By.id("password");
    By loginButton = By.xpath("//button[@type='submit']");
    By secureText = By.xpath("//div[@class='example']//h2");
    By userErrorMessage = By.xpath("//div[@id='flash']");

    By passwordErrorMessage = By.xpath("(//div[@id='flash'])[1]");


    public void enterUserName(String username) {
        sendTextToElement(usernameField, username);

    }

    public void enterPassword(String password) {
        sendTextToElement(passwordField, password);
    }

    public void clickOnLoginButton() {
        clickOnElement(loginButton);

    }

    public String getsecureText() {
        return getTextFormElement(secureText);
    }


    public String getUsernameErrorMessage() {
        return getTextFormElement(userErrorMessage);


    }
    public String getPasswordErrorMessage(){
        return getTextFormElement(passwordErrorMessage);
    }

}