package ZadanieDomowe.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ForgotPasswordPage extends AbstractPage {

    @FindBy(xpath = "//html/body/div[4]/div[2]/div/div/z-grid/z-grid-item/z-grid/z-grid-item[1]/div[2]/div/div/z-grid/z-grid-item/div/z-grid/z-grid-item[2]/div/div/label/div/input")
    public WebElement rememberField;

    @FindBy(xpath = "//html/body/div[4]/div[2]/div/div/z-grid/z-grid-item/z-grid/z-grid-item[1]/div[2]/div/div/div[1]/span[2]")
    public WebElement confirmAlert;

    public ForgotPasswordPage (WebDriver driver) {
        super(driver);
    }


    public ForgotPasswordPage fillLoginForm(String email){
        fillField(rememberField,email);
        return this;
    }

    public boolean isConfirmAlertDisplayed(){
        return  confirmAlert.isDisplayed();
    }

}
