package pages.PracticePages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilies.Driver;

public class AutoTestPage {

    public AutoTestPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//i[@class='fa fa-home']")
    public WebElement homePageButton;

    @FindBy(xpath= "//i[@class='fa fa-lock']")
    public WebElement signinLoginButton;

    @FindBy(xpath = "//*[text()='New User Signup!']")
    public WebElement newUserSignup;

    @FindBy (xpath = "//*[@data-qa='signup-name']")
    public WebElement logInNameBox;

    @FindBy(xpath = "//*[@data-qa='signup-email']")
    public WebElement logInEmailBox;

    @FindBy(xpath = "//*[@data-qa='signup-button']")
    public WebElement logInSignInButton;

    @FindBy(xpath = "//*[text()='Enter Account Information']")
    public WebElement enterAccountInformationText;

    @FindBy(xpath = "//input[@id='id_gender1']")
    public WebElement mrTitleRatioBox;

    @FindBy (xpath = "//input[@data-qa='password']")
    public WebElement passwordBoxEnterAccountInformation;




}
