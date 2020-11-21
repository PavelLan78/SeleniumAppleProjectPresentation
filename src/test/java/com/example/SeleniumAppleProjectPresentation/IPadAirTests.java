package com.example.SeleniumAppleProjectPresentation;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class IPadAirTests extends TestBase {
    @Test
    public void addIpadAirToBagTest(By locatorColorSkyBlue) throws InterruptedException {
        app.getHeader().clickOnHeaderMenuIPad();
        app.getiPadAir().clickOniPadAir();
        app.getiPadAir().clickBuyiPadAir();
        app.getiPadAir().filliPadAirForm(locatorColorSkyBlue, locatorStorage64Gb,locatorConnectivityWiFiButton, locatorNoEngravingButton );
        app.getiPadAir().clickAdToBag();

    }
    By locatorColorSkyBlue = By.cssSelector("#Item1skyblue_label");
    By locatorStorage64Gb = By.cssSelector("#Item264gb_label");
    By locatorAdToBagButton = By.cssSelector("span.add-to-cart ");
    By locatorNoEngravingButton = By.cssSelector("#noengraving-title");
    By locatorAddEngravingButton = By.cssSelector("#engraving_tile_open");
    By locatorConnectivityWiFiCellButton = By.cssSelector("input[value='wificell']");
    By locatorConnectivityWiFiButton = By.cssSelector("#Item3wifi_label");
    By locatorStorage256GbButton = By.cssSelector("input[value='256gb']");
    By locatorStorage64GbButton = By.cssSelector("input[value='64gb']");
    By locatorColorSkyBlueButton = By.cssSelector("#Item1skyblue_label");
    By locatorColorGreenButton = By.cssSelector("#Item1green_label");
    By locatorColorRoseGoldButton = By.cssSelector("#Item1rosegold_label");
    By locatorColorSilverButton = By.cssSelector("#Item1silver_label");
    By locatorColorSpaceGrayButton = By.cssSelector("#Item1space_gray_label");



}
