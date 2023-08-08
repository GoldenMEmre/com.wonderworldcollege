Feature: As an administrator (teacher)  I want a Hostel page to access students staying in the hostel.
  Scenario: TC_001 'Student Hostel Details'(Teacher) Page - Redirection, Visibility and Enability Tests
    Given go to login page
    When click teacher login button
    Then enter "ogun.erdogan@teacher.wonderworldcollege.com" as username
    Then enter "wonderworld123" as password
    And click signin button
      Then click and verify Reports and Hostel button on side bar
    Then verify student hostel details Page
    Then verify Select Criteria Sections
    Then make search
    Then verify Student Hostel List Reports columns
    Then Close the page.

    Scenario: TC_002 US_040] 'Student Hostel Report List'(Teacher) Page - Search Box Perform Test
      Given go to login page
      When click teacher login button
      Then enter "ogun.erdogan@teacher.wonderworldcollege.com" as username
      Then enter "wonderworld123" as password
      And click signin button
      Then click and verify Reports and Hostel button on side bar
      Then verify student hostel details Page
      Then verify Select Criteria Sections
      Then make search
      Then click on a student name
      Then verify Student Profile Page
      Then searchBox on Student Profile Page
      Then Close the page.

      Scenario: TC_003 'Student Hostel Report List'(Teacher) Page - Filtering Based on the Column Test
        Given go to login page
        When click teacher login button
        Then enter "ogun.erdogan@teacher.wonderworldcollege.com" as username
        Then enter "wonderworld123" as password
        And click signin button
        Then click and verify Reports and Hostel button on side bar
        Then verify student hostel details Page
        Then verify Select Criteria Sections
        Then make search
        Then make filtering with different student informations
        Then user close the browser


