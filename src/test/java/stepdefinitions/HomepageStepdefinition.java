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

        ReusableMethods.waitForClickablility(homepage.examResultButton, 3);

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

    }

    @Given("Go to {string}")
    public void go_to_url(String Url) {

        Driver.getDriver().get(ConfigReader.getProperty(Url));

    }


    @Given("Click the course menu title")
    public void click_the_course_menu_title(){

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

                Assert.assertTrue(homepage.coursePageComputerScienceTitle.isDisplayed());
                Assert.assertTrue(homepage.coursePageComputerScienceDetailsButton.isDisplayed());

    }

    @Given("Clicking the Details button of the course validated that it can access the detail page.")
    public void clicking_the_details_button_of_the_course_validated_that_it_can_access_the_detail_page() throws InterruptedException {

        String actualTitle;
        String expectedTitle;

        homepage.coursePageEnglishAndLiteratureDetailsButton.click();
        Thread.sleep(1000);
        actualTitle=Driver.getDriver().getTitle();
        expectedTitle="English and Literature";
        Assert.assertEquals(expectedTitle,actualTitle);

        Driver.getDriver().navigate().back();
        Thread.sleep(500);

        homepage.coursePageMathematicsDetailsButton.click();
        Thread.sleep(1000);
        actualTitle=Driver.getDriver().getTitle();
        expectedTitle="Mathematics";
        Assert.assertEquals(expectedTitle,actualTitle);

        Driver.getDriver().navigate().back();
        Thread.sleep(500);

        homepage.coursePageSciencesDetailsButton.click();
        Thread.sleep(1000);
        actualTitle=Driver.getDriver().getTitle();
        expectedTitle="Sciences";
        Assert.assertEquals(expectedTitle,actualTitle);

        Driver.getDriver().navigate().back();

        homepage.coursePageSocialSciencesDetailsButton.click();
        Thread.sleep(1000);
        actualTitle=Driver.getDriver().getTitle();
        expectedTitle="Social Sciences";
        Assert.assertEquals(expectedTitle,actualTitle);

        Driver.getDriver().navigate().back();

        homepage.coursePageHistoryDetailsButton.click();
        Thread.sleep(1000);
        actualTitle=Driver.getDriver().getTitle();
        expectedTitle="History";
        Assert.assertEquals(expectedTitle,actualTitle);

        Driver.getDriver().navigate().back();

        homepage.coursePageArtsAndMusicDetailsButton.click();
        Thread.sleep(1000);
        actualTitle=Driver.getDriver().getTitle();
        expectedTitle="Arts and Music";
        Assert.assertEquals(expectedTitle,actualTitle);

        Driver.getDriver().navigate().back();

        homepage.coursePageHealthAndExerciseSciencesDetailsButton.click();
        Thread.sleep(1000);
        actualTitle=Driver.getDriver().getTitle();
        expectedTitle="Health and Exercise Sciences";
        Assert.assertEquals(expectedTitle,actualTitle);

        Driver.getDriver().navigate().back();

        homepage.coursePageForeignLanguageDetailsButton.click();
        Thread.sleep(1000);
        actualTitle=Driver.getDriver().getTitle();
        expectedTitle="Foreign Language";
        Assert.assertEquals(expectedTitle,actualTitle);

        Driver.getDriver().navigate().back();

        homepage.coursePageComputerScienceDetailsButton.click();
        Thread.sleep(1000);
        actualTitle=Driver.getDriver().getTitle();
        expectedTitle="Computer Science";
        Assert.assertEquals(expectedTitle,actualTitle);
    }


    @Given("Close the page")
    public void close_the_page() {

        Driver.closeDriver();
    }




}