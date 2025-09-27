package com.thetestingacademy.ex_01_Selenium_Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail_click {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.google.com");
        driver.manage().window().maximize();

        WebElement gmail = driver.findElement(By.linkText("Images"));
        gmail.click();
    }
}
