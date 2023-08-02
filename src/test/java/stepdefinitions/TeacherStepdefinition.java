package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.TeacherPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import static org.junit.Assert.assertTrue;


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
        ReusableMethods.bekle(2);
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

    @Given("Enter the valid username and password on the Teacher login panel")
    public void enter_the_valid_username_and_password_on_the_teacher_login_panel() {

        teacherPage.adminUser.sendKeys(ConfigReader.getProperty("sumeyraTeacherUsername"));
        teacherPage.adminPassword.sendKeys(ConfigReader.getProperty("sumeyraPassword"));

    }

    @Given("On the sidebar of the teacher panel, the Examinations menu is clicked and it is verified that the Exam Group link is displayed")
    public void on_the_sidebar_of_the_teacher_panel_the_examinations_menu_is_clicked_and_it_is_verified_that_the_exam_group_link_is_displayed() {

        teacherPage.examinations.click();
        ReusableMethods.bekle(1);
        Assert.assertTrue(teacherPage.examGroupLink.isDisplayed());

    }
    @Given("Click on the Exam Group link and verify that it is directed to the examgroup page")
    public void click_on_the_exam_group_link_and_verify_that_it_is_directed_to_the_examgroup_page() {

        teacherPage.examGroupLink.click();
        ReusableMethods.bekle(1);
        Assert.assertTrue(teacherPage.addExamGroupText.isDisplayed());
        Assert.assertTrue(teacherPage.examGroupListText.isDisplayed());


    }
    // ***************************** Gulten Harrelson*****************************



    @Given("enter  teacher username")
    public void enter_teacher_username() {

        teacherPage.adminUser.sendKeys(ConfigReader.getProperty("teacherUserName"));

    }
    @Given("enter teacher password")
    public void enter_teacher_password() {
        teacherPage.adminPassword.sendKeys(ConfigReader.getProperty("adminPassword"));
    }

    @Given("click teacher sign in button")
    public void click_teacher_sign_in_button() {
        teacherPage.signInButton.click();

    }

    @Given("Click Attendance menu")
    public void click_attendance_menu() {
        teacherPage.attendanceMenu.click();
    }

    @Given("Verify that under Attendance menu the Period Attendance By Date is visible and clickable")
    public void verify_that_under_attendance_menu_the_period_attendance_by_date_is_visible_and_clickable() {
        teacherPage.periodAttendanceByDate.click();
        ReusableMethods.bekle(2);
        assertTrue(teacherPage.periodAttendanceByDate.isEnabled());

    }


        @Given("verify all section titles that related with Select Criteria is active and visible")
        public void verify_all_section_titles_that_related_with_select_criteria_is_active_and_visible () {
            assertTrue(teacherPage.ClassIcon.isDisplayed());
            assertTrue(teacherPage.ClassIcon.isEnabled());
            ReusableMethods.bekle(1);
            assertTrue(teacherPage.sectionIcon.isDisplayed());

            assertTrue(teacherPage.dateIcon.isDisplayed());
            ReusableMethods.bekle(3);
            Select select = new Select(teacherPage.classDropDown);
            select.selectByIndex(1);
            select = new Select(teacherPage.sectionDropDown);
            select.selectByIndex(1);
            teacherPage.dateDropDown.sendKeys(ConfigReader.getProperty(" Date"));
            teacherPage.periodAttendanceByDateSearchicon.click();


        }
        @Given("Click Period Attendance By Date")
        public void click_period_attendance_by_date () {
            teacherPage.periodAttendanceByDate.click();
        }

        @Given("verify that the Student List is displayed and active when searching  for the attendance records of all students for the specified date")
        public void verify_that_the_student_list_is_displayed_and_active_when_searching_for_the_attendance_records_of_all_students_for_the_specified_date
        () {
            Select select = new Select(teacherPage.classDropDown);
            select.selectByIndex(1);
            select = new Select(teacherPage.sectionDropDown);
            select.selectByIndex(1);
            // select=new Select(teacherPage.dateDropDown);
            JavascriptExecutor hadi = (JavascriptExecutor) Driver.getDriver();
            teacherPage.dateDropDown.click();

            //teacherPage.dateDropDown.sendKeys(ConfigReader.getProperty("DateTeacher"));

            // daha calsimam lazim bu soru icin
            //assertTrue(teacherPage.studentList.isDisplayed());


        }

        // **************************Gulten Harrelson *************************** 1.Sonu
        // **************************Gulten Harrelson *************************** 2.Baslangic
        @Given("click  Online Exam Section under the  online Examinations")
        public void click_online_exam_section_under_the_online_examinations () {
            teacherPage.onlineExaminations.click();
            teacherPage.onlineExam.click();

        }
        @Given("The user should be able to view column fields in the  Online Exam segment.")
        public void the_user_should_be_able_to_view_column_fields_in_the_online_exam_segment () {

        }

        @Given("The user should be able to access the Exam View from the Action section and view the fields.")
        public void the_user_should_be_able_to_access_the_exam_view_from_the_action_section_and_view_the_fields () {

        }
        @Given("When the user enters the Closed Exam segment, they should be able to see the column fields.")
        public void when_the_user_enters_the_closed_exam_segment_they_should_be_able_to_see_the_column_fields () {
            // Write code here that turns the phrase above into concrete actions
            throw new io.cucumber.java.PendingException();
        }

        @Given("The user should be able to access the Exam View from the Action section within the Closed Exam segment and view the fields.")
        public void the_user_should_be_able_to_access_the_exam_view_from_the_action_section_within_the_closed_exam_segment_and_view_the_fields
        () {
            // Write code here that turns the phrase above into concrete actions
            throw new io.cucumber.java.PendingException();
        }
        // **************************Gulten Harrelson *************************** 2.Sonu


    }




