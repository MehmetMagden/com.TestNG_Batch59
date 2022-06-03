package tests.Practice.AutomationExeccise;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.PracticePages.AutoTestPage;
import utilies.ConfigReader;
import utilies.Driver;

public class TestCase08_VerifyAllProductAndProductDetailPage {


    @Test
    public void test08VerifyAllProductAndProductDetailPage() {

        AutoTestPage autoTestPage =new AutoTestPage();
        SoftAssert softAssert = new SoftAssert();

        //1. Launch browser
        //2. Navigate to url 'http://automationexercise.com'

        Driver.getDriver().get(ConfigReader.getProperty("atUrl"));
        //3. Verify that home page is visible successfully
        softAssert.assertTrue(autoTestPage.hompePageTestCasesButton.isDisplayed());
        //4. Click on 'Products' button
        autoTestPage.homePageProductsButton.click();
        //5. Verify user is navigated to ALL PRODUCTS page successfully
        String expectedUrl = "https://automationexercise.com/products";
        String actualUrl = Driver.getDriver().getCurrentUrl();

        softAssert.assertEquals(actualUrl,expectedUrl,"Product page gidilemedi");

        //6. The products list is visible
        softAssert.assertFalse(autoTestPage.productPageProductList.isEmpty());
        //7. Click on 'View Product' of first product
        autoTestPage.productPageProductList.get(0).click();
        //8. User is landed to product detail page
        //9. Verify that detail detail is visible: product name, category, price, availability, condition, brand
}}
