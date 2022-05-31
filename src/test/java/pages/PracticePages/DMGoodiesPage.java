package pages.PracticePages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilies.Driver;

public class DMGoodiesPage {

    public DMGoodiesPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//div[@id='box6']")
    public WebElement roma;
    @FindBy(xpath = "//div[@id='box7']")
    public WebElement madrid;
    @FindBy(xpath = "//div[@id='box1']")
    public WebElement oslo;
    @FindBy(xpath = "//div[@id='box2']")
    public WebElement stockholm;
    @FindBy(xpath = "//div[@id='box3']")
    public WebElement washington;
    @FindBy(xpath = "//div[@id='box4']")
    public WebElement copehagen;
    @FindBy(xpath = "//div[@id='box5']")
    public WebElement seoul;
    @FindBy(xpath = "//div[@id='box106']")
    public WebElement ıtaly;
    @FindBy(xpath = "//div[@id='box107']")
    public WebElement spaın;
    @FindBy(xpath = "//div[@id='box101']")
    public WebElement norway;
    @FindBy(xpath = "//div[@id='box104']")
    public WebElement danımark;
    @FindBy(xpath = "//div[@id='box105']")
    public WebElement southKorea;
    @FindBy(xpath = "//div[@id='box102']")
    public WebElement sweden;
    @FindBy(xpath = "//div[@id='box103']")
    public WebElement unitedStates;


}
