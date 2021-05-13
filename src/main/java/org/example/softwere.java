package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class softwere {
    protected static WebDriver driver;

    @BeforeMethod
    public void OpenBrowser() {
        System.setProperty("webdriver.chrome.driver", "C:\\Soft\\chromedriver_win32 (1)\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com");

    }
    @Test
    public void verifyAddToCartButtonShouldBeAbleToSuccessfully(){
        WebElement addToCartButtonList =  driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div[1]/div/div[2]/h2/a"));
        int number = addToCartButtonList.getSize().getHeight();
        System.out.println(" addToCartButtonList= "+number);

    }
    @AfterMethod
    public void CloseBrowser(){
        driver.quit();
    }
}
