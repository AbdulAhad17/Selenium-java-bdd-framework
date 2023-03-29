
Feature: Cart

  Background:
    Given User is on saucedemoLogin page "https://www.saucedemo.com/"

@AddToCart
Scenario: Add the product in to the cart
And Enter username "standard_user" and Password "secret_sauce"
When clicks on login button
Then add the product in to the cart
Then Product added successfully


@FilterProduct
Scenario: filter the Product
And Enter username "standard_user" and Password "secret_sauce"
When clicks on login button
Then filter the product
