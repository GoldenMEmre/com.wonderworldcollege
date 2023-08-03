package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import io.cucumber.java.en.When;
import org.junit.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.Select;
import pages.AdminPage;
import pages.Base;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class AdminStepdefinition {

    AdminPage adminPage = new AdminPage();


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
        Select select = new Select(adminPage.feesGroupDropDown);
        select.selectByIndex(1);
        select = new Select(adminPage.feesTypeDropDown);
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

    @Given("Verify Record Saved Successfully displayed after clicking save button")
    public void verify_record_saved_successfully_displayed_after_clicking_save_button() {

        String expectedTitle = "Record Saved Successfully";

        if (expectedTitle.contains("Record Saved Successfully")) {
            System.out.print("Expected title test Passed");

        } else {
            System.out.print("Expected title test Failed");
        }
    }

    @Given("Verify that Fees Master List can be updated by clicking edit button")
    public void verify_that_fees_master_list_can_be_updated_by_clicking_edit_button() {
        adminPage.editButton.click();
        Select select = new Select(adminPage.feesGroupDropDown);
        select.selectByIndex(2);
        select = new Select(adminPage.feesTypeDropDown);
        select.selectByIndex(1);
        adminPage.dueDateDropDown.sendKeys(ConfigReader.getProperty("Date"));
        ReusableMethods.bekle(2);
        adminPage.amountDropdown.sendKeys(ConfigReader.getProperty("Amount"));
        ReusableMethods.bekle(1);
        adminPage.percentageSelect.sendKeys(ConfigReader.getProperty("Percentage"));
        adminPage.saveButton.click();
        adminPage.saveButton.click();
        String expectedTitle = "Record Updated  Successfully";

        if (expectedTitle.contains("Record Updated  Successfully")) {
            System.out.print("Expected title test Passed");

        } else {
            System.out.print("Expected title test Failed");
        }
    }

    @Given("Verify that the delete button is functional")
    public void verify_that_the_delete_button_is_functional() {
        adminPage.deleteButton.click();
        Driver.getDriver().switchTo().alert().accept();
        ReusableMethods.bekle(3);
        Driver.closeDriver();
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
        WebElement feesPageElement = Driver.getDriver().findElement(By.xpath("//h3[@class='box-title']"));
        Assert.assertTrue(feesPageElement.isDisplayed());
    }

    @Given("Choose class button")
    public void choose_class_button() {
        WebElement dropdownMenuSelect = Driver.getDriver().findElement(By.xpath("//select[@name='class_id']"));
        ReusableMethods.bekle(2);
        Select select = new Select(dropdownMenuSelect);
        ReusableMethods.bekle(2);
        select.selectByVisibleText("Class 2");
        ReusableMethods.bekle(1);
    }

    @Given("Choose section button")
    public void choose_section_button() {
        WebElement dropDownMenuSection = Driver.getDriver().findElement(By.xpath("(//select[@class='form-control'])[2]"));
        ReusableMethods.bekle(2);
        Select select = new Select(dropDownMenuSection);
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
        WebElement euro = Driver.getDriver().findElement(By.xpath("(//*[@class='filter-option pull-left'])[1]"));

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

    @When("click on a chat from the left bar")
    public void click_on_a_chat_from_the_left_bar() {
        adminPage.adminDashboardChatButton.click();
    }

    @Then("The message page is displayed on the right side")
    public void the_message_page_is_displayed_on_the_right_side() {
        Assert.assertTrue(adminPage.adminDashboardChatPage.isDisplayed());
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

    @And("Verify that Forgot Password Link is active")
    public void verifyThatForgotPasswordLinkIsActive() {
        Assert.assertTrue(adminPage.adminPasswordForgotLink.isDisplayed());
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







    //*************************************************************************************************



    @Then("The message is sent successfully")
    public void the_message_is_sent_successfully() {
        Assert.assertTrue(adminPage.getAdminDashboardSentMessageText.isDisplayed());


    }



}
































