package tests.day19_smokeTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BrcPage;
import utilies.ConfigReader;
import utilies.Driver;

public class PozitifLoginTest {

    BrcPage brcPage = new BrcPage();

    @Test
    public void test01() {
        // Bir test method olustur positiveLoginTest()
        //       https://www.bluerentalcars.com/ adresine git
        Driver.getDriver().get(ConfigReader.getProperty("brcUrl"));
        //      login butonuna bas
        brcPage .ilkLoginButtonu.click();

        //test data user email: customer@bluerentalcars.com ,
        brcPage.emailTextBox.sendKeys(ConfigReader.getProperty("brcValidEmail"));
        //test data password : 12345
        brcPage.passwordTextBox.sendKeys(ConfigReader.getProperty("brcValidPassword"));
        //goin buttonuna tıklayın
        brcPage.ikinciLoginButtonu.click();
        //Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et

        String actualUserName=brcPage.kullaniciProfilIsmi.getText();
        String expectedUserName = ConfigReader.getProperty("brcValidUserName");

        Assert.assertEquals(actualUserName,expectedUserName);

        Driver.closeDriver();


    }
}
