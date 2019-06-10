package ZadanieDomowe.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddProductPage extends AbstractPage {

    @FindBy(xpath = "//html/body/div[4]/div/x-fragment-pdp/div/div/div/div/div/div/div/div[2]/div[4]/div/div[2]")
    public WebElement addProductButton;

    @FindBy(xpath="//html/body/div[6]/div/div[2]/div[2]/div/div[2]/div[15]/div/div/div[2]/h5")
    public WebElement sizeButton;

    @FindBy(xpath = "//span[@class = \"z-text z-navicat-header_navToolLabelName z-text-cta z-text-black\" and text() = \"Koszyk\"]")
    public WebElement basketIcon;

    public AddProductPage (WebDriver driver){
        super(driver);
    }

    public AddProductPage submitChecker(){
        clickElement(addProductButton);
        clickElement(sizeButton);
        return  this;
    }

    public FinalPage goToFinalPage(){
        clickElement(basketIcon);
        return new FinalPage(driver);
    }
}
