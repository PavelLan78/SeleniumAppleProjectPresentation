package com.example.SeleniumAppleProjectPresentation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UserHelper extends HelperBase {
    public UserHelper(WebDriver wd) {
        super(wd);
    }

    public boolean isLoginFormPresent() {
        return isElementPresent(By.cssSelector(""));
    }

    public boolean isSignInButtonPresent() {
        return isElementPresent(By.cssSelector("a[class='ac-gn-bagview-nav-link ac-gn-bagview-nav-link-signIn']"));
    }

    public void logOut() {
        click(By.cssSelector("a.ac-gn-bagview-nav-link.ac-gn-bagview-nav-link-signOut"));
    }

    public void SubmitLogin() {
        new WebDriverWait(wd,10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#signInButtonId"))).click();
    }

    public void clickOnSignInButton() {
        click(By.cssSelector("a[class='ac-gn-bagview-nav-link ac-gn-bagview-nav-link-signIn']"));
    }

    public void fillSignInForm(User user) {
        type(By.cssSelector("input[type='email']"), user.getID());
        type(By.cssSelector("input[type='password']"), user.getPassword());
    }


}
