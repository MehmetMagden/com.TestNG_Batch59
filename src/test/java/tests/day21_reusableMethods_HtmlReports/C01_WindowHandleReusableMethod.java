package tests.day21_reusableMethods_HtmlReports;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilies.Driver;
import utilities.ReusableMethods1;

import java.util.Set;

public class C01_WindowHandleReusableMethod {

    @Test
    public void test01() {

        //● https://the-internet.herokuapp.com/windows adresine gidin.
        Driver.getDriver().get("https://the-internet.herokuapp.com/windows");

        String ilkSayfaWH =Driver.getDriver().getWindowHandle();
        //● Click Here butonuna basın.
        Driver.getDriver().findElement(By.linkText("Click Here")).click();
        Set<String> windowHandleSeti = Driver.getDriver().getWindowHandles();

        String ikinciSayfaWH ="";

        for(String w: windowHandleSeti){
            if (!w.equals(ilkSayfaWH)){
                ikinciSayfaWH=w;
            }
        }
        Driver.getDriver().switchTo().window(ikinciSayfaWH);
        System.out.println("Driver.getDriver().getTitle() = " + Driver.getDriver().getTitle());
        //açılan yeni tabın title'lının "New Window" olduğunu test edin

        String expectedTitle = "New Window";
        String actuelTitle =Driver.getDriver().getTitle();
        Assert.assertEquals(actuelTitle,expectedTitle);

        Driver.closeDriver();



    }

    @Test
    public void test02() {
        //● https://the-internet.herokuapp.com/windows adresine gidin.
        Driver.getDriver().get("https://the-internet.herokuapp.com/windows");
        //● Click Here butonuna basın.
        Driver.getDriver().findElement(By.linkText("Click Here")).click();
        ReusableMethods1.switchToWindow("New Window");

        String expectedTitle = "New Window";
        String actuelTitle =Driver.getDriver().getTitle();
        Assert.assertEquals(actuelTitle,expectedTitle);

        //utilities.ReusableMethods.waitFor(5);

        Driver.closeDriver();


    }
}
