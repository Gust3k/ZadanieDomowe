package ZadanieDomowe.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage extends AbstractPage {

    @FindBy(xpath = "//html/body/div[4]/z-grid/z-grid-item[2]/div/div/div[2]/button")
    public WebElement continueshopsButton;

    @FindBy(xpath = "//html/body/div[4]/z-grid/z-grid-item[1]/div/div/nav/ul/li[7]/a/span[1]")
    public WebElement addressMenuLink;

    public DashboardPage(WebDriver driver) {
        super(driver);
    }

    public boolean isContinueShopsButtonDisplayed(){
        return continueshopsButton.isDisplayed();
    }

    public AddressPage goToAddressPage(){
    clickElement(addressMenuLink);
    return new AddressPage(driver);
    }

}
