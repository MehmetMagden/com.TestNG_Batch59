package Tests.Practice.AutomationExeccise;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.PracticePages.AutoTestPage;
import utilies.ConfigReader;
import utilies.Driver;

public class TestCase02 {
    SoftAssert softAssert =new SoftAssert();
    AutoTestPage autoTestPage = new AutoTestPage();

    @Test
    public void testLoginUserwithCorrectEmailAndPassword() {
        //1. Launch browser
        //2. Navigate to url 'http://automationexercise.com'
        Driver.getDriver().get("http://automationexercise.com");

        //3. Verify that home page is visible successfully
        softAssert.assertTrue(autoTestPage.homePageButton.isDisplayed());

        //4. Click on 'Signup / Login' button
        autoTestPage.signinLoginButton.click();

        //5. Verify 'Login to your account' is visible
        softAssert.assertTrue(autoTestPage.loginToYourAccountText.isDisplayed());

        //6. Enter correct email address and password
        autoTestPage.loginToYourAccountMailBox.sendKeys(ConfigReader.getProperty("atUserEmail"));
        autoTestPage.loginToYourAccountPasswordBox.sendKeys(ConfigReader.getProperty("atUserPassword"));

        //7. Click 'login' button
        autoTestPage.loginToYourAccountLoginButton.click();
        //8. Verify that 'Logged in as username' is visible
        softAssert.assertTrue(autoTestPage.loggedInAsUserText.isDisplayed());
        //9. Click 'Delete Account' button
        autoTestPage.deleteAccountButton.click();

        //10. Verify that 'ACCOUNT DELETED!' is visible
        softAssert.assertTrue(autoTestPage.areYouSureYouWantToDeleteThisAccountText.isDisplayed());
        softAssert.assertAll();
        Driver.closeDriver();
    }
}
