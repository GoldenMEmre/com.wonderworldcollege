package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.Select;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class HomepageStepdefinition {

    HomePage homepage = new HomePage();

    @Given("user goes to url")
    public void user_goes_to_url() {
        Driver.getDriver().get(ConfigReader.getProperty("userurl"));
    }

    @Then("user clicks exam result button")
    public void userClicksExamResultButton() {

        ReusableMethods.waitForClickablility(homepage.examResultButton, 3);

        homepage.examResultButton.click();
    }

    @Then("user verifies that the exam result page is opened")
    public void verifiesThatTheExamResultPageIsOpened() {


        homepage.examResultText.isDisplayed();


        Assert.assertTrue(homepage.examResultText.isDisplayed());

        homepage.examResultText.isDisplayed();


    }

    @And("User enters admission number")
    public void enterAdmissionNumber() {
        homepage.admissionNoButton.sendKeys("18008");
    }

    @And("User selects exam")
    public void selectExam() {
        Select select = new Select(homepage.examDropDown);
        select.selectByVisibleText("Test Examination");
    }

    @Then("The user clicks the search button after entering the admission number and selecting the exam.")
    public void clickSearchButton() {
        homepage.examResultPageSearchButton.click();
    }

    @And("user verifies that result text appears")
    public void examResultPageResultText() {

        homepage.examResultPageResultText.isDisplayed();


        homepage.examResultPageResultText.isDisplayed();



        Assert.assertTrue(homepage.examResultPageResultText.isDisplayed());

    }

    @Given("Go to {string}")
    public void go_to_url(String Url) {

        Driver.getDriver().get(ConfigReader.getProperty(Url));
        ReusableMethods.bekle(1);
    }

    @Given("Click the course menu title")
    public void click_the_course_menu_title() {

        homepage.coursePage.click();
    }

    @Given("Verify that you have been to the course page")
    public void verify_that_you_have_been_to_the_course_page() {

        String expectedTitle = "Course";
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertTrue(actualTitle.contains(expectedTitle));
    }

    @Given("Verifies that the English and Literature, Mathematics, Sciences, Social Sciences, History, Arts and Music, Health and Exercise Sciences, Foreign Language, Computer Science course titles and details buttons is visible.")
    public void Verifies_that_the_English_and_Literature_Mathematics_Sciences_Social_Sciences_History_Arts_and_Music_Health_and_Exercise_Sciences_Foreign_Language_Computer_Science_course_titles_and_details_buttons_is_visible() {


        Assert.assertTrue(homepage.coursePageEnglishAndLiteratureTitle.isDisplayed());
        Assert.assertTrue(homepage.coursePageEnglishAndLiteratureDetailsButton.isDisplayed());


        Assert.assertTrue(homepage.coursePageMathematicsTitle.isDisplayed());
        Assert.assertTrue(homepage.coursePageMathematicsDetailsButton.isDisplayed());

        Assert.assertTrue(homepage.coursePageSciencesTitle.isDisplayed());
        Assert.assertTrue(homepage.coursePageSciencesDetailsButton.isDisplayed());

        Assert.assertTrue(homepage.coursePageSocialSciencesTitle.isDisplayed());
        Assert.assertTrue(homepage.coursePageSocialSciencesDetailsButton.isDisplayed());

        Assert.assertTrue(homepage.coursePageHistoryTitle.isDisplayed());
        Assert.assertTrue(homepage.coursePageHistoryDetailsButton.isDisplayed());

        Assert.assertTrue(homepage.coursePageArtsAndMusicTitle.isDisplayed());
        Assert.assertTrue(homepage.coursePageArtsAndMusicDetailsButton.isDisplayed());

        Assert.assertTrue(homepage.coursePageHealthAndExerciseSciencesTitle.isDisplayed());
        Assert.assertTrue(homepage.coursePageHealthAndExerciseSciencesDetailsButton.isDisplayed());

        Assert.assertTrue(homepage.coursePageForeignLanguageTitle.isDisplayed());
        Assert.assertTrue(homepage.coursePageForeignLanguageDetailsButton.isDisplayed());


        Assert.assertTrue(homepage.coursePageEnglishAndLiteratureTitle.isDisplayed());
        Assert.assertTrue(homepage.coursePageEnglishAndLiteratureDetailsButton.isDisplayed());


        Assert.assertTrue(homepage.coursePageMathematicsTitle.isDisplayed());
        Assert.assertTrue(homepage.coursePageMathematicsDetailsButton.isDisplayed());

        Assert.assertTrue(homepage.coursePageSciencesTitle.isDisplayed());
        Assert.assertTrue(homepage.coursePageSciencesDetailsButton.isDisplayed());

        Assert.assertTrue(homepage.coursePageSocialSciencesTitle.isDisplayed());
        Assert.assertTrue(homepage.coursePageSocialSciencesDetailsButton.isDisplayed());

        Assert.assertTrue(homepage.coursePageHistoryTitle.isDisplayed());
        Assert.assertTrue(homepage.coursePageHistoryDetailsButton.isDisplayed());

        Assert.assertTrue(homepage.coursePageArtsAndMusicTitle.isDisplayed());
        Assert.assertTrue(homepage.coursePageArtsAndMusicDetailsButton.isDisplayed());

        Assert.assertTrue(homepage.coursePageHealthAndExerciseSciencesTitle.isDisplayed());
        Assert.assertTrue(homepage.coursePageHealthAndExerciseSciencesDetailsButton.isDisplayed());

        Assert.assertTrue(homepage.coursePageForeignLanguageTitle.isDisplayed());
        Assert.assertTrue(homepage.coursePageForeignLanguageDetailsButton.isDisplayed());


        Assert.assertTrue(homepage.coursePageComputerScienceTitle.isDisplayed());
        Assert.assertTrue(homepage.coursePageComputerScienceDetailsButton.isDisplayed());



        Assert.assertTrue(homepage.coursePageComputerScienceTitle.isDisplayed());
        Assert.assertTrue(homepage.coursePageComputerScienceDetailsButton.isDisplayed());

    }

    @Given("Clicking the Details button of the course validated that it can access the detail page.")
    public void clicking_the_details_button_of_the_course_validated_that_it_can_access_the_detail_page() throws InterruptedException {

        String actualTitle;
        String expectedTitle;

        homepage.coursePageEnglishAndLiteratureDetailsButton.click();
        Thread.sleep(1000);
        actualTitle = Driver.getDriver().getTitle();
        expectedTitle = "English and Literature";
        Assert.assertEquals(expectedTitle, actualTitle);

        Driver.getDriver().navigate().back();
        Thread.sleep(500);

        homepage.coursePageMathematicsDetailsButton.click();
        Thread.sleep(1000);
        actualTitle = Driver.getDriver().getTitle();
        expectedTitle = "Mathematics";
        Assert.assertEquals(expectedTitle, actualTitle);

        Driver.getDriver().navigate().back();
        Thread.sleep(500);

        homepage.coursePageSciencesDetailsButton.click();
        Thread.sleep(1000);
        actualTitle = Driver.getDriver().getTitle();
        expectedTitle = "Sciences";
        Assert.assertEquals(expectedTitle, actualTitle);

        Driver.getDriver().navigate().back();

        homepage.coursePageSocialSciencesDetailsButton.click();
        Thread.sleep(1000);
        actualTitle = Driver.getDriver().getTitle();
        expectedTitle = "Social Sciences";
        Assert.assertEquals(expectedTitle, actualTitle);

        Driver.getDriver().navigate().back();

        homepage.coursePageHistoryDetailsButton.click();
        Thread.sleep(1000);
        actualTitle = Driver.getDriver().getTitle();
        expectedTitle = "History";
        Assert.assertEquals(expectedTitle, actualTitle);

        Driver.getDriver().navigate().back();

        homepage.coursePageArtsAndMusicDetailsButton.click();
        Thread.sleep(1000);
        actualTitle = Driver.getDriver().getTitle();
        expectedTitle = "Arts and Music";
        Assert.assertEquals(expectedTitle, actualTitle);

        Driver.getDriver().navigate().back();

        homepage.coursePageHealthAndExerciseSciencesDetailsButton.click();
        Thread.sleep(1000);
        actualTitle = Driver.getDriver().getTitle();
        expectedTitle = "Health and Exercise Sciences";
        Assert.assertEquals(expectedTitle, actualTitle);

        Driver.getDriver().navigate().back();

        homepage.coursePageForeignLanguageDetailsButton.click();
        Thread.sleep(1000);
        actualTitle = Driver.getDriver().getTitle();
        expectedTitle = "Foreign Language";
        Assert.assertEquals(expectedTitle, actualTitle);

        Driver.getDriver().navigate().back();

        homepage.coursePageComputerScienceDetailsButton.click();
        Thread.sleep(1000);
        actualTitle = Driver.getDriver().getTitle();
        expectedTitle = "Computer Science";
        Assert.assertEquals(expectedTitle, actualTitle);
    }


    //**********************************************************************//



    //@Given("Close the page")
    //public void close_the_page() {

    //  Driver.closeDriver();
    //}



    @Given("User go to Url")
    public void user_go_to_Url(String Url) {

        Driver.getDriver().get(ConfigReader.getProperty(Url));
    }

    @Then("user test if the images change at regular intervals")
    public void user_test_if_the_images_change_at_regular_intervals() {




        Assert.assertTrue(homepage.preparingImg.isDisplayed() ||
                homepage.diverseImg.isDisplayed() || homepage.wonderImg.isDisplayed() ||
                homepage.studentsImg.isDisplayed() || homepage.nurturingImg.isDisplayed());
        ReusableMethods.bekle(6);

    }

    @Given("Verify that the images in the slider panel can be manually changed")
    public void verify_that_the_images_in_the_slider_panel_can_be_manually_changed() {
        homepage.sliderPanel.click();
        ReusableMethods.bekle(4);
        homepage.sliderPanel.click();
        ReusableMethods.bekle(4);



        // **********************************************************************************//



    }






  /* // @Then("The homepage was reached on the website")
    //public void the_homepage_was_reached_on_the_website() throws InterruptedException {

        //Assert.assertTrue(homepage.CallUsText.isDisplayed());
         //Thread.sleep(2000);

    //@Then("The Achievements  section was displayed as the page was scrolled down.")

      //  Assert.assertTrue(homepage.CallUsText.isDisplayed());

       // Thread.sleep(2000);

   */



    @Then("The homepage was reached on the website")
    public void the_homepage_was_reached_on_the_website() throws InterruptedException {

        // @Then("The homepage was reached on the website")

        //public void the_homepage_was_reached_on_the_website() throws InterruptedException {

        //  Assert.assertTrue(homepage.CallUsText.isDisplayed());


        Assert.assertTrue(homepage.CallUsText.isDisplayed());



        // Assert.assertTrue(homepage.CallUsText.isDisplayed());

        // Assert.assertTrue(homepage.CallUsText.isDisplayed());

        // Thread.sleep(2000);


         //Thread.sleep(2000);


    }


  


    @Then("The Achievements  section was displayed as the page was scrolled down.")

    public void the_achievements_section_was_displayed_as_the_page_was_scrolled_down() throws InterruptedException {
        ReusableMethods.scrollToElement(Driver.getDriver(), homepage.acheıvementsSection);
        // Thread.sleep(5000);
        Assert.assertTrue(homepage.acheıvementsSection.isDisplayed());


    }







    @Then("The visibility of the boards in the Achievements section has been confirmed.")
    public void theVisibilityOfTheBoardsInTheAchievementsSectionHasBeenConfirmed() {
        Assert.assertTrue(homepage.studentCampusesBoard.isDisplayed());

        Assert.assertTrue(homepage.studentCampusesBoard.isDisplayed());

    }


    @Then("Verify that Login Button is visible")
    public void verify_that_login_button_is_visible() {

        Assert.assertTrue(homepage.loginButonu.isDisplayed());
    }

    @Then("Click the Login Button")
    public void click_the_login_button() {
        homepage.loginButonu.click();
    }

    //@Then("Verify that HomePage is accessible")
   // public void verify_that_home_page_is_accessible() {

       // String expectedTitle="Home";
      //  String actualTitle= Driver.getDriver().getTitle();
       // Assert.assertEquals(expectedTitle,actualTitle);



    @Given("The visibility of the site logo is tested")
    public void the_visibility_of_the_site_logo_is_tested() {

        Assert.assertTrue(homepage.homeBar.isDisplayed());
    }


        @Then("Headings in the top bar are clicked")
        public void headings_in_the_top_bar_are_clicked() {

        homepage.homeBar.click();
        }

    @Then("The site logo in the top bar of the home page is clicked")
    public void the_site_logo_in_the_top_bar_of_the_home_page_is_clicked() {

        homepage.siteLogo.click();
        ReusableMethods.bekle(2);
    }

    @Then("click on Academics section on the  page bar")
    public void click_on_academics_section_on_the_page_bar() {

        homepage.academicsButton.click();
        ReusableMethods.bekle(2);
    }


    @Then("The visibility of the pages")
    public void the_visibility_of_the_pages() {



        //Assert.assertTrue(homepage.studentCampusesBoard.isDisplayed());



        homepage.facilitiesDropDown.click();
        ReusableMethods.bekle(2);
        homepage.academicsButton.click();
        homepage.schoolUniformDropDown.click();
        ReusableMethods.bekle(2);
        homepage.academicsButton.click();
        homepage.principalMessageDropDown.click();
        ReusableMethods.bekle(2);
        homepage.academicsButton.click();
        homepage.knowUsDropDown.click();
        ReusableMethods.bekle(2);
        homepage.academicsButton.click();
        homepage.approachDropDown.click();
        ReusableMethods.bekle(2);
        homepage.academicsButton.click();
        homepage.teacherDropDown.click();
        ReusableMethods.bekle(2);

        Assert.assertTrue(homepage.academicsButton.isDisplayed());


    }




    @Then("Access to the page is tested")
    public void access_to_the_page_is_tested() {

        homepage.schoolUniformDropDown.click();

    }









    //Assert.assertTrue(homepage.studentCampusesBoard.isDisplayed());
    // }


    @Given("User go to {string}")
    public void user_go_to(String Url) {
        Driver.getDriver().get(ConfigReader.getProperty("userurl"));
    }

    @When("Clicks on the {string}")
    public void clicks_on_the(String string) {
        //ReusableMethods.waitForClickablility(homepage.galleryPage,3);
        ReusableMethods.waitForVisibility(homepage.galleryPage, 3);
        homepage.galleryPage.click();

    }

    @Then("Verifies redirecting to {string} , {string} , {string} , {string} , {string} , {string}")
    public void verifies_redirecting_to(String string, String string2,
                                        String string3, String string4,
                                        String string5, String string6) {

    }








    @Then("Verify that there is a login window on the left side and information about {string} on the right side.")
    public void verify_that_there_is_a_login_window_on_the_left_side_and_information_about_on_the_right_side(String string) {
        //Assert.assertTrue(homepage.userLoginMessages.isDisplayed());
    }





    @Then("Verify that HomePage is accessible")
    public void verify_that_home_page_is_accessible() {

        String expectedTitle = "Home";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle, actualTitle);


    }



    @And("Click Forgot Password Link")
    public void clickForgotPasswordLink() {
        homepage.userLoginForgotPasswordLink.click();
    }

    @And("Verify Forgot Password Link")
    public void verifyForgotPasswordLink() {
        Assert.assertTrue(homepage.userLoginForgotPasswordLink.isDisplayed());
    }

    @And("Enter Email Adress")
    public void enterEmailAdress() {
        homepage.userLoginForgotPasswordEmailTextBox.sendKeys(ConfigReader.getProperty("userloginemail"));
    }

    @And("Select Student Panel")
    public void selectStudentPanel() {
        homepage.userLoginForgotPasswordStudentRadioButton.click();
    }

    @And("Click Submit Button")
    public void clickSubmitButton() {
        homepage.UserLoginForgotPasswordSubmitButton.click();
    }

    @And("Verify that password reset email is sent")
    public void verifyThatPasswordResetEmailIsSent() {
        Assert.assertTrue(homepage.userLoginForgotPasswordInvalidCredentialsText.isDisplayed());
    }

    @And("Click the Front Site Link")
    public void clickTheFrontSiteLink() {
        homepage.userLoginFrontSiteLink.click();
    }
    //*************************************************************************************************








    @Given("go to home page")
    public void go_to_home_page() {
        ReusableMethods.goToHomePage();

    }

    @Then("go to features section and click on Complain")
    public void goToFeaturesSectionAndClickOnComplain() {
        homepage.verifyClickComplain();
    }

    @Then("verify the textboxes on complain page")
    public void verify_the_textboxes_on_complain_page() {
        homepage.verifyTextBoxesComplainPage();
    }

    @Then("fill the required felds")
    public void fill_the_required_felds() {
        homepage.enterDataComplainPage();
    }

    @Then("click on submit")
    public void click_on_submit() {
        homepage.clickOnSubmitComplainPage();
    }

    @Then("verify Complain page")
    public void verifyComplainPage() {
        homepage.verifyComplainPage();
    }

    @Then("verify that the created complain request has been send")
    public void verifyThatTheCreatedComplainRequestHasBeenSend() {
        homepage.verifiyComplainSend();
    }


    @Then("click on online admission title")
    public void clickOnOnlineAdmissionTitle() {
        homepage.clickOnlineAdmissionHomePage();
    }

    @Then("verify online admission page")
    public void verifyOnlineAdmissionPage() {
        homepage.verifyOnlineAdmissionPage();
    }

    @Then("verify that school admission criteria text")
    public void verifyThatSchoolAdmissionCriteriaText() {
        homepage.verifySchoolAdmissionCriteria();
    }

    @Then("verify and fill the fields under Basic Details")
    public void verifyAndFillTheFieldsUnderBasicDetails() {
        homepage.enterVerifyBasicDetails();
    }

    @Then("verify that student photo has been uploaded")
    public void verifyThatStudentPhotoHasBeenUploaded() {
        homepage.verifyUploadStudentPhoto();
    }

    @Then("verify and fill the fields under Parent Details")
    public void verifyAndFillTheFieldsUnderParentDetails() {
        homepage.verifyEnterDataParentDetails();
    }

    @Then("verify mandatory fields under Basic Details and Guardian Details section")
    public void verifyMandatoryFieldsUnderBasicDetailsAndGuardianDetailsSection() {
        homepage.verifyMandatoryFieldsBasicDetailsParentDetails();

    }


    @Then("verify and fill the fields under Guardian Details Section")
    public void verifyAndFillTheFieldsUnderGuardianDetailsSection() {
        homepage.verifyEnterGuardianDetailsOnlineAdmissionPage();
    }

    @Then("verify that guardian photo has been uploaded")
    public void verifyThatGuardianPhotoHasBeenUploaded() {
        homepage.verifyGuardianPhotoUpload();
    }
    @Then("verify RadioBoxes under Guardian Details Section")
    public void verifyRadioBoxesUnderGuardianDetailsSection() {
        homepage.verifyRadioBoxesGuardianDetails();
    }

    @Then("verify and fill the fields under Miscellaneous Details")
    public void verifyAndFillTheFieldsUnderMiscellaneousDetails() {
        homepage.miscellaneousDetailsVerifyEnter();
    }


    //@Given("Close the page")
    //public void close_the_page() {
       // Driver.closeDriver();
    //}





    @Then("upload a document on Upload Document Section and verify that")
    public void uploadADocumentOnUploadDocumentSectionAndVerifyThat() {
        homepage.uploadVerifyDocumentOnlineAdmissionPage();
    }

  @Then("click on Submit and verify Reference Number and Review entered Details and Status Page")
    public void clickOnSubmitAndVerifyReferenceNumberAndReviewEnteredDetailsAndStatusPage() {
        homepage.verifyREDaS_ReferenceNo();
    }

    @Then("verify form status and application Date")
    public void verifyFormStatusAndApplicationDate() {
        homepage.verifyFormStatusAndApplicationDate();
    }

    @Then("verifiy entered informations")
    public void verifiyEnteredInformations() {
        homepage.controlInformations();
    }

    @Then("verify and click on I agree to the terms and conditions checkbox")
    public void verifyAndClickOnIAgreeToTheTermsAndConditionsCheckbox() {
        homepage.checkBoxVerifyEnter();
    }

    @Then("click on submit and verify form status and success alert")
    public void clickOnSubmitAndVerifyFormStatusAndSuccessAlert() {
       homepage.submitVerifyFormStatusAndAlert();

        }







    @Given("Verify that the OUR EXPERIENCED STAFFS section is visible on the homepage")
    public void verify_that_the_our_experienced_staffs_section_is_visible_on_the_homepage() {

        Assert.assertTrue(homepage.ourExperiencedStaffsText.isDisplayed());
    }

    @Given("In OUR EXPERIENCED STAFFS, the names Anthony Carter, Ava Turner, Davidson Morgan, Lily Peterson are confirmed")
    public void in_our_experienced_staffs_the_names_anthony_carter_ava_turner_davidson_morgan_lily_peterson_are_confirmed() {

        Assert.assertTrue(homepage.ourExperiencedStaffsAnthonyCarter.isDisplayed());
        Assert.assertTrue(homepage.ourExperiencedStaffsAvaTurner.isDisplayed());
        Assert.assertTrue(homepage.ourExperiencedStaffsDavidMorgan.isDisplayed());
        Assert.assertTrue(homepage.ourExperiencedStaffsLilyPeterson.isDisplayed());

    }


    @Given("Close the page")
    public void close_the_page() {
        Driver.closeDriver();
    }




    @Then("verify What people says section")
    public void verifyWhatPeopleSaysSection() {
        homepage.whatPeopleSaysSectionVerify();
    }

    @Then("verify that the comments are from different individuals")
    public void verifyThatTheCommentsAreFromDifferentIndividuals() {
        homepage.whatPeopleSaysCommentsVerification();
    }


    @Then("The visibility of the Contack section on the page is tested")
    public void the_visibility_of_the_contack_section_on_the_page_is_tested() {
        Assert.assertTrue(homepage.contackButton.isDisplayed());
    }

    @Then("Click the contack button")
    public void click_the_contack_button() {
        homepage.contackButton.click();
        ReusableMethods.bekle(2);
    }

    @Then("The visibility of the buttons in the Send In Your Query section is tested")
    public void the_visibility_of_the_buttons_in_the_send_in_your_query_section_is_tested() throws InterruptedException {
        homepage.nameButton.isDisplayed();
        homepage.emailButton.isDisplayed();
        homepage.subjectButton.isDisplayed();
        homepage.descriptionButton.isDisplayed();
        homepage.nameButton.sendKeys("Gaye");
        ReusableMethods.bekle(1);
        homepage.emailButton.sendKeys("gayeozisikli@gmail.com");
        ReusableMethods.bekle(1);
        homepage.subjectButton.sendKeys("student");
        ReusableMethods.bekle(1);
        homepage.descriptionButton.sendKeys("School performance");
        ReusableMethods.bekle(1);
        ReusableMethods.bekle(1);
        homepage.submitButton.click();
    }

    @Then("The visibility of Our Location Call Us Working Hours information is tested")
    public void the_visibility_of_our_location_call_us_working_hours_information_is_tested() throws InterruptedException {
        ReusableMethods.scrollToElement(Driver.getDriver(),homepage.nameButton);
        homepage.ourLocation.isDisplayed();
        ReusableMethods.bekle(1);
        homepage.callUs.isDisplayed();
        ReusableMethods.bekle(1);
        homepage.workingHours.isDisplayed();
        ReusableMethods.bekle(1);

    }
    @Given("user close the browser")
    public void user_close_the_browser() {
        Driver.closeDriver();
    }




}






















