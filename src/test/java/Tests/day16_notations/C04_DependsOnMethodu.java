package Tests.day16_notations;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utilies.TestBase;

import java.time.Duration;

public class C04_DependsOnMethodu {

    /*
    dependson methodu test method'larıın çalışma sırasına karışmaz
    sadece bağlı olduğu testin sonucuna bakar
    bağlandığı test passed olmazsa bu test hiç çalışmaz
     */
    protected WebDriver driver;
    @BeforeClass
    public void beforeClassMethod(){
        System.out.println("Before Class");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @AfterClass
    public void afterClassMethod(){
        System.out.println("After Class");
    }


    @Test
    public void test01() {

        driver.get("https://www.amazon.com");
    }

    @Test(dependsOnMethods = "test01")
    public void test02() {
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("Nutella"+ Keys.ENTER);

    }

    @Test(dependsOnMethods = "test02")
    public void test03() {

        WebElement sonucYaziElementi = driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));
        Assert.assertTrue(sonucYaziElementi.getText().contains("Nutella"));

    }

    @Test
    public void test04() {
        System.out.println("test04");

    }
}
