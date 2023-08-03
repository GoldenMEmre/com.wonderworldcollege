package pages;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class AdminPage extends Base {

    Actions actions = new Actions(Driver.getDriver());

    // Admin fees collection section **************Gulten Harrelson***********************




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
    // Admin fees collection section **************Gulten Harrelson***********************







      //--------------------------
    // Admin Fees Collection > Collect Fees
    @FindBy(xpath ="(//*[text()='Collect Fees'])[2]")
    public  WebElement collectFees;



    // Admin Fees Collection > Collect Fees >Student Collect fees >search Button
    @FindBy(xpath ="(//button[@type='submit'])[4]")
    public  WebElement searchButton;


    // Admin Fees Collection > Collect Fees >Student Collect fees >search Button
    @FindBy(xpath ="//*[@id='DataTables_Table_0']/tbody/tr[6]/td[8]/a")
    public  WebElement collectFeesChoose;

    // Admin Fees Collection > Collect Fees >Student Collect fees >Student Fees
    @FindBy(xpath ="//*[text()='Student Fees']")
    public  WebElement studentFeesWrite ;

    // Admin Fees Collection > Collect Fees >Student Collect fees >Student Fees > Currency
    @FindBy(xpath ="//*[text()='USD ($)']")
    public  WebElement uSDCurrency ;

    // Admin Fees Collection > Collect Fees >Student Collect fees >Student Fees >Add Fees Butonu (+)
    @FindBy(xpath ="(//*[@data-fee-category='transport'])[1]")
    public  WebElement addFessButonu ;

    // Admin Fees Collection > Collect Fees >Student Collect fees >Student Fees >Add Fees Butonu > $ Collect Fees button
    @FindBy(xpath ="(//button[@id='load'])[3]")
    public  WebElement  collectFeesPayButton ;

    // Admin Fees Collection > Collect Fees >Student Collect fees >Student Fees >Add Fees Butonu > Revert Button
    @FindBy(xpath ="//*[@class='fa fa-undo']")
    public  WebElement  revertButton;
    // Admin Fees Collection > Collect Fees >Student Collect fees >Student Fees >Add Fees Butonu > Student Fees Lıst
     @FindBy(xpath = "//*[text()='Student Fees']")
    public  WebElement StudentFeesLıstWrite;

    //***********************************EMRE ADMINPAGE LOCATES***************************************
    //Admin Login Panel
    @FindBy(xpath = "//*[@class='messages']")
    public WebElement adminPanelMessageBoard;

    @FindBy(xpath = "//*[@class='forgot']")
    public WebElement adminPanelForgotPasswordElement;

    @FindBy(xpath = "//*[@class='loginright mCustomScrollbar _mCS_1']")
    public WebElement adminUserPanelMessagePanel;

    @FindBy(xpath = "//*[text()='Admin Login']")
    public WebElement adminLoginText;

    @FindBy(xpath = "//*[@class='forgot']")
    public WebElement adminPasswordForgotLink;
    //************************************************************************************************

    //--------------------------

    //Admin dashboard/chat section

    @FindBy(xpath = "//a[@class='todoicon']")
    public WebElement adminDashboardChatButton;

    @FindBy(xpath="//div[@class='messages']")
    public WebElement adminDashboardChatPage;

    @FindBy (xpath ="//input[@placeholder='Write Your Message...']")
    public WebElement adminDasbhoardChatPageMessageTextBox;

    @FindBy(xpath = "//i[@class='fa fa-paper-plane']")
    public WebElement adminDashboardMessageTextBoxSendButton;

    @FindBy(xpath = "//p[normalize-space()='Hello, this is a test message.']")
    public WebElement getAdminDashboardSentMessageText;

    //********************************* Ogun Locates **********************************************

    //Admin Panel Side Bar Transport Section
    @FindBy(xpath = "(//*[text()='Transport'])[2]")
    private WebElement transportSideBarAdminPanel;

    //Admin Panel Side Bar Routes Button under Transport Section
    @FindBy(xpath = "(//*[text()='Routes'])[2]")
    private WebElement routesUnderTransportAdminPanel;

    //Routes Page Create Route Title
    @FindBy(xpath = "//*[text()='Create Route']")
    private WebElement createRouteVerifyRoutesPage;

    //Routes Page Create Route TextBox
    @FindBy(xpath = "//input[@id='route_title']")
    private WebElement textBoxCreateRoute;

    // Routes Page Save Button
    @FindBy(xpath = "(//*[text()='Save'])[1]")
    private WebElement saveButtonRoutesPage;

    //Routes Page Create Route Success Alert
    @FindBy(xpath = "//*[text()='Record Saved Successfully']")
    private WebElement successAlertCreateRoute;

    //Created Route Routes List
    @FindBy(xpath = "//*[text()=' Bochum']")
    private WebElement createdRouteRoutesList;

    //Edited Route Routes List
    @FindBy(xpath = "//*[text()=' Elazig']")
    private WebElement editedRoute;

    //Route Title Section Routes Page
    @FindBy(xpath = "(//*[text()='Route Title'])[2]")
    private WebElement routeTitleSectionRouteList;

    //Action title Routes Page
    @FindBy(xpath = "(//th[@aria-controls='DataTables_Table_0'])[2]")
    private WebElement actionTitleUnderRouteList;

    //Edit Button under Route List
    @FindBy(xpath = "(//i[@class='fa fa-pencil'])[27]")
    private WebElement editButtonCreatedRoute;

    //******************************** Ogun Methods ***********************************************

    //Enters username and password, afterward click on SignIn
    public void enterUsernamePasswordAndClickSignIn(){
        ReusableMethods.switchToWindow("Login : Wonder World College");
        adminUser.sendKeys(ConfigReader.getProperty("ogunAdminUserName"));
        adminPassword.sendKeys(ConfigReader.getProperty("DGpassword"));
        signInButton.click();
    }

    //verify and click on Transport and Routes on side bar
    public void clickVerifyTransport(){
        Assert.assertTrue(transportSideBarAdminPanel.isDisplayed());
        Assert.assertTrue(transportSideBarAdminPanel.isEnabled());
        transportSideBarAdminPanel.click();

        Assert.assertTrue(routesUnderTransportAdminPanel.isDisplayed());
        Assert.assertTrue(routesUnderTransportAdminPanel.isEnabled());
        routesUnderTransportAdminPanel.click();
    }
    //verifies Route page and Create route Section, Route Title textbox and Save button
    public void verifyTitleAndTextBoxesRoutePage(){
        Assert.assertTrue(createRouteVerifyRoutesPage.isDisplayed());
        Assert.assertTrue(routeTitleSectionRouteList.isDisplayed());
        Assert.assertTrue(textBoxCreateRoute.isDisplayed());
        Assert.assertTrue(textBoxCreateRoute.isEnabled());
        Assert.assertTrue(saveButtonRoutesPage.isDisplayed());
        Assert.assertTrue(saveButtonRoutesPage.isEnabled());
    }
    //Creates a route and verify created route
    public void createVerifyRoute(){
        textBoxCreateRoute.sendKeys(ConfigReader.getProperty("route1"));
        saveButtonRoutesPage.click();
        Assert.assertTrue(successAlertCreateRoute.isDisplayed());
        try {
            ReusableMethods.scrollToElement(Driver.getDriver(),createdRouteRoutesList);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Assert.assertTrue(createdRouteRoutesList.isDisplayed());
    }

    //Verify the column Route Title and Action
    public void verifyColumnsRoutesPage(){
        Assert.assertTrue(routeTitleSectionRouteList.isDisplayed());
        Assert.assertTrue(actionTitleUnderRouteList.isDisplayed());
    }

    //edit Route and verify that
    public void editVerifyRoute(){
        try {
            ReusableMethods.scrollToElement(Driver.getDriver(),createdRouteRoutesList);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        actions.click(createdRouteRoutesList)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.ENTER)
                .perform();
        textBoxCreateRoute.clear();
        textBoxCreateRoute.sendKeys(ConfigReader.getProperty("route2"));
        saveButtonRoutesPage.click();
        ReusableMethods.bekle(2);
        try {
            ReusableMethods.scrollToElement(Driver.getDriver(),editedRoute);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Assert.assertTrue(editedRoute.isDisplayed());
    }
    //Delete the Route
    public void deleteRoute(){
        try {
            ReusableMethods.scrollToElement(Driver.getDriver(),editedRoute);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        actions.click(editedRoute)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.ENTER)
                .perform();
    }


}
