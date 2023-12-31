package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utilities.Driver;
import utilities.ReusableMethods;


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

    @FindBy(xpath = "//*[text()='Records: 0 to 0 of 0']")
    private WebElement leavesListRecords;

    // ***************************Gulten Harrelson**************

    @FindBy(xpath="//*[text()='Teacher Login '] ")
    public  WebElement teacherLoginButton;

    @FindBy(xpath ="//button[@type='submit']")
    public  WebElement teacherSignInButton;
    @FindBy(xpath = "(//*[text()='Attendance'])[2]")
    public  WebElement attendanceMenu;
    @FindBy(xpath ="(//*[text()='Period Attendance By Date'])[2]")
    public  WebElement periodAttendanceByDate;
    @FindBy(xpath="(//label[@for='exampleInputEmail1'])[1]")
    public  WebElement ClassIcon;
    @FindBy(xpath="(//label[@for='exampleInputEmail1'])[2]")
    public  WebElement sectionIcon;
    @FindBy(xpath="(//label[@for='exampleInputEmail1'])[3]")
    public  WebElement dateIcon;
    @FindBy(xpath = "//select[@id='class_id']")
    public  WebElement classDropDown;
    @FindBy(xpath = "//select[@id='section_id']")
    public  WebElement sectionDropDown;
    @FindBy(xpath = "//*[@name='date']")
    public  WebElement dateDropDown;

    @FindBy(xpath ="(//*[text()='1'])[1]")
    public  WebElement   teacherDate1;

    @FindBy(xpath ="(//*[@type='submit'])[3]")
    public  WebElement   teacherSearchButton ;
    @FindBy(xpath ="(//*[@class='box-body'])[2]")
    public  WebElement   studentListBodySection;
    // ***************************Gulten Harrelson**************

    //Reports Side Bar Teacher Page
    @FindBy(xpath = "//*[text()='Reports']")
    private WebElement reportsSideBarTeacherPage;
    //Hostel Side Bar Teacher Page
    @FindBy(xpath = "(//*[text()='Hostel'])[2]")
    private WebElement hostelSideBarTeacherPage;
    // student hostel details select Criteria Title
    @FindBy(xpath = "//*[text()=' Select Criteria']")
    private WebElement selectCriteriaTitleSHD;

    // hostel name dropbox under Select Criteria
    @FindBy(xpath = "//select[@name='hostel_name']")
    private WebElement hostelNameDropBoxUnderSelectCriteria;




    //Search Button under Select Criteria
    @FindBy(xpath = "//*[text()=' Search']")
    private WebElement searchButtonUnderSelectCriteria;

    //****Student Hostel Report Columns *****
    //Class(Section)
    @FindBy(xpath = "//tr[@role='row']/th[1]")
    private WebElement c1ClassSectionColumn;
    //Admission No
    @FindBy(xpath = "//tr[@role='row']/th[2]")
    private WebElement c2AdmissionNoColumn;
    //Student Name
    @FindBy(xpath = "//tr[@role='row']/th[3]")
    private WebElement c3StudentNameColumn;
    //Mobile Number
    @FindBy(xpath = "//tr[@role='row']/th[4]")
    private WebElement c4MobileNumberColumn;
    //Guardian Phone
    @FindBy(xpath = "//tr[@role='row']/th[5]")
    private WebElement c5GuardianPhoneColumn;
    //Hostel Name
    @FindBy(xpath = "//tr[@role='row']/th[6]")
    private WebElement c6CostelNameColumn;
    //Room Number Name
    @FindBy(xpath = "//tr[@role='row']/th[7]")
    private WebElement c7RoomNumberNameColumn;
    //Room Type
    @FindBy(xpath = "//tr[@role='row']/th[8]")
    private WebElement c8RoomTypeColumn;
    //Cost Per Bed
    @FindBy(xpath = "//tr[@role='row']/th[9]")
    private WebElement c9CostPerBedColumn;
    @FindBy(xpath = "//*[text()='Kavya Roy']")
    private WebElement kavyaRoyStudentExample;
    @FindBy(xpath = "//*[text()='Barcode']")
    private WebElement barcodeStudentRedirectAfterClick;
    @FindBy(xpath = "//input[@id='search_text1']")
    private WebElement searchBoxStudentProfilPage;
    @FindBy(xpath = "//*[text()='18009']")
    private WebElement kavyaRoyAdmissionNo;
    @FindBy(xpath = "//*[text()='18004']")
    private WebElement lauraclintonAdmissionNo;
    @FindBy(xpath = "//*[text()='65656546']")
    private WebElement lauraClintonMobileNo;
    @FindBy(xpath = "//*[text()='987654311']")
    private WebElement kavyaRoyMobileNo;
    @FindBy(xpath = "//input[@aria-controls='DataTables_Table_0']")
    private WebElement searchTextBoxSHR;



    //-------EXAMINATIONS/EXAM GROUP PAGE LOCATE---------

    @FindBy (xpath = "//span[text()='Examinations']")
    public WebElement examinations;

    @FindBy (xpath = "(//a[@href=\"https://qa.wonderworldcollege.com/admin/examgroup\"])[2]")
    public WebElement examGroupLink;

    @FindBy (xpath = "//h3[@class='box-title']")
    public WebElement addExamGroupText;

    @FindBy (className = "box-title titlefix" )
    public WebElement examGroupListText;

    @FindBy (xpath = "(//input[@class='form-control'])[1]")
    public WebElement addExamGroupNameTextbox;

    @FindBy (xpath = "//textarea[@class='form-control']")
    public WebElement addExamGroupDescriptionTextbox;

    @FindBy (xpath = "//select[@class='form-control']")
    public WebElement addExamGroupExamTypeDropdownMenu;

    @FindBy (className = "btn btn-info pull-right")
    public WebElement addExamGroupSaveButton;

    @FindBy (xpath = "(//th[@class='sorting'])[1]")
    public WebElement examGroupListNameTitle;

    @FindBy (xpath = "(//th[@class='sorting'])[2]")
    public WebElement examGroupListNoOfExamsTitle;

    @FindBy (xpath = "//th[@class='sorting_desc']")
    public WebElement examGroupListExamTypeTitle;

    @FindBy (xpath = "//th[@class='text-right noExport sorting']")
    public WebElement examGroupListActionTitle;

    @FindBy ( xpath = "(//i[@class='fa fa-plus'])[1]")
    public WebElement examGroupListActionPlusIcon;

    @FindBy ( xpath = "(//i[@class='fa fa-pencil'])[1]")
    public WebElement examGroupListActionEditIcon;

    @FindBy ( xpath = "(//i[@class='fa fa-remove'])[1]")
    public WebElement examGroupListActionDeleteIcon;

    @FindBy (xpath = "//a[@class='btn btn-primary btn-sm']")
    public WebElement examListNewExamButton;

    @FindBy (xpath = "//select[@name='exam_type']")
    public WebElement editExamGroupExamTypeDropdown;

    @FindBy (xpath = "//div[@class='alert alert-success text-left']")
    public WebElement updateAlert;

    @FindBy (xpath = "//a[@href=\"../site/login\"]")
    public WebElement teacherLogin;






