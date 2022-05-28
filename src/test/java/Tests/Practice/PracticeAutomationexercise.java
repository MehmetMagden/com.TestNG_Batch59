package Tests.Practice;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.PracticePages.AutomationexercisePage;
import utilies.Driver;

public class PracticeAutomationexercise {


    @Test
    public void test01() {


        AutomationexercisePage automationexercisePage = new AutomationexercisePage();
        //SoftAssert softAssert = new SoftAssert();



        Driver.getDriver().get("http://automationexercise.com/");

        //softAssert.assertTrue(automationexercisePage.homePageButton.isDisplayed());







        //softAssert.assertAll();
    }
}
