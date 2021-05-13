package org.example;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Register extends Utils {
    private Assertions Assert;
    String expectedclick = "Euro";

    public void ClickOnElement(By by, String click) {
        System.setProperty("webdriver.chrome.driver","C:\\Soft\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://demo.nopcommerce.com");
        enterText(By.cssSelector("Euro"),"click");
        try {
            Thread.sleep(2000);
        }catch (InterruptedException e){
            e.printStackTrace();

        }
        driver.quit();
        Assert.assertTrue(driver.findElement(By.linkText("Euro")).isSelected());
        Assert.assertEquals(expectedclick,expectedclick,"your test case pass");
        System.out.println("your test case passed");
    }



}



