package Tests.day19_smokeTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BrcPage;
import utilies.ConfigReader;
import utilies.Driver;

public class NegativeLoginTestYanlisPasswordVeYanlisKullaniciAdi {

    BrcPage brcPage = new BrcPage();

    @Test
    public void yanlisSifreVeKullaniciAdi() {

        // Bir test method olustur positiveLoginTest()
        //       https://www.bluerentalcars.com/ adresine git
        Driver.getDriver().get(ConfigReader.getProperty("brcUrl"));
        //      login butonuna bas
        brcPage .ilkLoginButtonu.click();

        //test data user yanlis e mail ,
        brcPage.emailTextBox.sendKeys(ConfigReader.getProperty("brcWrongEmail"));
        //test data password : 54321
        brcPage.passwordTextBox.sendKeys(ConfigReader.getProperty("brcWrongdPassword"));
        //goin buttonuna tıklayın
        brcPage.ikinciLoginButtonu.click();
        //Degerleri girildiginde sayfaya basarili sekilde girilemediğini test et

        Assert.assertTrue(brcPage.ikinciLoginButtonu.isDisplayed());

        Driver.closeDriver();




    }
}
