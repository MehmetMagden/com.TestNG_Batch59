package pages.PracticePages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilies.Driver;

import javax.security.auth.x500.X500Principal;

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

    @FindBy(id ="country")
    public WebElement loginCountryDropBox;

    @FindBy(xpath = "//*[@data-qa='create-account']")
    public WebElement signInCreateAccoutButton;

    @FindBy(xpath = "//*[text()='Account Created!']")
    public WebElement accountCreatedText;

    @FindBy(xpath = "//*[@data-qa='continue-button']")
    public WebElement accountCreatedContinueButton;

    @FindBy(xpath = "//*[@class='fa fa-user']")
    public WebElement loggedInAsUserText;

    @FindBy(xpath = "//*[text()=' Delete Account']")
    public WebElement deleteAccountButton;

    @FindBy (xpath = "//*[text()='Delete']")
    public WebElement deleteConfirmationBox;

    @FindBy (xpath = "//*[text()='Login to your account']")
    public WebElement loginToYourAccountText;

    @FindBy (xpath = "//input[@data-qa='login-email']")
    public WebElement loginToYourAccountMailBox;

    @FindBy (xpath = "//input[@data-qa='login-password']")
    public WebElement loginToYourAccountPasswordBox;

    @FindBy(xpath = "//button[@data-qa='login-button']")
    public WebElement loginToYourAccountLoginButton;

    @FindBy(xpath = "//*[text()='Are you sure you want to delete this Delete Account?']")
    public WebElement areYouSureYouWantToDeleteThisAccountText;

}
