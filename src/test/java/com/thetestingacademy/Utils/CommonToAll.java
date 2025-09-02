package com.thetestingacademy.Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CommonToAll {

    public WebDriver driver;

    public void openBrowser(WebDriver driver, String url){
        driver.get(url);
        driver.manage().window().maximize();
    }

    public void closebrowser(WebDriver driver){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
    }

    //WebElement anchorTag_fullLinktext_match= driver.findElement(By.linkText("Start a free trial"));

    public WebElement findElementByLinkText(WebDriver driver, String text){
       return driver.findElement(By.linkText(text));
    }

}
