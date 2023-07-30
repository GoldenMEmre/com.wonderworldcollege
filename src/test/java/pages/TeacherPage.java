package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utilities.Driver;

import java.text.DateFormat;

public class TeacherPage extends Base {

    // Login Page Teacher Login Button
    @FindBy(xpath = "//*[text()='Teacher Login ']")
    private WebElement loginPageTeacherLoginButton;

    //Admin Login Page Username TextBox
    @FindBy(xpath = "//input[@name='username']")
    private WebElement adminLoginPageUsernameTextBox;

    //Admin Login Page Password TextBox
    @FindBy(xpath = "//input[@name='password']")
    private WebElement adminLoginPagePasswordTextBox;

    // Admin Login Page SignIn Button
    @FindBy(xpath = "//button[@type='submit']")
    private WebElement adminLoginPageSubmitButton;

    // Teacher Page side bar Human Resource Menu Title
    @FindBy(xpath = "//*[text()='Human Resource']")
    private WebElement sideBarHumanResourcesMenuTitle;

    // Teacher Page side bar Human Resource Apply Leave Button
    @FindBy(xpath = "(//*[text()='Apply Leave']) [2]")
    private WebElement sideBarHumanResourcesApplyLeaveButton;

    // Leaves Page Apply Leave Button
    @FindBy(xpath = "//a[@onclick='addLeave()']")
    private WebElement leavesPageApplyLeaveButton;

    // Apply Leave Add Details page title
    @FindBy(xpath = "//*[text()='Add Details']")
    private WebElement applyLeaveAddDetailsPageTitle;

    // Apply Leave Add Details page Apply Date Box
    @FindBy(id = "applieddate")
    private WebElement addDetailsApplyDateBox;

    // Apply Leave Add Details page Leave From Date Box
    @FindBy(id = "leave_from_date")
    private WebElement addDetailsLeaveFromDateBox;

    // Apply Leave Add Details page Leave To Date Box
    @FindBy(id = "leave_to_date")
    private WebElement addDetailsLeaveToDateBox;

    // Apply Leave Add Details page Available Leave Box
    @FindBy(xpath = "//select[@id='leave_type']")
    private WebElement addDetailsAvailableLeaveBox;

    // Apply Leave Add Details page Reason  Box
    @FindBy(id = "reason")
    private WebElement addDetailsReasonBox;

    // Apply Leave Add Details Save Button
    @FindBy(id = "submitbtn")
    private WebElement addDetailsSaveButton;

    //***************** METHODS ********************

    //clicks on Teacher Login Button on Login Page
    public void clickTeacherLoginButton(){
        loginPageTeacherLoginButton.isDisplayed();
        loginPageTeacherLoginButton.isEnabled();
        loginPageTeacherLoginButton.click();
    }

    //Enters username in Username TextBox on Admin Login Page
    public void enterUsername(String userName){
        adminLoginPageUsernameTextBox.isDisplayed();
        adminLoginPageUsernameTextBox.isEnabled();
        adminLoginPageUsernameTextBox.sendKeys(userName);
    }

    //Enters password in Password TextBox on Admin Login Page
    public void enterPassword(String password){
        adminLoginPagePasswordTextBox.isDisplayed();
        adminLoginPagePasswordTextBox.isEnabled();
        adminLoginPagePasswordTextBox.sendKeys(password);
    }

    //Clicks Sign In Button on Admin Login Page
    public void clickSignIn(){
        adminLoginPageSubmitButton.isDisplayed();
        adminLoginPageSubmitButton.isEnabled();
        adminLoginPageSubmitButton.click();
    }

    //Clicks Human Resources on the side bar
    public void clickHumanResources(){
        sideBarHumanResourcesMenuTitle.isDisplayed();
        sideBarHumanResourcesMenuTitle.isEnabled();
        sideBarHumanResourcesMenuTitle.click();
    }

    //Clicks on Apply Leave Button under Human Resources on the side bar
    public void clickApplyLeaveHumanResources(){
        sideBarHumanResourcesApplyLeaveButton.isDisplayed();
        sideBarHumanResourcesApplyLeaveButton.isEnabled();
        sideBarHumanResourcesApplyLeaveButton.click();
    }

    // Clicks Apply Leave Button on Leaves Page
    public void clickApplyLeaveButtonLeavesPage(){
        leavesPageApplyLeaveButton.isDisplayed();
        leavesPageApplyLeaveButton.isEnabled();
        leavesPageApplyLeaveButton.click();
    }

    //Enters Apply Date on Add Details Page
    public void enterApplyDateAddDetails(String date){ //???????
        addDetailsApplyDateBox.isDisplayed();
        addDetailsApplyDateBox.isEnabled();
        addDetailsApplyDateBox.sendKeys(date);
    }

    //Enters Leave From Date on Add details page
    public void enterLeaveFromDate(String date){
        addDetailsLeaveFromDateBox.isDisplayed();
        addDetailsLeaveFromDateBox.isEnabled();
        addDetailsLeaveFromDateBox.sendKeys(date);
    }

    //Enters Leave To Date on Add details page
    public void enterLeaveToDate(String date){
        addDetailsLeaveToDateBox.isDisplayed();
        addDetailsLeaveToDateBox.isEnabled();
        addDetailsLeaveToDateBox.sendKeys(date);
    }

    //Selects Available Leave on Add Details
    public void selectAvailableLeave(){
        Select select = new Select(addDetailsAvailableLeaveBox); //dropdown
        addDetailsAvailableLeaveBox.isDisplayed();
        addDetailsAvailableLeaveBox.isEnabled();
        select.selectByIndex(1);
    }

    //Enters Reason on Reason Text Box on Add Details Page
    public void entersReason(String reason){
        addDetailsReasonBox.isDisplayed();
        addDetailsReasonBox.isEnabled();
        addDetailsReasonBox.sendKeys(reason);
    }

    //Clicks on Save Button on Add Details
    public void clickOnSaveAddDetails(){
        addDetailsSaveButton.isDisplayed();
        addDetailsSaveButton.isEnabled();
        addDetailsSaveButton.click();
    }
}
