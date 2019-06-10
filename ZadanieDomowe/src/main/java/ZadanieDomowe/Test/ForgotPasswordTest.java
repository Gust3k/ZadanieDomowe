package ZadanieDomowe.Test;


import ZadanieDomowe.Pages.ForgotPasswordPage;
import ZadanieDomowe.Pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ForgotPasswordTest extends AbstractTest {

    @Test
    public void ChangesPassword (){
        LoginPage loginPage = new LoginPage(driver);
        ForgotPasswordPage forgotPasswordPage = loginPage.submitRemindForm();
        forgotPasswordPage.fillLoginForm("siatkarz222@gmail.com");

        Assert.assertTrue(forgotPasswordPage.isConfirmAlertDisplayed());
    }
}
