package ZadanieDomowe.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends AbstractPage {

    @FindBy(xpath = "/html/body/div[4]/div[3]/div[1]/div[1]/z-grid/z-grid-item[2]/div/div[1]/div/div/h1/span")
    public WebElement infoText;

    @FindBy(xpath = "/html/body/div[4]/div[3]/div[1]/div[1]/z-grid/z-grid-item[2]/div/div[5]/z-grid/z-grid-item[1]")
    public WebElement productObject;

    public SearchPage (WebDriver driver){
        super(driver);
    }

    public boolean isinfoTextDisplayed(){
        return infoText.isDisplayed();
    }

    public AddProductPage goToAddProductPage(){
        clickElement(productObject);
        return new AddProductPage(driver);
    }


}
