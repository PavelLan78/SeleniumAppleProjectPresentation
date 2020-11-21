package com.example.SeleniumAppleProjectPresentation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HeaderHelper extends HelperBase {
    public HeaderHelper(WebDriver wd) {
        super(wd);
    }

    public void clickOnBagButton() {
        click(By.cssSelector("#ac-gn-bag"));
    }

    public void clickOnHeaderMenuIPad() {
        click(By.cssSelector("a[class = 'ac-gn-link ac-gn-link-ipad']"));
    }

    public String getTextFromiPad() {
        return wd.findElement(By.cssSelector("a[class = 'ac-gn-link ac-gn-link-ipad']")).getText();
    }
}
