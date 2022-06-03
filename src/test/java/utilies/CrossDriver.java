package utilies;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

public class CrossDriver {

    /*
    POM'de Driver için TestBase class'ına extends etmek yerine driver class'ından static method'lar kullanarak
    driver oluşturup, ilgili ayarların yapılması ve en sonda driver'ın kapatılması tercih edilmiştir.

     POM'de Driver class'indaki getDriver()'nin obje oluşturularak kullanilmasini engellemek için
     Singleton pattern kullanımı benimsenmiştir.

     SingleTon Pattern : tekli kullanım, bir class'ın farklı class'lardan obje oluşturularak kullanımını engellemek
     için kullanılır.

     Bunu sağlamak için yapmamız gerekn şey oldukça basit, obje oluşturmak için kullanılan Constructor'ı private
     yaptığımızda, başka class'larda Driver Class'ından obje oluşturulması mumkün olamaz
     */

    private CrossDriver(){

    }
    static WebDriver driver;

    public static WebDriver getDriver(String browser) {
        browser = browser == null ? ConfigReader.getProperty("browser") : browser;

        if (driver == null) {

            switch (browser){
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;
                case "safari":
                    WebDriverManager.safaridriver().setup();
                    driver = new SafariDriver();
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;

                case "headless-chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver(new ChromeOptions().setHeadless(true));
                    break;

                default:
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;


            }


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
