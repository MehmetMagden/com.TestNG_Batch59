package tests.day19_smokeTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BrcPage;
import utilies.ConfigReader;
import utilies.Driver;

public class NegativeLoginTestYanlisKullaniciAdi {


    BrcPage brcPage = new BrcPage();

    @Test
    public void yanlisKullaniciAdi() {

        // Bir test method olustur positiveLoginTest()
        //       https://www.bluerentalcars.com/ adresine git
        Driver.getDriver().get(ConfigReader.getProperty("brcUrl"));
        //      login butonuna bas
        brcPage .ilkLoginButtonu.click();

        //test data user yanlis e mail ,
        brcPage.emailTextBox.sendKeys(ConfigReader.getProperty("brcWrongEmail"));
        //test data password : 123456
        brcPage.passwordTextBox.sendKeys(ConfigReader.getProperty("brcValidPassword"));
        //goin buttonuna tıklayın
        brcPage.ikinciLoginButtonu.click();
        //Degerleri girildiginde sayfaya basarili sekilde girilemediğini test et

        Assert.assertTrue(brcPage.ikinciLoginButtonu.isDisplayed());

        Driver.closeDriver();




    }
}
