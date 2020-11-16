package com.example.SeleniumAppleProjectPresentation;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateAccountTests extends TestBase {

    //    preconditions: user should be logged out
    @BeforeMethod
    public void ensurePreconditions1() {
        click(By.cssSelector("#ac-gn-bag"));
        if (!isSignInButtonPresent()) {
            logOut();
//            a[class='ac-gn-bagview-nav-link ac-gn-bagview-nav-link-signOut']
//            li[class='ac-gn-bagview-nav-item ac-gn-bagview-nav-item-signOut']
//            a[class='ac-gn-bagview-nav-link ac-gn-bagview-nav-link-signIn']
//            #ac-gn-bag
        }
    }

    @Test
    public void testSignIn() {
        //    click on SignUp button
        click(By.cssSelector("a[class='ac-gn-bagview-nav-link ac-gn-bagview-nav-link-signIn']"));
        Assert.assertTrue(isElementPresent(By.cssSelector("div[class='row rs-signin-main as-l-container']")));

        //    fill registration form
        type(By.cssSelector("input[type='email']"), "knestyapin220178@mail.ru");

        type(By.cssSelector("input[type='password']"), "Pavel22011978");


//    click submit button
        SubmitLogin();
//    check login form displayed



    }


}
