#Login feature that describe the login scenario and steps

@LoginFeature
Feature: Login
    @Login_scenario
    Scenario: Login to Citrii
      Given I launch the citrii browser
      And i enter the username
      And i enter the password
      Then i click on Login button

    @Close_Browser
    Scenario: Close Browser
      Given I verified the error message
      Then I click on the close browser button
