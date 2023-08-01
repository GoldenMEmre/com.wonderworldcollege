package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utilities.Driver;
import utilities.ReusableMethods;

public class HomePage extends Base {

    Actions actions = new Actions(Driver.getDriver());
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

    //Online Admission PAge Instructions Text
    @FindBy(xpath = "//*[text()='In order to enroll in our school, it is necessary to have completed the age of 6 and reside in Brooklyn.']")
    private WebElement onlineAdmissionPageInstructionsText;

    //Online Admission Page Class Dropdown under BasicDetails
    @FindBy(xpath = "//select[@id='class_id']")
    private WebElement onlineAdmissionPageClassDropDown;

    //Online Admission Page Firstname Textbox under BasicDetails
    @FindBy(xpath = "//input[@id='firstname']")
    private WebElement onlineAdmissionPageFirstnameTextBox;

    //Online Admission Page Lastname TextBox under BasicDetails
    @FindBy(xpath = "//input[@id='lastname']")
    private WebElement onlineAdmissionPageLastNameTextBox;

    //Online Admission Page Gender Dropdown under BasicDetails
    @FindBy(xpath = "//select[@name='gender']")
    private WebElement onlineAdmissionPageGenderDropDown;

    //Online Admission Page Date Of Birth DatePicker under BasicDetails
    @FindBy(xpath = "//input[@name='dob']")
    private WebElement onlineAdmissionPageDateOfBirth;

    //Online Admission Page Mobile Number TextBox under BasicDetails
    @FindBy(xpath = "//input[@name='mobileno']")
    private WebElement onlineAdmissionPageMobileNumber;

    //Online Admission Page Email TextBox under BasicDetails
    @FindBy(xpath = "(//input[@name='email'])[2]")
    private WebElement onlineAdmissionPageEmail;

    //Online Admission Page Student Photo under BasicDetails
    @FindBy(xpath = "(//input[@id='file'])[1]")
    private WebElement onlineAdmissionPageStudentPhoto;

    // Online Admission PAge Date of birth previous button
    @FindBy(xpath = "(//th[@class='prev'])[2]")
    private WebElement previousDateOfBirth;

    // Online Admission PAge Date of birth mounth button
    @FindBy(xpath = "//*[text()='Oct']")
    private WebElement mounthDateOfBirth;
    // Online Admission PAge Date of birth day button
    @FindBy(xpath = "//*[text()='26']")
    private WebElement dayDateOfBirth;
    //Student Photo remove Button
    @FindBy(xpath = "(//button[@type='button'])[9]")
    private WebElement removeButtonStudentPhoto;

    //required field alerts
    @FindBy(xpath = "//*[text()='The Class field is required.']")
    private WebElement requiredFieldAlertClass;
    @FindBy(xpath = "//*[text()='The First Name field is required.']")
    private WebElement requiredFieldAlertFirstName;
    @FindBy(xpath = "//*[text()='The Gender field is required.']")
    private WebElement requiredFieldAlertGender;
    @FindBy(xpath = "//*[text()='The Date Of Birth field is required.']")
    private WebElement requiredFieldAlertDateOfBirth;
    @FindBy(xpath = "//*[text()='The Email field is required.']")
    private WebElement requiredFieldAlertEmail;
    @FindBy(xpath = "//*[text()='The Guardian field is required.']")
    private WebElement requiredFieldAlertGuardian;
    @FindBy(xpath = "//*[text()='The Guardian Name field is required.']")
    private WebElement requiredFieldAlertGuardianName;
    @FindBy(xpath = "//*[text()='The Guardian Relation field is required.']")
    private WebElement requiredFieldAlertGuardianRelation;

    //Online Admission Page Submit Button
    @FindBy(xpath = "(//button[@type='submit'])[5]")
    private WebElement onlineAdmissionPageSubmitButton;

    //Online Admission Page Parent details Section Father Name TextBox
    @FindBy(xpath = "//input[@name='father_name']")
    private WebElement fatherNameParentDetail;

