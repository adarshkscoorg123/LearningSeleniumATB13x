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
import org.testng.annotations.Test;

public class TestSelenium21_MiniProject_Katalon extends CommonToAll {

    @Owner("Adarsh")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify with valid email, password, appointment")

    @Test
    public void test_Katalon_login(){
        WebDriver driver = new ChromeDriver();
        openBrowser(driver,"https://katalon-demo-cura.herokuapp.com/");

        WebElement make_appointment_button= driver.findElement(By.xpath("//a[contains(text(),\"Make Appointment\")]"));
        make_appointment_button.click();

        WebElement username_inputbox = driver.findElement(By.xpath("//input[@id=\"txt-username\"]"));
        username_inputbox.sendKeys("John Doe");

        WebElement password_inputbox = driver.findElement(By.xpath("//input[@id=\"txt-password\"]"));
        password_inputbox.sendKeys("ThisIsNotAPassword");


        WebElement login_button = driver.findElement(By.xpath("//button[text()=\"Login\"]"));
        login_button.click();

    }

}
