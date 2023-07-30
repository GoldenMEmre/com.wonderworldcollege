Feature:As an administrator (teacher),
  I want a page where I can create online permission records and check all the permissions I have used.

  Scenario: TC_001 'Leaves'(Teacher) Page - Redirection, Visibility, Enability Tests
    Given go to login page
    When click teacher login button
    And wait 3 seconds
    Then enter "ogun.erdogan@teacher.wonderworldcollege.com" as username
    Then enter "wonderworld123" as password
    And click signin button
    Then wait 3 seconds
    And click human resources on side bar
    And click apply leave on side bar
    And click on apply leave on leaves page
    Then enter "29/07/2023" on apply date
    Then enter "30/07/2023" on leave from date
    Then enter "31/07/2023" on leave to date
    Then select available leave
    Then enter "Sick Leave" as reason on reason textbox
    Then click on save button