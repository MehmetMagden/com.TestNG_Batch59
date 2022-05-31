package Tests.CoursePractice;

import org.testng.annotations.Test;
import utilies.Driver;
import utilies.TestBase;

public class Q02DependsOn {

          /*
   birbirine bagimli testler olusturun..
   .beforClass olusturup setUp ayarlarini yapin..
     birbirine bagimli testler olusturarak;
         ilk once facebook a gidin
         sonra facebook a bagimli olarak google a gidin,
         daha sonra google a bagimli olarak amazon a gidin
   driver i kapatin

*/

    @Test
    public void facebookTest() {
        Driver.getDriver().get("http://www.facebook.com");

    }

    @Test(dependsOnMethods = "facebookTest")
    public void googleTest() {
        Driver.getDriver().get("http://www.google.com");

    }
    @Test(dependsOnMethods = "googleTest")
    public void amazonTest() {
        Driver.getDriver().get("http://www.amazon.com");

    }
}
