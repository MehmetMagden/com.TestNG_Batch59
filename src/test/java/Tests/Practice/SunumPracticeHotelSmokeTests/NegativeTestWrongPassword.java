package Tests.Practice.SunumPracticeHotelSmokeTests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.PracticePages.HotelMCPage;
import utilies.ConfigReader;
import utilies.Driver;

public class NegativeTestWrongPassword {

    static HotelMCPage hmc = new HotelMCPage();

    @Test
    public void wrongPasswordTest() {


        //1) com.techproed altinda bir package olustur : smoketest
        //2) Bir Class olustur : PositiveTest
        //3) Bir test method olustur positiveLoginTest()

        //https://www.hotelmycamp.com adresine git
        Driver.getDriver().get(ConfigReader.getProperty("hmcUrl"));
        //login butonuna bas
        hmc.hompePageLoginButton.click();

        //test data username: manager ,
        hmc.loginPageUserNameBox.sendKeys(ConfigReader.getProperty("hmcUserName"));
        //test data password : Manager1!
        hmc.loginPagePasswordeBox.sendKeys(ConfigReader.getProperty("hmcWrongPassword"));
        hmc.loginPageSubmitButton.click();
        //Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et

        System.out.println(Driver.getDriver().findElement(By.id("divMessageResult")).getText());

//        Assert.assertTrue(hmc.listOfUserText.isDisplayed());
//        Driver.closeDriver();
    }
    @Test
    public void positiveLoginTest() {
        //HotelMCPage hmc = new HotelMCPage();    //*******///objeyi iptal ettim////*******


        //1) com.techproed altinda bir package olustur : smoketest
        //2) Bir Class olustur : PositiveTest
        //3) Bir test method olustur positiveLoginTest()

        //https://www.hotelmycamp.com adresine git
        Driver.getDriver().get(ConfigReader.getProperty("hmcUrl"));
        //login butonuna bas
        hmc.hompePageLoginButton.click();

        //test data username: manager ,
        hmc.loginPageUserNameBox.sendKeys(ConfigReader.getProperty("hmcUserName"));
        //test data password : Manager1!
        hmc.loginPagePasswordeBox.sendKeys(ConfigReader.getProperty("hmcPassword"));
        hmc.loginPageSubmitButton.click();
        //Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et

        Assert.assertTrue(hmc.listOfUserText.isDisplayed());
        Driver.closeDriver();
    }



}

