Feature: Login
  Scenario: Successful login with valid credentials
    Given user launch browser
    When Open URL "https://parabank.parasoft.com/parabank/index.htm"
    And User enter username as "Asb" and password as "Asb"
    And Click on login button
    Then  User navigate to myaccount page
