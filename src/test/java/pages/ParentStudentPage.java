package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class ParentStudentPage extends Base{

    //admin login >email
    @FindBy(xpath = "//input[@name='login']")
    public WebElement eMail;

    // admin login >sing in
    @FindBy(xpath = "//button[text()='Sign In']")
    public WebElement signinButton;

    // Adress Box On The New Adress Page
    @FindBy (xpath = "//input[@id='Address']")
    public WebElement adressBoxOnTheNewAdressPage;






    // "UserLogin" butonu
    @FindBy(xpath = "(//*[@target='_blank'])[1]")
    public WebElement userLoginButonu;

    //User login  > UserName textbox
    @FindBy(xpath = "//input[@name='username']")
    public WebElement userloginuserNameTextBoxElement;

    //User login  > password textbox
    @FindBy(xpath = "//input[@name='password']")
    public WebElement userloginpasswordTextBoxElement;

    //User login >  "Sign In" butonu
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signInButonu;

    //Student Dashboard  /"My Profile" button
    @FindBy(xpath = "//*[text()='My Profile']")
    public WebElement myProfileButton;

   // User login >Student Dashboard / Class write text
    @FindBy(xpath = "//li[@class='list-group-item border0']")
    public WebElement classWriteTex;


    // User login >Student Dashboard  /My Profile / Profile
    @FindBy(xpath = "//*[text()='Profile']")
    public WebElement ProfileButton;


    //Student Dashboard  /My Profile / Exam
    @FindBy(xpath = "//*[text()='Exam']")
    public WebElement ExamButton;


    //User login > Student Dashboard  /My Profile / Exam
    @FindBy(xpath = "//*[text()='Documents']")
    public WebElement DokumentButton;


    //User login >Student Dashboard /note text
    @FindBy(xpath ="(//a[text()='New Academic Session'])[2]")
      public WebElement noteTextElement;
    //WebElement aa=Driver.getDriver().findElement(By.xpath("(//a[text()='New Academic Session'])[2]"));


    //Userlogin > Student Dashboard
    @FindBy(xpath = "//a[text()='fees']")
    public WebElement afees;

    // UserLogin > Student Dashboard > HomeWork button

       @FindBy(xpath = "//*[text()='Homework']")
        public  WebElement homeWorkButton;


    // UserLogin > Student Dashboard > HomeWork button > Upcoming Homework
    @FindBy(xpath = "//*[text()='Upcoming Homework']")
    public  WebElement upcomingHomeworkButton;


    // UserLogin > Student Dashboard > HomeWork button > Closed Homework'
    @FindBy(xpath = "//*[text()='Closed Homework']")
    public  WebElement closedHomeworkButton;

   //UserLogin StudentDashboard >HomeWork button >Upcoming Homework > Class cloums
   @FindBy(xpath = "(//*[text()='Class'])[1]")
   public  WebElement classColumn;



    //UserLogin StudentDashboard >HomeWork button >Upcoming Homework > Action Section
    @FindBy(xpath = "(//*[@data-original-title='Evaluation'])[1]")
    public  WebElement actionButonuSection;


    //UserLogin StudentDashboard >HomeWork button >Upcoming Homework > Action Section   >Homework Details Section
    @FindBy(xpath = "//*[text()='Description']")
    public  WebElement homeWorkDetailsWrite;


    //UserLogin StudentDashboard >HomeWork button >Upcoming Homework > Action Section   >Homework Details
    @FindBy(xpath = "//*[@name='message']")
    public  WebElement messageTextBox;



    //UserLogin StudentDashboard >HomeWork button >Upcoming Homework > Action Section   >Homework Details >save button
    @FindBy(xpath = "//*[@id='submit']")
    public  WebElement saveButton;




    //UserLogin StudentDashboard >HomeWork button >Closed Homework >
    @FindBy(xpath = "//*[@class='closed-exam']")
    public  WebElement closeddHomeWorkButton;


    //UserLogin StudentDashboard >HomeWork button >Closed Homework > Action Section
    @FindBy(xpath = "(//*[@data-toggle='modal'])[5]")
    public  WebElement actionSectionClosed;

     ////*[@class='box-tools pull-right']


    //UserLogin StudentDashboard >HomeWork button >Upcoming Homework> 'Daily Assignment'
    @FindBy(xpath = "//*[@data-method_call='add']")
    public  WebElement dailyAssignment;
    @FindBy(xpath ="(//*[@data-toggle='modal'])[3]")
    public WebElement dailyAssigmentTwo;


    //UserLogin StudentDashboard >HomeWork button >Upcoming Homework > 'Daily Assignment' >Add Daily Assignment'
    @FindBy(xpath = "//*[@class='box-title']")
    public  WebElement addDailyAssignment;



    //UserLogin StudentDashboard >HomeWork button >Upcoming Homework > 'Daily Assignment' >Add Daily Assignment'>Daily Assignment List
    @FindBy(xpath = "//*[@class='box-title titlefix']")
    public  WebElement dailyAssignmentList;




    //UserLogin StudentDashboard >HomeWork button >Upcoming Homework > 'Daily Assignment' >Add Daily Assignment'
    @FindBy(xpath = "(//input[@type='text'])[2]")
    public  WebElement titleTextBox;


    //UserLogin StudentDashboard >HomeWork button >Upcoming Homework > 'Daily Assignment' >Add Daily Assignment' >Descriptıon textBox
    @FindBy(xpath = "//*[@name='description']")
    public  WebElement descriptionTextBox;


    //UserLogin StudentDashboard >HomeWork button >Upcoming Homework > 'Daily Assignment' >Add Daily Assignment'>save button
    @FindBy(xpath = "//*[@name='description']")
    public  WebElement saveButtonAddAssigment;



    //UserLogin StudentDashboard >HomeWork button  > 'Daily Assignment' >Add Daily Assignment'>Add Daily Assignment Write
    @FindBy(xpath = "//*[@class='box-title']")
    public  WebElement addDailyAssignmentWrite;

    //UserLogin StudentDashboard >HomeWork button  > 'Daily Assignment' >Add Daily Assignment'>Add Daily Assignment close icon
    @FindBy(xpath = "(//button[@type='button'])[4]")
    public  WebElement addDailyAssignmentCloseİcon ;


    //UserLogin StudentDashboard >HomeWork button  > 'Daily Assignment' >Add Daily Assignment'> Daily Assignment List >Edit icon
    @FindBy(xpath = "//*[@id='DataTables_Table_0']/tbody/tr[1]/td[7]/a[1]")
    public  WebElement dailyAssignmentEditİcon ;

    //UserLogin StudentDashboard >HomeWork button  > 'Daily Assignment' >Add Daily Assignment'> Daily Assignment List >Delete icon
    @FindBy(xpath = "//*[@id='DataTables_Table_0']/tbody/tr[1]/td[7]/a[2]")
    public  WebElement dailyAssignmentDeleteİcon;

    //UserLogin StudentDashboard >HomeWork button  > 'Daily Assignment' >Add Daily Assignment'> Daily Assignment List > Edit - save button
    @FindBy(xpath = "(//button[@type='submit'])[2]")
    public  WebElement EditSaveButton;

    //*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*MEMRE LOCATES-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*

    //HomePage/User Login Page
    @FindBy(xpath = "//*[text()='User Login']")
    public WebElement userLoginText;

    @FindBy(xpath = "//div[@class='messages']")
    public WebElement userLoginMessages;

    @FindBy(xpath = "//input[@name='username']")
    public WebElement usernameTextBoxElement;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement passwordTextBoxElement;

    @FindBy(xpath = "//div[@class='col-lg-3 col-md-3 col-sm-3']")
    public WebElement noImageStudentPanel;

    @FindBy(xpath = "//div[text()='Invalid Username Or Password']")
    public WebElement invalidCredentialsTextElement;

    @FindBy (xpath = "//a[@class='forgot']")
    public WebElement userLoginForgotPasswordLinkElement;

    @FindBy(xpath = "//*[@class='fa fa-empire']")
    public WebElement userLoginFrontSiteLinkElement;
    //a[@href = 'https://qa.wonderworldcollege.com/']
    //*[@class='forgot pull-right']

    //******************************** Ogun Locates ***************************************

    //Login button on home page
    @FindBy(xpath = "(//*[text()='Login'])[1]")
    private WebElement loginButtonHomePage;

    //Examinations title Side Bar Student Page
    @FindBy(xpath = "//*[text()='Examinations']")
    private WebElement examinationsSideBarStudentPage;

    //Exam Schedule title Side Bar Student Page
    @FindBy(xpath = "//*[text()=' Exam Schedule']")
    private WebElement examScheduleSideBarStudentPage;

    //Exam Schedule header Text Student Page
    @FindBy(xpath = "//*[text()='Exam Schedule ']")
    private WebElement examScheduleHeaderTextStudentPage;

    //Exam Example Student Page
    @FindBy(xpath = "//*[text()='Java OOP']")
    private WebElement examExampleExamSchedule;
    //Exam Schedule search Box
    @FindBy(xpath = "//input[@type='search']")
    private WebElement searchBoxExamSchedule;
    //Exam Schedule Columns S.No
    @FindBy(xpath = "//*[text()='S.No.']")
    private WebElement columnSNoExamSchedule;
    //Exam Schedule Columns Exam
    @FindBy(xpath = "//*[text()='Exam']")
    private WebElement columnExamExamSchedule;
    //Exam Schedule Columns Description
    @FindBy(xpath = "//*[text()='Description']")
    private WebElement columnDescriptionExamSchedule;
    //Exam Schedule Columns Action
    @FindBy(xpath = "//*[text()='Action']")
    private WebElement columnActionExamSchedule;
    //View Button Exam Schedule
    @FindBy(xpath = "(//a[@data-toggle='tooltip'])[4]")
    private WebElement viewButtonExamSchedule;
    //Subject Column View Details Page Exam Schedule
   @FindBy(xpath = "(//*[text()='Subject'])[1]")
   private WebElement subjectColumnViewDetails;
 //Date From Column View Details Page Exam Schedule
 @FindBy(xpath = "(//*[text()='Date From'])[1]")
 private WebElement dateFromColumnViewDetails;
 //Start Time Column View Details Page Exam Schedule
 @FindBy(xpath = "(//*[text()='Start Time'])[1]")
 private WebElement startTimeColumnViewDetails;
 //Duration Column View Details Page Exam Schedule
 @FindBy(xpath = "(//*[text()='Duration'])[1]")
 private WebElement durationColumnViewDetails;
 //Credit Hours Column View Details Page Exam Schedule
 @FindBy(xpath = "(//*[text()='Credit Hours'])[1]")
 private WebElement creditHoursColumnViewDetails;
 //Room No. Column View Details Page Exam Schedule
 @FindBy(xpath = "(//*[text()='Room No.'])[1]")
 private WebElement roomNoColumnViewDetails;
 //Marks (Max..) Column View Details Page Exam Schedule
 @FindBy(xpath = "(//*[text()='Marks (Max..)'])[1]")
 private WebElement marksMaxColumnViewDetails;
 //Marks (Min..) Column View Details Page Exam Schedule
 @FindBy(xpath = "(//*[text()='Marks (Min..)'])[1]")
 private WebElement marksMinColumnViewDetails;
 // Teacher Reviews button on side bar
 @FindBy(xpath = "(//*[text()='Teachers Reviews'])[1]")
 private WebElement teacherReviewsButtonsideBar;
 //Teacher reviews Header Text
 @FindBy(xpath = "//*[text()=' Teachers Reviews']")
 private WebElement teacherReviewsHeaderText;
//Teachers Reviews Rate Button
 @FindBy(xpath = "(//i[@class='fa fa-plus'])[1]")
 private WebElement rateButtonTeachersReviews;
 //Rate Page Rating section
 @FindBy(xpath = "//span[@id='rate5']")
 private WebElement rateTeacherRatePage;
 //Rate Page Comment TextBox
 @FindBy(xpath = "(//input[@class='form-control'])[1]")
 private WebElement commentTextBoxRatePage;
//Rate Page Submit button
 @FindBy(xpath = "//button[@id='submit']")
 private WebElement submitButtonRatePage;

//Profile Image Parent Page
 @FindBy(xpath = "//img[@class='topuser-image']")
 private WebElement profileImageButtonParentPage;
 //Change Password Parent Page
 @FindBy(xpath = "//*[text()=' Change Password']")
 private WebElement changePasswordButtonParentPage;
 //Save Button Change Password
 @FindBy(xpath = "(//*[text()='Save'])[1]")
 private WebElement saveButtonChangePasswordParentPage;
 //Current Password TextBox
 @FindBy(xpath = "//input[@name='current_pass']")
 private WebElement currentPasswordTextbox;
 //New Password TextBox
 @FindBy(xpath = "//input[@name='new_pass']")
 private WebElement newPasswordTextbox;
 //Confirm Password TextBox
 @FindBy(xpath = "//input[@name='confirm_pass']")
 private WebElement confirmPasswordTextbox;
 //Logout Button Parent Page
 @FindBy(xpath = "//*[text()=' Logout']")
 private WebElement logOutButtonParentPage;
 //SignIn Button User Login Page
 @FindBy(xpath = "//button[@type='submit']")
 private WebElement signInButtonUserLogin;
private String positiveChangePassword = "Ogun,Erd23";
private String negativeChangePassword = "ogunerd23";

    //******************************* Ogun Methods *****************************************

 //Clicks on login button
 public void clickLoginButtonHomePage(){
  loginButtonHomePage.click();
 }
 //Enters username and password Student Login
 public void enterUserNameAndPassword(){
  userloginuserNameTextBoxElement.sendKeys(ConfigReader.getProperty("ogunStudentGiris"));
  passwordTextBoxElement.sendKeys(ConfigReader.getProperty("DGpassword"));
 }
 //Enters username and password Parent Login
 public void enterUserNameAndPasswordParent(){
  userloginuserNameTextBoxElement.sendKeys(ConfigReader.getProperty("ogunParentGiris"));
  passwordTextBoxElement.sendKeys(ConfigReader.getProperty("DGpassword"));
 }
   //Clicks and verifies Examination and Exam Schedule Titles on Side Bar
 public void examinationsExamScheduleClickverify(){
  Assert.assertTrue(examinationsSideBarStudentPage.isDisplayed());
  Assert.assertTrue(examinationsSideBarStudentPage.isEnabled());
  examinationsSideBarStudentPage.click();
  Assert.assertTrue(examScheduleSideBarStudentPage.isDisplayed());
  Assert.assertTrue(examScheduleSideBarStudentPage.isEnabled());
  examScheduleSideBarStudentPage.click();
 }
 //verifies exam schedule head text
 public void examScheduleHeaderTextVerify(){
  Assert.assertTrue(examScheduleHeaderTextStudentPage.isDisplayed());
 }
 //Enters an exam on search box and verify the filtering
 public void filterExamVerify(){
  Assert.assertTrue(searchBoxExamSchedule.isDisplayed());
  Assert.assertTrue(searchBoxExamSchedule.isEnabled());
  searchBoxExamSchedule.sendKeys("Java OOP", Keys.ENTER);
  Assert.assertTrue(examExampleExamSchedule.isDisplayed());
 }
 //Verifies the Columns on Exam Schedule Page
 public void columnsVerificationExamSchedule(){
  Assert.assertTrue(columnSNoExamSchedule.isDisplayed());
  Assert.assertTrue(columnExamExamSchedule.isDisplayed());
  Assert.assertTrue(columnDescriptionExamSchedule.isDisplayed());
  Assert.assertTrue(columnActionExamSchedule.isDisplayed());
 }
 //Clicks on view button and verify exam details page
 public void examDetailsPageVerify(){
  viewButtonExamSchedule.click();
  ReusableMethods.bekle(2);
  Assert.assertTrue(subjectColumnViewDetails.isDisplayed());
 }
 //Verify the Columns on Exam Details Page
 public void examDetailsPageColumnsVerification(){
  Assert.assertTrue(subjectColumnViewDetails.isDisplayed());
  Assert.assertTrue(dateFromColumnViewDetails.isDisplayed());
  Assert.assertTrue(startTimeColumnViewDetails.isDisplayed());
  Assert.assertTrue(durationColumnViewDetails.isDisplayed());
  Assert.assertTrue(creditHoursColumnViewDetails.isDisplayed());
  Assert.assertTrue(roomNoColumnViewDetails.isDisplayed());
  Assert.assertTrue(marksMaxColumnViewDetails.isDisplayed());
  Assert.assertTrue(marksMinColumnViewDetails.isDisplayed());
 }
//clicks and verifies Teachers Reviews Button on side bar
 public void teachersReviewsClickVerify(){
  Assert.assertTrue(teacherReviewsButtonsideBar.isDisplayed());
  Assert.assertTrue(teacherReviewsButtonsideBar.isEnabled());
  teacherReviewsButtonsideBar.click();
 }
 //verifies Teacher reviews Header Text
 public void teacherReviewsHeaderTextVerify(){
  Assert.assertTrue(teacherReviewsHeaderText.isDisplayed());
 }
 //clicks on rate button
 public void clickOnRatebutton(){
  Assert.assertTrue(rateButtonTeachersReviews.isDisplayed());
  Assert.assertTrue(rateButtonTeachersReviews.isEnabled());
  rateButtonTeachersReviews.click();
 }
 //rates teacher
 public void rateTeacher(){
  rateTeacherRatePage.click();
  commentTextBoxRatePage.sendKeys("Very friendly Teacher.");
  submitButtonRatePage.click();
 }
 //clicks on signIn button
 public void signInButtonclickUserLogin(){
  ReusableMethods.waitForClickablility(signInButtonUserLogin,5);
  signInButtonUserLogin.click();
 }
//clicks and verifies profile image button
 public void profileImageClickVerify(){
  Assert.assertTrue(profileImageButtonParentPage.isDisplayed());
  Assert.assertTrue(profileImageButtonParentPage.isEnabled());
  profileImageButtonParentPage.click();
 }
 //clicks and verifies change password button
 public void changePasswordButtonclickVerify(){
  Assert.assertTrue(changePasswordButtonParentPage.isDisplayed());
  Assert.assertTrue(changePasswordButtonParentPage.isEnabled());
  changePasswordButtonParentPage.click();
 }
 //verifies Change Password Page Redirection
 public void changePasswordPageRedirectionverify(){
  Assert.assertTrue(saveButtonChangePasswordParentPage.isDisplayed());
 }
 //positive change password test
 public void positiveChangePasswordTest(){
  currentPasswordTextbox.sendKeys(ConfigReader.getProperty("DGpassword"));
  newPasswordTextbox.sendKeys(positiveChangePassword);
  confirmPasswordTextbox.sendKeys(positiveChangePassword);
  saveButtonChangePasswordParentPage.click();
  profileImageButtonParentPage.click();
  logOutButtonParentPage.click();
  ReusableMethods.bekle(2);
 }
 //negative change password text
 public void negativeChangePasswordText(){
  currentPasswordTextbox.sendKeys(ConfigReader.getProperty("positiveChangePassword"));
  newPasswordTextbox.sendKeys(negativeChangePassword);
  confirmPasswordTextbox.sendKeys(negativeChangePassword);
  saveButtonChangePasswordParentPage.click();
 }
 //login to parent panel after positive change password process
 public void loginAfterPositiveChangePassword(){
  usernameTextBoxElement.sendKeys(ConfigReader.getProperty("ogunParentGiris"));
  passwordTextBoxElement.sendKeys(ConfigReader.getProperty("positiveChangePassword"));
  signInButonu.click();
 }
 //logs out from parent page
 public void logOutParentPage(){
  profileImageButtonParentPage.click();
  logOutButtonParentPage.click();
 }
 //verifies if negative password change has been accepted
 public void verificationNegativeLoginTest(){
  usernameTextBoxElement.sendKeys(ConfigReader.getProperty("ogunParentGiris"));
  passwordTextBoxElement.sendKeys(ConfigReader.getProperty("negativeChangePassword"));
  signInButtonUserLogin.click();
  profileImageButtonParentPage.click();
  changePasswordButtonParentPage.click();
  currentPasswordTextbox.sendKeys(ConfigReader.getProperty("negativeChangePassword"));
  newPasswordTextbox.sendKeys(ConfigReader.getProperty("DGpassword"));
  confirmPasswordTextbox.sendKeys(ConfigReader.getProperty("DGpassword"));
  saveButtonChangePasswordParentPage.click();
  Assert.assertTrue(usernameTextBoxElement.isDisplayed());
 }

}
