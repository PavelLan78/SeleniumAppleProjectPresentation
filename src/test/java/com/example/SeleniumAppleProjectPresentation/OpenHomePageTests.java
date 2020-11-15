package com.example.SeleniumAppleProjectPresentation;

import org.testng.annotations.Test;

public class OpenHomePageTests extends TestBase{

    @Test
    public void homePageTest() {
        System.out.println("site opened!!");
        System.out.println("WatchButton: " + isFindWatchButtonPresent());

    }


}
