package Tests.day17_pom;

import org.testng.annotations.Test;
import pages.FacebookPage;
import utilies.Driver;

public class C03_PageClassKullanimi {

    @Test
    public void test01() {

        FacebookPage facebookPage =new FacebookPage();
        //Facebook anasayfaya gidin

        Driver.getDriver().get("https://www.facebook.com");
        //kullanici mail kutusuna rastgele bir isim yazdırın
        //kullanıcı şifre kutusuna rastgele bir password yazdırın
        //login buttonunabasın
        //giriş yapılamadığını test edin
    }
}
