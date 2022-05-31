package Tests.Practice.AutomationExeccise;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.PracticePages.AutoTestPage;
import utilies.Driver;

public class TestCase03 {

    @Test
    public void LoginUserWithIncorrectEmailAndPassword() {

        AutoTestPage autoTestPage =new AutoTestPage();
        SoftAssert softAssert = new SoftAssert();

        //1. Launch browser
        //2. Navigate to url 'http://automationexercise.com'
        Driver.getDriver().get("http://automationexercise.com");
        //3. Verify that home page is visible successfully
        softAssert.assertTrue(autoTestPage.homePageButton.isDisplayed());
        //4. Click on 'Signup / Login' button
        autoTestPage.signupLoginButton.click();
        //5. Verify 'Login to your account' is visible
        softAssert.assertTrue(autoTestPage.loginToYourAccountText.isDisplayed());
        //6. Enter incorrect email address and password
        autoTestPage.loginToYourAccountMailBox.sendKeys("asdfasdf@sadf.com");
        autoTestPage.loginToYourAccountPasswordBox.sendKeys("asdfasdf");
        //7. Click 'login' button
        autoTestPage.loginToYourAccountLoginButton.click();
        //8. Verify error 'Your email or password is incorrect!' is visible
        softAssert.assertTrue(autoTestPage.yourEmailOrPasswordIsIncorrectText.isDisplayed());
        softAssert.assertAll();

        Driver.closeDriver();
    }
}
