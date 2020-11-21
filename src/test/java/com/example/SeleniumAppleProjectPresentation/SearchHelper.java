package com.example.SeleniumAppleProjectPresentation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class SearchHelper extends HelperBase{
    public SearchHelper(WebDriver wd) {
        super(wd);
    }

    public String getTextFromFirstPosition() {
        return wd.findElement(By.cssSelector("div h2[class = 'as-productname as-util-relatedlink'][data-relatedlink = '1']")).getText();
    }

    public void sendSearch() {
        wd.findElement(By.cssSelector("#ac-gn-searchform-input")).sendKeys("iPhone SE" + Keys.ENTER);
    }

    public void inputSearchForm() {
        click(By.cssSelector("#ac-gn-searchform-input"));
    }
    public void clickOnSearchPage() {
        click(By.cssSelector("#ac-gn-link-search"));
    }
}
