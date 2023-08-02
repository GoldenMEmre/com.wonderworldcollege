Feature:As an administrator (teacher), I want to access the attendance record of a class for a specific day.


  Scenario: TC01 Attendance menu should be displayed Test
    * Go to "loginurl"
    * click teacher login button
    * enter  teacher username
    * enter teacher password
    * click teacher sign in button
    * Click Attendance menu
    * Verify that under Attendance menu the Period Attendance By Date is visible and clickable
    * verify all section titles that related with Select Criteria is active and visible
    * user close the browser

  Scenario: TC2 Select Criteria Class Section Test
    * Go to "loginurl"
    * click teacher login button
    * enter  teacher username
    * enter teacher password
    * click teacher sign in button
    * Click Attendance menu
    * Click Period Attendance By Date
    * verify that the Student List is displayed and active when searching  for the attendance records of all students for the specified date
    * user close the browser
