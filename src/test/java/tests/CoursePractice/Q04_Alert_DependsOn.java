package tests.CoursePractice;

import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.PracticePages.WebDriverUniversityPage;
import utilies.Driver;

public class Q04_Alert_DependsOn {

    // 1. "http://webdriveruniversity.com/Popup-Alerts/index.html" adresine gidin
    // 2. CLICK ME of JavaScript Alert e tıklayın
    // 3. pop up text i alın
    // 4. Mesajın "I am an alert box!"  olduğunu doğrulayın.
    // 5. pop up i kabul edin

    // Yine ayni class da baska test methodu olusturun
    // 1. "http://webdriveruniversity.com/Popup-Alerts/index.html" adresine gidin
    // 2.  CLICK ME of JavaScript Confirm Box i  TIKLAYIN
    // 3.  pop up text i alın
    // 4. Mesajın "Press a button!" olduğunu doğrulayın
    // 5. Açılır pencereyi kapat
    // 6. pop up i iptal edin,
    // 7. "You pressed Cancel!" yazisinin goruntulendigini dogrulayin
    // 8. alert1'e göre dependsOnMethods kullanın


    @Test
    public void alert1() {

        Driver.getDriver().get("http://webdriveruniversity.com/Popup-Alerts/index.html");

        WebDriverUniversityPage wdup = new WebDriverUniversityPage();

        wdup.javaScriptAlert.click();
        String actualMessage = Driver.getDriver().switchTo().alert().getText();
        String expected = "I am an alert box!";
        Assert.assertEquals(actualMessage,expected);
        Driver.getDriver().switchTo().alert().accept();




    }

    @Test(dependsOnMethods ="alert1" )
    public void alert2() {

        Driver.getDriver().get("http://webdriveruniversity.com/Popup-Alerts/index.html");

        WebDriverUniversityPage wdup = new WebDriverUniversityPage();

        wdup.javaScriptConfirmBox.click();
        //String actualMessage = Driver.getDriver().switchTo().alert().getText();
        Alert alert = Driver.getDriver().switchTo().alert();
        alert.getText();
        String expectedMesg ="Press a button!";

        Assert.assertTrue(alert.getText().equals(expectedMesg));
        alert.dismiss();
        Assert.assertTrue(wdup.yaziElementi.isDisplayed());


    }
}


