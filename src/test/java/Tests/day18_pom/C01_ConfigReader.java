package Tests.day18_pom;

import org.testng.annotations.Test;
import utilies.ConfigReader;
import utilies.Driver;

public class C01_ConfigReader {

    @Test
    public void test01() {

        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        Driver.getDriver().get(ConfigReader.getProperty("facebookUrl"));

    }
}
