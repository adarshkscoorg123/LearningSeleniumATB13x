package com.thetestingacademy.ex_05_Selenium_Waits;

import com.thetestingacademy.Utils.CommonToAll;
import com.thetestingacademy.ex_07_WaitHelper.WaitHelpers;
import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestSelenium25_waitHelpers extends CommonToAll {

    @Description("Verify Makemytrip opens with modal")
    @Test
    public void testCloseModal(){

        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.makemytrip.com/");
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());

        new WaitHelpers().waitForVisibility(driver,"//span[@data-cy=\"closeModal\"]",5);

        WebElement closeModal = driver.findElement(By.xpath("//span[@data-cy=\"closeModal\"]"));
        closeModal.click();

        closebrowser(driver);

    }


}
