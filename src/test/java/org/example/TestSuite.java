package org.example;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestSuite extends BaseTest {
    HomePage homePage = new HomePage();
    Resultpage resultpage =new Resultpage();



    @Test
    public void UsershouldAbleToChangeCurrencySuccesfully() {
        HomePage homePage = new HomePage();
        homePage.UserShouldBeToChangeCurrencySuccessfully();
        resultpage.verifyChangeCurrencySuccessMessage();

    }
    @Test
    public void userShouldBeAbleToCommentOutSuccessfully(){
        homePage.userShouldBeAbleToCommentOutSuccessfully();
        resultpage.verifyChangeCommentOutSuccessMessage();



    }
}