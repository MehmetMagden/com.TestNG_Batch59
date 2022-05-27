package utilies;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Driver {

    /*
    POM'de Driver için TestBase class'ına extends etmek yerine driver class'ından static method'lar kullanarak
    driver oluşturup, ilgili ayarların yapılması ve en sonda driver'ın kapatılması tercih edilmiştir.
     */

    static WebDriver driver;

    public static WebDriver getDriver() {

        if (driver == null) {

            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        }
        return driver;


    }

    public static void closeDriver() {
        if (driver != null) {
            driver.close();
            driver = null;

        }
    }
}
