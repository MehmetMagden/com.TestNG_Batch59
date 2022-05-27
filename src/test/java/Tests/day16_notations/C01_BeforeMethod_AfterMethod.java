package Tests.day16_notations;

import org.testng.annotations.Test;
import utilies.TestBase;

public class C01_BeforeMethod_AfterMethod extends TestBase {

    @Test
    public void test01() {
        driver.get("https://www.amazon.com");


    }

    @Test
    public void test02() {
        driver.get("https://www.bestbuy.com");
    }

    @Test
    public void TechproedTest() {
        driver.get("https://www.techproeducation.com");
    }
}
