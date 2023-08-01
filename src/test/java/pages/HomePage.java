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


    //-------------------------------------------------------------

    @FindBy(xpath = "(//a[text()='Course'])[1]")
    public WebElement coursePage;

    @FindBy(xpath = "(//div[@class='course-inner'])[1]")
    public WebElement coursePageEnglishAndLiteratureTitle;

    @FindBy(xpath = "(//div[@class='course-inner'])[2]")
    public WebElement coursePageMathematicsTitle;

    @FindBy(xpath = "(//div[@class='course-inner'])[3]")
    public WebElement coursePageSciencesTitle;

    @FindBy(xpath = "(//div[@class='course-inner'])[4]")
    public WebElement coursePageSocialSciencesTitle;

    @FindBy(xpath = "(//div[@class='course-inner'])[5]")
    public WebElement coursePageHistoryTitle;

    @FindBy(xpath = "(//div[@class='course-inner'])[6]")
    public WebElement coursePageArtsAndMusicTitle;

    @FindBy(xpath = "(//div[@class='course-inner'])[7]")
    public WebElement coursePageHealthAndExerciseSciencesTitle;

    @FindBy(xpath = "(//div[@class='course-inner'])[8]")
    public WebElement coursePageForeignLanguageTitle;

    @FindBy(xpath = "(//div[@class='course-inner'])[9]")
    public WebElement coursePageComputerScienceTitle;

    @FindBy(xpath = "(//a[@class='btn-read'])[1]")
    public WebElement coursePageEnglishAndLiteratureDetailsButton;

    @FindBy(xpath = "(//a[@class='btn-read'])[2]")
    public WebElement coursePageMathematicsDetailsButton;

    @FindBy(xpath = "(//a[@class='btn-read'])[3]")
    public WebElement coursePageSciencesDetailsButton;

    @FindBy(xpath = "(//a[@class='btn-read'])[4]")
    public WebElement coursePageSocialSciencesDetailsButton;

    @FindBy(xpath = "(//a[@class='btn-read'])[5]")
    public WebElement coursePageHistoryDetailsButton;

    @FindBy(xpath = "(//a[@class='btn-read'])[6]")
    public WebElement coursePageArtsAndMusicDetailsButton;

    @FindBy(xpath = "(//a[@class='btn-read'])[7]")
    public WebElement coursePageHealthAndExerciseSciencesDetailsButton;

    @FindBy(xpath = "(//a[@class='btn-read'])[8]")
    public WebElement coursePageForeignLanguageDetailsButton;

    @FindBy(xpath = "(//a[@class='btn-read'])[9]")
    public WebElement coursePageComputerScienceDetailsButton;

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
  
    // **********************************************************//
  
  // Homepage>SliderImg
  @FindBy(xpath = "//img[@src='https://qa.wonderworldcollege.com/uploads/gallery/media/top-banner2-2.jpg']")
  public  WebElement diverseImg;
    @FindBy(xpath = "//img[@src='https://qa.wonderworldcollege.com/uploads/gallery/media/v-4banner3-3.jpg']")
    public  WebElement wonderImg;
    @FindBy(xpath ="//img[@src='https://qa.wonderworldcollege.com/uploads/gallery/media/1674040621-203862736463c7d52d312c6!DCC Sports Day (3).jfif']")
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

    @FindBy(xpath="right carousel-control")
     public  WebElement sliderPanel;
    //*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*

    //HomePage/User Login Page
    @FindBy(xpath = "//*[text()='User Login']")
    public WebElement userLoginText;

    @FindBy(xpath = "//div[@class='messages']")
    public WebElement userLoginMessages;


}
