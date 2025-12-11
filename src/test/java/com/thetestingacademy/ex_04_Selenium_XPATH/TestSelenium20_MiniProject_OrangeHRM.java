package com.thetestingacademy.ex_04_Selenium_XPATH;

import com.thetestingacademy.Utils.CommonToAll;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestSelenium20_MiniProject_OrangeHRM extends CommonToAll{

    @Owner("Adarsh")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify login is working")
    @Test
    public void test_OHRM_Login() throws InterruptedException {
        //Orange HRM-https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
        //x-path- //input[@name="username"]
        //x-path- //input[@name="password"]
        //x=path- //button[normalize-space()="Login"]

        WebDriver driver = new ChromeDriver();
        openBrowser(driver,"https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebElement input_username = driver.findElement(By.xpath("//input[@name=\"username\"]"));
        WebElement input_password = driver.findElement(By.xpath("//input[@name=\"password\"]"));
        WebElement button = driver.findElement(By.xpath("//button[normalize-space()=\"Login\"]"));

        input_username.sendKeys("Admin");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        input_password.sendKeys("admin123");
        button.click();

        //Thread.sleep(4000);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h6[text()=\"Dashboard\"]")));

        //h6[text()="PIM"]

        WebElement h6 = driver.findElement(By.xpath("//h6[text()=\"Dashboard\"]"));
        Assert.assertEquals(h6.getText(),"Dashboard");

        closebrowser(driver);

        //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));
        //Two things in Explicit Wait
        //1. First max time duration-ex:4 seconds-Duration.ofSeconds(4)
        //2. Condition ? ExpectedConditions.
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h6[text()=\"Dashboard\"]")));

    }

}
