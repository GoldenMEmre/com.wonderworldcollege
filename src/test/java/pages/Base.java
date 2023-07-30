package pages;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import javax.swing.*;

public abstract class Base {

public Base(){

    PageFactory.initElements(Driver.getDriver(), this);

}


}
