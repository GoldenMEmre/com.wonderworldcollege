package stepdefinitions;



import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.HomePage;
import pages.ParentStudentPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;




public class ParentStudentStepdefinition {

    ParentStudentPage parentStudentPage = new ParentStudentPage();


    @Given("Go to {string}.")
    public void go_to(String requestedUrl) {
        Driver.getDriver().get(ConfigReader.getProperty(requestedUrl));
    }

    @Then("Enter  Correct user name  {string}")
    public void enter_correct_user_name(String studentUsername) {
        parentStudentPage.userloginuserNameTextBoxElement.sendKeys(ConfigReader.getProperty(studentUsername));
        ReusableMethods.bekle(1);

    }

    @Then("Enter Correct password {string}")
    public void enter_correct_password(String studentPassword) {
        parentStudentPage.userloginpasswordTextBoxElement.sendKeys(ConfigReader.getProperty(studentPassword));
        ReusableMethods.bekle(1);
    }

    @Then("The My Profile button was displayed")
    public void the_my_profile_button_was_displayed() throws InterruptedException {
        Assert.assertTrue(parentStudentPage.myProfileButton.isDisplayed());

    }

    @Then("The Profile button was clicked and displayed.")
    public void the_profile_button_was_clicked_and_displayed() throws InterruptedException {
        parentStudentPage.myProfileButton.click();
        ReusableMethods.bekle(3);
        WebElement aa = Driver.getDriver().findElement(By.xpath("(//a[text()='New Academic Session'])[2]"));
        ReusableMethods.scrollToElement(Driver.getDriver(), aa);
        Assert.assertTrue(parentStudentPage.myProfileButton.isDisplayed());
        ReusableMethods.bekle(2);

    }

    @Then("The Exam button was clicked and displayed.")
    public void the_exam_button_was_clicked_and_displayed() {

    }

    @Then("The Documents button was clicked and displayed.")
    public void the_documents_button_was_clicked_and_displayed() {

    }

    @Then("The Fees button was clicked and displayed.")
    public void the_fees_button_was_clicked_and_displayed() {

        Assert.assertTrue(parentStudentPage.afees.isDisplayed());
        //***************There is no fees section(BUG)
    }


    @Then("Click on the Sign In button")
    public void click_on_the_sign_ın_button() {
        parentStudentPage.signInButonu.click();
        ReusableMethods.bekle(3);
    }


    @Then("The Profile button was clicked and the relevant sections were displayed.")
    public void the_profile_button_was_clicked_and_the_relevant_sections_were_displayed() {
        parentStudentPage.ProfileButton.click();
        Assert.assertTrue(parentStudentPage.ProfileButton.isDisplayed());
        ReusableMethods.bekle(2);
    }

    @Then("The Exam button was clicked and the relevant sections were displayed.")
    public void the_exam_button_was_clicked_and_the_relevant_sections_were_displayed() {
        parentStudentPage.ExamButton.click();
        Assert.assertTrue(parentStudentPage.ExamButton.isDisplayed());
        ReusableMethods.bekle(1);
    }

    @Then("The Document button was clicked and the relevant sections were displayed.")
    public void the_document_button_was_clicked_and_the_relevant_sections_were_displayed() {
        parentStudentPage.ExamButton.click();
        Assert.assertTrue(parentStudentPage.DokumentButton.isDisplayed());
        ReusableMethods.bekle(2);
    }

    @Then("The Fees button was clicked and the relevant sections were displayed.")
    public void the_fees_button_was_clicked_and_the_relevant_sections_were_displayed() {
        Assert.assertTrue(parentStudentPage.afees.isDisplayed());

        // There is no fees section (BUG)
    }


    @Then("The {string} button was displayed.")
    public void the_button_was_displayed(String string) {
        Assert.assertTrue(parentStudentPage.homeWorkButton.isDisplayed());
    }


    @Then("Click on the {string} button.")
    public void click_on_the_button(String string) {
        parentStudentPage.homeWorkButton.click();
    }

    @Then("The {string} button was clicked and the relevant sections were displayed.")
    public void the_button_was_clicked_and_the_relevant_sections_were_displayed(String string) {
        Assert.assertTrue(parentStudentPage.classColumn.isDisplayed());
    }

    @Then("Click on the Homework button.")
    public void click_on_the_homework_button() {
        parentStudentPage.homeWorkButton.click();
    }

    @Then("The Upcoming Homeworkbutton was clicked and the relevant sections were displayed.")
    public void the_upcoming_homeworkbutton_was_clicked_and_the_relevant_sections_were_displayed() {
        Assert.assertTrue(parentStudentPage.classColumn.isDisplayed());
        ReusableMethods.bekle(2);
    }

    @Then("Click on the  Upcoming Homework button")
    public void click_on_the_upcoming_homework_button() {
        parentStudentPage.upcomingHomeworkButton.click();
    }

    @Then("Click on the Action section.")
    public void click_on_the_action_section() {
        parentStudentPage.actionButonuSection.click();
    }

