package tests.Practice.AutomationExeccise;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.PracticePages.AutoTestPage;
import utilies.ConfigReader;
import utilies.Driver;

public class TestCase04 {
    AutoTestPage autoTestPage = new AutoTestPage();
    SoftAssert softAssert = new SoftAssert();

    @Test
    public void testLogOutUser() {

        //1. Launch browser
        //2. Navigate to url 'http://automationexercise.com'
        Driver.getDriver().get("http://automationexercise.com");
        //3. Verify that home page is visible successfully
        softAssert.assertTrue(autoTestPage.homePageButton.isDisplayed());

        //4. Click on 'Signup / Login' button
        autoTestPage.signupLoginButton.click();
        //5. Verify 'Login to your account' is visible
        softAssert.assertTrue(autoTestPage.loginToYourAccountText.isDisplayed());
        //6. Enter correct email address and password
        autoTestPage.loginToYourAccountMailBox.sendKeys(ConfigReader.getProperty("atUserEmail"));
        autoTestPage.loginToYourAccountPasswordBox.sendKeys(ConfigReader.getProperty("atUserPassword"));
        //7. Click 'login' button
        autoTestPage.loginToYourAccountLoginButton.click();
        //8. Verify that 'Logged in as username' is visible
        softAssert.assertTrue(autoTestPage.loggedInAsUserText.isDisplayed());
        //9. Click 'Logout' button
        autoTestPage.logOutButton.click();
        //10. Verify that user is navigated to login page

        String expectedPage ="https://automationexercise.com/login";
        String actualPage = Driver.getDriver().getCurrentUrl();
        softAssert.assertEquals(actualPage,expectedPage,"login sayfasi mı bakalım");

        softAssert.assertAll();

        Driver.closeDriver();
    }
}
