package pages.PracticePages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilies.Driver;

public class SauceDemoPage {

    public SauceDemoPage() {
        PageFactory.initElements(Driver.getDriver(), this
        );
    }

    @FindBy(xpath = "//input[@placeholder='Username']")
    public WebElement userNameBox;

    @FindBy(id="password")
    public WebElement passwordBox;

    @FindBy(id="login-button")
    public WebElement loginButton;

    @FindBy(className = "inventory_item")
    public WebElement firstItem;

    @FindBy(className = "inventory_item_name")
    public WebElement firstItemName;

    @FindBy(xpath = "//*[text()='Add to cart']")
    public WebElement addToCartButton;

    @FindBy(className = "shopping_cart_link")
    public WebElement alisverisSepeti;

    @FindBy(className = "inventory_item_name")
    public WebElement sepeteEklenenUrunDogrumu;


}
