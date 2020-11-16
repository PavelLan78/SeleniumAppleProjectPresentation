package com.example.SeleniumAppleProjectPresentation;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {
    @BeforeMethod
    public void ensurePreconditions() {
        click(By.cssSelector("#ac-gn-bag"));
        if (!isSignInButtonPresent()) {
            logOut();
        }
    }

    @Test
    public void loginRegisteredUserPositiveTest() {
//        go to login page

        click(By.cssSelector("a[class='ac-gn-bagview-nav-link ac-gn-bagview-nav-link-signIn']"));
        Assert.assertTrue(isElementPresent(By.cssSelector("div[class='row rs-signin-main as-l-container']")));

//        fill login form

        type(By.cssSelector("input[type='email']"), "knestyapin220178@mail.ru");
        type(By.cssSelector("input[type='password']"), "Pavel22011978");

//        submit login
        SubmitLogin();


//        userLoggedIn
//        click(By.cssSelector("#ac-gn-bag"));
//        boolean elementPresent = isElementPresent(By.cssSelector("a[data-analytics-activitymap-link-id='signOut']"));
//        boolean elementPresent = isElementPresent(By.cssSelector("a[class='ac-gn-bagview-nav-link ac-gn-bagview-nav-link-signOut']"));
//        System.out.println(elementPresent);
//        Assert.assertTrue(isElementPresent(By.cssSelector("a[class='ac-gn-bagview-nav-link ac-gn-bagview-nav-link-signOut']")));


    }

}

