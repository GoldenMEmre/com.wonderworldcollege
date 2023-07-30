

  Feature:US046 .I should be able to verify the visibility and active clickability of the Profile, Fees, Exam, and Documents buttons via the My Profile button.

    Scenario:The user reaches the "My Profile" button.
      Given  Go to "studentUrl"
      Then   Enter  Correct user name  "DGemail"
      Then   Enter Correct password "DGpassword"
      Then   Click on the Sign In button
      Then   The My Profile button was displayed
      And    Close the page.


    Scenario:Through the User Profile button, access is provided to the Profile, Fees, Exams, and Documents buttons.


      Given  Go to "studentUrl"
      Then   Enter  Correct user name  "DGemail"
      Then   Enter Correct password "DGpassword"
      Then   Click on the Sign In button
      Then   The My Profile button was displayed
      Then   The Profile button was clicked and displayed.
      Then   The Exam button was clicked and displayed.
      Then   The Documents button was clicked and displayed.
      Then   The Fees button was clicked and displayed.
      And    Close the page.



    Scenario:The User Profile button displays the relevant areas of Profile, Fees, Exams, and Documents.

      Given  Go to "studentUrl"
      Then   Enter  Correct user name  "DGemail"
      Then   Enter Correct password "DGpassword"
      Then   Click on the Sign In button
      Then   The My Profile button was displayed
      Then   The Profile button was clicked and displayed.
      Then   The Profile button was clicked and the relevant sections were displayed.
      Then   The Exam button was clicked and the relevant sections were displayed.
      Then   The Document button was clicked and the relevant sections were displayed.
      Then   The Fees button was clicked and the relevant sections were displayed.
      And    Close the page.




