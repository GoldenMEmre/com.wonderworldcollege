package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
import utilities.ReusableMethods;

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

    //-------------------------------------------------------------

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
    @FindBy(xpath="right carousel-control")
     public  WebElement sliderPanel;
    //*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*

    //User Login Page
    @FindBy(xpath = "//*[text()='User Login']")
    public WebElement userLoginText;

    @FindBy(xpath = "//div[@class='messages']")
    public WebElement userLoginMessages;

    //--------------------------- Ogun Locates ----------------------------------------
    // Home Page Complain Title
    @FindBy(xpath = "//*[text()='Complain']")
    private WebElement homepageComplain;

    // Complain Page Name Textbox
    @FindBy(xpath = "(//input[@name='name'])[2]")
    private WebElement complainPageNameTextBox;

    // Complain Page EMail Textbox
    @FindBy(xpath = "(//input[@name='email'])[2]")
    private WebElement complainPageEmailTextBox;

    // Complain Page Contact No. Textbox
    @FindBy(xpath = "//input[@name='contact_no']")
    private WebElement complainPageContactNoTextBox;

    // Complain Page Description Textbox
    @FindBy(xpath = "//textarea[@name='description']")
    private WebElement complainPageDescriptionTextBox;

    // Complain Page Submit Button
    @FindBy(xpath = "//input[@type='submit']")
    private WebElement complainPageSubmitButton;

    // Complain Page Successful Alert
    @FindBy(xpath = "//div[@class='alert alert-success']")
    private WebElement complainPageSuccessAlert;

    //********************************************

    //Home Page Online Admission Title
    @FindBy(xpath = "//*[text()='Online Admission']")
    private WebElement homePageOnlineAdmissionTitle;

    //------------------------------ Ogun Methods -------------------------------

    // Verifies that Complain button is visible and enable, and clicks on it
    public void verifyClickComplain(){
        try {
            ReusableMethods.scrollToElement(Driver.getDriver(),homepageComplain);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Assert.assertTrue(homepageComplain.isDisplayed());
        Assert.assertTrue(homepageComplain.isEnabled());
        homepageComplain.click();
    }

    //Verifies that Complain page
    public void verifyComplainPage(){
        String expectedTitle = "Complain";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);
    }

    // Verifies Name, Email, contact No and Description TextBoxes on Complain Page
    public void verifyTextBoxesComplainPage(){
        Assert.assertTrue(complainPageNameTextBox.isDisplayed());
        Assert.assertTrue(complainPageEmailTextBox.isDisplayed());
        Assert.assertTrue(complainPageContactNoTextBox.isDisplayed());
        Assert.assertTrue(complainPageDescriptionTextBox.isDisplayed());
    }

    // Enters required datas in required textBoxes
    public void enterDataComplainPage(){
        complainPageNameTextBox.sendKeys("Ogün Erdogan");
        complainPageEmailTextBox.sendKeys("ogun.erdogan@hotmail.com");
        complainPageContactNoTextBox.sendKeys("0123 4567 890");
        complainPageDescriptionTextBox.sendKeys("Classes are Dirty");
    }

    //Clicks on submit button on Complain Page
    public void clickOnSubmitComplainPage(){
        Assert.assertTrue(complainPageSubmitButton.isDisplayed());
        Assert.assertTrue(complainPageSubmitButton.isEnabled());
        complainPageSubmitButton.click();
    }

    // Verifies that Complain has been send
    public void verifiyComplainSend(){
        Assert.assertTrue(complainPageSuccessAlert.isDisplayed());
    }

}
