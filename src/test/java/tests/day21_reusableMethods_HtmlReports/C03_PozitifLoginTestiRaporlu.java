package tests.day21_reusableMethods_HtmlReports;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BrcPage;
import utilies.ConfigReader;
import utilies.Driver;
import utilies.TestBaseRapor;

public class C03_PozitifLoginTestiRaporlu extends TestBaseRapor {

    BrcPage brcPage = new BrcPage();

    @Test
    public void test01(){
        extentTest=extentReports.createTest("Pozitif Login","Geçerli user name ile giriş yapabilmeli");
        // Bir test method olustur positiveLoginTest()
        //       https://www.bluerentalcars.com/ adresine git
        Driver.getDriver().get(ConfigReader.getProperty("brcUrl"));
        extentTest.info("Brc anasayfaya gidildi");
        //      login butonuna bas
        brcPage .ilkLoginButtonu.click();
        extentTest.info("Login Button'una tıklandı");

        //test data user email: customer@bluerentalcars.com ,
        brcPage.emailTextBox.sendKeys(ConfigReader.getProperty("brcValidEmail"));
        extentTest.info("Geçerli bir Email girildi");
        //test data password : 12345
        brcPage.passwordTextBox.sendKeys(ConfigReader.getProperty("brcValidPassword"));
        extentTest.info("Geçerli password yazıldı");
        //goin buttonuna tıklayın
        brcPage.ikinciLoginButtonu.click();
        extentTest.info("login buttonuna tıklandı");
        //Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et


        String actualUserName=brcPage.kullaniciProfilIsmi.getText();
        String expectedUserName = ConfigReader.getProperty("brcValidUserName");

        Assert.assertEquals(actualUserName,expectedUserName);
        extentTest.pass("kullanıcı başarılı bir şekilde giriş yaptı");

        Driver.closeDriver();


    }

}
