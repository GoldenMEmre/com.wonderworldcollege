

  Feature:US_047 As a user, I should be able to access the "Homework" page and make changes to my assignments  When entering the Student Panel
  @ttt
 Scenario: TC 001 The user should access the "Homework" button in the student panel.

   Given  Go to "studentUrl"
   Then   Enter  Correct user name  "DGemail"
   Then   Enter Correct password "DGpassword"
   Then   Click on the Sign In button
   Then   The 'Homework' button was displayed.
   Then   user close the browser



  Scenario:TC 002 The user verifies to have reached the "Upcoming Assignments" button through the "Homework" button.

    Given  Go to "studentUrl"
    Then   Enter  Correct user name  "DGemail"
    Then   Enter Correct password "DGpassword"
    Then   Click on the Sign In button
    Then  Click on the Homework button.
    Then  The Upcoming Homeworkbutton was clicked and the relevant sections were displayed.
    And   user close the browser




    Scenario:TC 003 After clicking on the "Upcoming Homework" button, the user sends a message to the "Homework Details" section from the "Action" section.

      Given  Go to "studentUrl"
      Then   Enter  Correct user name  "DGemail"
      Then   Enter Correct password "DGpassword"
      Then   Click on the Sign In button
      Then  Click on the Homework button.
      Then  Click on the  Upcoming Homework button
      Then  Click on the Action section.
      Then  The homework details page was displayed.
      Then  Sent message.
      Then  user close the browser



      Scenario: TC 004 After clicking on the "Upcoming Homework" button, the user sends a message to the "Homework Details" section from the "Action" section.


        Given  Go to "studentUrl"
        Then   Enter  Correct user name  "DGemail"
        Then   Enter Correct password "DGpassword"
        Then   Click on the Sign In button
        Then  Click on the Homework button.
        Then  Click on the  Closed Homework button
        Then  click on the   Action section in the Closed Homework section.
        Then  The homework details section in the Closed Homework section is displayed.
        Then  Sent message.
        Then  user close the browser



      Scenario: TC 005 You should access the "Daily Assignment" section via the "Homework" button and confirm that a new assignment has been created by clicking the "New Assignment" button.

        Given  Go to "studentUrl"
        Then   Enter  Correct user name  "DGemail"
        Then   Enter Correct password "DGpassword"
        Then   Click on the Sign In button
        Then  Click on the Homework button.
        Then   Click on the Daily Assignment button.
        Then   The Add Daily Assignment page was displayed
        Then   A new assignment has been created.
         And   user close the browser



        Scenario: TC 006 Using the "Action" button, updating and deleting must be done from the Daily Assignment section.


          Given  Go to "studentUrl"
          Then   Enter  Correct user name  "DGemail"
          Then   Enter Correct password "DGpassword"
          Then   Click on the Sign In button
          Then  Click on the Homework button.
          Then   Click on the Daily Assignment button.
          Then   The Add Daily Assignment page was displayed
          Then   Click on the Edit
          Then   Click on the Delete
          And    user close the browser


       Scenario: TC 007 It should validate the column fields on the "Daily Assignment List" page from the Daily Assignment section.


         Given  Go to "studentUrl"
         Then   Enter  Correct user name  "DGemail"
         Then   Enter Correct password "DGpassword"
         Then   Click on the Sign In button
         Then  Click on the Homework button.
         Then   Click on the Daily Assignment button.
         Then   The Add Daily Assignment page was displayedd
         And     user close the browser

























