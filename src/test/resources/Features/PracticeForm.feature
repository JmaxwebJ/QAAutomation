@OverAll
Feature: Student Register Form
  
  As a student 
  I want to register into portal 
  So that I can register myself

 @Gpay
  Scenario Outline: case 1
    Given User is on registration page "https://demoqa.com/automation-practice-form"
    And User enters firstName as "Nitin", Last name as "Singh" and email as "Nitin@gmail.com"
    When User click on gender as "Female"
    And Enter Mobile number as "8557037939"
    And User Enters Subject as "<Subject>", Hobbies as "<Hobbies>", Select Date and address as "<Address>"
    And Upload the picture
    And Select state as "NCR" and city as "Delhi"
    And Click on the submit button
    Then User should register successfully into the portal

    Examples: 
      | Subject |  | Hobbies |  | Address  |
      | Maths   |  | Reading |  | Homeland |
      
   @SmokeTest
  Scenario Outline: case 2
    Given User is on registration page "https://demoqa.com/automation-practice-form"
    And User enters firstName as "Nitin", Last name as "Singh" and email as "Nitin@gmail.com"
    When User click on gender as "Female"
    And Enter Mobile number as "8557037939"
    And User Enters Subject as "<Subject>", Hobbies as "<Hobbies>", Select Date and address as "<Address>"
    And Upload the picture
    And Select state as "NCR" and city as "Delhi"
    And Click on the submit button
    Then User should register successfully into the portal

    Examples: 
      | Subject |  | Hobbies |  | Address  |
      | Maths   |  | Reading |  | Homeland |
  
 
