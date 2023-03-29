Feature: Login to HRM Application

  Background:
    Given User is on saucedemoLogin page "https://www.saucedemo.com/"

  @ValidCredentials
  Scenario: Login with valid credentials
    And Enter username "standard_user" and Password "secret_sauce"
    When clicks on login button
    Then then user should logged in successfully