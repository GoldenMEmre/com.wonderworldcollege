package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class StudentPage extends  Base {


    //********************Gulten Harrelson******************************
    @FindBy(xpath ="(//a[@target='_blank'])[1]")
    public WebElement studentLogin;
    @FindBy(xpath ="//*[@name='username']")
    public  WebElement studentUserName;
    @FindBy(xpath ="//input[@name='password']")
    public  WebElement studentPassword;
    @FindBy(xpath ="//button[@type='submit']")
    public  WebElement studentSignInButton;

    @FindBy(xpath="//*[text()='Online Exam']")
    public  WebElement onlineExam;
    @FindBy(xpath ="(//*[text()='Exam'])[1]")
    public  WebElement examSegment;
    @FindBy(xpath ="(//*[text()='Quiz'])[1]")
    public  WebElement quizSegment;
    @FindBy(xpath ="(//*[text()='Date To'])[1]")
    public  WebElement dateToSegment;
    @FindBy(xpath ="(//*[text()='Duration'])[1]")
    public  WebElement durationSegment;
    @FindBy(xpath ="(//*[text()='Total Attempt'])[1]")
    public  WebElement totalAttemptSegment;
    @FindBy(xpath ="(//*[text()='Attempted'])[1]")
    public  WebElement attemptedSegment;
    @FindBy(xpath ="(//*[text()='Status'])[1]")
    public  WebElement statusSegment;
    @FindBy(xpath ="(//*[@class='fa fa fa-eye'])[2]")
    public  WebElement eyeButton;
    @FindBy(xpath ="(//*[@class='fa fa fa-eye'])[3]")
    public  WebElement closedExamEyeButton;
    @FindBy(xpath ="//div[@class='box-body']")
    public  WebElement closedExamEyeBody;


    @FindBy(xpath ="//div[@class='box-body']")
    public  WebElement examViewBody;
    @FindBy(xpath ="//*[text()='Closed Exam']")
    public  WebElement closedExamButton;
    @FindBy(xpath ="(//*[@class='dataTables_wrapper no-footer'])[2]")
    public  WebElement closedExamBody;

    @FindBy(xpath ="//*[text()='Apply Leave']")
    public  WebElement applyLeaveButton;
    @FindBy(xpath ="//*[text()='Class']")
    public  WebElement classApplyLeaveButton;
    @FindBy(xpath ="//*[text()='Section']")
    public  WebElement sectionApplyLeaveButton;
    @FindBy(xpath ="(//*[text()='Apply Date'])[1]")
    public  WebElement applyDateApplyLeaveButton;
    @FindBy(xpath ="(//*[text()='From Date'])[1]")
    public  WebElement fromDateApplyLeaveButton;
    @FindBy(xpath ="(//*[text()='To Date'])[1]")
    public  WebElement toDateApplyLeaveButton;
    @FindBy(xpath ="(//*[text()='Reason'])[1]")
    public  WebElement reasonApplyLeaveButton;
    @FindBy(xpath ="(//*[text()='Status'])[1]")
    public  WebElement statusApplyLeaveButton;
    @FindBy(xpath ="(//*[@class='fa fa-pencil'])[1]")
    public  WebElement editApplyLeaveButton;
    @FindBy(xpath="//*[@id='message']")
    public  WebElement messageButton;
    @FindBy(xpath="(//*[@type='submit'])[1]")
    public  WebElement saveButton;

    @FindBy(xpath="//*[text()=' Add']")
    public  WebElement addButton;
    @FindBy(xpath="//*[@name='from_date']")
    public  WebElement fromDateButton;
    @FindBy(xpath="//*[@name='to_date']")
    public  WebElement toDateButton;
    @FindBy(xpath="(//*[@class='fa fa-remove'])[1]")
    public  WebElement deleteButton;
    //********************Gulten Harrelson******************************
















}

