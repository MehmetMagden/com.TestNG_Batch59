package Tests.Practice.AutomationExeccise;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.PracticePages.AutoTestPage;
import utilies.Driver;

public class TestCase01 {


    @Test
    public void test01() {


        AutoTestPage autoTestPage = new AutoTestPage();
        SoftAssert softAssert = new SoftAssert();
        Actions actions = new Actions(Driver.getDriver());

        Driver.getDriver().get("http://automationexercise.com/");

        softAssert.assertTrue(autoTestPage.homePageButton.isDisplayed());
        autoTestPage.signinLoginButton.click();
        softAssert.assertTrue(autoTestPage.newUserSignup.isDisplayed());
        autoTestPage.logInNameBox.sendKeys("hasan");
        autoTestPage.logInEmailBox.sendKeys("hasan111@asdf.com");
        autoTestPage.logInSignInButton.click();

        softAssert.assertTrue(autoTestPage.enterAccountInformationText.isDisplayed());

        autoTestPage.mrTitleRatioBox.click();
        autoTestPage.passwordBoxEnterAccountInformation
                .sendKeys("123456"+ Keys.TAB+"23"+Keys.TAB+"jun"+Keys.TAB+1990+Keys.TAB+Keys.SPACE+Keys.TAB+Keys.SPACE
                +Keys.TAB+"hasan"+Keys.TAB+ "uzar"+Keys.TAB+"freelancer"+Keys.TAB+"can st, 51254, freelancer"+Keys.TAB+"Hollanda");

        Select select = new Select(autoTestPage.loginCountryDropBox);

        select.selectByVisibleText("Canada");

actions.sendKeys(Keys.TAB+"US"+Keys.TAB+"bilemedim"+Keys.TAB+"51254"+Keys.TAB+"56446584654"+Keys.TAB).click().perform();
        autoTestPage.signInCreateAccoutButton.click();

        softAssert.assertTrue(autoTestPage.accountCreatedText.isDisplayed());
        autoTestPage.accountCreatedContinueButton.click();

        softAssert.assertTrue(autoTestPage.loggedInAsUserText.isDisplayed());
        autoTestPage.deleteAccountButton.click();
        autoTestPage.deleteConfirmationBox.click();

        //site sildikten sonra karışıyor
        softAssert.assertAll();
    }
}
