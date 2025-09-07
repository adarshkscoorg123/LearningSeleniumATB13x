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
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class TestSelenium22_MiniProject_Katalon_2 extends CommonToAll {

    @Owner("Adarsh")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify with valid email, password, appointment")

    @Test
    public void test_Katalon_login(){
        WebDriver driver = new ChromeDriver();
        openBrowser(driver,"https://katalon-demo-cura.herokuapp.com/");

        WebElement make_appointment_button= driver.findElement(By.xpath("//a[contains(text(),\"Make Appointment\")]"));
        make_appointment_button.click();

        List<WebElement> username_inputbox = driver.findElements(By.xpath("//input[@placeholder=\"Username\"]"));
        username_inputbox.get(1).sendKeys("John Doe");

        List<WebElement> password_inputbox = driver.findElements(By.xpath("//input[@placeholder=\"Password\"]"));
        password_inputbox.get(1).sendKeys("ThisIsNotAPassword");


        WebElement login_button = driver.findElement(By.xpath("//button[text()=\"Login\"]"));
        login_button.click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }

}
