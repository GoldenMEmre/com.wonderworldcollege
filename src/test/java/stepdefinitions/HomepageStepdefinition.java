package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
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


}