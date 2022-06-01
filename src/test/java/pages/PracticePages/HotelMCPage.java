package pages.PracticePages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilies.Driver;

public class HotelMCPage {

    public HotelMCPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[text()='Log in']")
    public WebElement hompePageLoginButton;


    @FindBy(id = "UserName")
    public WebElement loginPageUserNameBox;

    @FindBy(id = "Password")
    public WebElement loginPagePasswordeBox;

    @FindBy(id = "btnSubmit")
    public WebElement loginPageSubmitButton;

    @FindBy (xpath = "//*[text()='ListOfUsers']")
    public WebElement listOfUserText;


}
