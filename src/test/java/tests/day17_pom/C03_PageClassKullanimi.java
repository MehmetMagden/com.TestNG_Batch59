package tests.day17_pom;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FacebookPage;
import utilies.Driver;

public class C03_PageClassKullanimi {

    @Test
    public void test01() {

        FacebookPage facebookPage =new FacebookPage();
        //Facebook anasayfaya gidin

        Driver.getDriver().get("https://www.facebook.com");
        //cookies çıkarsa kabul edin
        //kullanici mail kutusuna rastgele bir isim yazdırın
        Faker faker = new Faker();
        facebookPage.mailKutusu.sendKeys(faker.internet().emailAddress());
        //kullanıcı şifre kutusuna rastgele bir password yazdırın
        facebookPage.sifreKutusu.sendKeys(faker.internet().password());
        //login buttonunabasın
        facebookPage.loginKutusu.click();
        //giriş yapılamadığını test edin
        Assert.assertTrue(facebookPage.girilemediYazisi.isDisplayed());

        Driver.closeDriver();


    }
}
