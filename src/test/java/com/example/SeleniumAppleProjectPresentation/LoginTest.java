package com.example.SeleniumAppleProjectPresentation;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {
    @BeforeMethod
    public void ensurePreconditions() {
        app.getHeader().clickOnBagButton();
        if (!app.getUser().isSignInButtonPresent()) {
            app.getUser().logOut();
        }
    }

    @Test
    public void loginRegisteredUserPositiveTest() {

        app.getUser().clickOnSignInButton();
//        Assert.assertTrue(app.getSearch().isElementPresent(app.getUser().isSignInFormOpened()));

        app.getUser().fillSignInForm(new User()
                .setID("knestyapin220178@mail.ru")
                .setPassword("Pavel22011978"));

        app.getUser().SubmitLogin();

    }

}

