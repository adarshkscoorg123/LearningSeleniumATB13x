package com.thetestingacademy.ex_01_Selenium_Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail_text {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.manage().window().maximize();

        WebElement gmail_element = driver.findElement(By.xpath("//a[contains(text(),\"Gmail\")]"));
        String gmail_text = gmail_element.getText();
        System.out.println(gmail_text);
    }
}
