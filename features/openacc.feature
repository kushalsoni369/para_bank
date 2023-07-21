Feature: Newaccount
  Scenario: Successful open new account into the application
    Given user launch browser
    When Open URL "https://parabank.parasoft.com/parabank/index.htm"
    And User enter username as "Asb" and password as "Asb"
    And Click on login button
    And Click on open new account link
    And Enter new account information into mandatory fields
    And Click on open new account button
    Then User successfully navigate to account page


