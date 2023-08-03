Feature: US_18 As an administrator (admin),I want to be able to log in to the admin panel with registered email and password.

  Scenario: TC_001 The School Panels Url Test

    Given Go to "loginurl"
    And Verify that the title of the Admin Panel is displayed
    And Close the page.

  Scenario: TC_002 Admin Panel and Site Login Page Test
    
    Given Go to "loginurl"
    Then Verify that Admin Login Panel is displayed
    And Click the Admin Login Button
    And Switch to window
    And Verify that Admin Site Login Page is displayed
    And Verify that Admin Login Username Box is diplayed
    And Verify that Admin Login Password Box is displayed
    And Verify that Admin Login Submit Button is displayed
    And Close the page.

  Scenario: TC_003 Admin Login Forgot Password Test

    Given Go to "loginurl"
    Then Click the Admin Login Button
    And Switch to window
    And Verify that Forgot Password Link is active
    And Click the Forgot Password Link
    And Enter Forgot Password Email Adress
    And Click the Forgot Botton Submit Button
    And Verify that Admin Login password reset email is sent
    And Verify that Admin User Login Link is enabled
    And Close the page.

  Scenario: TC_04 Back to Front Site and User Login test

    Given Go to "loginurl"
    Then Click the Admin Login Button
    And Switch to window
    And Verify that Forgot Password Link is active
    And Click the Forgot Password Link
    And Enter Forgot Password Email Adress
    And Click the Forgot Botton Submit Button
    And Click Site Login User Login Link

  Scenario: TC_05 And Click Site Login User Login Link

    Given Go to "loginurl"
    Then Click the Admin Login Button
    And Switch to window
    And Verify that Forgot Password Link is active
    And Click the Forgot Password Link
    And Enter Forgot Password Email Adress
    And Click the Forgot Botton Submit Button
    And Click Site Login User Login Link












