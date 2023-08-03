package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminPage extends Base {


    // Admin fees collection section
    @FindBy(xpath = "//a[@class='btn btn-lg btn-admin']")
    public WebElement adminLoginButton;
    @FindBy(xpath = "//input[@placeholder='Username']")
    public WebElement adminUser;
    @FindBy(xpath = "//input[@placeholder='Password']")
    public WebElement adminPassword;
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signInButton;
    @FindBy(xpath = "//*[text()='Fees Collection']")
    public WebElement feesCollection;
    @FindBy(xpath = "(//*[text()='Fees Master'])[2]")
    public WebElement feesMasterButton;
    @FindBy(xpath = "(//label[@for='exampleInputEmail1'])[1]")
    public WebElement feesGroup;
    @FindBy(xpath = "(//label[@for='exampleInputEmail1'])[2]")
    public WebElement feesType;
    @FindBy(xpath = "(//label[@for='exampleInputEmail1'])[3]")
    public WebElement dueDate;
    @FindBy(xpath = "(//label[@for='exampleInputEmail1'])[4]")
    public WebElement percentage;
    @FindBy(xpath = "(//label[@for='exampleInputEmail1'])[5]")
    public WebElement fixAmount;
    @FindBy(xpath = "(//label[@for='exampleInputEmail1'])[4]")
    public WebElement amountButton;
    @FindBy(xpath = "//label[text()='Fine Type']")
    public WebElement fineType;

    @FindBy(xpath = " (//label[@class='radio-inline'])[1]")
    public WebElement radioNoneButton;
    @FindBy(xpath = " (//label[@class='radio-inline'])[2]")
    public WebElement radioPercentageButton;
    @FindBy(xpath = " (//label[@class='radio-inline'])[3]")
    public WebElement radioFixButton;
    @FindBy(xpath = "//input[@placeholder='Search...']")
    public WebElement searchBox;

    @FindBy(xpath = "//select[@id='fee_groups_id']")
    public WebElement feesGroupDropDown;
    @FindBy(xpath = "//select[@id='feetype_id']")
    public WebElement feesTypeDropDown;
    @FindBy(xpath = "//input[@id='due_date']")
    public WebElement dueDateDropDown;
    @FindBy(xpath = "//input[@name='amount']")
    public WebElement amountDropdown;
    @FindBy(xpath = "//input[@id='fine_percentage']")
    public WebElement percentageSelect;
    @FindBy(xpath = "//input[@id='fine_amount']")
    public WebElement fixAmountSelect;
    @FindBy(xpath = "(//button[@type='submit'])[3]")
    public WebElement saveButton;
    @FindBy(xpath = "Record Saved Successfully")
    public WebElement savedSuccessfully;
    @FindBy(xpath = "(//i[@class='fa fa-pencil'])[1]")
    public WebElement editButton;
    @FindBy(xpath = "(//i[@class='fa fa-remove'])[1]")
    public WebElement deleteButton;


    //--------------------------
    // Admin Fees Collection > Collect Fees
    @FindBy(xpath = "(//*[text()='Collect Fees'])[2]")
    public WebElement collectFees;


    // Admin Fees Collection > Collect Fees >Student Collect fees >search Button
    @FindBy(xpath = "(//button[@type='submit'])[4]")
    public WebElement searchButton;


    // Admin Fees Collection > Collect Fees >Student Collect fees >search Button
    @FindBy(xpath = "//*[@id='DataTables_Table_0']/tbody/tr[6]/td[8]/a")
    public WebElement collectFeesChoose;

    // Admin Fees Collection > Collect Fees >Student Collect fees >Student Fees
    @FindBy(xpath = "//*[text()='Student Fees']")
    public WebElement studentFeesWrite;

    // Admin Fees Collection > Collect Fees >Student Collect fees >Student Fees > Currency
    @FindBy(xpath = "//*[text()='USD ($)']")
    public WebElement uSDCurrency;

    // Admin Fees Collection > Collect Fees >Student Collect fees >Student Fees >Add Fees Butonu (+)
    @FindBy(xpath = "(//*[@data-fee-category='transport'])[1]")
    public WebElement addFessButonu;

    // Admin Fees Collection > Collect Fees >Student Collect fees >Student Fees >Add Fees Butonu > $ Collect Fees button
    @FindBy(xpath = "(//button[@id='load'])[3]")
    public WebElement collectFeesPayButton;

    // Admin Fees Collection > Collect Fees >Student Collect fees >Student Fees >Add Fees Butonu > Revert Button
    @FindBy(xpath = "//*[@class='fa fa-undo']")
    public WebElement revertButton;
    // Admin Fees Collection > Collect Fees >Student Collect fees >Student Fees >Add Fees Butonu > Student Fees Lıst
    @FindBy(xpath = "//*[text()='Student Fees']")
    public WebElement StudentFeesLıstWrite;


    //--------------------------

    //Admin dashboard/chat section

    @FindBy(xpath = "//a[@class='todoicon']")
    public WebElement adminDashboardChatButton;

    @FindBy(xpath = "//div[@class='messages']")
    public WebElement adminDashboardChatPage;

    @FindBy(xpath = "//input[@placeholder='Write Your Message...']")
    public WebElement adminDasbhoardChatPageMessageTextBox;

    @FindBy(xpath = "//i[@class='fa fa-paper-plane']")
    public WebElement adminDashboardMessageTextBoxSendButton;

    @FindBy(xpath = "//p[normalize-space()='Hello, this is a test message.']")
    public WebElement getAdminDashboardSentMessageText;


    @FindBy(xpath = "//span[normalize-space()='Student Information']")
    public WebElement studentInformationSection;
    @FindBy(xpath = "//ul[@class='treeview-menu menu-open']//a[normalize-space()='Online Admission']")
    public WebElement onlineAdmissionSection;
    @FindBy(xpath = "//a[@role='button']")
    public WebElement adminPanelSideBarButton;
    @FindBy(xpath = "//table/thead/tr/th[1]")
    public WebElement onlineAdmissionSectionReferenceNo;
    @FindBy(xpath = "//table/thead/tr/th[2]")
    public WebElement onlineAdmissionSectionStudentName;
    @FindBy(xpath = "//table/thead/tr/th[3]")
    public WebElement onlineAdmissionSectionClass;
    @FindBy(xpath = "//table/thead/tr/th[4]")
    public WebElement onlineAdmissionSectionFather;
    @FindBy(xpath = "//table/thead/tr/th[5]")
    public WebElement onlineAdmissionSectionDateOfBirth;
    @FindBy(xpath = "//table/thead/tr/th[6]")
    public WebElement onlineAdmissionSectionGender;
    @FindBy(xpath = "//table/thead/tr/th[7]")
    public WebElement onlineAdmissionSectionCategory;
    @FindBy(xpath = "//table/thead/tr/th[8]")
    public WebElement onlineAdmissionSectionStudentMobileNumber;
    @FindBy(xpath = "//table/thead/tr/th[9]")
    public WebElement onlineAdmissionSectionFormStatus;
    @FindBy(xpath = "//table/thead/tr/th[10]")
    public WebElement onlineAdmissionSectionEnrolled;
    @FindBy(xpath = "//table/thead/tr/th[11]")
    public WebElement onlineAdmissionSectionCreatedAt;
    @FindBy(xpath = "//table/thead/tr/th[12]")
    public WebElement onlineAdmissionSectionAction;

    @FindBy(xpath = "//input[@placeholder='Search...']")
    public WebElement onlineAdmissionSearchBox;
    @FindBy(xpath = "//tr[@class='odd']//td[contains(text(),'Jhon')]")
    public WebElement onlineAdmissionSearchResultText;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/" +
            "div[2]/div[1]/div[1]/div[1]/div[4]/table[1]/tbody[1]/tr[5]/td[9]/span[1]"
    )
    public WebElement submittedStudent;
    @FindBy(xpath = "//tbody/tr[2]/td[12]/a[2]/i[1]")
    public WebElement editAndEnrollPageButton;
    @FindBy(xpath = "//input[@id='admission_no']")
    public WebElement editandEnrollAdmissionNoBox;

    



}
