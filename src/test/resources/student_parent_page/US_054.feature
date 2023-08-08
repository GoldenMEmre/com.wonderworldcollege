Feature: As a user, I should be able to change my password
  from the Parent page  When entering the Parent Panel
  Scenario: 'Change Password'(Parent) Page - Visibility, Accessibility and Positive Change Password Tests
    Given go to home page
    Then click on login button
    Then enter username and password for a parent login
    Then click on SignIn Button
    Then verify and click profile image button
    Then verify and click change password button
    Then verify redirection after clicking change password button
    Then make positive change password text
    Then user close the browser

    Scenario: 'Change Password'(Parent) Page - Negative Change Password Test
      Given go to home page
      Then click on login button
      Then enter username and new password
      Then verify and click profile image button
      Then verify and click change password button
      Then verify redirection after clicking change password button
      Then make negative change password test
      Then log out from parent page
      Then make a log in with username and negative password
      Then user close the browser
