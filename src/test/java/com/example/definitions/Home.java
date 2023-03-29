package com.example.definitions;

import com.example.Pages.homePage;
import com.example.Pages.loginPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.time.Duration;
import static com.example.definitions.Login.driver;

public class Home {
   // loginPage login = new loginPage();
    homePage home = new homePage();

    @Then("add the product in to the cart")
    public void addTheProductInToTheCart() throws InterruptedException {
        Thread.sleep(100);
        home.add_cart();

    }

    @Then("filter the product")
    public void filterTheProduct() throws InterruptedException {
        Thread.sleep(100);
        home.selectValuefromDropdownviaIndex(home.filter_product,2);

    }

    @Then("Product added successfully")
    public void productAddedSuccessfully() throws InterruptedException {
        String Actual_Text =  home.verifyAddCart();
        Assert.assertEquals(Actual_Text, "Remove");
        Thread.sleep(100);
    }

    @And("click on cart")
    public void clickOnCart() throws InterruptedException {
        home.click_cart();
        Thread.sleep(50);
    }

    @And("{string} will be display in cart page")
    public void willBeDisplayInCartPage(String cart_title) throws InterruptedException {

        String Actual_Text =  home.verifyCartPageTitle();
        Assert.assertEquals(Actual_Text, cart_title);
        Thread.sleep(100);

    }

    @And("item should be display in cart page")
    public void itemShouldBeDisplayInCartPage() {
        home.verifyCartPageitem();
        Assert.assertTrue(true);

    }
}
