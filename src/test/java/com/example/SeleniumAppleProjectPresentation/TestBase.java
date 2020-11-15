package com.example.SeleniumAppleProjectPresentation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class TestBase {

    WebDriver wd;

    @BeforeMethod
    public void setUp() {
        wd = new ChromeDriver();
        wd.get("https://www.apple.com/");
        wd.manage().window().maximize();
        wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public boolean isElementPresent(By locator) {
        return wd.findElements(locator).size() > 0;
    }

    public boolean isFindWatchButtonPresent() {
        return isElementPresent(By.cssSelector(".ac-gn-link.ac-gn-link-watch"));
    }

    public boolean isFindWatchButtonPresent2() {
        return isElementPresent2(By.cssSelector(".ac-gn-link.ac-gn-link-watch"));
    }

    public boolean isElementPresent2(By locator) {
        try {
            wd.findElement(locator);
            return true;
        } catch (NoSuchElementException ex) {
            return false;
        }
    }

    @AfterMethod(enabled = false)
    public void tearDown() {
        wd.quit();
    }
}
