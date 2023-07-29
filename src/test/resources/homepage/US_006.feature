Feature: US006 Course page test

  @ww
  Scenario Outline: : TC01 User tests visibility of Course titles

    * Go to "url"
    * Click the course menu title
    * Verify that you have been to the course page
    * Verifies that the "<title to be tested>" course title is visible
    Examples:
      | title to be tested           |
      | English and Literature       |
      | Mathematics                  |
      | Sciences                     |
      | Social Sciences              |
      | History                      |
      | Arts and Music               |
      | Health and Exercise Sciences |
      | Foreign Language             |
      | Computer Science             |


  Scenario: TC02 Access test to the course detail page



