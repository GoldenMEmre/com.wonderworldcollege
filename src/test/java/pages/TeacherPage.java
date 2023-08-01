package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utilities.Driver;


import javax.swing.*;
import java.awt.*;
import java.text.DateFormat;
import java.util.List;

public class TeacherPage extends Base {
    Actions actions = new Actions(Driver.getDriver());
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

    // Leave From Date Box Date Picker Next Month
    @FindBy(xpath = "(//th[@class='next'])[1]")
    private WebElement leaveFromDateBoxNextMonth;

    //Leave From Date Box Day
    @FindBy(xpath = "(//td[text()='10'])[1]")
    private WebElement leaveFromDateBoxDate;

    // Apply Leave Add Details page Leave To Date Box
    @FindBy(id = "leave_to_date")
    private WebElement addDetailsLeaveToDateBox;

    // Leave To Date Date Picker Next Month
    @FindBy(xpath = "(//th[@class='next'])[1]")
    private WebElement leaveToDateBoxNextMonth;

    //Leave To Date Box Day
    @FindBy(xpath = "(//td[text()='10'])[1]")
    private WebElement leaveToDateBoxDate;

    // Apply Leave Add Details page Available Leave Box
    @FindBy(xpath = "//select[@id='leave_type']")
    private WebElement addDetailsAvailableLeaveBox;

    // Apply Leave Add Details page Reason  Box
    @FindBy(id = "reason")
    private WebElement addDetailsReasonBox;

    // Apply Leave Add Details Save Button
    @FindBy(id = "submitbtn")
    private WebElement addDetailsSaveButton;

    // Leave Request Staff Name
    @FindBy(xpath = "//*[text()='ogun.erdogan ']")
    private WebElement leaveRequestStaffName;

    // Leaves List Columns : Staff, Leave Type, Leave Date, Days, Apply Date, Status and Action
    @FindBy(xpath = "//*[text()='Staff']")
    private WebElement columnsLeavesListStaff;
    @FindBy(xpath = "(//*[text()='Leave Type'])[1]")
    private WebElement columnsLeavesListLeaveType;
    @FindBy(xpath = "//*[text()='Leave Date']")
    private WebElement columnsLeavesListLeaveDate;
    @FindBy(xpath = "//*[text()='Days']")
    private WebElement columnsLeavesListDays;
    @FindBy(xpath = "(//*[text()='Apply Date'])[1]")
    private WebElement columnsLeavesListApplyDate;
    @FindBy(xpath = "//*[text()='Status']")
    private WebElement columnsLeavesListStatus;
    @FindBy(xpath = "//*[text()='Action']")
    private WebElement columnsLeavesListAction;

    //Status of Created Leave Request
    @FindBy(xpath = "(//span[@data-toggle='popover'])[2]")
    private WebElement statusLeaveRequest;

    //Leaves List View Button
    @FindBy(xpath = "(//a[@role='button'])[3]")
    private WebElement viewButtonLeavesList;

    //Details window after clicking view Button
    @FindBy(xpath = "//*[text()='Details']")
    private WebElement detailsWindow;

    // Details Window Close Button
    @FindBy(xpath = "(//button[@class='close'])[1]")
    private WebElement detailsWindowCloseButton;

    // Leaves Page Delete Button
    @FindBy(xpath = "//i[@class='fa fa-remove']")
    private WebElement leavesPageDeleteButton;

    // Staff ID Leaves Page (For verifying Deletion of Leave Request)
    @FindBy(xpath = "//*[text()='Staff ID: 9091']")
    private WebElement leavesPageStaffID;

    //

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

    //Enters Leave From Date on Add details page
    public void enterLeaveFromDate(){
        addDetailsLeaveFromDateBox.isDisplayed();
        addDetailsLeaveFromDateBox.isEnabled();
        actions.click(addDetailsLeaveFromDateBox).perform();
        actions.click(leaveFromDateBoxNextMonth).perform();
        actions.moveToElement(leaveFromDateBoxDate).click().perform();
    }

    //Enters Leave To Date on Add details page
    public void enterLeaveToDate(){
        addDetailsLeaveToDateBox.isDisplayed();
        addDetailsLeaveToDateBox.isEnabled();
        actions.click(addDetailsLeaveToDateBox).perform();
        actions.click(leaveToDateBoxNextMonth).perform();
        actions.moveToElement(leaveToDateBoxDate).click().perform();
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

    //Verifies the created Leave Request
    public void verifyLeaveRequest(){
        leaveRequestStaffName.isDisplayed();
    }

    //Verifies the Columns on Leaves List Page
    public void verifyColumnsLeavesList(){
        columnsLeavesListStaff.isDisplayed();
        columnsLeavesListLeaveType.isDisplayed();
        columnsLeavesListLeaveDate.isDisplayed();
        columnsLeavesListDays.isDisplayed();
        columnsLeavesListApplyDate.isDisplayed();
        columnsLeavesListStatus.isDisplayed();
        columnsLeavesListAction.isDisplayed();
    }

    // Verifies the Status of Created Leave Request
    public void verifyStatusLeavesList(){
        statusLeaveRequest.isDisplayed();
        String status = statusLeaveRequest.getText();
        Assert.assertFalse(status.isEmpty());
    }

    //Verifies view Button on Leaves Page
    public void verifyViewButton(){
        viewButtonLeavesList.isDisplayed();
        viewButtonLeavesList.isEnabled();
        viewButtonLeavesList.click();
    }

    //Verifies Details Window After Clicking View Button
    public void verifyDetailsWindow(){
        Assert.assertTrue(detailsWindow.isDisplayed());
    }

    // Closes Details Window
    public void closeDetailsWindow(){
        detailsWindowCloseButton.click();
    }

    // Verifies and Clicks on Delete Button on Leaves Page
    public void clickOnDeleteButtonLeavesPage(){
        leavesPageDeleteButton.isDisplayed();
        leavesPageDeleteButton.isEnabled();
        leavesPageDeleteButton.click();
        Driver.getDriver().switchTo().alert().accept();
    }
    //Verifies that created Leave Request has been deleted
    public void deleteTestLeaveRequest(){
        Assert.assertFalse(leavesPageStaffID.isDisplayed());
    }
}
