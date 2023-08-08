Feature: US_48 As a user, I should be able to access the "Online Exam" page and make changes and view the Exam details  When entering the Student Panel

  @ab
  Scenario: TC01  A user may view the Exam Details ,when entering the Student Panel.
    * Go to "loginurl"
    * click user login button
    * enter  user  username
    * enter user  password
    * click user sign in button
    * user click Online Exam
    * The user should be able to view column fields in the Online Exam segment
    * user close the browser





  @ac
  Scenario: TC02 A user may access and the "Online Exam" page ,when entering the Student Panel.
    * Go to "loginurl"
    * click user login button
    * enter  user  username
    * enter user  password
    * click user sign in button
    * user click Online Exam
    * The user should be able to access the Exam View from the Action section and view the fields
    * When the user enters the Closed Exam segment, they should be able to see the column fields
    * The user should be able to access the Exam View from the Action section within the Closed Exam segment and view the fields
    * user close the browser


