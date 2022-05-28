package Tests.Practice;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.PracticePages.SauceDemoPage;
import utilies.Driver;

public class Practice01SauceDemo {


    @Test
    public void test01() {
        SauceDemoPage sauceDemoPage = new SauceDemoPage();
        ////1. "https://www.saucedemo.com" Adresine gidin
        Driver.getDriver().get("https://www.saucedemo.com");
        //    //2. Username kutusuna "standard_user" yazdirin
        sauceDemoPage.userNameBox.sendKeys("standard_user");

        //    //3. Password kutusuna "secret_sauce" yazdirin
        sauceDemoPage.passwordBox.sendKeys("secret_sauce");
        //    //4. Login tusuna basin
        sauceDemoPage.loginButton.click();
        //    //5. Ilk urunun ismini kaydedin ve bu urunun sayfasina gidin
       String firstItemName = sauceDemoPage.firstItemName.getText();
       sauceDemoPage.firstItem.click();
        //    //6. Add to Cart butonuna basin
        sauceDemoPage.addToCartButton.click();

        //    //7. Alisveris sepetine tiklayin
        sauceDemoPage.alisverisSepeti.click();
        //    //8. Sectiginiz urunun basarili olarak sepete eklendigini control edin
        String expectedProductString = firstItemName;
        String actualProductAtCard = sauceDemoPage.sepeteEklenenUrunDogrumu.getText();
        Assert.assertEquals(actualProductAtCard,expectedProductString,"is added product same with the order?");
        //    //9. Sayfayi kapatin7
        Driver.closeDriver();
    }
}
