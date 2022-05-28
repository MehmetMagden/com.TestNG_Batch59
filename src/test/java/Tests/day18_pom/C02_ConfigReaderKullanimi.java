package Tests.day18_pom;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FacebookPage;
import utilies.ConfigReader;
import utilies.Driver;

public class C02_ConfigReaderKullanimi {

    @Test
    public void test01() {

        FacebookPage facebookPage = new FacebookPage();

        // facebook anasayfaya gidin
        Driver.getDriver().get(ConfigReader.getProperty("facebookUrl"));

        // cikarsa cookies kabul edin
        //yok

        // kullanici mail kutusuna yanliş bir isim yazdirin
        facebookPage.mailKutusu.sendKeys(ConfigReader.getProperty("fbWrongUserName"));

        // kullanici sifre kutusuna rastgele bir password yazdirin
        facebookPage.sifreKutusu.sendKeys(ConfigReader.getProperty("fbWrongPassword"));

        // login butonuna basin
        facebookPage.loginKutusu.click();
        // giris yapilamadigini test edin
        Assert.assertTrue(facebookPage.girilemediYazisi.isDisplayed());

        // sayfayı kapatın
        Driver.closeDriver();
    }
}
