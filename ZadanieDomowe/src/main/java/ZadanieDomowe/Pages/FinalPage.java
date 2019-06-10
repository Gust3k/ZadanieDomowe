package ZadanieDomowe.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FinalPage extends AbstractPage{

    @FindBy(css = "html.z-base-assets-major-5.z-base-assets-minor-0.z-base-assets-patch-3 body div div#app div div.z-coast-cart__cart__container div.z-coast-cart__cart__cart-tiles div.z-coast-cart__cart__cart-tiles__container.z-coast-cart__cart__cart-tiles__container__first-container.z-coast-cart__cart__cart-tiles__spacing div.z-coast-base__tile.z-coast-base__tile--white div.z-coast-base__article-group.z-coast-cart__cart--first-article-group.z-coast-cart__cart--last-article-group div#article-AD115O07O-E110105000.z-coast-base__article-in-cart div.z-coast-base__article div.z-coast-base__article__content div.z-coast-base__article__details-group div.z-coast-base__article__details")
    public WebElement finalchecker;

    public FinalPage (WebDriver driver) {
        super(driver);
    }

    public boolean isfinalcheckerDisplayed(){
        return finalchecker.isDisplayed();
    }


}
