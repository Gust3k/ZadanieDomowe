package ZadanieDomowe.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddAddressPage extends AbstractPage {

    @FindBy(name = "firstname")
    public WebElement nameorcompanyField;

    @FindBy(name = "lastname")
    public WebElement surnameorcompanyField;

    @FindBy(name = "street")
    public WebElement streetField;

    @FindBy(name = "additional")
    public WebElement additionalinformationField;

    @FindBy(name = "zip")
    public WebElement zipcodeField;

    @FindBy(name = "city")
    public WebElement cityField;

    @FindBy(css = "html.z-base-assets-major-5.z-base-assets-minor-0.z-base-assets-patch-3 body div.zVSJZw.Aw6F0J._86ww8z.pzFMFb.Oktjkw.dFnZxw._28jhzu.FdH8Pf.ccsMLn.PbG-b5.ZMy9wr.jKGo1M._9hL0MQ.DVq42V._6oppVd div.q_PMzK._4X1T70._0qBygh.Q4kNLS.ftCR9S.aOkACG.ccsMLn.HbfUFI.Upa9lO._1WpBSZ.EPpKDZ._68fP3V.wVNb8p.ehpaDY.YQxj7G.mq0_51.aNEfgh div.zwNUnC.DVq42V.CLZF8d.NRKMg3 div._3yEC5U.uuWxTj div._3sKnp div._7dJAc.lOulK4._7RunF3.Upa9lO div.qCcn_V div.q_Wd12.ccsMLn.Pv6N9i div.ZQwM1R._0qBygh.cjnarj._0pw7Dx div._1kFMv button.NR6U9O.asbbQN.ccsMLn.f2LeUT.YJjAXl._4Dn_hw.rk5xjV.iRTWcu.WyRDll.Lr35FC.mOWcYW.Pih6jB.SFWSLQ.KyqyyN.bpoNDV.MJ3QEv.qkwPTZ.xAccPt.vMzkQg.Pw2OdI.-JVh7M._5oEc31.m8Hbvv._5yBtwd.P477Zt.DuK5bw.asDLal.ZS769O")
    public WebElement saveButton;

    @FindBy(css = "html.z-base-assets-major-5.z-base-assets-minor-0.z-base-assets-patch-3 body div.zVSJZw.Aw6F0J._86ww8z.pzFMFb.Oktjkw.dFnZxw._28jhzu.FdH8Pf.ccsMLn.PbG-b5.ZMy9wr div.q_PMzK._4X1T70._0qBygh.Q4kNLS.ftCR9S.aOkACG.ccsMLn.HbfUFI.Upa9lO._1WpBSZ.EPpKDZ._68fP3V.wVNb8p.ehpaDY.YQxj7G.mq0_51.aNEfgh div.zwNUnC.DVq42V.CLZF8d.NRKMg3 div._1kFMv button.NR6U9O.asbbQN.ccsMLn.f2LeUT.YJjAXl._4Dn_hw.rk5xjV.iRTWcu.WyRDll.Lr35FC.mOWcYW.Pih6jB.SFWSLQ.KyqyyN.bpoNDV.MJ3QEv.qkwPTZ.xAccPt.vMzkQg.Pw2OdI.-JVh7M._5oEc31.m8Hbvv._5yBtwd.P477Zt.DuK5bw.asDLal.ZS769O span.T7EZ2Y.XQCmZ9.gM8atJ.VcCaWc.O82Ha7.UnzkRv.P6b3OO.febL1w.X3ffeU._53iU3L.KyqyyN.VMeYkv.RC9LjH.V5fnk3")
    public WebElement secondsaveButton;

    @FindBy(css ="html.z-base-assets-major-5.z-base-assets-minor-0.z-base-assets-patch-3 body div div div#z-navicat-header-root header.z-navicat-header div.z-navicat-header_navSectionContainer div div div.z-navicat-header_navContainer div.z-navicat-header_navContent z-grid z-grid-item div.z-navicat-header_wrapper div.z-navicat-header_bottomRow div.z-navicat-header_searchContainer form.z-navicat-header_searchForm input.z-navicat-header_searchInput")
    public WebElement searchFiled;

    @FindBy(css = "html.z-base-assets-major-5.z-base-assets-minor-0.z-base-assets-patch-3 body div div div#z-navicat-header-root header.z-navicat-header div.z-navicat-header_navSectionContainer div div div.z-navicat-header_navContainer div.z-navicat-header_navContent z-grid z-grid-item div.z-navicat-header_wrapper div.z-navicat-header_bottomRow div.z-navicat-header_searchContainer form.z-navicat-header_searchForm span span.z-icon.z-icon-search-semi-bold.z-icon-small.z-icon-black svg.z-icon_svg")
    public WebElement luopIkon;

    public AddAddressPage (WebDriver driver){
        super(driver);
    }

    public AddAddressPage fillAddAddressPage (String nameorCompany, String surnameorcompany, String street, String additionalinformation, String zipcode, String city){
    fillField(nameorcompanyField, nameorCompany);
    fillField(surnameorcompanyField,surnameorcompany);
    fillField(streetField,street);
    fillField(additionalinformationField,additionalinformation);
    fillField(zipcodeField,zipcode);
    fillField(cityField,city);
    return this;
    }

    public AddressPage submitAddAddressPage(){
    clickElement(saveButton);
    clickElement(secondsaveButton);
    return new AddressPage(driver);
    }

    public AddAddressPage fillSearchingPage(String search){
        fillField(searchFiled,search);
        return new AddAddressPage(driver);
    }

    public SearchPage submitSearchPage(){
        clickElement(luopIkon);
        return new SearchPage(driver);
    }

}
