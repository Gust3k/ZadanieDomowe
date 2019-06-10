package ZadanieDomowe.Test;

import ZadanieDomowe.Pages.DashboardPage;
import ZadanieDomowe.Pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest_success extends AbstractTest {

    @Test
    public void successLoginTest() {
        driver.get("https://www.zalando.pl/login");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.fillLoginForm("siatkarz222@gmail.com","qwerty123");

        DashboardPage dashboardPage = loginPage.submitLoginForm();

        Assert.assertTrue(dashboardPage.isContinueShopsButtonDisplayed());
    }
}
