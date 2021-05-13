package org.example;

import org.openqa.selenium.By;

public class HomePage extends Utils {

    public void UserShouldBeToChangeCurrencySuccessfully(){
        ClickOnElement(By.cssSelector("Euro"));
    }

    public void userShouldBeAbleToSearchSuccessfully(){
        ClickOnElement(By.linkText("Nike"));

    }
    public void verifyAddToCartButtonShouldBeAbleToSuccessfully(){
        ClickOnElement(By.xpath("/html/body/div[6]/div[3]/div/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div[1]/div/div[2]/h2/a"));

    }
    public void userShouldBeAbleToCommentOutSuccessfully(){
        ClickOnElement(By.id("Title"));
        ClickOnElement(By.id("Comment"));

    }
}

