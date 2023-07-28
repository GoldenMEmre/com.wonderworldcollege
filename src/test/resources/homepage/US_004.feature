Feature: US004 The user should be able to access the exam result page
  @ab
  Scenario: user enters exam result page

    Given user goes to url
    Then user clicks exam result button
    Then user verifies that the exam result page is opened
    And User enters admission number
    And User selects exam
    Then The user clicks the search button after entering the admission number and selecting the exam.
    And user verifies that result text appears


