Feature:WonderWorldCollage StudentPanelChangeUsername Test
  Scenario: TC01 change password
    Given go to'loginurl'
    Then click student login
    Then enter student name
    Then enter student password
    Then click signin button

    Scenario: TC02 change username
      Given click student password
      Then click student username change

      Scenario: TC03 username criteria
        Given user name must be min 5 char

        Scenario: TC04 wrong user name
          Given should give 'Username must contain a minumum 5 characters' warning when user enters wrong username

          Scenario: TC05 right username
            Given 'username has been changed successfully' should be written when the user enters the correct combination