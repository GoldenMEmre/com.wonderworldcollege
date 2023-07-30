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

   // Student Dashboard / Class write text
    @FindBy(xpath = "//li[@class='list-group-item border0']")
    public WebElement classWriteTex;


    //Student Dashboard  /My Profile / Profile
    @FindBy(xpath = "//*[text()='Profile']")
    public WebElement ProfileButton;


    //Student Dashboard  /My Profile / Exam
    @FindBy(xpath = "//*[text()='Exam']")
    public WebElement ExamButton;


    //Student Dashboard  /My Profile / Exam
    @FindBy(xpath = "//*[text()='Documents']")
    public WebElement DokumentButton;


    //Student Dashboard /note text
    @FindBy(xpath ="(//a[text()='New Academic Session'])[2]")
      public WebElement noteTextElement;
    //WebElement aa=Driver.getDriver().findElement(By.xpath("(//a[text()='New Academic Session'])[2]"));


    //Student Dashboard
    @FindBy(xpath = "//a[text()='fees']")
    public WebElement afees;





}
