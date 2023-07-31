Feature: WonderWorldCollage GalleryPage Test

  Scenario: TC001 HomePage Gallery Clicked Test

    Given User go to "userurl"
    When Clicks on the "galleryPage"
   Then Verifies redirecting to "artAndMusic" , "campus" , "activities" , "prePrimary" , "classrooms" , "sports"

