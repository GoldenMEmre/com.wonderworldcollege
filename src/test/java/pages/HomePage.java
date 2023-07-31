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

}
