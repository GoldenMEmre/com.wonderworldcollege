Feature:US_002 Home top bar test

  Scenario: TC001
    * Go to "userurl"

    Scenario: TC002

      * Go to "userurl"

      * The visibility of the site logo is tested

      Scenario: TC003

        * Go to "userurl"
        * The visibility of the site logo is tested
        Then Headings in the top bar are clicked
        And The site logo in the top bar of the home page is clicked

  @gaye
      Scenario: TC004

        * Go to "userurl"
        * The visibility of the site logo is tested
        Then Headings in the top bar are clicked
        And The site logo in the top bar of the home page is clicked
        And click on Academics section on the  page bar
        And The visibility of the pages
        And user close the browser
