package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HomePage  {
    public HomePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //Homepage >ExamResultButton
    @FindBy(xpath = "//a[normalize-space()='Exam Result']")
    public WebElement examResultButton;








}
