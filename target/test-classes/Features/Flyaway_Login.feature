@Login
Feature: Login Feature



  Background: 
    Given I have launched the flyaway application
    When I click on the Login Link


  @sanity
  Scenario: Login Failure Scenario using test data as parameter
    And I enter the Username "npravin89@gmail.com"
    And I enter the Password "Abc@12345"
    And I click on the Login Button
    Then I should be able to see the error message "Login failed"
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
