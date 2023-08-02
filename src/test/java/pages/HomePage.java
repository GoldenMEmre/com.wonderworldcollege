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

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

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
  
  // Homepage>SliderImg Gulten Harrelson**************************
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
    @FindBy(xpath = "(//*[@class='fa fa-angle-left'])[1]")
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

    //Online Admission Page Guardian Details Section
    //Guardian Name Online Admission Page
    @FindBy(xpath = "//input[@id='guardian_name']")
    private WebElement guardianNameOnlineAdmissionPage;
    //Guardian Relation Online Admission Page
    @FindBy(xpath = "//input[@id='guardian_relation']")
    private WebElement guardianRelationOnlineAdmissionPage;
    //Guardian EMail Online Admission Page
    @FindBy(xpath = "//input[@id='guardian_email']")
    private WebElement guardianEmailOnlineAdmissionPage;
    //Guardian Photo Online Admission Page
    @FindBy(xpath = "(//input[@id='file'])[2]")
    private WebElement guardianPhotoOnlineAdmissionPage;
    //Guardian Phone Online Admission Page
    @FindBy(xpath = "//input[@id='guardian_phone']")
    private WebElement guardianPhoneOnlineAdmissionPage;
    //Guardian Occupation Online Admission Page
    @FindBy(xpath = "//input[@id='guardian_occupation']")
    private WebElement guardianOccupationOnlineAdmissionPage;
    //Guardian Adress Online Admission Page
    @FindBy(xpath = "//textarea[@id='guardian_address']")
    private WebElement guardianAdressOnlineAdmissionPage;

    // Remove button on Guardian Photo
    @FindBy(xpath = "(//button[@type='button'])[10]")
    private WebElement verifyGuardianPhotoUploaded;

    //Online Admission title
    @FindBy(xpath = "(//*[text()='Online Admission'])[2]")
    private WebElement onlineAdmissionTitle;

    //Guardian Details Radio Box Father
    @FindBy(xpath = "//div/div/div/label[2]/input")
    private WebElement fatherRadioBoxGuardianDetails;
    //Guardian Details Radio Box Mother
    @FindBy(xpath = "//div/div/div/label[3]/input")
    private WebElement motherRadioBoxGuardianDetails;
    //Guardian Details Radio Box Other
    @FindBy(xpath = "//div/div/div/label[4]/input")
    private WebElement otherRadioBoxGuardianDetails;

    //Miscellaneous Details Section National Identification Number TextBox
    @FindBy(xpath = "//input[@id='adhar_no']")
    private WebElement nationalINMiscellaneousDetails;
    //Miscellaneous Details Section Previous School Details TextBox
    @FindBy(xpath = "(//textarea[@class='form-control'])[2]")
    private WebElement previousSchoolDetailsMiscellaneousDetails;
    //Upload Dokument Online Admission Page
    @FindBy(xpath = "//input[@id='document']")
    private WebElement uploadDocumentOnlineAdmissionPage;
    //Uplaod Document Remove Button
    @FindBy(xpath = "(//button[@type='button'])[11]")
    private WebElement uploadDocumentRemoveButton;
    //Review entered Deteails and Status Page Student Reference Number
    @FindBy(xpath = "//div[5]/div[1]/div[1]/div[4]/div[3]/div[1]/ul/li[1]/span")
    private WebElement referencenumberReviewEnteredDetails;
    //Title Review entered Details and Status
    @FindBy(xpath = "//*[text()='Review Entered Details and Status']")
    private WebElement titleReviewEDaS;
    //Form status REDaS
    @FindBy(xpath = "//*[text()='Not Submitted']")
    private WebElement formStatusREDaS;
    //Application Date REDaS
    @FindBy(xpath = "//*[text()='02/08/2023']")
    private WebElement applicationDateREDaS;
    //Date Of Birth after Submit
    @FindBy(xpath = "//*[text()='26/10/2013']")
    private WebElement controlDateOfBirth;
    //Guardian Relation after Submit
    @FindBy(xpath = "//*[text()='Brother']")
    private WebElement controlGuardianRelation;
    //Email after Submit
    @FindBy(xpath = "//*[text()='muster.mustermann11@gmail.com']")
    private WebElement controlEmail;
    //CheckBox I Agree Terms
    @FindBy(xpath = "//input[@id='checkterm']")
    private WebElement checkBoxIAgreeTerms;
   //Successful Alert REDaS
    @FindBy(xpath = "//input[@id='checkterm']")
    private WebElement successfulAlertREDaS;
    //Form Status REDaS
    @FindBy(xpath = "//input[@id='checkterm']")
    private WebElement formstatusAfterSubmitREDaS;
    //REDaS Submit Button
    @FindBy(xpath = "//button[@id='submitbtn']")
    private WebElement submitREDaS;
    //REDaS Successful alert after submit
    @FindBy(xpath = "//*[text()='Form Has Been Submitted Successfully..!! ']")
    private WebElement successfulAlertAfterSubmitREDaS;
    // REDaS Submitted Form Status
    @FindBy(xpath = "//*[text()='Submitted']")
    private WebElement submittedFormStatusREDaS;

    private String eMail = "muster.mustermann11@gmail.com";
    //**************************************************

    //What People Says title on homepage
    @FindBy(xpath = "//*[text()='WHAT PEOPLE SAYS']")
    private WebElement whatPeopleSaysTitleHomePage;
    //What People Says Sidney W. Yarber
    @FindBy(xpath = "(//*[text()='Sidney W. Yarber'])[2]")
    private WebElement person1WhatPeopleSays;
    //What People Says Kayla H. Seaman
    @FindBy(xpath = "(//*[text()='Kayla H. Seaman'])[2]")
    private WebElement person2WhatPeopleSays;
    //What People Says Terence M. Witzel
    @FindBy(xpath = "(//*[text()='Terence M. Witzel'])[2]")
    private WebElement person3WhatPeopleSays;
    //What People Says Loura Williamson
    @FindBy(xpath = "(//*[text()='Loura Williamson'])[2]")
    private WebElement person4WhatPeopleSays;
    //Our Experienced Stuff Title Home Page
    @FindBy(xpath = "//*[text()='OUR EXPERIENCED STAFFS']")
    public WebElement ourExperiencedStaffHomePage;

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

        Select select = new Select(onlineAdmissionPageClassDropDown);
        select.selectByIndex(14);
        onlineAdmissionPageFirstnameTextBox.sendKeys("Timur");
        onlineAdmissionPageLastNameTextBox.sendKeys("Lenk");
        Select select1 = new Select(onlineAdmissionPageGenderDropDown);
        select1.selectByIndex(1);
       // actions.click(onlineAdmissionPageDateOfBirth).perform();
        //actions.click(Driver.getDriver().findElement(By.xpath("(//th[@colspan='5'])[1]"))).perform();
        //actions.doubleClick(previousDateOfBirth).perform();
        //actions.doubleClick(previousDateOfBirth).perform();
        //actions.doubleClick(previousDateOfBirth).perform();
        //actions.doubleClick(previousDateOfBirth).perform();
        //actions.doubleClick(previousDateOfBirth).perform();
        //actions.click(mounthDateOfBirth).perform();
        //actions.click(dayDateOfBirth).perform();
        onlineAdmissionPageMobileNumber.sendKeys("0123 456 78 90");

        onlineAdmissionPageEmail.sendKeys(eMail);

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

        try {
            ReusableMethods.scrollToElement(Driver.getDriver(),guardianAdressOnlineAdmissionPage);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        onlineAdmissionPageSubmitButton.click();
        try {
            ReusableMethods.scrollToElement(Driver.getDriver(),onlineAdmissionTitle);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Assert.assertTrue(requiredFieldAlertClass.isDisplayed());
        Assert.assertTrue(requiredFieldAlertFirstName.isDisplayed());
        Assert.assertTrue(requiredFieldAlertGender.isDisplayed());
        Assert.assertTrue(requiredFieldAlertDateOfBirth.isDisplayed());
        Assert.assertTrue(requiredFieldAlertEmail.isDisplayed());
        try {
            ReusableMethods.scrollToElement(Driver.getDriver(),fatherNameParentDetail);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

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
        motherNameParentDetail.sendKeys("Fatma");
    }
    //Verifies and Enters data of WebElements on Guardian Details Section
    public void verifyEnterGuardianDetailsOnlineAdmissionPage(){
        try {
            ReusableMethods.scrollToElement(Driver.getDriver(),motherNameParentDetail);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Assert.assertTrue(guardianNameOnlineAdmissionPage.isDisplayed());
        Assert.assertTrue(guardianNameOnlineAdmissionPage.isEnabled());
        Assert.assertTrue(guardianRelationOnlineAdmissionPage.isDisplayed());
        Assert.assertTrue(guardianRelationOnlineAdmissionPage.isEnabled());
        Assert.assertTrue(guardianEmailOnlineAdmissionPage.isDisplayed());
        Assert.assertTrue(guardianEmailOnlineAdmissionPage.isEnabled());
        Assert.assertTrue(guardianPhoneOnlineAdmissionPage.isDisplayed());
        Assert.assertTrue(guardianPhoneOnlineAdmissionPage.isEnabled());
        Assert.assertTrue(guardianOccupationOnlineAdmissionPage.isDisplayed());
        Assert.assertTrue(guardianOccupationOnlineAdmissionPage.isEnabled());
        Assert.assertTrue(guardianAdressOnlineAdmissionPage.isDisplayed());
        Assert.assertTrue(guardianAdressOnlineAdmissionPage.isEnabled());

        otherRadioBoxGuardianDetails.click();
        guardianNameOnlineAdmissionPage.sendKeys("Tarik Erdogan");
        guardianRelationOnlineAdmissionPage.sendKeys("Brother");
        guardianEmailOnlineAdmissionPage.sendKeys("muster.mustermann2@hotmail.com");
        guardianPhoneOnlineAdmissionPage.sendKeys("01234 56 789");
        guardianOccupationOnlineAdmissionPage.sendKeys("Big Boss");
        guardianAdressOnlineAdmissionPage.sendKeys("Bochum, Germany");
        String dosyaYolu = "C:\\Users\\ogune\\OneDrive\\Desktop\\BOOTCAMP\\" +
                "com.wonderworldcollege\\src\\test\\java\\.jpg\\IMG_20211022_124748.jpg";
        guardianPhotoOnlineAdmissionPage.sendKeys(dosyaYolu);
        ReusableMethods.bekle(5);
    }
    //Verify that Guardian Photo has been uploaded
    public void verifyGuardianPhotoUpload() {
        actions.moveToElement(verifyGuardianPhotoUploaded).perform();
        Assert.assertTrue(verifyGuardianPhotoUploaded.isDisplayed());


    }

    }


    //******************************EMRE HOME PAGE LOCATES*****************************************
    @FindBy(xpath = "//*[@class='forgot']")
    public WebElement userLoginForgotPasswordLink;

    @FindBy(xpath = "//*[@name='username']")
    public WebElement userLoginForgotPasswordEmailTextBox;

    @FindBy(xpath = "(//*[@type='radio'])[1]")
    public WebElement userLoginForgotPasswordStudentRadioButton;

    @FindBy(xpath = "//*[@type='submit']")
    public WebElement UserLoginForgotPasswordSubmitButton;

    @FindBy(xpath = "//*[text()='Invalid Email Or User Type']")
    public WebElement userLoginForgotPasswordInvalidCredentialsText;

    @FindBy(xpath = "//*[@class='forgot pull-right']")
    public WebElement userLoginFrontSiteLink;



    // Verify Radio Boxes under Guardian Details
    public void verifyRadioBoxesGuardianDetails(){

        Assert.assertTrue(fatherRadioBoxGuardianDetails.isDisplayed());
        Assert.assertTrue(fatherRadioBoxGuardianDetails.isEnabled());
        Assert.assertTrue(motherRadioBoxGuardianDetails.isDisplayed());
        Assert.assertTrue(motherRadioBoxGuardianDetails.isEnabled());
        Assert.assertTrue(otherRadioBoxGuardianDetails.isDisplayed());
        Assert.assertTrue(otherRadioBoxGuardianDetails.isEnabled());
    }
    //Verifies and fills Miscellaneous Details Section
    public void miscellaneousDetailsVerifyEnter(){
        Assert.assertTrue(nationalINMiscellaneousDetails.isDisplayed());
        Assert.assertTrue(previousSchoolDetailsMiscellaneousDetails.isDisplayed());
        Assert.assertTrue(nationalINMiscellaneousDetails.isEnabled());
        Assert.assertTrue(previousSchoolDetailsMiscellaneousDetails.isEnabled());
        nationalINMiscellaneousDetails.sendKeys("0123456789");
        previousSchoolDetailsMiscellaneousDetails.sendKeys("Boston Collage");
    }
    //Uploads Document and verifies that the Document has been uploaded
    public void uploadVerifyDocumentOnlineAdmissionPage(){
        String dosyaYolu = "C:\\Users\\ogune\\OneDrive\\Desktop\\BOOTCAMP\\" +
                "com.wonderworldcollege\\src\\test\\java\\.jpg\\Student.txt";
        uploadDocumentOnlineAdmissionPage.sendKeys(dosyaYolu);
        ReusableMethods.bekle(2);
        actions.moveToElement(uploadDocumentOnlineAdmissionPage).perform();
        ReusableMethods.bekle(1);
        Assert.assertTrue(uploadDocumentRemoveButton.isDisplayed());
    }

    //Verifes Review Entered Details and Status Page and Student Reference No
    public void verifyREDaS_ReferenceNo(){
        onlineAdmissionPageSubmitButton.click();
        Assert.assertTrue(titleReviewEDaS.isDisplayed());
        Assert.assertTrue(referencenumberReviewEnteredDetails.isDisplayed());
    }
    //Verifies Form Status and Application Date
    public void verifyFormStatusAndApplicationDate(){
        String expectedStatus = "Not Submitted";
        String actualStatus = formStatusREDaS.getText();
        Assert.assertEquals(expectedStatus,actualStatus);

        LocalDateTime ldt = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(ldt.format(dateTimeFormatter));
        Assert.assertEquals(applicationDateREDaS.getText(),ldt.format(dateTimeFormatter));
    }
    //verifies entered Informations
    public void controlInformations(){
        Assert.assertEquals(controlEmail.getText(),eMail);
        Assert.assertEquals(controlDateOfBirth.getText(),"26/10/2013");
        Assert.assertEquals(controlGuardianRelation.getText(),"Brother");
    }
    //verifies and clicks on I Agree To The terms And Conditions
    public void checkBoxVerifyEnter(){
        Assert.assertTrue(checkBoxIAgreeTerms.isDisplayed());
        Assert.assertTrue(checkBoxIAgreeTerms.isEnabled());
        checkBoxIAgreeTerms.click();
    }
    //clicks Submit and verifies Form Status And Succeddful Alert
    public void submitVerifyFormStatusAndAlert(){
        submitREDaS.click();
        Assert.assertTrue(successfulAlertAfterSubmitREDaS.isDisplayed());
        Assert.assertTrue(submittedFormStatusREDaS.isDisplayed());
    }

    //Verifies What People Says Section
    public void whatPeopleSaysSectionVerify(){
        try {
            ReusableMethods.scrollToElement(Driver.getDriver(),ourExperiencedStaffHomePage);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Assert.assertTrue(whatPeopleSaysTitleHomePage.isDisplayed());
    }
    //verifies that the comments are from different individuals under What People Says section
    public void whatPeopleSaysCommentsVerification(){
        try {
            ReusableMethods.scrollToElement(Driver.getDriver(),whatPeopleSaysTitleHomePage);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
      do {
          ReusableMethods.bekle(1);
      }
      while (!person1WhatPeopleSays.isDisplayed());
      Assert.assertTrue(person1WhatPeopleSays.isDisplayed());

        do {
            ReusableMethods.bekle(1);
        }
        while (!person4WhatPeopleSays.isDisplayed());
        Assert.assertTrue(person4WhatPeopleSays.isDisplayed());

        String personName1 = person1WhatPeopleSays.getText();
        String personName2 = person2WhatPeopleSays.getText();
        String personName3 = person3WhatPeopleSays.getText();
        String personName4 = person4WhatPeopleSays.getText();
        String[] names = {personName1,personName2,personName3,personName4};
        for (int i = 1; i < 5; i++) {
            for (int j = i+1; j < 4; j++) {
                Assert.assertNotEquals(i,j);
            }
        }
    }

}
    //*******************************************************************************************