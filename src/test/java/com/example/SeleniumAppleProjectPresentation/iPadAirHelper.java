package com.example.SeleniumAppleProjectPresentation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class iPadAirHelper extends HelperBase {

    public iPadAirHelper(WebDriver wd) {
        super(wd);
    }

    public void clickOniPadAir() {
        click(By.cssSelector("a[data-analytics-title='ipad air']"));
    }

    public void clickBuyiPadAir() {
        click(By.cssSelector("a[data-analytics-title='buy']"));
    }



    public void filliPadAirForm(By locatorColor, By locatorStorage, By locatorConnectivy, By locatorEngraving) throws InterruptedException {
        click(locatorColor);
        pause(3000);
        click(locatorStorage);
        pause(3000);
        click(locatorConnectivy);
        pause(3000);
        click(locatorEngraving);
        pause(3000);

    }

    public void clickAdToBag() {
        click(By.cssSelector("span.add-to-cart "));
    }


}
