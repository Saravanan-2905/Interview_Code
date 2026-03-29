Feature: OrangeHCM Page

Background:

  Scenario Outline: Login with multiple users
    Given User should navigate to the application
    And User enter the username as "<username>"
    And User enter the password as "<password>"
    When User click the login page
    Then Login should be success

    Examples:
      | username | password |
      | Admin    | admin123 |
      | Admin    | admin123 |
      #| Admin    | admin123 |