    //Online Admission Page Parent details Section Father Name TextBox
    @FindBy(xpath = "//input[@name='mother_name']")
    private WebElement motherNameParentDetail;

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
    //**********************************************
    //Clicks on Online Admission Title on Home page
    public void clickOnlineAdmissionHomePage(){
        Assert.assertTrue(homePageOnlineAdmissionTitle.isDisplayed());
        Assert.assertTrue(homePageOnlineAdmissionTitle.isEnabled());
        homePageOnlineAdmissionTitle.click();
    }
    // Verifies Online Admission Page
    public void verifyOnlineAdmissionPage(){
        String expectedTitle = "Online Admission Form";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);
    }
    // Verifies that school admission criteria is displayed
    public void verifySchoolAdmissionCriteria(){
        String expectedText ="In order to enroll in our school, " +
                "it is necessary to have completed the age of 6 and reside in Brooklyn.";
        String actualText = onlineAdmissionPageInstructionsText.getText();
        Assert.assertEquals(expectedText,actualText);
    }
    //Verifies Class, First Name, Last Name, Gender, Date of Birth,
    //Mobile number, Email and Student Photo Webelements and fills these fields
    public void enterVerifyBasicDetails(){
        Assert.assertTrue(homepageComplain.isDisplayed()); //negatif test
        Assert.assertTrue(onlineAdmissionPageClassDropDown.isDisplayed());
        Assert.assertTrue(onlineAdmissionPageClassDropDown.isEnabled());
        Assert.assertTrue(onlineAdmissionPageFirstnameTextBox.isDisplayed());
        Assert.assertTrue(onlineAdmissionPageFirstnameTextBox.isEnabled());
        Assert.assertTrue(onlineAdmissionPageLastNameTextBox.isDisplayed());
        Assert.assertTrue(onlineAdmissionPageLastNameTextBox.isEnabled());
        Assert.assertTrue(onlineAdmissionPageGenderDropDown.isDisplayed());
        Assert.assertTrue(onlineAdmissionPageGenderDropDown.isEnabled());
        Assert.assertTrue(onlineAdmissionPageDateOfBirth.isDisplayed());
        Assert.assertTrue(onlineAdmissionPageDateOfBirth.isEnabled());
        Assert.assertTrue(onlineAdmissionPageMobileNumber.isDisplayed());
        Assert.assertTrue(onlineAdmissionPageMobileNumber.isEnabled());
        Assert.assertTrue(onlineAdmissionPageEmail.isDisplayed());
        Assert.assertTrue(onlineAdmissionPageEmail.isEnabled());
        Assert.assertTrue(onlineAdmissionPageStudentPhoto.isDisplayed());
        Assert.assertTrue(onlineAdmissionPageStudentPhoto.isEnabled());

        Select select = new Select(onlineAdmissionPageClassDropDown);
        select.selectByIndex(1);
        onlineAdmissionPageFirstnameTextBox.sendKeys("Ogün");
        onlineAdmissionPageLastNameTextBox.sendKeys("Erdogan");
        Select select1 = new Select(onlineAdmissionPageGenderDropDown);
        select1.selectByIndex(1);
        actions.click(onlineAdmissionPageDateOfBirth).perform();
        actions.click(Driver.getDriver().findElement(By.xpath("(//th[@colspan='5'])[1]"))).perform();
        actions.doubleClick(previousDateOfBirth).perform();
        actions.doubleClick(previousDateOfBirth).perform();
        actions.doubleClick(previousDateOfBirth).perform();
        actions.doubleClick(previousDateOfBirth).perform();
        actions.doubleClick(previousDateOfBirth).perform();
        actions.click(mounthDateOfBirth).perform();
        actions.click(dayDateOfBirth).perform();
        onlineAdmissionPageMobileNumber.sendKeys("0123 456 78 90");
        onlineAdmissionPageEmail.sendKeys("muster.mustermann@gmail.com");
       // onlineAdmissionPageStudentPhoto.click();
        String dosyaYolu = "C:\\Users\\ogune\\OneDrive\\Desktop\\BOOTCAMP\\com.wonderworldcollege" +
                "\\src\\test\\java\\.jpg\\4432b9bcacc2ed45b9bef8d8475a6030.jpg";
        onlineAdmissionPageStudentPhoto.sendKeys(dosyaYolu);
    }
    //verifies that student photo has been uploaded
    public void verifyUploadStudentPhoto(){
        removeButtonStudentPhoto.isDisplayed();
    }

    //Verifies required Fields on Online Admission Page under Basic Details Section
    public void verifyMandatoryFieldsBasicDetailsParentDetails(){
        onlineAdmissionPageSubmitButton.click();
        Assert.assertTrue(requiredFieldAlertClass.isDisplayed());
        Assert.assertTrue(requiredFieldAlertFirstName.isDisplayed());
        Assert.assertTrue(requiredFieldAlertGender.isDisplayed());
        Assert.assertTrue(requiredFieldAlertDateOfBirth.isDisplayed());
        Assert.assertTrue(requiredFieldAlertEmail.isDisplayed());
        Assert.assertTrue(requiredFieldAlertGuardian.isDisplayed());
        Assert.assertTrue(requiredFieldAlertGuardianName.isDisplayed());
        Assert.assertTrue(requiredFieldAlertGuardianRelation.isDisplayed());
    }

    //verifies and fills FatherName and MotherName textBoxes under Parent details Section
    public void verifyEnterDataParentDetails(){
        Assert.assertTrue(fatherNameParentDetail.isDisplayed());
        Assert.assertTrue(motherNameParentDetail.isDisplayed());
        Assert.assertTrue(fatherNameParentDetail.isEnabled());
        Assert.assertTrue(motherNameParentDetail.isEnabled());

        fatherNameParentDetail.sendKeys("Hasan");
        motherNameParentDetail.sendKeys("Nimet");
    }
}
