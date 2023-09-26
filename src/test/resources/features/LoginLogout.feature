Feature: demoqa web application

  Background:
    Given user is on the login page

  @AC1
  Scenario:Verification of Login and Logout functions
    When user clicks Login button
    And user enters "username" and "password" and press enters
    Then user sees your name
    When user clicks Logout button
    Then user is on the login Page again

