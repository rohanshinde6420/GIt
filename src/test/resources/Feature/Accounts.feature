Feature: NewAccount_Functionality

  Background:
    Given user is on login page
    When user enters valid credentials and click on login

@Acct
  Scenario: New_Account_Creation_TC_02

    When Click on New Accounts link and  Enter Account Name and  Click on Save button
    Then New account should get created
