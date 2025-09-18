package com.thetestingacademy.ex_09_Actions_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Lab34_Action_Keyboard {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://awesomeqa.com/practice.html");
        driver.manage().window().maximize();

        WebElement firstName = driver.findElement(By.name("firstname"));

        Actions actions = new Actions(driver);

        actions.keyDown(Keys.SHIFT).sendKeys(firstName,"the testing academy")
                .keyUp(Keys.SHIFT).build().perform();
    }
}
