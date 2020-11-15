package com.example.SeleniumAppleProjectPresentation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class FirstSeleniumTest {
    WebDriver wd;

    @BeforeMethod
    public void setUp() {
//        wd = new FirefoxDriver();
        wd = new ChromeDriver();
        wd.get("https://www.apple.com/");
        wd.manage().window().maximize();
        wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void openAppleTest() {
        System.out.println("site opened!!");

        wd.findElement(By.cssSelector("#ac-gn-link-search")).click();
        wd.findElement(By.cssSelector("#ac-gn-searchform-input")).click();
        wd.findElement(By.cssSelector("#ac-gn-searchform-input")).sendKeys("iPhone SE" + Keys.ENTER);
        String text = wd.findElement(By.cssSelector("div h2[class = 'as-productname as-util-relatedlink'][data-relatedlink = '1']")).getText();
        System.out.println(text);
        Assert.assertEquals(text.toLowerCase(), "iphone se");

    }

    @Test
    public void searchFromNavMenuTest() {
//        click on menu iPad
        wd.findElement(By.cssSelector("a[class = 'ac-gn-link ac-gn-link-ipad']")).click();
        String title = wd.findElement(By.cssSelector("a[class = 'ac-gn-link ac-gn-link-ipad']")).getText();
        System.out.println(title);

    }


    @AfterMethod(enabled = false)
    public void tearDown() {
        wd.quit();
    }

}
