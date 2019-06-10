package ZadanieDomowe.Test;

import ZadanieDomowe.Pages.AllertsPage;
import ZadanieDomowe.Pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest_negative extends AbstractTest{

    @Test
    public void failLoginTest() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.fillLoginForm("siatkarz222@gmail.com","test");

        AllertsPage allertsPage = loginPage.failSubmitLoginForm();

        Assert.assertTrue(allertsPage.isWrongDatasAlertDisplayed());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void emptyLoginTest() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.fillLoginForm("","");

        AllertsPage allertsPage = loginPage.failSubmitLoginForm();

        Assert.assertTrue(allertsPage.isEmptyDatasAlertDisplayed());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
