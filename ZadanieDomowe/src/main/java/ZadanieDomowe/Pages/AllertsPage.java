package ZadanieDomowe.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AllertsPage extends AbstractPage {

    @FindBy(xpath = "//html/body/div[4]/div[2]/div/div/z-grid/z-grid-item/z-grid/z-grid-item[1]/div[2]/div/div/div/div[1]")
    public WebElement wrongdatasAlert;

    @FindBy(xpath = "//html/body/div[4]/div[2]/div/div/z-grid/z-grid-item/z-grid/z-grid-item[1]/div[2]/div/div/div/div/form/z-grid/z-grid-item[1]/div/div/div/span[2]")
    public WebElement emptydatasAlert;


    public AllertsPage(WebDriver driver) {
        super(driver);
    }


    public boolean isWrongDatasAlertDisplayed() {
        return wrongdatasAlert.isDisplayed();
    }

    public boolean isEmptyDatasAlertDisplayed() {
        return  emptydatasAlert.isDisplayed();
    }
}
