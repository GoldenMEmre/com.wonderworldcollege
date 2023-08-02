Feature: US_18 As an administrator (admin),I want to be able to log in to the admin panel with registered email and password.

  Scenario: TC_001 The School Panels Url Test

    Given Go to "loginurl"
    And Verify that the title of the Admin Panel is displayed
    And Close the page.

  Scenario: TC_002 Admin Panel and Site Login Page Test
    
    Given Go to "loginurl"
    Then Verify that Admin Login Panel is displayed
    And Click the Admin Login Button
    And Verify that Admin Site Login Page is displayed

  Scenario: TC_003 Admin Login Forgot Password Test

    Given Go to "loginurl"
    Then Click the Admin Login Button
    And Verify that Forgot Password Link is active






