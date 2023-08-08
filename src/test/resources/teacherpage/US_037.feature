Feature:As an administrator (teacher),
  I want a page where I can create online permission records and check all the permissions I have used.

  Scenario: TC_001 'Leaves'(Teacher) Page - Redirection, Visibility, Enability Tests
    Given go to login page
    When click teacher login button
    Then enter "ogun.erdogan@teacher.wonderworldcollege.com" as username
    Then enter "wonderworld123" as password
    And click signin button
    And click human resources on side bar
    And click apply leave on side bar
    And click on apply leave on leaves page
    Then enter date on leave from date
    Then enter date on leave to date
    Then select available leave
    Then enter "Sick Leave" as reason on reason textbox
    Then click on save button
    And verify that leave request has been created
    And user close the browser

  Scenario: TC_002 'Leaves'(Teacher) Page - Visibility, Enability and Leave Request Status Tests
      Given go to login page
      When click teacher login button
      Then enter "ogun.erdogan@teacher.wonderworldcollege.com" as username
      Then enter "wonderworld123" as password
      And click signin button
      And click human resources on side bar
      And click apply leave on side bar
      Then verify the columns on leaves list page
      Then verify the status of created leave request
      Then user close the browser

  Scenario: TC_003 'Leaves List'(Teacher) Section - Visibility, Viewing Details and Deleting of a Leave Requests Test
      Given go to login page
      When click teacher login button
      Then enter "ogun.erdogan@teacher.wonderworldcollege.com" as username
      Then enter "wonderworld123" as password
      And click signin button
      And click human resources on side bar
      And click apply leave on side bar
      Then verify view button and click on it
      Then verify that details window is accessible
      Then close details window
      Then verify and click on delete button
      Then verify that leave request has been deleted
      And user close the browser


