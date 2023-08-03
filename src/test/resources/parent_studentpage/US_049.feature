Feature: US_49  As a user, I should be able to access the "Apply Leave" page, make changes, and view the
  leave details  When entering the Student Panel



  Scenario: TC01  A user may access the "Apply for Leave" page ,when entering the Student Panel.
    * Go to "loginurl"
    * click user login button
    * enter  user  username
    * enter user  password
    * click user sign in button
    * The should be able to access the Apply leave page
    * The user should be able to see the Leave List header text
    * The user should be able to view column fields on the Leave List page
    * The user should be able to access the details page of a pending leave from the Action section and update it
    * user close the browser


    Scenario: TC02 A user may change the "Apply for Leave" page ,when entering the Student Panel.
      * Go to "loginurl"
      * click user login button
      * enter  user  username
      * enter user  password
      * click user sign in button
      * The should be able to access the Apply leave page
      * The user should be able to click on the Add button add a new leave and see a success message confirming the addition
      * user close the browser
  Scenario: TC03 A user may change the "Apply for Leave" page ,when entering the Student Panel.
    * Go to "loginurl"
    * click user login button
    * enter  user  username
    * enter user  password
    * click user sign in button
    * The should be able to access the Apply leave page
    * The user should be able to delete a leave from the Action section and see a success message confirming the deletion
    * user close the browser
