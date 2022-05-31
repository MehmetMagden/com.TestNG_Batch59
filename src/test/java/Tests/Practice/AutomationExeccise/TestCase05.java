package Tests.Practice.AutomationExeccise;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.PracticePages.AutoTestPage;
import utilies.ConfigReader;
import utilies.Driver;

import java.io.ObjectInputFilter;

public class TestCase05 {

    @Test
    public void testRegisterUserWithExistingEmail() {
        SoftAssert softAssert = new SoftAssert();
        AutoTestPage autoTestPage = new AutoTestPage();


        //1. Launch browser
        //2. Navigate to url 'http://automationexercise.com'
        Driver.getDriver().get("http://automationexercise.com");

        //3. Verify that home page is visible successfully
        softAssert.assertTrue(autoTestPage.homePageButton.isDisplayed());

        //4. Click on 'Signup / Login' button
        autoTestPage.signupLoginButton.click();
        //5. Verify 'New User Signup!' is visible
        softAssert.assertTrue(autoTestPage.newUserSignupText.isDisplayed());
        //6. Enter name and already registered email address
        autoTestPage.logInNameBox.sendKeys(ConfigReader.getProperty("atUserName"));
        autoTestPage.logInEmailBox.sendKeys(ConfigReader.getProperty("atUserEmail"));
        //7. Click 'Signup' button
        autoTestPage.logInSignUpButton.click();
        //8. Verify error 'Email Address already exist!' is visible
        softAssert.assertTrue(autoTestPage.emailAddressAlreadExistText.isDisplayed());

        softAssert.assertAll();

        Driver.closeDriver();




    }
}
