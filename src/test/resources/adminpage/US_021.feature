Feature: Online Admission Management

  Scenario: TC01 Verify Online Admission Page and Student List
    Given  go to admin panel's sidebar
    When  click on the "Student Information" menu
    And click on the "Online Admission" link
    Then should see the "Student List" page with columns
      | Reference No | Student Name | Class | Father Name | Date Of Birth | Gender | Category | Student Mobile Number | Form Status | Enrolled | Created At | Action |

  Scenario: TC02 Verify Searching in Online Student List
    Given go to the Online Student page
    When enter "John" in the search TextBox
    Then should see results containing "John" in the "Student List"

  Scenario: TC03 Verify Form Status and Enrollment Icons
    Given go to the Student List page
    Then students with not submitted admission forms should have "Not Submitted" status
    And students with submitted admission forms should have "Submitted" status
    And enrolled students should have a check icon in the "Enrolled" column
    And students with incomplete enrollment should have a (-) icon in the "Enrolled" column

  Scenario: TC04 Verify Editing and Enrolling an Application
    Given go to the Student List page
    When go to the "Edit and Enroll" icon for a student
    Then  should be on the "Edit and Enroll" page
    And  should see the information filled by the student in the Online Admission form
    And the following sections should be displayed: Edit Online Admission, Fees Details, Transport Details, Parent Guardian Detail, Address Details, Miscellaneous Details
    And  should see the "Save" and "Save and Enroll" buttons

  Scenario:TC05 Verify Automatically Calculated Total Payment Amount
    Given go to the "Edit and Enroll" page
    When  enter the Fees Details
    Then the automatically calculated total payment amount should be displayed

  Scenario: TC06 Verify Detailed Breakdown of Total Fee
    Given go to  the "Edit and Enroll" page
    When click the plus sign next to the Fees Details
    Then the detailed breakdown of the total fee should be displayed

  Scenario:TC07 Verify Saving the Form
    Given go to the "Edit and Enroll" page
    When  enter all the required information
    And  click the "Save" button
    Then the form should be saved successfully

  Scenario:TC08 Verify Saving and Enrolling the Form
    Given go to the "Edit and Enroll" page
    When enter all the required information
    And click the "Save and Enroll" button for the given Admission No
    Then the student's school enrollment should be completed




