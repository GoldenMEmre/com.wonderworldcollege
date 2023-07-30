package stepdefinitions;



import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.ParentStudentPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;




public class ParentStudentStepdefinition {

    ParentStudentPage parentStudentPage =new ParentStudentPage();
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
        WebElement aa=Driver.getDriver().findElement(By.xpath("(//a[text()='New Academic Session'])[2]"));
        ReusableMethods.scrollToElement(Driver.getDriver(),aa);
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
        //There is no fees section
    }


    @Then("Click on the Sign In button")
    public void click_on_the_sign_ın_button() {
       parentStudentPage.signInButonu.click();
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

     // There is no fees section
    }

}
