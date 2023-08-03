Feature: As an administrator (teacher)  I want a Hostel page to access students staying in the hostel.
  Scenario: TC_001 'Student Hostel Details'(Teacher) Page - Redirection, Visibility and Enability Tests
    Given go to login page
    When click teacher login button
    Then enter "ogun.erdogan@teacher.wonderworldcollege.com" as username
    Then enter "wonderworld123" as password
    And click signin button

