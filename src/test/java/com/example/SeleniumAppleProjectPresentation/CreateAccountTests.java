package com.example.SeleniumAppleProjectPresentation;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateAccountTests extends TestBase {

    //    preconditions: user should be logged out
    @BeforeMethod
    public void ensurePreconditions() {
        wd.findElement(By.cssSelector("#ac-gn-bag")).click();
        if (!isElementPresent(By.cssSelector("a[class='ac-gn-bagview-nav-link ac-gn-bagview-nav-link-signIn']"))) {
            wd.findElement(By.cssSelector("a[class='ac-gn-bagview-nav-link ac-gn-bagview-nav-link-signOut']")).click();
//            a[class='ac-gn-bagview-nav-link ac-gn-bagview-nav-link-signOut']
//            a[class='ac-gn-bagview-nav-link ac-gn-bagview-nav-link-signIn']
//            #ac-gn-bag
        }
    }

    @Test
    public void testSignIn() {
        //    click on SignUp button
        wd.findElement(By.cssSelector("a[class='ac-gn-bagview-nav-link ac-gn-bagview-nav-link-signIn']")).click();
        Assert.assertTrue(isElementPresent(By.cssSelector("div[class='row rs-signin-main as-l-container']")));
        //    fill registration form
        wd.findElement(By.cssSelector("input[type='email']")).click();
        wd.findElement(By.cssSelector("input[type='email']")).clear();
        wd.findElement(By.cssSelector("input[type='email']")).sendKeys("knestyapin220178@mail.ru");

        wd.findElement(By.cssSelector("input[type='password']")).click();
        wd.findElement(By.cssSelector("input[type='password']")).clear();
        wd.findElement(By.cssSelector("input[type='password']")).sendKeys("Pavel22011978");


//    click submit button
//        #signInButtonId
//    check login form displayed

    }


}
