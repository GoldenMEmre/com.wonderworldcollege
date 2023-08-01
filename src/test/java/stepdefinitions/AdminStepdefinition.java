package stepdefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.AdminPage;
import pages.Base;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class AdminStepdefinition {

    AdminPage adminPage = new AdminPage();


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
        Assert.assertTrue(adminPage.feesCollection.isDisplayed());


    }
    @Given("verify  all title that related with Fees Master are displayed")
    public void verify_all_title_that_related_with_fees_master_are_displayed() {
        Assert.assertTrue(adminPage.feesGroup.isDisplayed());

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
        adminPage.multiClassStudentLink.click();

    }
    @Given("It is verified that the Class and Section textBoxes and the Search button are displayed on the Multiclass page")
    public void it_is_verified_that_the_class_and_section_text_boxes_and_the_search_button_are_displayed_on_the_multiclass_page() {

        Assert.assertTrue(adminPage.multiClassStudentClassTexbox.isDisplayed());
        Assert.assertTrue(adminPage.multiClassStudentSectionTexbox.isDisplayed());
        Assert.assertTrue(adminPage.multiClassStudentSearchButton.isDisplayed());

    }
    @Given("Select the class from the Class tab, select the section from the Section tab and click the search button")
    public void select_the_class_from_the_class_tab_select_the_section_from_the_section_tab_and_click_the_search_button(){

        Select select = new Select(adminPage.multiClassStudentClassTexbox);
        select.selectByIndex(2);
        ReusableMethods.bekle(2);

        select = new Select(adminPage.multiClassStudentSectionTexbox);
        select.selectByIndex(1);
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
        select.selectByIndex(1);
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





    }














