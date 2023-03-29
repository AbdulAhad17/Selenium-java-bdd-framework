package com.example.definitions;

import java.io.IOException;
import java.time.Duration;

import com.example.Pages.loginPage;
import com.example.Pages.homePage;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.annotations.BeforeTest;


public class Login {

    loginPage login = new loginPage();
    homePage home = new homePage();
    public static WebDriver driver;
    public final static int TIMEOUT = 10;

    @Before
    public void setUp() {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUT));
        driver.manage().window().maximize();
    }



    @Given("User is on saucedemoLogin page \"([^\"]*)\"$")
    public void loginTest(String url) throws InterruptedException {
        driver.get(url);
        Thread.sleep(50);
    }



    @And("Enter username {string} and Password {string}")
    public void enterUsernameAndPassword(String usr, String pwd) throws Throwable {
        // login.waitForPageToLoad(login.getTitle());
        // login.waitForVisibility(login.login_user);
        Thread.sleep(50);
        login.enterUsername(usr);
        login.enterPassword(pwd);
        Thread.sleep(50);
    }

    @After
    public void teardown() {

        driver.quit();
    }


    @When("clicks on login button")
    public void clicksOnLoginButton() {
        login.clickLogin();
    }

    @Then("then user should logged in successfully")
    public void thenUserShouldLoggedInSuccessfully() throws InterruptedException {
        String homePageHeading = home.getHeading();
        Assert.assertEquals(homePageHeading, "Swag Labs");

        Thread.sleep(100);
    }
}
