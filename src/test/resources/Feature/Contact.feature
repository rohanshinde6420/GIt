Feature: New Contact Functionality


  Background:
    Given user is on login page
    When user enters valid credentials and click on login
  @xyz
  Scenario: Create_Contact_with_mandatory_fields_TC04

    When user click on new contact
    And user enters last name and click on save button
    Then lead should be created successfully