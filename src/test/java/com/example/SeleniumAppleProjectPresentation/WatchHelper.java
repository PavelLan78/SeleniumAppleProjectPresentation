package com.example.SeleniumAppleProjectPresentation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WatchHelper extends HelperBase {
    public WatchHelper(WebDriver wd) {
        super(wd);
    }

    public boolean isFindWatchButtonPresent() {
        return isElementPresent(By.cssSelector(".ac-gn-link.ac-gn-link-watch"));
    }

    public boolean isFindWatchButtonPresent2() {
        return isElementPresent2(By.cssSelector(".ac-gn-link.ac-gn-link-watch"));
    }
}