    @Then("The homework details page was displayed.")
    public void the_homework_details_page_was_displayed() {
        ReusableMethods.bekle(4);
        Assert.assertTrue(parentStudentPage.homeWorkDetailsWrite.isDisplayed());
        ReusableMethods.bekle(4);
    }

    @Then("Sent message.")
    public void sent_message() {
        ReusableMethods.bekle(3);
        parentStudentPage.messageTextBox.sendKeys("I want to work on geraniums");
        parentStudentPage.saveButton.click();

    }


    @Then("Click on the  Closed Homework button")
    public void click_on_the_closed_homework_button() {
        parentStudentPage.closeddHomeWorkButton.click();
    }

    @Then("click on the   Action section in the Closed Homework section.")
    public void click_on_the_action_section_in_the_closed_homework_section() {
        parentStudentPage.actionSectionClosed.click();
    }

    @Then("The homework details section in the Closed Homework section is displayed.")
    public void the_homework_details_section_in_the_closed_homework_section_is_displayed() {
        ReusableMethods.bekle(4);
        Assert.assertTrue(parentStudentPage.homeWorkDetailsWrite.isDisplayed());
        ReusableMethods.bekle(4);
    }


    @Then("Click on the Daily Assignment button.")
    public void click_on_the_daily_assignment_button() {
        parentStudentPage.dailyAssignment.click();
        ReusableMethods.bekle(3);
        ReusableMethods.switchToWindow("https://qa.wonderworldcollege.com/user/homework/dailyassignment");
        ReusableMethods.bekle(3);
        parentStudentPage.dailyAssigmentTwo.click();
    }

    @Then("The Add Daily Assignment page was displayed")
    public void the_add_daily_assignment_page_was_displayed() {

    }

    @Then("A new assignment has been created.")
    public void a_new_assignment_has_been_created() {
        WebElement dropDownMenu = Driver.getDriver().findElement(By.xpath("//select[@name='subject']"));

        Select select = new Select(dropDownMenu);
        select.selectByVisibleText("Science (111) ");
        ReusableMethods.bekle(2);
        parentStudentPage.titleTextBox.sendKeys("hello World");
        ReusableMethods.bekle(2);
        parentStudentPage.descriptionTextBox.sendKeys("hello teacher");
        ReusableMethods.bekle(2);
        parentStudentPage.saveButtonAddAssigment.click();


    }


    @Then("Click on the Edit")
    public void click_on_the_edit() {
        ReusableMethods.bekle(3);

        WebElement Xicon = Driver.getDriver().findElement(By.xpath("//button[@class='close']"));
        ReusableMethods.bekle(3);
        Xicon.click();
        parentStudentPage.dailyAssignmentEditİcon.click();


        ReusableMethods.bekle(3);
        WebElement dropDownMenu = Driver.getDriver().findElement(By.xpath("(//select[@class='form-control'])[2]"));
        ReusableMethods.bekle(3);
        Select select = new Select(dropDownMenu);
        select.selectByVisibleText("Science (111) ");
        ReusableMethods.bekle(2);
        parentStudentPage.titleTextBox.clear();
        ReusableMethods.bekle(2);
        parentStudentPage.titleTextBox.sendKeys("hello World");
        ReusableMethods.bekle(2);

        parentStudentPage.EditSaveButton.click();


    }


    @Then("Click on the Delete")
    public void click_on_the_delete() {
        ReusableMethods.bekle(3);
        parentStudentPage.dailyAssignmentDeleteİcon.click();
        ReusableMethods.bekle(3);
        Driver.getDriver().switchTo().alert();
        Driver.getDriver().switchTo().alert().accept();


    }

    @Then("The Add Daily Assignment page was displayedd")
    public void the_add_daily_assignment_page_was_displayedd() {
        WebElement Xicon = Driver.getDriver().findElement(By.xpath("//button[@class='close']"));
        ReusableMethods.bekle(3);
        Xicon.click();
    }

    @Then("Verify the login into the panel")
    public void verify_the_login_into_the_panel() {
        Assert.assertTrue(parentStudentPage.myProfileButton.isDisplayed());
    }

    @Then("Enter wrong user name")
    public void enter_wrong_user_name() {
        parentStudentPage.userloginuserNameTextBoxElement.sendKeys("hfffgfg");
    }

    @Then("Enter wrong password")
    public void enter_wrong_password() {
        parentStudentPage.userloginpasswordTextBoxElement.sendKeys("sdsdnghg");

    }

    @And("Verify not log into the Panel")
    public void verifyNotLogIntoThePanel() {
        Assert.assertTrue(parentStudentPage.userloginuserNameTextBoxElement.isEnabled());
    }

    @And("Verify the Front Site Link")
    public void verifyTheFrontSiteLink() {
        Assert.assertTrue(parentStudentPage.userLoginFrontSiteLinkElement.isDisplayed());

    }



