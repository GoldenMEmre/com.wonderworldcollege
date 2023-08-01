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



    @Then("Verify Forgot Password Link")
    public void verify_forgot_password_link() {
        Assert.assertTrue(parentStudentPage.userLoginForgotPasswordLinkElement.isDisplayed());



    }
}

