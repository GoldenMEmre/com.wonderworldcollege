package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

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

    //*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*

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















}
