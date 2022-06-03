package pages.PracticePages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilies.Driver;

import java.util.List;

public class AutoTestPage {

    public AutoTestPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//i[@class='fa fa-home']")
    public WebElement homePageButton;

    @FindBy(xpath= "//i[@class='fa fa-lock']")
    public WebElement signupLoginButton;

    @FindBy(xpath = "//*[text()='New User Signup!']")
    public WebElement newUserSignupText;

    @FindBy (xpath = "//*[@data-qa='signup-name']")
    public WebElement logInNameBox;

    @FindBy(xpath = "//*[@data-qa='signup-email']")
    public WebElement logInEmailBox;

    @FindBy(xpath = "//*[@data-qa='signup-button']")
    public WebElement logInSignUpButton;

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

    @FindBy (xpath = "//*[text()='Your email or password is incorrect!']")
    public WebElement yourEmailOrPasswordIsIncorrectText;

    @FindBy (xpath = "//*[text()=' Logout']")
    public WebElement logOutButton;

    @FindBy(xpath = "//*[text()='Email Address already exist!']")
    public WebElement emailAddressAlreadExistText;

    @FindBy(xpath = "//*[text()=' Contact us']")
    public WebElement contactUsButton;

    @FindBy(xpath = "//*[text()='Get In Touch']")
    public WebElement getInTouchText;

    @FindBy(xpath = "//input[@data-qa='name']")
    public WebElement contactUsNameBox;

    @FindBy(xpath = "//input[@name='upload_file']")
    public WebElement contactUsChooseFileButton;

    @FindBy(xpath = "//input[@data-qa='submit-button']")
    public WebElement contactUsSubmitButton;

    @FindBy(xpath = "//div[@class='status alert alert-success']")
    public WebElement contactUsSuccesYourDetailsHaveBeenSubmittedSuccesfullyText;

    @FindBy(xpath = "//a[@class='btn btn-success']")
    public WebElement contactUsHomePageReturnButton;

    @FindBy(xpath = "//button[text()='Test Cases']")
    public WebElement hompePageTestCasesButton;

    @FindBy (xpath = "//a[text()=' Products']")
    public WebElement homePageProductsButton;

    @FindBy(xpath = "//div[@class='col-sm-4']")
    public List<WebElement> productPageProductList;
}
