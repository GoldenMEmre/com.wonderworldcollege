package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import pages.AdminPage;
import pages.Base;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class AdminStepdefinition {
    ReusableMethods wonder=new ReusableMethods();
    AdminPage adminPage = new AdminPage();


    @Given("click admin login")
    public void click_admin_login() {
        adminPage.adminLoginButton.click();
       ReusableMethods.switchToWindow("What's New In Wonder World College");

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
        ReusableMethods.waitForVisibility(adminPage.signInButton,1);
        adminPage.signInButton.click();

    }

    @Given("Click fees collection")
    public void click_fees_collection() {

    }

    @Given("verif that the fees master displayed")
    public void verif_that_the_fees_master_displayed() {

    }




    @And("User logs as an admin")
    public void userLogsAsAnAdmin() {

        adminPage.adminLoginButton.click();
        ReusableMethods.bekle(5);
//        ReusableMethods.waitForVisibility(adminPage.adminUser,2);
//        adminPage.adminUser.sendKeys(ConfigReader.getProperty("adminName"));
//        adminPage.adminPassword.sendKeys(ConfigReader.getProperty("adminPassword"));
//
//        adminPage.signInButton.click();
    }
}



