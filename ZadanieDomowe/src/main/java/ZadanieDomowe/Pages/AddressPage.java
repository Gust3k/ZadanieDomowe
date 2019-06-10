package ZadanieDomowe.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddressPage extends AbstractPage {

    @FindBy(xpath = "//html/body/div[4]/z-grid/z-grid-item[2]/div[2]/div/div/div/div[1]/button")
    public WebElement addAddressButton;

    @FindBy(css = "html.z-base-assets-major-5.z-base-assets-minor-0.z-base-assets-patch-3 body div#z-notifications-root.Up4Wpe.Aw6F0J.NVmMx8.UiWSAj.IIhb4G.RTqc9n._9oMk5I.iOipwn._2nhiXG.lLkH24.Q5iccO.Oktjkw.dFnZxw.pzFMFb.FdH8Pf div.uIXnt2.t-7idd.ccsMLn.nqLuO6._0Pob50.gdx2fq._4Dn_hw.j0vE-P.febL1w.e7YYnu.yIjBuv.ecSeEq.MJ3QEv.i3TFO-.mL4AAF.lYCNXx")
    public WebElement infoBox;

    public AddressPage (WebDriver driver) {
        super(driver);
    }

    public AddAddressPage goToAddAddressPage(){
        clickElement(addAddressButton);
        return new AddAddressPage(driver);
    }

    public boolean isInfoBoxDisplayed(){
        return infoBox.isDisplayed();
    }
}

