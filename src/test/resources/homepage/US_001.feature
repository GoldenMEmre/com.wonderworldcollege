Feature: US_001 As a user, I want to be able to access the website to use it.

  Scenario: TC_001 Homepage Access Test

    Given Go to "userurl"
    Then Verify that HomePage is accessible
    Then Close the page.