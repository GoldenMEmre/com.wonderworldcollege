package stepdefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
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







    }





















