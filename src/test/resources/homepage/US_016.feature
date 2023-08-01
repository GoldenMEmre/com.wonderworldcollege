Feature: US_016 As a user (student/parent), I want to have access to the login page from the homepage.

  Scenario: TC_001 Homepage Login Button Test

    Given user goes to url
    Then Verify that Login Button is visible
    And Click the Login Button
    And Verify that there is a login window on the left side and information about "What's New In Wonder World College" on the right side.
    And Close the page.

