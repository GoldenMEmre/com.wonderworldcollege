package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.TeacherPage;
import utilities.ReusableMethods;

public class TeacherStepdefinition {

    TeacherPage teacherPage = new TeacherPage();
    @Given("go to login page")
    public void go_to_login_page() {
        ReusableMethods.goToLoginPage();
    }
    @When("click teacher login button")
    public void click_teacher_login_button() {
        teacherPage.clickTeacherLoginButton();
        ReusableMethods.switchToWindow("Login : Wonder World College");
    }
    @Then("enter {string} as username")
    public void enterAsUsername(String username) {
        teacherPage.enterUsername(username);
    }
    @Then("enter {string} as password")
    public void enterAsPassword(String pass) {
        teacherPage.enterPassword(pass);
    }
    @Then("click signin button")
    public void click_signin_button() {
       teacherPage.clickSignIn();
    }
    @And("wait {int} seconds")
    public void waitSeconds(int seconds) {
        ReusableMethods.bekle(seconds);
    }
    @Then("click human resources on side bar")
    public void click_human_resources_on_side_bar() {
        teacherPage.clickHumanResources();
    }
    @Then("click apply leave on side bar")
    public void click_apply_leave_on_side_bar() {
       teacherPage.clickApplyLeaveHumanResources();
    }
    @Then("click on apply leave on leaves page")
    public void click_on_apply_leave_on_leaves_page() {
        teacherPage.clickApplyLeaveButtonLeavesPage();
    }
    @Then("enter {string} on apply date")
    public void enterOnApplyDate(String datum) {
        teacherPage.enterApplyDateAddDetails(datum);
    }
    @Then("enter {string} on leave from date")
    public void enterOnLeaveFromDate(String datum) {
        teacherPage.enterLeaveFromDate(datum);
    }
    @Then("enter {string} on leave to date")
    public void enterOnLeaveToDate(String datum) {
        teacherPage.enterLeaveToDate(datum);
    }
    @Then("select available leave")
    public void selectAvailableLeave() {
        teacherPage.selectAvailableLeave();
    }
    @Then("enter {string} as reason on reason textbox")
    public void enterAsReasonOnReasonTextbox(String grund) {
        teacherPage.entersReason(grund);
    }
    @Then("click on save button")
    public void clickOnSaveButton() {
        teacherPage.clickOnSaveAddDetails();
    }
}
