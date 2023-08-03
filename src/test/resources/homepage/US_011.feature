Feature: As a user I want a "Complaints" section on the website where I can submit my requests and complaints.
  Scenario: TC_001 'Complain' Page - Redirection, Verification, Visibility and 'Successfully Submit' Tests
    Given go to home page
    Then go to features section and click on Complain
    Then verify Complain page
    Then verify the textboxes on complain page
    Then fill the required felds
    Then click on submit
    Then verify that the created complain request has been send
