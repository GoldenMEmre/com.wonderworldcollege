Feature: Chat Functionality

  Scenario: TC01 Sending a Message

  Scenario: TC03 message page is displayed

    Given Login to dashboard with admin name and admin password as admin
    Then Click the Chat page
    When  click on a chat from the left bar
    Then The message page is displayed on the right side
    And The "Write Your Message" TextBox is visible
    When  Type a message in the TextBox
    Then The send icon becomes active
    And  Click on the send icon
    Then The message is sent successfully