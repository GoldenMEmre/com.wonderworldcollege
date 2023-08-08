Feature: US_50 As a user, I should be able to access the "Attendance" page and view the attendance details  When entering the Student Panel

  Scenario: TC01 A user may access the "Attendance" page  when entering the Student Panel.
    * Go to "loginurl"
    * click user login button
    * enter  user  username
    * enter user  password
    * click user sign in button
    * The user should be able to access the Attendance page
    * The user should be able to see the Attendance header text
    * The user should be able to select a date and list the attendances for that date
    * The user should be to view column fields
    * user close the browser