Feature: As a user I want an Online Admission page on the homepage so that I can enroll in the school online
  Scenario: TC_001  'Online Admission' Page - Redirection, Visibility,
  Enability, Mendatory Fields, Verification and Upload Tests

    Given go to home page
    Then click on online admission title
    Then verify online admission page
    Then verify that school admission criteria text
    Then verify mandatory fields under Basic Details and Parent Details section
    Then verify and fill the fields under Basic Details
    Then verify that student photo has been uploaded
    Then verify and fill the fields under Parent Details

