Feature:WonderWorldCollage AdminProfileInfo Test

  Scenario: TC01 Update Admin Profile Information Test
    Given Go to "loginurl"
    And User logs as an admin

    Scenario:TC02 profile icon visibility in admin panel top bar
      Given click profile icon
      When account holder name and role must be visible
      Then profile, password and logout links must be accessible

      Scenario:TC03 that it is possible to switch to Profile, Payroll, Leaves, Attendance, Documents pages on the page that opens
        Given click profile icon
        Then click profile button
        When click payroll leaves attendance and documents

        Scenario:TC04 view the details on the profile page
          Given click profile icon
          Then click profile button
          When details must be accessible

  Scenario: TC05 payroll page
    Given click payroll
    Then information boards must be accessible
    When payslip list must be accessible

    Scenario: TC06 payslip action title
      Given click payroll
      Then click action

      Scenario: TC07 textbox and paylist view
        Given click payroll
        Then click search textbox
        When click view paylist
        And close view payslip

        Scenario: TC08 leaves menu
          Given click leaves
          Then leave list menu must be accessible

          Scenario: TC09 leaves action
            Given click leaves action
            Then click view icon
            When close view permisson page

            Scenario: TC10 attendance page
              Given click attendance
              Then attendance information boards must be accessible

              Scenario: TC11 years select and descriptions of the letters used for attendance
                Given year should be select
                Then descriptions of the letters should be accessible

                Scenario: TC12 attendance relevant staff is listed
                  Given relevant staff is listed by month and day in the Attendance List must be accessible

                  Scenario: TC13 password change
                    Given click pasword button
                    Then textBoxes about the Password should be accessible

                    Scenario: TC14 change password
                      Given click current password and enter password
                      Then click new password and enter new password
                      When click confirm password and enter password
                      And 'Password Changed Successfully' text must be accessible

                      Scenario: TC15 logout test
                        Given click profile icon
                        When click logout button