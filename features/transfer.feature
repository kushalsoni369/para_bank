Feature: TransferFund
  Scenario: Transfer fund from one account to other
    Given user launch browser
    When Open URL "https://parabank.parasoft.com/parabank/index.htm"
    And User enter username as "Asb" and password as "Asb"
    And Click on login button
    And Click on Transfer Fund link
    And Enter fund transfer details into mandatory fields
    And Click on transfer button
    Then Successfully transfer from one account to other


