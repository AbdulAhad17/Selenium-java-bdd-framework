package com.example.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import static com.example.definitions.Login.driver;

import java.io.IOException;

public class loginPage{

    //Locator for username field
    By uName = By.id("user-name");

    //Locator for password field
    By pswd = By.id("password");

    //Locator for login button
    By loginBtn = By.id("login-button");



    //Method to enter username
    public void enterUsername(String user) {
        driver.findElement(uName).sendKeys(user);
    }

    //Method to enter password
    public void enterPassword(String pass) {
        driver.findElement(pswd).sendKeys(pass);
    }

    //Method to click on Login button
    public void clickLogin() {
        driver.findElement(loginBtn).click();
    }
}
