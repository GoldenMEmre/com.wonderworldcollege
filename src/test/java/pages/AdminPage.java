package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminPage extends Base {



    // Admin fees collection section
    @FindBy(xpath = "//a[@class='btn btn-lg btn-admin']")
    public WebElement adminLoginButton;

    @FindBy(id ="//input[@id='form-username']")
      //@FindBy(xpath = "//input[@placeholder='Username']")
    public  WebElement adminUser;
    @FindBy(xpath = "//input[@placeholder='Password']")
    public  WebElement adminPassword;
    @FindBy(xpath = "//button[@type='submit']")
    public  WebElement signInButton;



}
