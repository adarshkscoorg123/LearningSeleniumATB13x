package com.thetestingacademy.ex_06_Input_Select_Alerts_Radio_checkbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestSelenium30_Modals {

    @Test
    public void test_Modals() {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.makemytrip.com/");
        System.out.println(driver.getTitle());
        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(4));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@data-cy=\"closeModal\"]")));

        WebElement element = driver.findElement(By.xpath("//span[@data-cy=\"closeModal\"]"));
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        element.click();


    }
}
