package tests.day16_notations;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilies.TestBase;

public class C06_SoftAssert extends TestBase {


    @Test
    public void test01() {
        /*
        soft assertion baslangic ve bitiş satırları arasındaki tüm assertion ları yapıp. bitiş satırına geldiğinde
        bize buluğu tüm hataları rapor eder.

        softAsserttun başlangıcı soft objesi oluşturmaktır
         */
        SoftAssert softAssert = new SoftAssert();
        // amazon anasayfa
        driver.get("https://www.amazon.com");

        //title amazon mu
        String expectedTitle = "Amazon";
        String actualTitle = driver.getTitle();
        softAssert.assertTrue(actualTitle.contains(expectedTitle));
        //arama kutusuna erişebiliyor muyuz
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
        //nutella arat
        aramaKutusu.sendKeys("Nutella"+ Keys.ENTER);
        //arama yapıldığını test et
        WebElement sonucYaziElementi = driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));
        softAssert.assertTrue(sonucYaziElementi.isDisplayed(),"ortalık karışık");
        //arama sonuuc nutella içeriyormu test
        softAssert.assertTrue(sonucYaziElementi.getText().contains("Nutella"),"nutella yok");

        //soft assert'e bitiş satırını söylemek için assertAll() kullanılır
        softAssert.assertAll();

        /*
        softAssert'in hata bulsa bile çlaışmaya devam etme özelliği assertAll'a kadardır
        eğer asserAll()da failed rapor edilirse çalışma durdurulur
        ve class'ın geri kalanı çalışmaz
        Yani assertAall hard assert gibidir. hata bulduğunda codu direk keser
         */
        System.out.println("Assertion'lardan fail olan olursa, burası çalışmaz");


    }
}
