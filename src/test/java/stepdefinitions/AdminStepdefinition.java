package stepdefinitions;

import io.cucumber.java.en.Given;
import pages.AdminPage;
import pages.Base;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class AdminStepdefinition {

    AdminPage adminPage = new AdminPage();


    @Given("click admin login")
    public void click_admin_login() {
        adminPage.teacherLoginButton.click();

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

    }

    @Given("Click fees collection")
    public void click_fees_collection() {

    }

    @Given("verif that the fees master is displayed")
    public void verif_that_the_fees_master_is_displayed() {

    }


    }



