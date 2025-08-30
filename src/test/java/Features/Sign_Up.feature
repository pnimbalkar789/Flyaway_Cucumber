@Sign_Up
Feature: Sign_Up Feature



  Background: 
    Given I have launched the flyaway application
    When I click on the Login Link
    
    
  @sanity 
  Scenario: Sign_up Success
    And I click on signup link
    And I enter the Email "alexp@gmail.com"
    And I enter the pwd "alex@1234"
    And I enter the Confirm pwd "alex@1234"
    And I enter the Name "alex"
    And I enter the Address "132 My Street, Kingston"
    And I enter the City "Newyork"
    And I click on the SignUp Button
    And I click on the login to continue checking flights link
    And I enter the Username "alexp@gmail.com"
    And I enter the Password "alex@1234"
    And I click on the Login Button
    Then I should be able to see the home page "FLYAWAY - DASHBOARD"