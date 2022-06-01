package tests.CoursePractice;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.PracticePages.DMGoodiesPage;
import utilies.Driver;

public class Q05_DraganDrop {
    // Go to URL : http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html
// Fill in capitals by country.


    @Test
    public void test01() {

        Driver.getDriver().get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
        DMGoodiesPage dm =new DMGoodiesPage();
        Actions actions = new Actions(Driver.getDriver());

        actions.dragAndDrop(dm.oslo,dm.norway).dragAndDrop(dm.stockholm,dm.sweden).dragAndDrop(dm.washington,dm.unitedStates)
                .dragAndDrop(dm.copehagen,dm.danımark).dragAndDrop(dm.seoul,dm.southKorea).dragAndDrop(dm.madrid,dm.spaın)
                .dragAndDrop(dm.roma,dm.ıtaly).perform();


    }
}
