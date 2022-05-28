package Tests.Practice;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.PracticePages.AutoTestPage;
import utilies.Driver;

public class PracticeAutomationexercise {


    @Test
    public void test01() {


        AutoTestPage autoTestPage = new AutoTestPage();
        SoftAssert softAssert = new SoftAssert();

        Driver.getDriver().get("http://automationexercise.com/");

        softAssert.assertTrue(autoTestPage.homePageButton.isDisplayed());
        autoTestPage.signinLoginButton.click();
        softAssert.assertTrue(autoTestPage.newUserSignup.isDisplayed());
        autoTestPage.logInNameBox.sendKeys("hasan");
        autoTestPage.logInEmailBox.sendKeys("hasan@asdf.com");
        autoTestPage.logInSignInButton.click();

        softAssert.assertTrue(autoTestPage.enterAccountInformationText.isDisplayed());

        autoTestPage.mrTitleRatioBox.click();
        autoTestPage.passwordBoxEnterAccountInformation
                .sendKeys("123456"+ Keys.TAB)+"23"+;






        //softAssert.assertAll();
    }
}
