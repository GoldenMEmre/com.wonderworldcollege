package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
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
    @Given("Verify that the title of the Admin Panel is displayed")
    public void verify_that_the_title_of_the_admin_panel_is_displayed() {
        Assert.assertTrue(adminPage.adminLoginButton.isDisplayed());
    }
}














