package tests.day16_notations;

import org.testng.annotations.Test;
import utilies.TestBase;

public class C03_Priority extends TestBase {

    /*
    TestNG test method'larını isim sırasına göre çalıştır. Eğer isim sıralamasının dışında bir sıralama
    ile çalışmasını isterseniz, test method'larına öncelik priority sağlayabilirsiniz

    priority küçükten büyüğe göre çalışır.
    Eğer bir test methodua priority atanmamışssa priority değeri sıfır kabul edilir

     */


    @Test (priority = 5 )
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
