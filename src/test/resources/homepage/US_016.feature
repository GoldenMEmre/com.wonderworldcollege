Feature: US_016 As a user (student/parent), I want to have access to the login page from the homepage.

  Scenario: TC_001 Homepage Login Button Test

    Given user goes to url
    Then Verify that Login Button is visible
    And Click the Login Button
    And Verify that there is a login window on the left side and information about "What's New In Wonder World College" on the right side.
    And Close the page

  Scenario: TC_002 Positive Login Test

    Given user goes to url
    Then Click the Login Button
    And Enter  Correct user name  "studentusername"
    And Enter Correct password "studentpassword"
    And Click on the Sign In button
    And Verify the login into the panel
    And Close the page
    
  Scenario: TC_002 Negative Login Test
    
    Given user goes to url
    Then Click the Login Button
    And Enter  Correct user name  "wrongstudentusername"
    And Enter Correct password "wrongstudentpassword"
    And Click on the Sign In button
    And Verify not log into the Panel
    And Close the page

  Scenario: TC_003 Userlogin Page Forgot Password Test

    Given user goes to url
    Then Click the Login Button
    And Verify Forgot Password Link
    And Click Forgot Password Link
    And Enter Email Adress
    And Select Student Panel
    And Click Submit Button
    And Verify that password reset email is sent
    And Close the page.

  Scenario: TC_04 Back to Front Site Test

    Given user goes to url
    Then Click the Login Button
    And Verify the Front Site Link
    And Click the Front Site Link
    And Close the page.




    




