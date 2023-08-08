Feature: As an administrator (admin), I want a page related to school bus routes to update the routes as needed.
  Scenario: TC_001  'Routes'(Admin) Page - Redirection, Visibility, Enability and Route Record Tests
    Given go to login page
    Then Click the Admin Login Button
    Then enter username and password afterward click on signin
    Then verify Transport and Routes Sections and click on them one by one
    Then verify the textbox and button
    Then enter required informations and click on save and verify created route
    Then verify the columns
    Then user close the browser

    Scenario: TC_002 'Route'(Admin) Page - Edit Route Test
      Given go to login page
      Then Click the Admin Login Button
      Then enter username and password afterward click on signin
      Then verify Transport and Routes Sections and click on them one by one
      Then edit created Route and verify the changes
      Then user close the browser

      Scenario: TC_003 'Route'(Admin) Page - Delete Route Test
        Given go to login page
        Then Click the Admin Login Button
        Then enter username and password afterward click on signin
        Then verify Transport and Routes Sections and click on them one by one
        Then delete the edited Route
        Then user close the browser

