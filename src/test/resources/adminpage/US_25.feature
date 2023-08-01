Feature: admin school fees
@ab
Scenario: : TC01 in the admin panel's side bar under the  Fees Collection related with Fees Master should be active and displayed.
    * Go to "loginurl"
    * click admin login
    * enter username
    * enter password
    * click sign in button
    * Click fees collection
    * Click fees master
   * verify that fees Master  displayed
  * verify  all title that related with Fees Master are displayed
  * verify  all section title that related with Fees Master can be select by clicking
  * Verify Record Saved Successfully displayed after clicking save button
  * Verify that Fees Master List can be updated by clicking edit button


  Scenario: 2  Verify that Fees Master List can be updated by clicking edit button
    * Go to "loginurl"
    * click admin login
    * enter username
    * enter password
    * click sign in button
    * Click fees collection
    * Click fees master
    * Verify that Fees Master List can be updated by clicking edit button
    Scenario: 3 Verify that the delete button is active
      * Go to "loginurl"
      * click admin login
      * enter username
      * enter password
      * click sign in button
      * Click fees collection
      * Click fees master
      * Verify that the delete button is functional






