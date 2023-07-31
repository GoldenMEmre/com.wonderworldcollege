package stepdefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
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

    }
    @Given("Verify Record Saved Successfully displayed after clicking save button")
    public void verify_record_saved_successfully_displayed_after_clicking_save_button() {
        adminPage.saveButton.click();
        String expectedTitle="Record Saved Successfully";

       if(expectedTitle.contains("Record Saved Successfully")){
           System.out.print("Expected title test Passed");

       }else{
           System.out.print("Expected title test Failed");
       }
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
    }





    }


