    @Then("click student login")
    public void clickStudentLogin() {
        parentStudentPage.userLoginButonu.click();
        ReusableMethods.bekle(2);
        ReusableMethods.switchToWindow("Login : Wonder World College");
    }

    @Then("enter student name")
    public void enterStudentName() {
 parentStudentPage.studentUserName.sendKeys(ConfigReader.getProperty("studentName"));

    }

    @Then("enter student password")
    public void enterStudentPassword() {
        parentStudentPage.studentPassword.sendKeys(ConfigReader.getProperty("studentPassword"));
    }

    @Given("click student password")
    public void clickStudentPassword() {
        parentStudentPage.profileIcon.click();
        parentStudentPage.passwordClick.click();
    }

    @Then("click student username change")
    public void clickStudentUsernameChange() {
        parentStudentPage.changeUserNameButton.click();
    }

    @Given("user name must be min {int} char")
    public void userNameMustBeMinChar(int arg0) {
    }

    @Given("should give {string} warning when user enters wrong username")
    public void shouldGiveUsernameMustContainAMinumumCharactersWarningWhenUserEntersWrongUsername(int arg0) {

    }

    @Given("{string} should be written when the user enters the correct combination")
    public void usernameHasBeenChangedSuccessfullyShouldBeWrittenWhenTheUserEntersTheCorrectCombination() {
        parentStudentPage.saveButton.click();

    @Then("click and verify examinations and exam schedule buttons on side bar")
    public void clickAndVerifyExaminationsAndExamScheduleButtonsOnSideBar() {
        parentStudentPage.examinationsExamScheduleClickverify();
    }

    @Then("verify exam schedule page")
    public void verifyExamSchedulePage() {
        parentStudentPage.examScheduleHeaderTextVerify();
    }

    @Then("search an exam on search box and verify that")
    public void searchAnExamOnSearchBoxAndVerifyThat() {
        parentStudentPage.filterExamVerify();
    }

    @Then("verify the columns on exam schedule page")
    public void verifyTheColumnsOnExamSchedulePage() {
        parentStudentPage.columnsVerificationExamSchedule();
    }

    @Then("click on view button and verify exam details page")
    public void clickOnViewButtonAndVerifyExamDetailsPage() {
        parentStudentPage.examDetailsPageVerify();
    }

    @Then("verify the columns on exam details page")
    public void verifyTheColumnsOnExamDetailsPage() {
        parentStudentPage.examDetailsPageColumnsVerification();
    }

    @Then("click on login button")
    public void clickOnLoginButton() {
        parentStudentPage.clickLoginButtonHomePage();
    }

    @Then("enter username and password")
    public void enterUsernameAndPassword() {
        parentStudentPage.enterUserNameAndPassword();
    }

    @Then("click and verify teacher reviews button on side bar")
    public void clickAndVerifyTeacherReviewsButtonOnSideBar() {
        parentStudentPage.teachersReviewsClickVerify();
    }

    @Then("verify teacher review header text")
    public void verifyTeacherReviewHeaderText() {
        parentStudentPage.teacherReviewsHeaderTextVerify();
    }

    @Then("click on rate button")
    public void clickOnRateButton() {
        parentStudentPage.clickOnRatebutton();
    }

    @Then("rate teacher and write a command afterward click on save button")
    public void rateTeacherAndWriteACommandAfterwardClickOnSaveButton() {
        parentStudentPage.rateTeacher();
    }

    @Then("enter username and password for a parent login")
    public void enterUsernameAndPasswordForAParentLogin() {
        parentStudentPage.enterUserNameAndPasswordParent();
    }

    @Then("verify and click profile image button")
    public void verifyAndClickProfileImageButton() {
        parentStudentPage.profileImageClickVerify();
    }

    @Then("verify and click change password button")
    public void verifyAndClickChangePasswordButton() {
        parentStudentPage.changePasswordButtonclickVerify();
    }

    @Then("verify redirection after clicking change password button")
    public void verifyRedirectionAfterClickingChangePasswordButton() {
        parentStudentPage.changePasswordPageRedirectionverify();
    }

    @Then("make positive change password text")
    public void makePositiveChangePasswordText() {
        parentStudentPage.positiveChangePasswordTest();
    }

    @Then("enter username and new password")
    public void enterUsernameAndNewPassword() {
        parentStudentPage.loginAfterPositiveChangePassword();
    }

    @Then("make negative change password test")
    public void makeNegativeChangePasswordTest() {
        parentStudentPage.negativeChangePasswordText();
    }

    @Then("log out from parent page")
    public void logOutFromParentPage() {
        parentStudentPage.logOutParentPage();
    }

    @Then("make a log in with username and negative password")
    public void makeALogInWithUsernameAndNegativePassword() {
        parentStudentPage.verificationNegativeLoginTest();
    }

    @Then("click on SignIn Button")
    public void clickOnSignInButton() {

        parentStudentPage.signInButtonclickUserLogin();

    }
}

