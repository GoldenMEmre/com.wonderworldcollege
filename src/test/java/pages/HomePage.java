package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HomePage extends Base {

    //Homepage>ExamResultButton
    @FindBy(xpath =" a[normalize-space()='Exam Result']")
    public WebElement examResultButton;
    //Homepage ExamResultPage> ExamResultText
    @FindBy(xpath ="h3[@class='entered mt0']")
    public WebElement examResultText;
    //Homepage>ExamResultPage>AdmissionNoButtong
    @FindBy(xpath = "input[@id='admission_no'] ")
    public WebElement admissionNoButton;

    //Homepage>ExamResultPage>ExamButton
    @FindBy(xpath="select[@id='exam_id']")
    public WebElement examDropDown;
    @FindBy(xpath = "//button[@id='search_btn']")
    public WebElement examResultPageSearchButton;

    @FindBy(xpath = "//div[@class='alert alert-danger']")
    public  WebElement examResultPageResultText;   







      //Homepage >"login" butonu
    @FindBy(xpath = "//*[@class='complainbtn']")
    public WebElement loginButonu;

    //HomePage  > Dashboard > Notice Board text
    @FindBy(xpath = "(//h3[@class='box-title'])[1]")
      public WebElement NoticeBoardText;

    //Homepage > Header > "Call Us" text
    @FindBy(xpath = "//div[@class='he-text']")
    public WebElement CallUsText;

    //Homepage > "ACHEIVEMENTS" section

    @FindBy(xpath = "//h2[@class='counter-title mt0']")
    public WebElement acheıvementsSection;

    //Homepage > "ACHEIVEMENTS" section >   STUDENT CAMPUSES BOARDS
    @FindBy(xpath = "//*[text()='Student Campuses']")
    public WebElement studentCampusesBoard;

    // Homepage>SliderImg
    @FindBy(xpath = "//img[@src='https://qa.wonderworldcollege.com/uploads/gallery/media/top-banner2-2.jpg']")
    public  WebElement diverseImg;
    @FindBy(xpath = "//img[@src='https://qa.wonderworldcollege.com/uploads/gallery/media/v-4banner3-3.jpg']")
    public  WebElement wonderImg;
    @FindBy(xpath ="https://qa.wonderworldcollege.com/uploads/gallery/media/1674040621-203862736463c7d52d312c6!DCC Sports Day (3).jfif")
    public  WebElement studentsImg;
    @FindBy(xpath ="//img[@src='https://qa.wonderworldcollege.com/uploads/gallery/media/v-4banner1.jpg']")
    public  WebElement nurturingImg;
    @FindBy(xpath ="//img[@src='https://qa.wonderworldcollege.com/uploads/gallery/media/v-4banner4.jpg']")
    public  WebElement preparingImg;

   @FindBy(xpath = "//*[@id='navbar-collapse-3']")
    public WebElement homeBar;

   @FindBy(xpath = "//a[@class='logo']")
    public WebElement siteLogo;

   @FindBy(xpath="//a[@data-toggle='dropdown']")
    public WebElement academicsButton;


    @FindBy(xpath = "//a[text()='School Uniform']")
    public WebElement schoolUniformDropDown;

    @FindBy(xpath = "//a[text()='Facilities']")
    public WebElement facilitiesDropDown;


    @FindBy(xpath = "//a[text()='Principal Message']")
    public WebElement principalMessageDropDown;

    @FindBy(xpath = "//a[text()='Know Us']")

    public WebElement knowUsDropDown;

    @FindBy(xpath = "//a[text()='Approach']")
    public WebElement approachDropDown;

    @FindBy(xpath = "//a[text()='Teacher']")
    public WebElement teacherDropDown;

    @FindBy(xpath = "//*[@id=\"navbar-collapse-3\"]/ul/li[9]/a")
    public WebElement contackButton;

    @FindBy(xpath = "(//input[@type='text'])[5]")
    public WebElement nameButton;

    @FindBy(xpath = "(//input[@type='email'])[2]")
    public WebElement emailButton;

    @FindBy(xpath = "(//input[@type='text'])[6]")
    public WebElement subjectButton;

    @FindBy(xpath = "//textarea[@name='description']")
    public WebElement descriptionButton;
    @FindBy(xpath = "//input[@value='Submit']")
    public WebElement submitButton;


    @FindBy(xpath = "//*[text()='Our Location']")
    public WebElement ourLocation;

    @FindBy(xpath = "//*[text()='CALL US']")
    public WebElement callUs;

    @FindBy (xpath = "//h3[text()='Working Hours']")
    public WebElement workingHours;

   @FindBy(xpath ="//*[text()='Feedback']" )
    public WebElement feedBack;

}
