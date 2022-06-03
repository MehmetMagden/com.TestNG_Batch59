package tests.Practice.AutomationExeccise;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.PracticePages.AutoTestPage;
import utilies.ConfigReader;
import utilies.Driver;

public class TestCase07_verifyTestCasesPage {

    @Test
    public void test07VerifyTestCasesPage() {

        AutoTestPage autoTestPage =new AutoTestPage();
        SoftAssert softAssert = new SoftAssert();
        //1. Launch browser
        //2. Navigate to url 'http://automationexercise.com'

        Driver.getDriver().get(ConfigReader.getProperty("atUrl"));
        //3. Verify that home page is visible successfully
        softAssert.assertTrue(autoTestPage.hompePageTestCasesButton.isDisplayed());

        //4. Click on 'Test Cases' button
        autoTestPage.hompePageTestCasesButton.click();
        //5. Verify user is navigated to test cases page successfully
        String expectedUrl = "https://automationexercise.com/test_cases";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        softAssert.assertEquals(actualUrl,expectedUrl,"site url farklı");

        softAssert.assertAll();
        Driver.closeDriver();

    }
}
