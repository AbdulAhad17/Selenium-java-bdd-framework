package com.example.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import static com.example.definitions.Login.driver;

public class homePage {

    By swaglab = By.xpath("//*[@id=\"header_container\"]/div[1]/div[2]/div");
    By add_cart = By.id("add-to-cart-sauce-labs-backpack");
    public By filter_product = By.xpath("//*[@data-test=\"product_sort_container\"]");
    By Remove_button = By.id("remove-sauce-labs-backpack");

    //Method to capture the page heading
    public String getHeading() {
        String head = driver.findElement(swaglab).getText();
        return head;
    }

    //Method to Add the Product to the cart
    public void add_cart() {
        driver.findElement(add_cart).click();
    }

    //Method to Verify the product added successfully in to the cart
    public String verifyAddCart() {
        String verify_cart_product = driver.findElement(Remove_button).getText();
        return verify_cart_product;

    }

    //Method to select the value from the dropdown
    public void selectValuefromDropdownviaIndex(By filter_product, int valueToBeSelectedindex){
        Select selectFromDropdown = new Select(driver.findElement(this.filter_product));
        selectFromDropdown.selectByIndex(valueToBeSelectedindex);

    }
}
