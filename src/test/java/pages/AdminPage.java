package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminPage extends Base {



    // Admin fees collection section

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
    @FindBy(xpath="(//*[text()='Fees Group'])[3]")
    public WebElement feesGroup;
    @FindBy(xpath ="//*[@name='feetype_id']")
    public  WebElement feesType;

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
