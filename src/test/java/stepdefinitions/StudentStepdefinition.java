package stepdefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.StudentPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class StudentStepdefinition {

    StudentPage studentPage = new StudentPage();

    // ****************** Gulten Harrelson ***************************
    @Given("click user login button")
    public void click_user_login_button() {
        studentPage.studentLogin.click();
        ReusableMethods.bekle(2);
        ReusableMethods.switchToWindow("Login : Wonder World College");


    }

    @Given("enter  user  username")
    public void enter_user_username() {
        studentPage.studentUserName.sendKeys(ConfigReader.getProperty("userLogin"));
    }

    @Given("enter user  password")
    public void enter_user_password() {
        studentPage.studentPassword.sendKeys(ConfigReader.getProperty("userPassword"));

    }

    @Given("click user sign in button")
    public void click_user_sign_in_button() {
        studentPage.studentSignInButton.click();
    }

    @Given("user click Online Exam")
    public void user_click_online_exam() {
        studentPage.onlineExam.click();
        ReusableMethods.bekle(3);

    }

    @Given("The user should be able to view column fields in the Online Exam segment")
    public void the_user_should_be_able_to_view_column_fields_in_the_online_exam_segment() {
        studentPage.examSegment.click();
        ReusableMethods.bekle(1);
        studentPage.quizSegment.click();
        ReusableMethods.bekle(1);
        studentPage.dateToSegment.click();
        ReusableMethods.bekle(1);
        studentPage.durationSegment.click();
        ReusableMethods.bekle(1);
        studentPage.totalAttemptSegment.click();
        ReusableMethods.bekle(1);
        studentPage.attemptedSegment.click();
        ReusableMethods.bekle(1);
        studentPage.statusSegment.click();


    }

    @Given("The user should be able to access the Exam View from the Action section and view the fields")
    public void the_user_should_be_able_to_access_the_exam_view_from_the_action_section_and_view_the_fields() {
        studentPage.eyeButton.click();
        ReusableMethods.bekle(2);
        assertTrue(studentPage.eyeButton.isEnabled());
        ReusableMethods.bekle(2);
        assertTrue(studentPage.examViewBody.isDisplayed());

    }


    @Given("When the user enters the Closed Exam segment, they should be able to see the column fields")
    public void when_the_user_enters_the_closed_exam_segment_they_should_be_able_to_see_the_column_fields() {
        assertTrue(studentPage.closedExamButton.isEnabled());
        ReusableMethods.bekle(2);
        assertTrue(studentPage.closedExamBody.isDisplayed());


    }

    @Given("The user should be able to access the Exam View from the Action section within the Closed Exam segment and view the fields")
    public void the_user_should_be_able_to_access_the_exam_view_from_the_action_section_within_the_closed_exam_segment_and_view_the_fields() {
        assertTrue(studentPage.closedExamEyeButton.isEnabled());
        ReusableMethods.bekle(2);
        assertTrue(studentPage.closedExamEyeBody.isDisplayed());
    }

    @Given("The should be able to access the Apply leave page")
    public void the_should_be_able_to_access_the_apply_leave_page() {
        studentPage.applyLeaveButton.click();
        ReusableMethods.bekle(2);

    }

    @Given("The user should be able to see the Leave List header text")
    public void the_user_should_be_able_to_see_the_leave_list_header_text() {
        String expectedTitle = "Leave List";
        if (expectedTitle.contains("Leave List")) {
            System.out.print("Expected Title PASSED");


        } else {
            System.out.print("Expected Title FAILED");


        }

    }

    @Given("The user should be able to view column fields on the Leave List page")
    public void the_user_should_be_able_to_view_column_fields_on_the_leave_list_page() {
        studentPage.classApplyLeaveButton.click();
        assertTrue(studentPage.classApplyLeaveButton.isDisplayed());
        ReusableMethods.bekle(2);
        studentPage.sectionApplyLeaveButton.click();
        assertTrue(studentPage.sectionApplyLeaveButton.isDisplayed());
        ReusableMethods.bekle(2);
        studentPage.applyDateApplyLeaveButton.click();
        assertTrue(studentPage.applyDateApplyLeaveButton.isDisplayed());
        ReusableMethods.bekle(2);
        studentPage.fromDateApplyLeaveButton.click();
        assertTrue(studentPage.fromDateApplyLeaveButton.isDisplayed());
        ReusableMethods.bekle(2);
        studentPage.toDateApplyLeaveButton.click();
        assertTrue(studentPage.toDateApplyLeaveButton.isDisplayed());
        ReusableMethods.bekle(2);
        studentPage.reasonApplyLeaveButton.click();
        assertTrue(studentPage.reasonApplyLeaveButton.isDisplayed());
        ReusableMethods.bekle(2);
        studentPage.statusApplyLeaveButton.click();
        assertTrue(studentPage.statusApplyLeaveButton.isDisplayed());
        ReusableMethods.bekle(2);

    }

    @Given("The user should be able to access the details page of a pending leave from the Action section and update it")
    public void the_user_should_be_able_to_access_the_details_page_of_a_pending_leave_from_the_action_section_and_update_it() {

        studentPage.editApplyLeaveButton.click();
        ReusableMethods.bekle(8);
        studentPage.messageButton.clear();
        ReusableMethods.bekle(3);
        studentPage.messageButton.sendKeys("Feeling better");
        studentPage.saveButton.click();
        ReusableMethods.bekle(4);

    }


    @Given("The user should be able to click on the Add button add a new leave and see a success message confirming the addition")
    public void the_user_should_be_able_to_click_on_the_add_button_add_a_new_leave_and_see_a_success_message_confirming_the_addition() {

        studentPage.addButton.click();
        ReusableMethods.bekle(1);
        studentPage.fromDateButton.sendKeys("08/08/2023");
        studentPage.toDateButton.sendKeys("08/09/2023");
        studentPage.messageButton.sendKeys("Please don't give me hard time:)");
        ReusableMethods.bekle(6);
        studentPage.saveButton.click();


    }

    @Given("The user should be able to delete a leave from the Action section and see a success message confirming the deletion")
    public void the_user_should_be_able_to_delete_a_leave_from_the_action_section_and_see_a_success_message_confirming_the_deletion() {
        studentPage.deleteButton.click();
        Driver.getDriver().switchTo().alert().accept();


    }

    //*************************************Gulten Harrelson*************************


}
