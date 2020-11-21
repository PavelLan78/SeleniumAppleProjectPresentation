package com.example.SeleniumAppleProjectPresentation;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstSeleniumTest extends TestBase {


    @Test(enabled = true)
    public void openAppleTest() {
        System.out.println("site opened!!");

        app.getSearch().clickOnSearchPage();
        app.getSearch().inputSearchForm();
        app.getSearch().sendSearch();
        String text = app.getSearch().getTextFromFirstPosition();
        System.out.println(text);
        Assert.assertEquals(text.toLowerCase(), "iphone se");

    }

    @Test
    public void searchFromNavMenuTest()  {
//        click on menu iPad

        app.getHeader().clickOnHeaderMenuIPad();
        String title = app.getHeader().getTextFromiPad();
        System.out.println(title);

    }
}



