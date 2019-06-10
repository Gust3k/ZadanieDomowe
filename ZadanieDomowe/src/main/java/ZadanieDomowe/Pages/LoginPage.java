package ZadanieDomowe.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends AbstractPage {

    @FindBy(xpath = "//html/body/div[4]/div[2]/div/div/z-grid/z-grid-item/z-grid/z-grid-item[1]/div[2]/div/div/div/div/form/z-grid/z-grid-item[1]/div/div/label/div/input")
    public WebElement emailField;

    @FindBy(xpath = "//html/body/div[4]/div[2]/div/div/z-grid/z-grid-item/z-grid/z-grid-item[1]/div[2]/div/div/div/div/form/z-grid/z-grid-item[2]/div/div/div/label/div[2]/label/div/input")
    public WebElement passwordField;

    @FindBy(xpath = "//html/body/div[4]/div[2]/div/div/z-grid/z-grid-item/z-grid/z-grid-item[1]/div[2]/div/div/div/div/form/z-grid/z-grid-item[3]/button/div")
    public WebElement loginButton;

    @FindBy(xpath = "//html/body/div[4]/div[2]/div/div/z-grid/z-grid-item/z-grid/z-grid-item[1]/div[2]/div/div/div/div/div/span[2]/span")
    public WebElement forgotPasswordButton;


    public LoginPage(WebDriver driver){
        super(driver);
    }

    public LoginPage fillLoginForm( String email, String password) {
        fillField(emailField,email);
        fillField(passwordField,password);
        return this;
    }

    public DashboardPage submitLoginForm() {
        clickElement(loginButton);
        return new DashboardPage(driver);
    }

    public AllertsPage failSubmitLoginForm(){
        clickElement(loginButton);
        return  new AllertsPage(driver);
    }

    public ForgotPasswordPage submitRemindForm(){
        clickElement(forgotPasswordButton);
        return new ForgotPasswordPage(driver);
    }
}
