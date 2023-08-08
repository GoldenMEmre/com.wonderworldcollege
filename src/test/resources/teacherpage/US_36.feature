Feature:As an administrator (teacher), I want to access the attendance record of a class for a specific day.


  Scenario: TC01 Attendance menu should be displayed Test
    * Go to "loginurl"
    * click teacher login buttonG
    * enter  teacher usernameG
    * enter teacher passwordG
    * click teacher sign in buttonG
    * Click Attendance menu
    * Verify that under Attendance menu the Period Attendance By Date is visible and clickable
    * verify all section titles that related with Select Criteria is active and visible
    * user close the browser


  Scenario: TC2 Select Criteria Class Section Test
    * Go to "loginurl"
    * click teacher login buttonG
    * enter  teacher usernameG
    * enter teacher passwordG
    * click teacher sign in buttonG
    * Click Attendance menu
    * verify that the Student List is displayed and active when searching  for the attendance records of all students for the specified date
    * user close the browser


