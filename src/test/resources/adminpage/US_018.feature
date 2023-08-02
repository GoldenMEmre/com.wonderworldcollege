Feature: US_18 As an administrator (admin),I want to be able to log in to the admin panel with registered email and password.
  @ab
  Scenario: TC_001 The School Panels Url Test

    Given Go to "loginurl"
    And Verify that the title of the Admin Panel is displayed
    And Close the page.

  Scenario:
    
    Given Go to "loginurl"
    Then Verify that the title of the Admin Panel is displayed
    And Click the Admin Login Button


