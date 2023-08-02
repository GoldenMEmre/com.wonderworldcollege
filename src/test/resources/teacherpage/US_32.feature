Feature: As a teacher, creating exam groups for students

  Scenario: Exam Group link is displayed under the Examinations menu on the teacher panel and when it is clicked, it is directed to the examgroup page.

    * Go to "loginurl"
    * click teacher login button
    * Enter the valid username and password on the Teacher login panel
    * click sign in button
    * On the sidebar of the teacher panel, the Examinations menu is clicked and it is verified that the Exam Group link is displayed
    * Click on the Exam Group link and verify that it is directed to the examgroup page
    * Quit the page

@ab
  Scenario: A new exam group is created, saved and saved in the Add Exam Group window on the Examgroup page.

    * Go to "loginurl"
    * click teacher login button
    * Enter the valid username and password on the Teacher login panel
    * click sign in button
    * Examinations, Exam Group link is clicked on the teacher panel, respectively
    * Verify that the Name, Description textBoxes and Exam Type dropdown menu are visible in the Add Exam Group window
    * The save button appears in the Add Exam Group window and it is verified that it is active
    * After entering the Name in the Add Exam Group window and selecting the Exam Type, clicking the Save button will see that the new exam group has been registered
    * Quit the page

  Scenario:  Titles are displayed in the Exam Group List window and it is verified that the add, update and delete icons under the action title are active.

    * Go to "loginurl"
    * click teacher login button
    * Enter the valid username and password on the Teacher login panel
    * click sign in button
    * Examinations, Exam Group link is clicked on the teacher panel, respectively
    * Verify that the Title, No Of Exams, Exam Type, Action titles are visible in the Exam Group List window
    * Clicking the + icon under the Action title in the Exam Group List window confirms that it is directed to the add exam page
    * Click the edit icon under the Action title in the Exam Group List window
    * Updates the Edit Exam Group window
    * Clicking the delete icon under the Action heading in the Exam Group List window confirms that the relevant exam group can be deleted
    * Quit the page

