package ZadanieDomowe.Test;

import ZadanieDomowe.Pages.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ActionOnDashboardTest extends AbstractTest {

    @Test(priority = 1)
    public void successAddAddressTest(){
        driver.get("https://www.zalando.pl/myaccount/addresses");
        DashboardPage dashboardPage = new DashboardPage(driver);
        AddressPage addressPage =dashboardPage.goToAddressPage();

        AddAddressPage addAddressPage =addressPage.goToAddAddressPage();

        addAddressPage = addAddressPage.fillAddAddressPage("Test", "Kowalski","Opolska 12","123",
                "11-111","Kraków");

        addressPage =addAddressPage.submitAddAddressPage();

        Assert.assertTrue(addressPage.isInfoBoxDisplayed());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test(priority = 2)
    public void successSearchTextTest(){
        AddAddressPage addAddressPage = new AddAddressPage(driver);
        addAddressPage.fillSearchingPage("adidas obuwie");

        SearchPage searchPage = addAddressPage.submitSearchPage();

        Assert.assertTrue(searchPage.isinfoTextDisplayed());
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test(priority = 3)
    public void successAddProductTest(){
        driver.get("https://www.zalando.pl/mezczyzni/?q=adidas+obuwie");
        SearchPage searchPage = new SearchPage(driver);
        AddProductPage addProductPage = searchPage.goToAddProductPage();
        addProductPage.submitChecker();
        FinalPage finalPage = addProductPage.goToFinalPage();

        Assert.assertTrue(finalPage.isfinalcheckerDisplayed());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
