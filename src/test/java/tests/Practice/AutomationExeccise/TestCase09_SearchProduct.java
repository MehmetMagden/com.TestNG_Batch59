package tests.Practice.AutomationExeccise;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.PracticePages.AutoTestPage;

public class TestCase09_SearchProduct {

    @Test
    public void test09() {

       AutoTestPage autoTestPage = new AutoTestPage();
        SoftAssert softAssert =new SoftAssert();

        //1. Launch browser
        //2. Navigate to url 'http://automationexercise.com'


        //3. Verify that home page is visible successfully
        //4. Click on 'Products' button
        //5. Verify user is navigated to ALL PRODUCTS page successfully
        //6. Enter product name in search input and click search button
        //7. Verify 'SEARCHED PRODUCTS' is visible
        //8. Verify all the products related to search are visible


    }
}
