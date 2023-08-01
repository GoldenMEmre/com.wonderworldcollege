

Feature: US _024 The "Collect Fees "Page Link should be displayed under the "Fees Collection " menu in the admin Panel's Sidebar,and clicking on it should redict to the "Student Fees"Page

  Scenario: TC_001 The "Collect Fees "Page Link should be displayed under the "Fees Collection " menu in the admin Panel's Sidebar,and clicking on it should redict to the "Student Fees"Page

    * Go to "loginurl"
    * click admin login
    * enter username
    * enter password
    * click sign in button
    * Click fees collection
    * Click on the Collect Fees button
    * The Student Fees page was displayed
    * Close the page.




    Scenario: TC_002 The Student Fees list should be displayed.

      * Go to "loginurl"
      * click admin login
      * enter username
      * enter password
      * click sign in button
      * Click fees collection
      * Click on the Collect Fees button
      * Choose class button
      * Choose section button
      * Click  on  the Seach button
      * Click on the Collect Fees
      * It has been confirmed that the sudent fee list is displayed with columns
      * Close the page.


     Scenario: TC_003 When the curreny(USD/EUR) is changed in the Admin Panel's top bar, the amounts in the Student Fees list should be updated according to the selected currency.

       * Go to "loginurl"
       * click admin login
       * enter username
       * enter password
       * click sign in button
       * Click fees collection
       * Click on the Collect Fees button
       * Choose class button
       * Choose section button
       * Click  on  the Seach button
       * Click on the Collect Fees
       * When the Currency button is clicked, change the currency
       * Close the page.



      Scenario: TC _004 It should be possible to enter a payment from the popup window when the status of an Unpaid Paymentsis clicked with the (+) sign under the "Action" column in the Student Fees list.


        * Go to "loginurl"
        * click admin login
        * enter username
        * enter password
        * click sign in button
        * Click fees collection
        * Click on the Collect Fees button
        * Choose class button
        * Choose section button
        * Click  on  the Seach button
        * Click on the Collect Fees
        * Click on the + Sign under the Action column
        * Click on the Revert icon under the Action column to revert the payment
        * Verify that the Transport Fees popup is visible.
        *  Close the page.



        Scenario: TC _005 should be possible to revert a paid payment by clicking on the "Revert" icon under the "Action" column in the Student Fees list.


          * Go to "loginurl"
          * click admin login
          * enter username
          * enter password
          * click sign in button
          * Click fees collection
          * Click on the Collect Fees button
          * Choose class button
          * Choose section button
          * Click  on  the Seach button
          * Click on the Collect Fees
          * Click on the + Sign under the Action column
          * Click on the Revert icon under the Action column to revert the payment
          * Close the page.


       Scenario: TC _006 The total of the made payments and the remaining payments should be displayed in the students Fees list

         * Go to "loginurl"
         * click admin login
         * enter username
         * enter password
         * click sign in button
         * Click fees collection
         * Click on the Collect Fees button
         * Choose class button
         * Choose section button
         * Click  on  the Seach button
         * Click on the Collect Fees
         * Status section was viewed and the students Fees list section displayed their payment histories
         * Close the page.










