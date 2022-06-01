package tests.CoursePractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.SauceDemoPage;
import utilies.Driver;

import java.util.ArrayList;
import java.util.Collections;

public class Q03_SoftAssert {

    ///*
    // * Navigate to  https://www.saucedemo.com/
    // * Enter the user name  as standard_user
    // * Enter the password as   secret_sauce
    // * Click on login button
    // *     T1 : Choose price low to high with soft Assert
    // *     T2 : Verify item prices are sorted from low to high with hard Assert
    // */
    //
    //
    //// Verify item prices are sorted from low to high with hard Assert


    @Test
    public void sauceDemoSoft() {

        Driver.getDriver().get("https://www.saucedemo.com/");
        SauceDemoPage sauceDemoPage = new SauceDemoPage();
        sauceDemoPage.userName.sendKeys("standard_user");
        sauceDemoPage.password.sendKeys("secret_sauce");
        sauceDemoPage.loginButton.click();

        Select select = new Select(sauceDemoPage.dropDown);
        select.selectByVisibleText("Price (low to high)");
        SoftAssert softAssert = new SoftAssert();

        String expected = "PRICE (LOW TO HIGH)";
        String actual =select.getFirstSelectedOption().getText();
        String actual2 = Driver.getDriver().findElement(By.className("active_option")).getText();

        softAssert.assertEquals(actual,expected);
        softAssert.assertEquals(actual2,expected);
        softAssert.assertAll();

    }

    @Test
    public void sauceDemoHard() {

        Driver.getDriver().get("https://www.saucedemo.com/");

        SauceDemoPage sauceDemoPage = new SauceDemoPage();
        sauceDemoPage.userName.sendKeys("standard_user");
        sauceDemoPage.password.sendKeys("secret_sauce");
        sauceDemoPage.loginButton.click();

        Select select = new Select(sauceDemoPage.dropDown);
        select.selectByIndex(2);

        ArrayList<Double> urunlerDouble = new ArrayList<>();

        for (WebElement w : sauceDemoPage.urunler){
            //String fiyatStr = w.getText().replaceAll("$","");
            String fiyatStr =w.getText().replaceAll("^\\D","");
            urunlerDouble.add(Double.parseDouble(fiyatStr));
        }
        ArrayList<Double> kontrolList = new ArrayList<>(urunlerDouble);
        Collections.sort(kontrolList);


        Assert.assertEquals(kontrolList,urunlerDouble);


        //SoftAssert softAssert = new SoftAssert();

//        String expected = "PRICE (LOW TO HIGH)";
//        String actual =select.getFirstSelectedOption().getText();
//        String actual2 = Driver.getDriver().findElement(By.className("active_option")).getText();
//
//        softAssert.assertEquals(actual,expected);
//        softAssert.assertEquals(actual2,expected);

    }
}
