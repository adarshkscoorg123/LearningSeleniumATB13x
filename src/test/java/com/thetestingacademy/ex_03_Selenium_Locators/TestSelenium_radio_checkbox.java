package com.thetestingacademy.ex_03_Selenium_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestSelenium_radio_checkbox {

    @Test
    public void test_radio_checkbox(){

        WebDriver driver= new ChromeDriver();
        driver.get("https://awesomeqa.com/practice.html");
        driver.manage().window().maximize();

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebElement firstName= driver.findElement(By.xpath("//input[@name=\"firstname\"]"));
        firstName.sendKeys("Adarsh");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebElement lastName = driver.findElement(By.xpath("//input[@name=\"lastname\"]"));
        lastName.sendKeys("Suresh");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebElement female1 = driver.findElement(By.xpath("//input[@id=\"sex-1\"]"));
        female1.click();

        WebElement profession = driver.findElement(By.xpath("//input[@id=\"profession-1\"]"));
        profession.click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.quit();
        
    }
}
