Feature: As a user, I want to see comments from users who have made comments about the school on the homepage.
  Scenario: TC_001 'What People Say' Section - Verification Test
    Given go to home page
    Then verify What people says section
    Then verify that the comments are from different individuals
    Then Close the page.