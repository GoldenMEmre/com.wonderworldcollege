package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminPage extends Base {



    // Admin fees collection section **************Gulten Harrelson***********************




    @FindBy(xpath = "//a[@class='btn btn-lg btn-admin']")
    public WebElement adminLoginButton;
    @FindBy(xpath ="//input[@placeholder='Username']")
    public  WebElement adminUser;
    @FindBy(xpath = "//input[@placeholder='Password']")
    public  WebElement adminPassword;
    @FindBy(xpath = "//button[@type='submit']")
    public  WebElement signInButton;
    @FindBy(xpath ="//*[text()='Fees Collection']")
    public  WebElement feesCollection;
    @FindBy(xpath ="(//*[text()='Fees Master'])[2]" )
    public WebElement feesMasterButton;
    @FindBy(xpath = "(//label[@for='exampleInputEmail1'])[1]")
    public WebElement feesGroup;
    @FindBy(xpath ="(//label[@for='exampleInputEmail1'])[2]")
    public  WebElement feesType;
    @FindBy(xpath ="(//label[@for='exampleInputEmail1'])[3]")
    public  WebElement dueDate;
    @FindBy(xpath = "(//label[@for='exampleInputEmail1'])[4]")
    public  WebElement percentage;
    @FindBy(xpath = "(//label[@for='exampleInputEmail1'])[5]")
    public  WebElement fixAmount;
    @FindBy(xpath = "(//label[@for='exampleInputEmail1'])[4]")
    public  WebElement amountButton;
    @FindBy(xpath = "//label[text()='Fine Type']")
    public  WebElement fineType;

    @FindBy(xpath =" (//label[@class='radio-inline'])[1]")
    public  WebElement radioNoneButton;
    @FindBy(xpath =" (//label[@class='radio-inline'])[2]")
    public  WebElement radioPercentageButton;
    @FindBy(xpath =" (//label[@class='radio-inline'])[3]")
    public  WebElement radioFixButton;
   @FindBy(xpath ="//input[@placeholder='Search...']")
    public  WebElement searchBox;

   @FindBy(xpath="//select[@id='fee_groups_id']")
    public  WebElement feesGroupDropDown;
   @FindBy(xpath="//select[@id='feetype_id']")
    public  WebElement feesTypeDropDown;
   @FindBy(xpath ="//input[@id='due_date']")
   public  WebElement dueDateDropDown;
   @FindBy(xpath="//input[@name='amount']")
    public  WebElement amountDropdown;
  @FindBy(xpath ="//input[@id='fine_percentage']")
    public  WebElement percentageSelect;
  @FindBy(xpath ="//input[@id='fine_amount']")
    public  WebElement fixAmountSelect;
   @FindBy(xpath="(//button[@type='submit'])[3]")
    public  WebElement saveButton;
   @FindBy(xpath = "Record Saved Successfully")
    public  WebElement savedSuccessfully;
   @FindBy(xpath="(//i[@class='fa fa-pencil'])[1]")
    public  WebElement editButton;
   @FindBy(xpath="(//i[@class='fa fa-remove'])[1]")
    public WebElement deleteButton;
    // Admin fees collection section **************Gulten Harrelson***********************







      //--------------------------
    // Admin Fees Collection > Collect Fees
    @FindBy(xpath ="(//*[text()='Collect Fees'])[2]")
    public  WebElement collectFees;



    // Admin Fees Collection > Collect Fees >Student Collect fees >search Button
    @FindBy(xpath ="(//button[@type='submit'])[4]")
    public  WebElement searchButton;


    // Admin Fees Collection > Collect Fees >Student Collect fees >search Button
    @FindBy(xpath ="//*[@id='DataTables_Table_0']/tbody/tr[6]/td[8]/a")
    public  WebElement collectFeesChoose;

    // Admin Fees Collection > Collect Fees >Student Collect fees >Student Fees
    @FindBy(xpath ="//*[text()='Student Fees']")
    public  WebElement studentFeesWrite ;

    // Admin Fees Collection > Collect Fees >Student Collect fees >Student Fees > Currency
    @FindBy(xpath ="//*[text()='USD ($)']")
    public  WebElement uSDCurrency ;

    // Admin Fees Collection > Collect Fees >Student Collect fees >Student Fees >Add Fees Butonu (+)
    @FindBy(xpath ="(//*[@data-fee-category='transport'])[1]")
    public  WebElement addFessButonu ;

    // Admin Fees Collection > Collect Fees >Student Collect fees >Student Fees >Add Fees Butonu > $ Collect Fees button
    @FindBy(xpath ="(//button[@id='load'])[3]")
    public  WebElement  collectFeesPayButton ;

    // Admin Fees Collection > Collect Fees >Student Collect fees >Student Fees >Add Fees Butonu > Revert Button
    @FindBy(xpath ="//*[@class='fa fa-undo']")
    public  WebElement  revertButton;
    // Admin Fees Collection > Collect Fees >Student Collect fees >Student Fees >Add Fees Butonu > Student Fees Lıst
     @FindBy(xpath = "//*[text()='Student Fees']")
    public  WebElement StudentFeesLıstWrite;

    //***********************************EMRE ADMINPAGE LOCATES***************************************
    //Admin Login Panel
    @FindBy(xpath = "//*[@class='messages']")
    public WebElement adminPanelMessageBoard;

    @FindBy(xpath = "//*[@class='forgot']")
    public WebElement adminPanelForgotPasswordElement;

    @FindBy(xpath = "//*[@class='loginright mCustomScrollbar _mCS_1']")
    public WebElement adminUserPanelMessagePanel;

    @FindBy(xpath = "//*[text()='Admin Login']")
    public WebElement adminLoginText;

    @FindBy(xpath = "//*[@class='forgot']")
    public WebElement adminPasswordForgotLink;
    //************************************************************************************************

    //--------------------------

    //Admin dashboard/chat section

    @FindBy(xpath = "//a[@class='todoicon']")
    public WebElement adminDashboardChatButton;

    @FindBy(xpath="//div[@class='messages']")
    public WebElement adminDashboardChatPage;

    @FindBy (xpath ="//input[@placeholder='Write Your Message...']")
    public WebElement adminDasbhoardChatPageMessageTextBox;

    @FindBy(xpath = "//i[@class='fa fa-paper-plane']")
    public WebElement adminDashboardMessageTextBoxSendButton;

    @FindBy(xpath = "//p[normalize-space()='Hello, this is a test message.']")
    public WebElement getAdminDashboardSentMessageText;












// Admin Student Information --> Multi Class Student
    @FindBy (xpath = "//span[text()='Student Information']")
    public WebElement studentInformation;

    @FindBy (xpath = "(//a[@href=\"https://qa.wonderworldcollege.com/student/multiclass\"])[2]")
    public WebElement multiClassStudentLink;

    @FindBy (xpath = "//h3[@class='box-title']")
    public WebElement multiClassStudentselectCriteriaText;

    @FindBy (id = "class_id")
    public WebElement multiClassStudentClassTexbox;

    @FindBy (id = "section_id")
    public WebElement multiClassStudentSectionTexbox;

    @FindBy (xpath = "(//button[@type='submit'])[3]")
    public WebElement multiClassStudentSearchButton;

    @FindBy (xpath = "(//h3[@class='box-title'])[2]")
    public WebElement multiClassStudentselectCriteriaText2;

    @FindBy (xpath = "(//button[@class='btn btn-default btn-sm pull-right addrow addrow-mb2010'])[1]")
    public WebElement multiClassStudentAddButton;

    @FindBy (xpath = "(//select[@name='class_id_3'])[1]")
    public WebElement multiClassStudentClassTexbox2;

    @FindBy (xpath = "(//select[@name='section_id_3'])[1]")
    public WebElement multiClassStudentSectionTexbox2;

    @FindBy (xpath = "(//button[@type='submit'])[4]")
    public WebElement multiClassStudentUpdateButton;

    @FindBy(xpath = "(//button[@class='btn btn-sm btn-danger rmv_row'])[3]")
    public WebElement multiClassStudentRemoveButton;





}
