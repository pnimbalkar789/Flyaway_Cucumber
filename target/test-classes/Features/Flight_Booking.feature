@Flight_booking
Feature: Flight_Booking Feature



  Background: 
    Given I have launched the flyaway application
    When I click on the Login Link
    
    
  @sanity 
   Scenario:  To check My booking scenario 
    And I enter the Username "npravin89@gmail.com"
    And I enter the Password "flyaway@12"
    And I click on the Login Button
    Then I should be able to see the home page "FLYAWAY - DASHBOARD"
    And I click on Your Booking link
    Then I should be able to see the source as "Bangalore"
    And I should be able to see the destination as "Chennai"
    
 
   @sanity 
   Scenario:  To check My booking scenario 
    And I enter the Username "npravin89@gmail.com"
    And I enter the Password "flyaway@12"
    And I click on the Login Button
    Then I should be able to see the home page "FLYAWAY - DASHBOARD"
    And I click on Your Booking link
    Then I should be able to see the source as "Bangalore"
    And I should be able to see the destination as "Chennai"
    
  
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    