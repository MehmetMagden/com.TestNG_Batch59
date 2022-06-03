package tests.day22_crossBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utilies.ConfigReader;
import utilies.Driver;

public class C03_DataProvider {



    @Test
    public void test01() {

        // amazon ana sayfaya gidelim
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        // nutella için arama yapalım
        Driver.getDriver().findElement(By.id("twotabsearchtextbox")).sendKeys("nutella"+ Keys.ENTER);

        String actualResult =Driver.getDriver().findElement(By.xpath("//span[@class='a-color-state a-text-bold']")).getText();
        String expectedWord ="nutella";

        // sonuçların nutella içerdiğini test edelim
        Assert.assertTrue(actualResult.contains(expectedWord));

        // sayfayı kapatalım
        Driver.closeDriver();


    }

    @DataProvider
    public static Object[][] AranacakKelimeler() {

        Object[][] arananKelimeArray = {{"Nutella"}, {"Java"}, {"cigden"}, {"Netherlands"}};
        return  arananKelimeArray;
    }

    @Test(dataProvider = "AranacakKelimeler")

    // arayacağımız kelimeleri bir liste gibi tutup bana yollayacak bir veri sağlayıcısı oluşturacağız.

    public void dataProviderTesti(String arananKelime) {

        // amazon ana sayfaya gidelim
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        // Nutella, Java, cigden ve Netherlands için arama yapalım
        Driver.getDriver().findElement(By.id("twotabsearchtextbox")).sendKeys(arananKelime+ Keys.ENTER);
        String actualResult =Driver.getDriver().findElement(By.xpath("//span[@class='a-color-state a-text-bold']")).getText();
        String expectedWord =arananKelime;


        // Sonuçların aradığımız kelimeyi içerdiğini test edelim
        Assert.assertTrue(actualResult.contains(expectedWord));
        // sayfayı kapatalım
        Driver.closeDriver();


        // Sayfayı kapatalım





    }
}
