package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class HomepageStepdefinition {

    HomePage homepage = new HomePage();
    @Given("user goes to url")
    public void user_goes_to_url() {
      Driver.getDriver().get(ConfigReader.getProperty("url"));
    }
    @Then("user clicks exam result button")
    public void userClicksExamResultButton() {

        ReusableMethods.waitForClickablility(homepage.examResultButton,3);

        homepage.examResultButton.click();
    }
    @Then("user verifies that the exam result page is opened")
    public void verifiesThatTheExamResultPageIsOpened() {
      
        homepage.examResultText.isDisplayed();
    }
    @And("User enters admission number")
    public void enterAdmissionNumber() {
        homepage.admissionNoButton.sendKeys("18008");
    }

    @And("User selects exam")
    public void selectExam(){
        Select select=new Select(homepage.examDropDown);
        select.selectByVisibleText("Test Examination");
    }
    @Then("The user clicks the search button after entering the admission number and selecting the exam.")
    public void clickSearchButton(){
        homepage.examResultPageSearchButton.click();
    }
    @And("user verifies that result text appears")
    public void examResultPageResultText(){
        homepage.examResultPageResultText.isDisplayed();

    }
    @Given("Go to {string}")
    public void go_to_url(String Url) {

        Driver.getDriver().get(ConfigReader.getProperty(Url));
    }
    @Given("Click the course menu title")
    public void click_the_course_menu_title() {

    }
    @Given("Verify that you have been to the course page")
    public void verify_that_you_have_been_to_the_course_page() {

    }
    @Given("Verifies that the {string} course title is visible")
    public void verifies_that_the_course_title_is_visible(String string) {

    }

    @Given("User go to Url")
    public void user_go_to_Url (String Url) {
        Driver.getDriver().get(ConfigReader.getProperty(Url));
    }
    @Then("user test if the images change at regular intervals")
    public void user_test_if_the_images_change_at_regular_intervals() {
        Assert.assertTrue(homepage.preparingImg.isDisplayed()||
                homepage.diverseImg.isDisplayed() || homepage.wonderImg.isDisplayed()||
                homepage.studentsImg.isDisplayed()||homepage.nurturingImg.isDisplayed());

    }
    @Then("wait {int} seconds")
    public void wait_seconds() {
        ReusableMethods.bekle(5);

    }
    @Then("user close the browser")
    public void user_close_the_browser() {
        Driver.closeDriver();
    }

    @Then("The homepage was reached on the website")
    public void the_homepage_was_reached_on_the_website() throws InterruptedException {
        Assert.assertTrue(homepage.CallUsText.isDisplayed());
         Thread.sleep(2000);
    }
    @Then("The Achievements  section was displayed as the page was scrolled down.")
    public void the_achievements_section_was_displayed_as_the_page_was_scrolled_down() throws InterruptedException {
       ReusableMethods.scrollToElement(Driver.getDriver(), homepage.acheıvementsSection);
       // Thread.sleep(5000);
        Assert.assertTrue(homepage.acheıvementsSection.isDisplayed());

    }
    @And("Close the page.")
    public void close_the_page() {
           Driver.quitDriver();

    }

    @Then("The visibility of the boards in the Achievements section has been confirmed.")
    public void theVisibilityOfTheBoardsInTheAchievementsSectionHasBeenConfirmed() {

         Assert.assertTrue(homepage.studentCampusesBoard.isDisplayed());
    }

    }