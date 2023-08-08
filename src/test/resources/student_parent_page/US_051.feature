Feature: As a user  I should be able to access the Examinations page
  and view the relevant exams, when entering the Student Panel
  Scenario: TC_001 'Exam Schedule' and 'Examination'(Student) Pages - Visibility and Funktion Tests
    Given go to home page
    Then click on login button
    Then enter username and password
    Then Click on the Sign In button
    Then click and verify examinations and exam schedule buttons on side bar
    Then verify exam schedule page
    Then search an exam on search box and verify that
    Then verify the columns on exam schedule page
    Then click on view button and verify exam details page
    Then verify the columns on exam details page
    Then user close the browser