// ***************************Gulten Harrelson**************







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
        Assert.assertTrue(leavesListRecords.isDisplayed());
    }


    @FindBy(xpath = "//*[@id='sibe-box']/ul[2]/li[3]/a")
    public WebElement sideBarAttendance;

    @FindBy(xpath = "//*[@id='sibe-box']/ul[2]/li[3]/ul/li[2]/a")
    public WebElement periodAttendance;

    @FindBy(xpath = "/html/body/div[1]/div[1]/section[2]/div/div")
    public WebElement periodAttendancePage;

    @FindBy(xpath = "//*[@id='class_id']")
    public WebElement selectCriteriaClass;

    @FindBy(xpath = "//*[@id='section_id']")
    public WebElement selectCriteriaSection;

    @FindBy(xpath = "//*[@id='form1']/div/div/div[3]/div/input")
    public WebElement selectCriteriaDate;

    @FindBy(xpath = "//*[@id='subject_timetable_id']")
    public WebElement selectCriteriasubject;

    @FindBy(xpath = "//*[@id='form1']/div/div/div[5]/div/button")
    public WebElement selectCriteriaSearchButtton;

    @FindBy(xpath = "//*[@id='DataTables_Table_0']/thead/tr/th[2]")
    public WebElement admissionNo;

    @FindBy(xpath = "//*[@id='DataTables_Table_0']/thead/tr/th[3]")
    public WebElement rollNumber;

    @FindBy(xpath = "//*[@id='DataTables_Table_0']/thead/tr/th[4]")
    public WebElement attendanceName;

    @FindBy(xpath = "//*[@id='DataTables_Table_0']/thead/tr/th[5]")
    public WebElement attendance;

    @FindBy(xpath = "//*[@id='DataTables_Table_0']/thead/tr/th[6]")
    public WebElement note;

    @FindBy(xpath = "//*[@id='DataTables_Table_0']/tbody/tr[1]/td[5]/div[1]")
    public WebElement attendancePresent;

    @FindBy(xpath = "//*[@id='DataTables_Table_0']/tbody/tr[1]/td[5]/div[2]")
    public WebElement attendanceLate;

    @FindBy(xpath = "//*[@id='DataTables_Table_0']/tbody/tr[1]/td[5]/div[3]")
    public WebElement attendanceAbsent;

    @FindBy(xpath = "//*[@id='DataTables_Table_0']/tbody/tr[1]/td[5]/div[4]")
    public WebElement attendanceHalfDay;

    @FindBy(xpath = "/html/body/div[1]/div[1]/section[2]/div/div/div/div[2]/div[3]/form/div[1]/div/button")
    public WebElement saveAttendance;

    @FindBy(xpath = "//*[@id='DataTables_Table_0']/tbody/tr[1]/td[6]/input")
    public WebElement noteBox;

    @FindBy(xpath = "/html/body/div[1]/div[1]/section[2]/div/div/div/div[2]/div[3]/form/div[1]/span/button")
    public WebElement markAsHolidayButton;

    public void reportsHostelsVerifyClick(){

        reportsSideBarTeacherPage.click();
        ReusableMethods.bekle(2);
        actions.moveToElement(hostelSideBarTeacherPage).click().perform();

        //hostelSideBarTeacherPage.click();
    }
    public void selectCriteriaVerifyPage(){
        Assert.assertTrue(selectCriteriaTitleSHD.isDisplayed());
    }
    public void dropdownMenuSearchButtonVerify(){
        Assert.assertTrue(classDropDown.isDisplayed());
        Assert.assertTrue(sectionDropDown.isDisplayed());
        Assert.assertTrue(hostelNameDropBoxUnderSelectCriteria.isDisplayed());
        Assert.assertTrue(searchButtonUnderSelectCriteria.isDisplayed());
    }
    public void searchStudentHostel(){
        Select select = new Select(classDropDown);
        classDropDown.click();
        select.selectByIndex(1);
        ReusableMethods.bekle(1);
        Select select1 = new Select(sectionDropDown);
        sectionDropDown.click();
        select1.selectByIndex(1);
        ReusableMethods.bekle(1);
        Select select2 = new Select(hostelNameDropBoxUnderSelectCriteria);
        hostelNameDropBoxUnderSelectCriteria.click();
        select2.selectByIndex(3);
        searchButtonUnderSelectCriteria.click();
    }
    public void verifyColumnsunderStudentHostelReport(){
        Assert.assertTrue(c1ClassSectionColumn.isDisplayed());
        Assert.assertTrue(c2AdmissionNoColumn.isDisplayed());
        Assert.assertTrue(c3StudentNameColumn.isDisplayed());
        Assert.assertTrue(c4MobileNumberColumn.isDisplayed());
        Assert.assertTrue(c5GuardianPhoneColumn.isDisplayed());
        Assert.assertTrue(c6CostelNameColumn.isDisplayed());
        Assert.assertTrue(c7RoomNumberNameColumn.isDisplayed());
        Assert.assertTrue(c8RoomTypeColumn.isDisplayed());
        Assert.assertTrue(c9CostPerBedColumn.isDisplayed());
    }
    public void studentNameClick(){
        kavyaRoyStudentExample.click();
    }
    public void redirectedPageVerify(){
        Assert.assertTrue(barcodeStudentRedirectAfterClick.isDisplayed());
    }
    public void searchBoxVerifyStudentProfile(){
        Assert.assertTrue(searchBoxStudentProfilPage.isDisplayed());
    }
    public void filterStudents(){

        searchTextBoxSHR.sendKeys(kavyaRoyAdmissionNo.getText(), Keys.ENTER);
        ReusableMethods.bekle(2);
        Assert.assertTrue(kavyaRoyAdmissionNo.isDisplayed());
        searchTextBoxSHR.clear();
        searchTextBoxSHR.sendKeys(kavyaRoyMobileNo.getText(), Keys.ENTER);
        ReusableMethods.bekle(2);
        Assert.assertTrue(kavyaRoyMobileNo.isDisplayed());
    }


}

