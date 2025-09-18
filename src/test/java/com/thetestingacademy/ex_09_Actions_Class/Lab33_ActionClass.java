package com.thetestingacademy.ex_09_Actions_Class;

import com.thetestingacademy.Utils.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Lab33_ActionClass extends CommonToAll {

    @Test
    public void test_actions(){

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.spicejet.com/");
        driver.manage().window().maximize();

        WebElement source = driver.findElement(By.xpath("//div[@data-testid=\"to-testID-origin\"]/div/div/input"));

        Actions actions = new Actions(driver);
        // move to element
        //click
        //sendkeys-BLR

        WebElement destination = driver.findElement(By.xpath("//div[@data-testid=\"to-testID-destination\"]/div/div/input"));


        actions.moveToElement(source).click().sendKeys("Ahm").build().perform();
        actions.moveToElement(destination).click().sendKeys("Shirdi").build().perform();

        actions.contextClick(source).build().perform();



    }
}
