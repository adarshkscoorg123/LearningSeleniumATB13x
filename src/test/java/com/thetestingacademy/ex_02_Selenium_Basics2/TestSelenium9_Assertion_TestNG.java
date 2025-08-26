package com.thetestingacademy.ex_02_Selenium_Basics2;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.*;

public class TestSelenium9_Assertion_TestNG {

    @Description("Verify that the title is visible")
    @Test
    public void test_Selenium_Assertions(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://talent.capgemini.com/in");
        driver.manage().window().maximize();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(driver.getCurrentUrl());
        //Assert function from TESTNG
        Assert.assertEquals(driver.getCurrentUrl(),"https://talent.capgemini.com/in");
        System.out.println(driver.getTitle());
        Assert.assertEquals(driver.getTitle(),"India Intranet Homepage | Talent Capgemini");

        //AssertJ
        assertThat(driver.getCurrentUrl()).isNotBlank().isNotNull().isEqualTo("https://talent.capgemini.com/in");
        assertThat(driver.getTitle()).isEqualTo("India Intranet Homepage | Talent Capgemini").isNotBlank().isNotNull();
        driver.quit();
    }
}
