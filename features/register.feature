Feature: Register
  Scenario: Successful Register into the application
    Given user launch browser
    When Open URL "https://parabank.parasoft.com/parabank/index.htm"
    And Click on Register link
    And Enter information into mandatory fields username as "<firstname>" and "<lastname>" and "<address>" and "<city>" and "<state>" and "<zipcode>" and "<phone>" and "<ssn>" and "<username>" and "<password>" and "<conpassword>"
    And Click on register button
    Then User successfully navigate to myaccount page

    Examples:
    | firstname | lastname  | address | city  | state | zipcode | phone | ssn | username  | password  | conpassword |
    | ssss      | ssss      | ssss    | ssss  | ssss  | 0000    | 1234  | 011 | Asd       | Asc       | Asc         |
    | dddd      | dddd      | dddd    | dddd  | dddd  | 0012    | 1221  | 012 | Asb       | Asb       | Asb         |



