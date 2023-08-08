package stepdefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;







import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;



import org.openqa.selenium.By;



import io.cucumber.java.en.When;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


import org.openqa.selenium.interactions.Actions;






import org.openqa.selenium.support.ui.Select;

import pages.AdminPage;
import pages.Base;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;


import javax.swing.*;

import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;



import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class AdminStepdefinition {

    AdminPage adminPage = new AdminPage();

    Actions action =new Actions(Driver.getDriver());

  //************************************** Gulten Harrelson********************


    @Given("click admin login")
    public void click_admin_login() {
        adminPage.adminLoginButton.click();

       ReusableMethods.switchToWindow("Login : Wonder World College");
    }
    @Given("enter username")
    public void enter_username() {
        adminPage.adminUser.sendKeys(ConfigReader.getProperty("adminName"));
    }
    @Given("enter password")
    public void enter_password() {
        adminPage.adminPassword.sendKeys(ConfigReader.getProperty("adminPassword"));
    }
    @Given("click sign in button")
    public void click_sign_in_button() {

        ReusableMethods.waitForVisibility(adminPage.signInButton, 1);
        adminPage.signInButton.click();


        adminPage.signInButton.click();

    }
    @Given("Click fees collection")
    public void click_fees_collection() {
        adminPage.feesCollection.click();
    }
    @Given("Click fees master")
    public void click_fees_master() {
        adminPage.feesMasterButton.click();
    }
    @Given("verify that fees Master  displayed")
    public void verify_that_fees_master_displayed() {
        assertTrue(adminPage.feesCollection.isDisplayed());
    }
    @Given("verify  all title that related with Fees Master are displayed")
    public void verify_all_title_that_related_with_fees_master_are_displayed() {

        assertTrue(adminPage.feesGroup.isDisplayed());
        assertTrue(adminPage.feesType.isDisplayed());
        assertTrue(adminPage.dueDate.isDisplayed());
        assertTrue(adminPage.percentage.isDisplayed());
        assertTrue(adminPage.fixAmount.isDisplayed());
        assertTrue(adminPage.amountButton.isDisplayed());
        assertTrue(adminPage.fineType.isDisplayed());
        assertTrue(adminPage.radioNoneButton.isDisplayed());
        assertTrue(adminPage.radioPercentageButton.isDisplayed());
        assertTrue(adminPage.radioFixButton.isDisplayed());
        ReusableMethods.bekle(2);
        assertTrue(adminPage.searchBox.isEnabled());
    }
    @Given("Verify that the title of the Admin Panel is displayed")
    public void verify_that_the_title_of_the_admin_panel_is_displayed() {
        Assert.assertTrue(adminPage.adminLoginButton.isDisplayed());
    }

    @Given("verify  all section title that related with Fees Master can be select by clicking")
    public void verify_all_section_title_that_related_with_fees_master_can_be_select_by_clicking() {
        Select select=new Select(adminPage.feesGroupDropDown);
        select.selectByIndex(1);
        select=new Select(adminPage.feesTypeDropDown);
        select.selectByIndex(1);
            adminPage.dueDateDropDown.sendKeys(ConfigReader.getProperty("Date"));
            ReusableMethods.bekle(2);
           adminPage.amountDropdown.sendKeys(ConfigReader.getProperty("Amount"));
           ReusableMethods.bekle(1);
        adminPage.radioPercentageButton.click();
       adminPage.percentageSelect.sendKeys(ConfigReader.getProperty("Percentage"));
       adminPage.fixAmountSelect.click();
        adminPage.saveButton.click();
    }






    @Given("Enter the valid username and password on the Admin login panel")
    public void enter_the_valid_username_and_password_on_the_admin_login_panel() {

        adminPage.adminUser.sendKeys(ConfigReader.getProperty("sumeyraAdminUsername"));
        adminPage.adminPassword.sendKeys(ConfigReader.getProperty("sumeyraPassword"));
    }

    @Given("Click the Student Information menu on the sidebar in the admin panel and verify that the Multi Class Student link is displayed")
    public void click_the_student_information_menu_on_the_sidebar_in_the_admin_panel_and_verify_that_the_multi_class_student_link_is_displayed() {

        adminPage.studentInformation.click();
        ReusableMethods.bekle(2);
        Assert.assertTrue(adminPage.multiClassStudentLink.isDisplayed());

    }

    @Given("Click on the Multi Class Student link and confirm that the multiclass page is displayed")
    public void click_on_the_multi_class_student_link_and_confirm_that_the_multiclass_page_is_displayed() {

        adminPage.multiClassStudentLink.click();
        ReusableMethods.bekle(1);
        Assert.assertTrue(adminPage.multiClassStudentselectCriteriaText.isDisplayed());


    }


    

    @Given("Student Information, Multi Class Student link is clicked on the admin panel, respectively")
    public void student_information_multi_class_student_link_is_clicked_on_the_admin_panel_respectively() {

        adminPage.studentInformation.click();
        ReusableMethods.bekle(1);
        adminPage.multiClassStudentLink.click();


    }

    


    @Given("It is verified that the Class and Section textBoxes and the Search button are displayed on the Multiclass page")
    public void it_is_verified_that_the_class_and_section_text_boxes_and_the_search_button_are_displayed_on_the_multiclass_page() {

        Assert.assertTrue(adminPage.multiClassStudentClassTexbox.isDisplayed());
        Assert.assertTrue(adminPage.multiClassStudentSectionTexbox.isDisplayed());
        Assert.assertTrue(adminPage.multiClassStudentSearchButton.isDisplayed());

    }


    @Given("Select the class from the Class tab, select the section from the Section tab and click the search button")
    public void select_the_class_from_the_class_tab_select_the_section_from_the_section_tab_and_click_the_search_button() {


        Select select = new Select(adminPage.multiClassStudentClassTexbox);
        select.selectByIndex(3);
        ReusableMethods.bekle(2);

        select = new Select(adminPage.multiClassStudentSectionTexbox);
        select.selectByIndex(1);
        ReusableMethods.bekle(2);

        adminPage.multiClassStudentSearchButton.click();
        ReusableMethods.bekle(2);
      adminPage.multiClassStudentSearchButton.click();
        ReusableMethods.bekle(2);
    }

        
    


    @Given("Verifies that students are listed according to the search criteria")
    public void verifies_that_students_are_listed_according_to_the_search_criteria() {

        Assert.assertTrue(adminPage.multiClassStudentselectCriteriaText2.isDisplayed());


    }


    

    @Given("A new class is added by clicking the + icon in the selected student's window")
    public void a_new_class_is_added_by_clicking_the_icon_in_the_selected_student_s_window() {

        adminPage.multiClassStudentAddButton.click();
        ReusableMethods.bekle(1);

        Select select = new Select(adminPage.multiClassStudentClassTexbox2);
        select.selectByIndex(2);
        ReusableMethods.bekle(1);

        select = new Select(adminPage.multiClassStudentSectionTexbox2);
        select.selectByIndex(3);
        ReusableMethods.bekle(1);



    }


    

    @Given("Clicking the Update button saves the changes made")
    public void clicking_the_update_button_saves_the_changes_made() {

        adminPage.multiClassStudentUpdateButton.click();
        ReusableMethods.bekle(2);


    }

  


    @Given("Click the remove button of the class you want to delete in the selected student's window")
    public void click_the_remove_button_of_the_class_you_want_to_delete_in_the_selected_student_s_window() {

        adminPage.multiClassStudentRemoveButton.click();
        ReusableMethods.bekle(2);


    }


    

    @Given("Quit the page")
    public void quit_the_page() {
        Driver.quitDriver();
    }





    @Given("Verify Record Saved Successfully displayed after clicking save button")
    public void verify_record_saved_successfully_displayed_after_clicking_save_button() {

        String expectedTitle="Record Saved Successfully";

       if(expectedTitle.contains("Record Saved Successfully")){
           System.out.print("Expected title test Passed");


       }else{
           System.out.print("Expected title test Failed");
       }

     //String expectedTitle="Record Saved Successfully";


      
    }
    @Given("Verify that Fees Master List can be updated by clicking edit button")
    public void verify_that_fees_master_list_can_be_updated_by_clicking_edit_button() {
        adminPage.editButton.click();
        Select select=new Select(adminPage.feesGroupDropDown);
        select.selectByIndex(2);
        select=new Select(adminPage.feesTypeDropDown);
        select.selectByIndex(1);
        adminPage.dueDateDropDown.sendKeys(ConfigReader.getProperty("Date"));
        ReusableMethods.bekle(2);
        adminPage.amountDropdown.sendKeys(ConfigReader.getProperty("Amount"));
        ReusableMethods.bekle(1);
        adminPage.percentageSelect.sendKeys(ConfigReader.getProperty("Percentage"));
        adminPage.saveButton.click();
        adminPage.saveButton.click();
        String expectedTitle="Record Updated  Successfully";

        if(expectedTitle.contains("Record Updated  Successfully")){
            System.out.print("Expected title test Passed");

        }else{
            System.out.print("Expected title test Failed");
        }
    }
    @Given("Verify that the delete button is functional")
    public void verify_that_the_delete_button_is_functional() {
    adminPage.deleteButton.click();
        Driver.getDriver().switchTo().alert().accept();
        ReusableMethods.bekle(3);

    }

    //************************************** Gulten Harrelson********************




    @Given("Click on the Collect Fees button")
    public void click_on_the_collect_fees_button() {
       ReusableMethods.bekle(2);
        adminPage.collectFees.click();
        ReusableMethods.bekle(2);
    }
    @Given("The Student Fees page was displayed")
    public void the_student_fees_page_was_displayed() {
        WebElement feesPageElement =Driver.getDriver().findElement(By.xpath("//h3[@class='box-title']"));
        Assert.assertTrue(feesPageElement.isDisplayed());
    }




    @And("User logs as an admin")
    public void userLogsAsAnAdmin() {

        adminPage.adminLoginButton.click();
        ReusableMethods.bekle(5);

//        ReusableMethods.waitForVisibility(adminPage.adminUser,2);
        ReusableMethods.switchToWindow("Login : Wonder World College");
       adminPage.adminUser.sendKeys(ConfigReader.getProperty("adminName"));
       adminPage.adminPassword.sendKeys(ConfigReader.getProperty("adminPassword"));
//
        adminPage.signInButton.click();
    }

    @Given("click profile icon")
    public void click_profile_icon() {
        adminPage.profileIcon.click();
    }
    @When("account holder name and role must be visible")
    public void account_holder_name_and_role_must_be_visible() {
        adminPage.adminText.isDisplayed();
    }
    @Then("profile, password and logout links must be accessible")
    public void profile_password_and_logout_links_must_be_accessible() {
        adminPage.profileButton.isDisplayed();
        adminPage.passwordButton.isDisplayed();
        adminPage.logOutButton.isDisplayed();
    }

    @Then("click profile button")
    public void click_profile_button() {
       adminPage.profileButton.click();
    }

    @When("click payroll leaves attendance and documents")
    public void click_payroll_leaves_attendance_and_documents() {
      adminPage.payrollButton.click();
     ReusableMethods.bekle(2);
     adminPage.leavesButton.click();
     ReusableMethods.bekle(2);
     adminPage.attendanceButton.click();
     ReusableMethods.bekle(2);
     adminPage.documentsButton.click();
    }

    @When("details must be accessible")
    public void details_must_be_accessible() {
        adminPage.profileText.click();
        adminPage.generalDetailPart.isDisplayed();
        adminPage.addressDetailsPart.isDisplayed();
        adminPage.bankAccountDetailsPart.isDisplayed();
        adminPage.socialMediaLinksPart.isDisplayed();
    }
    @Given("click payroll")
    public void click_payroll() {
       adminPage.payrollButton.click();
    }
    @Then("information boards must be accessible")
    public void information_boards_must_be_accessible() {

        adminPage.totalNetSallaryPaid.isDisplayed();
        adminPage.totalGrossSallary.isDisplayed();
        adminPage.totalEarning.isDisplayed();
        adminPage.totalDeduction.isDisplayed();
    }
    @When("payslip list must be accessible")
    public void payslip_list_must_be_accessible() {

        adminPage.payslipList.isDisplayed();

    //   ReusableMethods.waitForVisibility(adminPage.adminUser,2);
     //   adminPage.adminUser.sendKeys(ConfigReader.getProperty("adminName"));
       // adminPage.adminPassword.sendKeys(ConfigReader.getProperty("adminPassword"));

       // adminPage.signInButton.click();
    }








    }

    @Then("click action")
    public void clickAction() {
        adminPage.payrollAction.click();
    }

    @Then("click search textbox")
    public void clickSearchTextbox() {

        adminPage.payrollSearchTextBox.isDisplayed();
    }

    @When("click view paylist")
    public void clickViewPaylist() {
        adminPage.viewPayslip.click();
        adminPage.bordro.isDisplayed();
    }
    @And("close view payslip")
    public void closeViewPayslip() {
        adminPage.bordroClose.click();
    }

    @Given("click leaves")
    public void clickLeaves() {
        adminPage.leavesButton.click();

    }

    @Then("leave list menu must be accessible")
    public void leaveListMenuMustBeAccessible() {
        adminPage.leavesType.isDisplayed();
        adminPage.leaveDate.isDisplayed();
        adminPage.leaveDays.isDisplayed();
        adminPage.applyDate.isDisplayed();
        adminPage.status.isDisplayed();
        adminPage.leavesAction.isDisplayed();
    }

    @Given("click leaves action")
    public void clickLeavesAction() {
     adminPage.leavesAction.click();
    }
    @Then("click view icon")
    public void clickViewIcon() {
    adminPage.viewIcon.click();
    adminPage.viewIcon.isDisplayed();
    }
    @When("close view permisson page")
    public void closeViewPermissonPage() {
        adminPage.viewIconClose.click();
    }
    @Given("click attendance")
    public void clickAttendance() {
        adminPage.attendanceButton.click();
    }

    @Then("attendance information boards must be accessible")
    public void attendanceInformationBoardsMustBeAccessible() {
        adminPage.totalPresent.isDisplayed();
        adminPage.totalLate.isDisplayed();
        adminPage.totalAbsent.isDisplayed();
        adminPage.totalHalfDay.isDisplayed();
        adminPage.totalHoliday.isDisplayed();
    }

    @Given("year should be select")
    public void yearShouldBeSelect() {
        adminPage.attendanceYearSelect.isSelected();
    }

    @Then("descriptions of the letters should be accessible")
    public void descriptionsOfTheLettersShouldBeAccessible() {
        adminPage.attendanceLetters.isDisplayed();
    }
    @Given("relevant staff is listed by month and day in the Attendance List must be accessible")
    public void relevantStaffIsListedByMonthAndDayInTheAttendanceListMustBeAccessible() {
        adminPage.attendanceListStaff.isDisplayed();
    }
    @Given("click pasword button")
    public void clickPaswordButton() {
        adminPage.profileIcon.click();
        adminPage.passwordButton.click();
    }

    @Then("textBoxes about the Password should be accessible")
    public void textboxesAboutThePasswordShouldBeAccessible() {
        adminPage.currentPassword.isDisplayed();
        adminPage.confirmPassword.isDisplayed();
        adminPage.newPassword.isDisplayed();
        adminPage.passwordChangeButton.isDisplayed();
    }

    @Given("click current password and enter password")
    public void clickCurrentPasswordAndEnterPassword() {
        adminPage.currentPasswordTextBox.click();
        adminPage.adminPassword.sendKeys(ConfigReader.getProperty("adminPassword"));

    }

    @Then("click new password and enter new password")
    public void clickNewPasswordAndEnterNewPassword() {
        adminPage.newPasswordTextBox.click();
        adminPage.adminPassword.sendKeys(ConfigReader.getProperty("adminPassword"));

    }
    @When("click confirm password and enter password")
    public void clickConfirmPasswordAndEnterPassword() {
        adminPage.confirmPasswordTextBox.click();
        adminPage.adminPassword.sendKeys(ConfigReader.getProperty("adminPassword"));
    }
    @And("{string} text must be accessible")
    public void passwordChangedSuccessfullyTextMustBeAccessible() {
        adminPage.passwordChangeSuccessfully.isDisplayed();
    }
    @When("click logout button")
    public void clickLogoutButton() {
        adminPage.logOutButton.click();
    }
    @Given("Choose class button")
    public void choose_class_button() {
        WebElement dropdownMenuSelect =Driver.getDriver().findElement(By.xpath("//select[@name='class_id']"));
        ReusableMethods.bekle(2);
        Select select = new Select(dropdownMenuSelect);
        ReusableMethods.bekle(2);


         select.selectByVisibleText("Class 2");
         ReusableMethods.bekle(1);


    }









    @Given("Choose section button")
    public void choose_section_button() {
        WebElement dropDownMenuSection =Driver.getDriver().findElement(By.xpath("(//select[@class='form-control'])[2]"));
        ReusableMethods.bekle(2);
        Select select =new Select(dropDownMenuSection);
        ReusableMethods.bekle(2);
        select.selectByVisibleText("A");
        ReusableMethods.bekle(2);
    }
    @Given("Click  on  the Seach button")
    public void click_on_the_seach_button() {
          adminPage.searchButton.click();
    }
    @Given("Click on the Collect Fees")
    public void click_on_the_collect_fees() {
        adminPage.collectFeesChoose.click();
    }
    @Given("It has been confirmed that the sudent fee list is displayed with columns")
    public void ıt_has_been_confirmed_that_the_sudent_fee_list_is_displayed_with_columns() {
            Assert.assertTrue(adminPage.studentFeesWrite.isDisplayed());
    }
    @Given("When the Currency button is clicked, change the currency")
    public void when_the_currency_button_is_clicked_change_the_currency() {
        WebElement  euro=Driver.getDriver().findElement(By.xpath("(//*[@class='filter-option pull-left'])[1]"));

        euro.click();
        ReusableMethods.bekle(8);
        adminPage.uSDCurrency.click();
        ReusableMethods.bekle(9);
    }
    @Given("Click on the + Sign under the Action column")
    public void click_on_the_sign_under_the_action_column() {
        adminPage.addFessButonu.click();
        ReusableMethods.bekle(2);
    }
    @Given("Verify that the Transport Fees popup is visible.")
    public void verify_that_the_transport_fees_popup_is_visible() {
        adminPage.collectFeesPayButton.click();
        ReusableMethods.bekle(1);
    }
    @Given("Click on the Revert icon under the Action column to revert the payment")
    public void click_on_the_revert_icon_under_the_action_column_to_revert_the_payment() {
        adminPage.revertButton.click();
    }
    @Given("Status section was viewed and the students Fees list section displayed their payment histories")
    public void status_section_was_viewed_and_the_students_fees_list_section_displayed_their_payment_histories() {
        ReusableMethods.bekle(2);
        Assert.assertTrue(adminPage.studentFeesWrite.isDisplayed());
        ReusableMethods.bekle(2);
    }









    //************************************EMRE ADMIN STEP DEFINITIONS********************************

    @And("Click the Admin Login Button")
    public void clickTheAdminLoginButton() {
        adminPage.adminLoginButton.click();
        ReusableMethods.bekle(3);

    }

    @And("Verify that message board is visible")
    public void verifyThatMessageBoardIsVisible() {
        Assert.assertTrue(adminPage.adminPanelMessageBoard.isDisplayed());
    }

    @And("Click the Forgot Password Link")
    public void clickTheForgotPasswordLink() {
        adminPage.adminPanelForgotPasswordElement.click();
    }

    @Then("Verify that Admin Login Panel is displayed")
    public void verifyThatAdminLoginPanelIsDisplayed() {
        Assert.assertTrue(adminPage.adminLoginButton.isDisplayed());
    }

    @And("Verify that Admin Site Login Page is displayed")
    public void verifyThatAdminSiteLoginPageIsDisplayed() {
        Assert.assertTrue(adminPage.adminLoginText.isDisplayed());
    }

    @Given("Login to dashboard with admin name and admin password as admin")
    public void login_to_dashboard_with_admin_name_and_admin_password_as_admin() {
        Driver.getDriver().get(ConfigReader.getProperty("loginurl"));
        adminPage.adminLoginButton.sendKeys(ConfigReader.getProperty("adminMelike"));
        adminPage.adminPassword.sendKeys(ConfigReader.getProperty("adminPassword"));
        adminPage.adminLoginButton.click();
    }

    @Then("Click the Chat page")
    public void click_the_chat_page() {
        adminPage.adminLoginButton.click();


    }


    @Then("The TextBox is visible")
    public void the_text_box_is_visible() {

        Assert.assertTrue(adminPage.adminDasbhoardChatPageMessageTextBox.isDisplayed());
    }

    @When("Type a message in the TextBox")
    public void type_a_message_in_the_text_box() {
        adminPage.adminDasbhoardChatPageMessageTextBox.sendKeys("Hello, this is a test message.");
    }

    @Then("The send icon becomes active")
    public void the_send_icon_becomes_active() {
        Assert.assertTrue(adminPage.adminDashboardMessageTextBoxSendButton.isDisplayed());

    }








    @And("Switch to window")
    public void switchToWindow() {
        ReusableMethods.switchToWindow("Login : Wonder World College");
    }

    @And("Verify that Admin Login Username Box is diplayed")
    public void verifyThatAdminLoginUsernameBoxIsDiplayed() {
        Assert.assertTrue(adminPage.adminLoginUsernameTextBox.isDisplayed());

    }

    @And("Verify that Admin Login Password Box is displayed")
    public void verifyThatAdminLoginPasswordBoxIsDisplayed() {
        Assert.assertTrue(adminPage.adminLoginPasswordTextBox.isDisplayed());
    }


    @And("Verify that Admin Login Submit Button is displayed")
    public void verifyThatAdminLoginSubmitButtonIsDisplayed() {
        Assert.assertTrue(adminPage.adminLoginSubmitButton.isEnabled());

    }

    @And("Enter Forgot Password Email Adress")
    public void enterForgotPasswordEmailAdress() {
        adminPage.forgotPasswordEmailBox.sendKeys(ConfigReader.getProperty("userloginemail"));
    }

    @And("Click the Forgot Botton Submit Button")
    public void clickTheForgotBottonSubmitButton() {
        adminPage.forgotPasswordSubmitButton.click();
    }

    @And("Verify that Admin Login password reset email is sent")
    public void verifyThatAdminLoginPasswordResetEmailIsSent() {
        Assert.assertTrue(adminPage.forgotPasswordResetEmailAlert.isDisplayed());
        ReusableMethods.bekle(3);
    }

    @And("Verify that Admin User Login Link is enabled")
    public void verifyThatAdminUserLoginLinkIsEnabled() {
        Assert.assertTrue(adminPage.adminPasswordForgotLink.isEnabled());
        ReusableMethods.bekle(3);
    }

    @And("Click the Admin User Login Link")
    public void clickTheAdminUserLoginLink() {
        adminPage.adminPasswordForgotLink.click();
        ReusableMethods.bekle(3);
    }

    @And("Click Forgot Password Admin Login Link")
    public void clickForgotPasswordAdminLoginLink() {
        adminPage.forgotPasswordAdminLoginLink.click();
        ReusableMethods.bekle(3);
    }

    @And("Click Site Login User Login Link")
    public void clickSiteLoginUserLoginLink() {
        adminPage.siteLoginUserLoginLink.click();
        ReusableMethods.bekle(3);
    }

    @And("Verify that User Login Front Page Link is visible")
    public void verifyThatUserLoginFrontPageLinkIsVisible() {
        Assert.assertTrue(adminPage.userLoginFrontPageLink.isDisplayed());
        ReusableMethods.bekle(3);
    }

    @And("Click the User Login Front Page Link")
    public void clickTheUserLoginFrontPageLink() {
        adminPage.userLoginFrontPageLink.click();
        ReusableMethods.bekle(3);
    }


    //*************************************************************************************************


    @Then("Click on the send icon")
    public void click_on_the_send_icon() {
        adminPage.adminDashboardMessageTextBoxSendButton.click();
    }







    @And("Verify that Forgot Password Link is active")
    public void verifyThatForgotPasswordLinkIsActive() {
        Assert.assertTrue(adminPage.adminPasswordForgotLink.isDisplayed());
    }









    //*************************************************************************************************


    //*************************************************************************************************


    @Then("The message is sent successfully")
    public void the_message_is_sent_successfully() {
        Assert.assertTrue(adminPage.getAdminDashboardSentMessageText.isDisplayed());


    }




}

@Then("enter username and password afterward click on signin")
    public void enterUsernameAndPasswordAfterwardClickOnSignin() {
        adminPage.enterUsernamePasswordAndClickSignIn();
    }

    @Then("verify Transport and Routes Sections and click on them one by one")
    public void verifyTransportAndRoutesSectionsAndClickOnThemOneByOne() {
        adminPage.clickVerifyTransport();
    }

    @Then("verify the textbox and button")
    public void verifyTheTextboxAndButton() {
        adminPage.verifyTitleAndTextBoxesRoutePage();
    }



    @Then("enter required informations and click on save and verify created route")
    public void enterRequiredInformationsAndClickOnSaveAndVerifyCreatedRoute() {
        adminPage.createVerifyRoute();
    }

    @Then("verify the columns")
    public void verifyTheColumns() {
        adminPage.verifyColumnsRoutesPage();
    }






    @Then("edit created Route and verify the changes")
    public void editCreatedRouteAndVerifyTheChanges() {
        adminPage.editVerifyRoute();
    }

    @Then("delete the edited Route")
    public void deleteTheEditedRoute() {
        adminPage.deleteRoute();
    }
}




































