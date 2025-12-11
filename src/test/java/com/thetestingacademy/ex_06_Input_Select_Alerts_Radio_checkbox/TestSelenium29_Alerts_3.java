package com.thetestingacademy.ex_06_Input_Select_Alerts_Radio_checkbox;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestSelenium29_Alerts_3 {

    @Test
    public void test_alerts_3(){
        //button[contains(text(),"Click for JS Alert")]
        //button[contains(text(),"Click for JS Confirm")]
        //button[contains(text(),"Click for JS Prompt")]
        //p[@id="result"]

        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        System.out.println(driver.getTitle());
        driver.manage().window().maximize();

        WebElement jsAlertPrompt = driver.findElement(By.xpath("//button[contains(text(),\"Click for JS Prompt\")]"));
        jsAlertPrompt.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));
        wait.until(ExpectedConditions.alertIsPresent());

        Alert alert = driver.switchTo().alert();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        alert.sendKeys("Sairam");
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        alert.accept();

        WebElement text= driver.findElement(By.xpath("//p[@id=\"result\"]"));
        String result = text.getText();
        System.out.println(result);

        Assert.assertEquals(result,"You entered: Sairam");

    }
}
