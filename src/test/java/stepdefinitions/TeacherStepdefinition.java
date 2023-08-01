package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;
import pages.TeacherPage;
import utilities.Driver;
import utilities.ReusableMethods;


public class TeacherStepdefinition {

    TeacherPage teacherPage = new TeacherPage();
    Actions actions = new Actions(Driver.getDriver());
    @Given("go to login page")
    public void go_to_login_page() {
        ReusableMethods.goToLoginPage();
    }
    @When("click teacher login button")
    public void click_teacher_login_button() {
        teacherPage.clickTeacherLoginButton();
        ReusableMethods.switchToWindow("Login : Wonder World College");
        ReusableMethods.bekle(3);
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
        ReusableMethods.bekle(3);
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
        ReusableMethods.bekle(2);
    }

    @Then("enter date on leave from date")
    public void enterDateOnLeaveFromDate() {
        teacherPage.enterLeaveFromDate();
    }

    @Then("enter date on leave to date")
    public void enterDateOnLeaveToDate() {
        teacherPage.enterLeaveToDate();
    }

    @And("verify that leave request has been created")
    public void verifyThatLeaveRequestHasBeenCreated() {
        teacherPage.verifyLeaveRequest();
    }

    @Then("verify the columns on leaves list page")
    public void verify_the_columns_on_leaves_list_page() {
            teacherPage.verifyColumnsLeavesList();
    }
    @Then("verify the status of created leave request")
    public void verify_the_status_of_created_leave_request() {
        teacherPage.verifyStatusLeavesList();
    }

    @Then("verify view button and click on it")
    public void verifyViewButtonAndClickOnIt() {
        teacherPage.verifyViewButton();
        ReusableMethods.bekle(2);
    }

    @Then("verify that details window is accessible")
    public void verifyThatDetailsWindowIsAccessible() {
        teacherPage.verifyDetailsWindow();
    }

    @Then("verify that leave request has been deleted")
    public void verifyThatLeaveRequestHasBeenDeleted() {
        teacherPage.deleteTestLeaveRequest();
    }

    @Then("verify and click on delete button")
    public void verifyAndClickOnDeleteButton() {
        teacherPage.clickOnDeleteButtonLeavesPage();
    }

    @Then("close details window")
    public void closeDetailsWindow() {
        teacherPage.closeDetailsWindow();
    }
}
