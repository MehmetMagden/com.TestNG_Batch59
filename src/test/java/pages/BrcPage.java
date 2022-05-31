package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilies.Driver;

public class BrcPage {

    public BrcPage (){

        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy (xpath = "//a[@class='btn btn-primary btn-sm']")
    public WebElement ilkLoginButtonu;

    @FindBy(xpath = "//input[@id='formBasicEmail']")
    public WebElement emailTextBox;

    @FindBy(xpath = "//input[@type='password']")
    public WebElement passwordTextBox;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement ikinciLoginButtonu;

    @FindBy (id = "dropdown-basic-button")
    public WebElement kullaniciProfilIsmi;

}
