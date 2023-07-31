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
    @FindBy(xpath = "(//label[@for='exampleInputEmail1'])[1]")
    public WebElement feesGroup;
    @FindBy(xpath ="(//label[@for='exampleInputEmail1'])[2]")
    public  WebElement feesType;
    @FindBy(xpath ="(//label[@for='exampleInputEmail1'])[3]")
    public  WebElement dueDate;
    @FindBy(xpath = "(//label[@for='exampleInputEmail1'])[4]")
    public  WebElement percentage;
    @FindBy(xpath = "(//label[@for='exampleInputEmail1'])[5]")
    public  WebElement fixAmount;
    @FindBy(xpath = "(//label[@for='exampleInputEmail1'])[4]")
    public  WebElement amountButton;
    @FindBy(xpath = "//label[text()='Fine Type']")
    public  WebElement fineType;

    @FindBy(xpath =" (//label[@class='radio-inline'])[1]")
    public  WebElement radioNoneButton;
    @FindBy(xpath =" (//label[@class='radio-inline'])[2]")
    public  WebElement radioPercentageButton;
    @FindBy(xpath =" (//label[@class='radio-inline'])[3]")
    public  WebElement radioFixButton;
   @FindBy(xpath ="//input[@placeholder='Search...']")
    public  WebElement searchBox;

   @FindBy(xpath="//select[@id='fee_groups_id']")
    public  WebElement feesGroupDropDown;
   @FindBy(xpath="//select[@id='feetype_id']")
    public  WebElement feesTypeDropDown;
   @FindBy(xpath ="//input[@id='due_date']")
   public  WebElement dueDateDropDown;
   @FindBy(xpath="//input[@name='amount']")
    public  WebElement amountDropdown;
  @FindBy(xpath ="//input[@id='fine_percentage']")
    public  WebElement percentageSelect;
  @FindBy(xpath ="//input[@id='fine_amount']")
    public  WebElement fixAmountSelect;
   @FindBy(xpath="(//button[@type='submit'])[3]")
    public  WebElement saveButton;
   @FindBy(xpath = "Record Saved Successfully")
    public  WebElement savedSuccessfully;
   @FindBy(xpath="(//i[@class='fa fa-pencil'])[1]")
    public  WebElement editButton;
   @FindBy(xpath="(//i[@class='fa fa-remove'])[1]")
    public WebElement deleteButton;







}
