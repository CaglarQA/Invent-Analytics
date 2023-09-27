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


   @AC2
   Scenario: Search Book
     When user clicks Login button
     And user enters "username" and "password" and press enters
     Then user sees your name
     When user enters "keyword" in the search box
     Then user see the book containing "keyword"


     @AC3
     Scenario: Add and Delete Book
       When user clicks Login button
       And user enters "username" and "password" and press enters
       Then user sees your name
       When user enters "keyword" in the search box
       Then user see the book containing "keyword"
       When user clicks on the book
       And user add book
       And user returns to the bookstore
       When user enters again "secondkeyword" in the search box
       Then user see  again the book containing "secondkeyword"
       When user clicks on the book
       And user add book
       And user goes its profile
       Then user is on the profile page
       And user sees selectedbooks
       When user deletes all books

      @AC4
      Scenario: Change Row-Number
        When user clicks Login button
        And user enters "username" and "password" and press enters
        And user goes its profile
        Then user is on the profile page
        When user changes rows








