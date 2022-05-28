package pages.PracticePages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilies.Driver;

public class AutomationexercisePage {

    public AutomationexercisePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(className = "fa fa-home")
    public WebElement homePageButton;

    @FindBy(className = "fa fa-lock")
    public WebElement signinLoginButton;





}
