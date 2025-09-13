package com.thetestingacademy.ex_06_Input_Select_Alerts_Radio_checkbox;

import com.thetestingacademy.Utils.CommonToAll;
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

public class TestSelenium28_Alerts_2 extends CommonToAll {

    @Test

    public void test_alerts_2() throws InterruptedException {

        //button[contains(text(),"Click for JS Alert")]
        //button[contains(text(),"Click for JS Confirm")]
        //button[contains(text(),"Click for JS Prompt")]
        //p[@id="result"]

        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        System.out.println(driver.getTitle());
        driver.manage().window().maximize();

        WebElement jsAlertConfirm = driver.findElement(By.xpath("//button[contains(text(),\"Click for JS Confirm\")]"));
        jsAlertConfirm.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));
        wait.until(ExpectedConditions.alertIsPresent());

        Alert alert = driver.switchTo().alert();
        Thread.sleep(2000);
        //alert.accept();
        alert.dismiss();
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebElement text= driver.findElement(By.xpath("//p[@id=\"result\"]"));
        String result = text.getText();
        System.out.println(result);

        //Assert.assertEquals(result,"You clicked: Ok");
        Assert.assertEquals(result,"You clicked: Cancel");

    }
}
