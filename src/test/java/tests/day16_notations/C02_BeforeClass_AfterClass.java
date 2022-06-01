package tests.day16_notations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utilies.TestBase;

public class C02_BeforeClass_AfterClass extends TestBase {

    // JUnit'te beforeClass ve @AfterClass notasyonuna sahip methodlar static olmak zorundaydı.
    // TestNG bu zorunluluktan bizi kurtarıyor

    /*
    testng bize daha fazla before ve after notasyonları sunar diğer before/after notasyonları tanımlayacağımız
    gurup, test veya suit'ten önce veya sonra çalışır

    ileride xml dosyaları ile bunları göreceğiz
     */

    @BeforeClass
    public void beforeClassMethod(){
        System.out.println("Before Class");
    }

    @AfterClass
    public void afterClassMethod(){
        System.out.println("After Class");
    }


    @Test
    public void amazonTesti() {
        driver.get("https://www.amazon.com");
        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());


    }

    @Test
    public void test02() {
        driver.get("https://www.bestbuy.com");
        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());
    }

    @Test
    public void TechproedTest() {
        driver.get("https://www.techproeducation.com");
        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());
    }
}
