package tests.day22_crossBrowser;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.BrcPage;
import utilies.ConfigReader;
import utilies.Driver;

public class C04_NegativeLoginDataProvider {
    BrcPage brcPage ;
    @DataProvider
    public static Object[][] kullaniciListesi() {
        Object[][] kullaniciBilgileri= {{"firuze@nehaber.com","12354"},
                                        {"murat@ben.com","65874"},
                                        {"ilyas@asdf.com","987654"      } };
        return kullaniciBilgileri;
    }

    @Test(dataProvider = "kullaniciListesi")
    public void yanlisSifre(String userEmail,String password) {

        brcPage = new BrcPage();
        // Bir test method olustur positiveLoginTest()
        //       https://www.bluerentalcars.com/ adresine git
        Driver.getDriver().get(ConfigReader.getProperty("brcUrl"));
        //      login butonuna bas
        brcPage .ilkLoginButtonu.click();

        //test data user email: dataProvider'dan alalım ,
        brcPage.emailTextBox.sendKeys(userEmail);
        //test data password : dataProvider'dan alalım ,
        brcPage.passwordTextBox.sendKeys(password);
        //goin buttonuna tıklayın
        brcPage.ikinciLoginButtonu.click();
        //Degerleri girildiginde sayfaya basarili sekilde girilemediğini test et

        Assert.assertTrue(brcPage.ikinciLoginButtonu.isDisplayed());

        Driver.closeDriver();

        /*
        otel ile ilgili olanı yapın


         */


    }
}
