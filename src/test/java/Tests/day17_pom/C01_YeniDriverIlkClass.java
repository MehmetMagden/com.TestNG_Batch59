package Tests.day17_pom;

import org.testng.annotations.Test;
import utilies.Driver;

public class C01_YeniDriverIlkClass {

    @Test
    public void test01() {

        Driver.getDriver().get("https://www.amazon.com");
        /*
        bugüne kadar TestBase class'ına extends ederek kullandığımız driver yerine
        bundan sonra DriverClass'indan static methodunu kullanacağız

        Driver.getDriver()      in
        driver                  out
         */
        Driver.getDriver().get("https://www.bestbuy.com");
        Driver.getDriver().get("https://www.facebook.com");

    }
}
