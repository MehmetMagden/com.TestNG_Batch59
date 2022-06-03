package tests.day16_notations;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilies.TestBase;

public class C05_Assertions extends TestBase {

    @Test
    public void test01() {

        // amazon anasayfa
        driver.get("https://www.amazon.com");

        //title amazon mu
        String expectedTitle = "Amazon";
        String actualTitle = driver.getTitle();
        Assert.assertTrue(actualTitle.contains(expectedTitle));
        //arama kutusuna erişebiliyor muyuz
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchbox"));
        //nutella arat
        aramaKutusu.sendKeys("Nutella"+ Keys.ENTER);
        //arama yapıldığını test et
        WebElement sonucYaziElementi = driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));
        Assert.assertTrue(sonucYaziElementi.isDisplayed());
        //arama sonuuc nutella içeriyormu test
        Assert.assertTrue(sonucYaziElementi.getText().contains("nutella"));


    }
}
