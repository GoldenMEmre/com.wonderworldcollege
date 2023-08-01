Feature: Multi Class student page test as admin


  Scenario: TC01 When you click on the Multi Class Student page link in the admin panel, the multiclass page is displayed.

    * Go to "loginurl"
    * click admin login
    * Enter the valid username and password on the Admin login panel
    * click sign in button
    * Click the Student Information menu on the sidebar in the admin panel and verify that the Multi Class Student link is displayed
    * Click on the Multi Class Student link and confirm that the multiclass page is displayed
    * Quit the page


  Scenario: TC02 On the Multiclass page, the students in the school are searched and the students are listed according to the search criteria.

    * Go to "loginurl"
    * click admin login
    * Enter the valid username and password on the Admin login panel
    * click sign in button
    * Student Information, Multi Class Student link is clicked on the admin panel, respectively
    * It is verified that the Class and Section textBoxes and the Search button are displayed on the Multiclass page
    * Select the class from the Class tab, select the section from the Section tab and click the search button
    * Verifies that students are listed according to the search criteria
    * Quit the page

  @ww
  Scenario: TC03 A new class can be added, the class can be deleted and the changes made can be saved in the window of the selected student among the students listed on the Multi Class page.

    * Go to "loginurl"
    * click admin login
    * Enter the valid username and password on the Admin login panel
    * click sign in button
    * Student Information, Multi Class Student link is clicked on the admin panel, respectively
    * Select the class from the Class tab, select the section from the Section tab and click the search button
    * A new class is added by clicking the + icon in the selected student's window
    * Clicking the Update button saves the changes made
    * Click the remove button of the class you want to delete in the selected student's window
    * Clicking the Update button saves the changes made
    * Quit the page
