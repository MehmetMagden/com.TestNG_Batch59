package Tests.day18_pom;

import org.testng.annotations.Test;
import utilies.Driver;

public class C01_ConfigReader {

    @Test
    public void test01() {

        Driver.getDriver().get("amazonUrl");
        Driver.getDriver().get("facebookUrl");

    }
}
