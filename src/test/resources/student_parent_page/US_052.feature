Feature: As a user, I should be able to access the Teacher Reviews page and view the relevant fields,
  make changes, and provide ratings  When entering the Student Panel
  Scenario: 'Teacher Reviews'(Student) Page -  Visibility and Successfully Rating Tests
    Given go to home page
    Then click on login button
    Then enter username and password
    Then Click on the Sign In button
    Then click and verify teacher reviews button on side bar
    Then verify teacher review header text
    Then click on rate button
    Then rate teacher and write a command afterward click on save button
    Then Close the page.