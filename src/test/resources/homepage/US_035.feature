Feature:WonderWorldCollage TeacherAttendanceRecord Test
  Scenario: TC01
    Given go to'loginurl'
    Then click teacher login button
    Then enter  teacher username1
    Then enter teacher password2
    Then click signin button
    When click teacher attendance
    And click period attendance
    And subject attendace page must be accessible

    Scenario: TC02 subject attendance page
      Given class section subject dropdown date boc must be accessiblle

      Scenario: TC03 select criteria select button
        Given search text box must be accessible

        Scenario: TC04 student list
          Given select class section date and subject
          Then admission no roll number name attendance note must be accessible

          Scenario: TC05 student attendance status
            Given click present late absent half day
            Then click save attendance button

            Scenario: TC06 note box
              Given note text box must be accessible

              Scenario: TC07 holiday
                Given mark as holiday button must be accessible
