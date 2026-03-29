Feature: BookCart application demo

  Scenario: Login should be success
    Given User should navigate to the application 
    And User enter the username as "Admin"
    And User enter the password as "admin123"
    When User click the login button
    Then Login should be success

  Scenario: Login should be fail
    Given User should navigate to the application 
    And User enter the username as "Admins" 
    And User enter the password as "admin1234"
    When User click the login button
    But Login should be fail
