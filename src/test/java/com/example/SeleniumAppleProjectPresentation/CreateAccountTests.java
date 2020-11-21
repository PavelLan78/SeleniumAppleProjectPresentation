package com.example.SeleniumAppleProjectPresentation;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateAccountTests extends TestBase {

    @BeforeMethod
    public void ensurePreconditions1() {
        app.getHeader().clickOnBagButton();
        if (!app.getUser().isSignInButtonPresent()) {
            app.getUser().logOut();
        }
    }

    @Test(enabled = false)
    public void testSignIn() throws InterruptedException {
        app.getUser().clickOnSignInButton();
//        Assert.assertTrue(app.getHeader().isElementPresent(app.getUser().isSignInFormOpened()));

        app.getUser().fillSignInForm(new User().setID("knestyapin220178@mail.ru").setPassword("Pavel22011978"));
        app.getHeader().pause(2000);

        app.getUser().SubmitLogin();

    }
}
