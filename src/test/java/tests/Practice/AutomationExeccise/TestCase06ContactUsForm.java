package tests.Practice.AutomationExeccise;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.PracticePages.AutoTestPage;
import utilies.ConfigReader;
import utilies.Driver;

public class TestCase06ContactUsForm {
    @Test
    public void testContactUsForm() {

        AutoTestPage autoTestPage = new AutoTestPage();
        SoftAssert softAssert = new SoftAssert();
        Actions actions = new Actions(Driver.getDriver());

        //1. Launch browser
        //2. Navigate to url 'http://automationexercise.com'

        Driver.getDriver().get("http://automationexercise.com");
        //3. Verify that home page is visible successfully
        softAssert.assertTrue(autoTestPage.homePageButton.isDisplayed());
        //4. Click on 'Contact Us' button
        autoTestPage.contactUsButton.click();
        //5. Verify 'GET IN TOUCH' is visible
        autoTestPage.getInTouchText.isDisplayed();
        //6. Enter name, email, subject and message
        autoTestPage.contactUsNameBox.sendKeys("hasan"+ Keys.TAB+ ConfigReader.getProperty("atUserEmail") +Keys.TAB
                +"subject"+Keys.TAB+"bla bla bla bla bla bla bla");
        //7. Upload file
            //C:\Users\Maden\Documents\05-Mart-2020_23-00 hard disk.jpg
        //actions.sendKeys(Keys.PAGE_DOWN).perform(); //Bir şekilde alert.Accept() dememi engelliyordu so I canceled it
        autoTestPage.contactUsChooseFileButton.sendKeys("C:\\Users\\Maden\\Documents\\05-Mart-2020_23-00 hard disk.jpg");


        //8. Click 'Submit' button
        autoTestPage.contactUsSubmitButton.click();

        //9. Click OK button
        Driver.getDriver().switchTo().alert().accept();
        //10. Verify success message 'Success! Your details have been submitted successfully.' is visible
        softAssert.assertTrue(autoTestPage.contactUsSuccesYourDetailsHaveBeenSubmittedSuccesfullyText.isDisplayed());
        //11. Click 'Home' button and verify that landed to home page successfully
        autoTestPage.contactUsHomePageReturnButton.click();
        String expectedUrl ="https://automationexercise.com/";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        softAssert.assertEquals(actualUrl,expectedUrl,"home sayfasına dönüldü mü?");
        softAssert.assertAll("nedu");
    }
}
