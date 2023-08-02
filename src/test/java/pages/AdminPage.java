package pages;

import org.bouncycastle.jcajce.provider.asymmetric.X509;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminPage extends Base {



    // Admin fees collection section
    @FindBy(xpath = "//a[@class='btn btn-lg btn-admin']")
    public WebElement adminLoginButton;

    @FindBy(xpath ="//input[@id='form-username']")
      //@FindBy(xpath = "//input[@placeholder='Username']")
    public  WebElement adminUser;
    @FindBy(xpath = "//input[@placeholder='Password']")
    public  WebElement adminPassword;
    @FindBy(xpath = "//button[@type='submit']")
    public  WebElement signInButton;

    @FindBy(xpath = "//*[@id='alert']/nav/div[2]/div/div/ul/li[5]/a/img")
    public WebElement profileIcon;

    @FindBy(xpath = "//*[@id='alert']/nav/div[2]/div/div/ul/li[5]/ul/li/div/div[4]/a[1]")
    public WebElement profileButton;

    @FindBy(xpath = "//*[@id='alert']/nav/div[2]/div/div/ul/li[5]/ul/li/div/div[4]/a[2]")
    public WebElement passwordButton;

    @FindBy(xpath = "//*[@id='alert']/nav/div[2]/div/div/ul/li[5]/ul/li/div/div[4]/a[3]")
    public WebElement logOutButton;

    @FindBy(xpath = "/html/body/div[1]/div[1]/section/div/div[2]/div/ul/li[2]/a")
    public WebElement payrollButton;

    @FindBy(xpath = "/html/body/div[1]/div[1]/section/div/div[2]/div/ul/li[3]/a")
    public WebElement leavesButton;

    @FindBy(xpath = "/html/body/div[1]/div[1]/section/div/div[2]/div/ul/li[4]/a")
    public WebElement attendanceButton;

    @FindBy(xpath = "/html/body/div[1]/div[1]/section/div/div[2]/div/ul/li[5]/a")
    public WebElement documentsButton;

    @FindBy(xpath = "//*[@id='activity']/div[1]/div")
    public WebElement generalDetailPart;

    @FindBy(xpath = "//*[@id='activity']/div[2]/h3")
    public WebElement addressDetailsPart;

    @FindBy(xpath = "//*[@id='activity']/div[3]/h3")
    public WebElement bankAccountDetailsPart;

    @FindBy(xpath = "//*[@id='activity']/div[4]/h3")
    public WebElement socialMediaLinksPart;

    @FindBy(xpath = "//*[@id='payroll']/div[1]/div[1]/div")
    public WebElement totalNetSallaryPaid;

    @FindBy(xpath = "//*[@id='payroll']/div[1]/div[2]/div")
    public WebElement totalGrossSallary;

    @FindBy(xpath = "//*[@id='payroll']/div[1]/div[3]/div")
    public WebElement totalEarning;

    @FindBy(xpath = "//*[@id='payroll']/div[1]/div[4]/div")
    public WebElement totalDeduction;

    @FindBy(xpath = "//*[@id='DataTables_Table_0']/thead/tr/th[1]")
    public WebElement paySlip;

    @FindBy(xpath = "//*[@id='DataTables_Table_0']/thead/tr/th[2]")
    public WebElement monthYear;

    @FindBy(xpath = "//*[@id='DataTables_Table_0']/thead/tr/th[3]")
    public WebElement date;

    @FindBy(xpath = "//*[@id='DataTables_Table_0']/thead/tr/th[4]")
    public WebElement mode;

    @FindBy(xpath = "//*[@id='DataTables_Table_0']/thead/tr/th[5]")
    public WebElement status;

    @FindBy(xpath = "//*[@id='DataTables_Table_0']/thead/tr/th[6]")
    public WebElement netSallary;

    @FindBy(xpath = "//*[@id='DataTables_Table_0']/thead/tr/th[7]")
    public WebElement payrollAction;

    @FindBy(xpath = "//*[@id='DataTables_Table_0']/tbody/tr[1]/td[7]/a")
    public WebElement viewPayslip;

    @FindBy(xpath = "//*[@id='testdata']")
    public WebElement bordro;

    @FindBy(xpath = "//*[@id='DataTables_Table_0_filter']/label/input")
    public WebElement searchTextBox;

    @FindBy(xpath = "//*[@id='DataTables_Table_0_wrapper']/div[1]/a[6]/span/i")
    public WebElement columns;

    @FindBy(xpath = "//*[@id='DataTables_Table_1']/thead/tr/th[1]")
    public WebElement leavesType;

    @FindBy(xpath = "//*[@id='DataTables_Table_1']/thead/tr/th[2]")
    public WebElement leaveDate;

    @FindBy(xpath = "//*[@id='DataTables_Table_1']/thead/tr/th[3]")
    public WebElement leaveDays;

    @FindBy(xpath = "//*[@id='DataTables_Table_1']/thead/tr/th[4]")
    public WebElement applyDate;

    @FindBy(xpath = "//*[@id='DataTables_Table_1']/thead/tr/th[5]")
    public WebElement Status;

    @FindBy(xpath = "//*[@id='DataTables_Table_1']/thead/tr/th[6]")
    public WebElement leavesAction;

    @FindBy(xpath = "//*[@id='DataTables_Table_1']/tbody/tr[1]/td[6]")
    public WebElement viewIcon;

    @FindBy(xpath = "//*[@id='leavedetails']/div/div")
    public WebElement leaveInformation;

    @FindBy(xpath = "//*[@id='attendance']/div[1]/div[1]/div")
    public WebElement totalPresent;

    @FindBy(xpath = "//*[@id='attendance']/div[1]/div[2]/div")
    public WebElement totalLate;

    @FindBy(xpath = "//*[@id='attendance']/div[1]/div[3]/div")
    public WebElement totalAbsent;

    @FindBy(xpath = "//*[@id='attendance']/div[1]/div[4]/div")
    public WebElement totalHalfDay;

    @FindBy(xpath = "//*[@id='attendance']/div[1]/div[5]/div")
    public WebElement totalHoliday;

    @FindBy(xpath = "//*[@id='attendance']/div[2]/div[1]/form/div/div/select")
    public WebElement attendanceYearSelect;

    @FindBy(xpath = "//*[@id='attendance']/div[2]/div[2]")
    public WebElement attendanceLetters;

    @FindBy(xpath = "//*[@id='attendancetable_wrapper']")
    public WebElement attendanceListStaff;

    @FindBy(xpath = "//*[@id='passwordform']/div[1]/div/input")
    public WebElement currentPassword;

    @FindBy(xpath = "//*[@id='passwordform']/div[2]/div/input")
    public WebElement newPassword;

    @FindBy(xpath = "//*[@id='confirm_pass']")
    public WebElement confirmPassword;

    @FindBy(xpath = "//*[@id='passwordform']/div[4]/div/div/button")
    public WebElement passwordChangeButton;



}
