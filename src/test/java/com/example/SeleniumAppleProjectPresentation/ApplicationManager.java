package com.example.SeleniumAppleProjectPresentation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ApplicationManager{
    WebDriver wd;

    UserHelper user;
    iPadAirHelper iPadAir;
    WatchHelper watch;
    HeaderHelper header;
    SearchHelper search;

    public void init() {
        wd = new ChromeDriver();
        wd.get("https://www.apple.com/");
        wd.manage().window().maximize();
        wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        user = new UserHelper(wd);
        iPadAir = new iPadAirHelper(wd);
        watch = new WatchHelper(wd);
        header = new HeaderHelper(wd);
        search = new SearchHelper(wd);
    }

    public void stop() {
        wd.quit();
    }

    public iPadAirHelper getiPadAir() {
        return iPadAir;
    }

    public UserHelper getUser() {
        return user;
    }

    public WatchHelper getWatch() {
        return watch;
    }

    public HeaderHelper getHeader() {
        return header;
    }

    public SearchHelper getSearch() {
        return search;
    }
}
