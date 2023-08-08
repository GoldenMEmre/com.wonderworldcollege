Feature:US004 The user should be able to access the "Achievements" section

  Scenario:The user views the panels in the "Achievements" section.

    Given  Go to "userurl"
    Then  The homepage was reached on the website
    Then  The Achievements  section was displayed as the page was scrolled down.
    And   user close the browser


  Scenario:The user views the boards "Mezunlar","Sertifikalı Öğretmenler","Öğrenci Kampüsleri","Öğrenciler" in the achievements section.

    Given  Go to "userurl"
    Then  The Achievements  section was displayed as the page was scrolled down.
    Then   The visibility of the boards in the Achievements section has been confirmed.
    And    user close the browser
