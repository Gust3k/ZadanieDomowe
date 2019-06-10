package ZadanieDomowe.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FinalPage extends AbstractPage{

    @FindBy(css = "html.z-base-assets-major-5.z-base-assets-minor-0.z-base-assets-patch-3 body div div#app div div.z-coast-cart__cart__container div.z-coast-cart__cart__cart-tiles div.z-coast-cart__cart__cart-tiles__container.z-coast-cart__cart__cart-tiles__container__second-container.z-coast-cart__cart__cart-tiles__spacing.z-coast-cart__cart__sticky div div div.z-coast-base__tile.z-coast-base__tile--white div.z-coast-base__totals-tile button.z-1-button.z-coast-base__totals-tile__button-checkout.z-1-button--primary.z-1-button--button")
    public WebElement finalchecker;

    public FinalPage (WebDriver driver) {
        super(driver);
    }

    public boolean isfinalcheckerDisplayed(){
        return finalchecker.isDisplayed();
    }


}
