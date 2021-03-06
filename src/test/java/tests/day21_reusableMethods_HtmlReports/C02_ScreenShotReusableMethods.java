package tests.day21_reusableMethods_HtmlReports;

import org.testng.annotations.Test;
import utilies.ConfigReader;
import utilies.Driver;
import utilities.ReusableMethods1;

import java.io.IOException;

public class C02_ScreenShotReusableMethods {

    @Test
    public void test01() throws IOException {
        //amazon sayfasına gidip fotoğrafını çekelim
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        ReusableMethods1.getScreenshot("amazon");

        Driver.closeDriver();
    }
}
