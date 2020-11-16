package com.example.SeleniumAppleProjectPresentation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class TestBase {

    static WebDriver wd;

    @BeforeSuite
    public void setUp() {
        wd = new ChromeDriver();
        wd.get("https://www.apple.com/");
        wd.manage().window().maximize();
        wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterSuite(enabled = false)
    public void tearDown() {
        wd.quit();
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



    public boolean isLoginFormPresent() {
        return isElementPresent(By.cssSelector(""));
    }

    public void type(By locator, String text) {
        click(locator);
        wd.findElement(locator).clear();
        wd.findElement(locator).sendKeys(text);
    }

    public void click(By locator) {
        wd.findElement(locator).click();

    }

    public boolean isSignInButtonPresent() {
        return isElementPresent(By.cssSelector("a[class='ac-gn-bagview-nav-link ac-gn-bagview-nav-link-signIn']"));
    }

    public void logOut() {
        click(By.cssSelector("a.ac-gn-bagview-nav-link.ac-gn-bagview-nav-link-signOut"));
    }

    public void SubmitLogin() {
        new WebDriverWait(wd,10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#signInButtonId"))).click();
//        click(By.cssSelector("#signInButtonId"));
    }
}
