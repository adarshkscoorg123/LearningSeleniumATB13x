package com.thetestingacademy.ex_12_JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lab_42_ShadowDom_JS {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://selectorshub.com/xpath-practice-page");
        driver.manage().window().maximize();

        Thread.sleep(4000);

        //document.querySelector("div#userName").shadowRoot.querySelector("div#app2").shadowRoot.querySelector("#pizza")
        //document.querySelector("div#userName").shadowRoot.querySelector("div#concepts").shadowRoot.querySelector("#training")

        //driver.findElement(By.id("pizza")).sendKeys("farmhouse");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement inputboxPizza = (WebElement) js.executeScript("return document.querySelector(\"div#userName\").shadowRoot.querySelector(\"div#app2\").shadowRoot.querySelector(\"#pizza\")");
        WebElement userName = (WebElement) js.executeScript("return document.querySelector(\"div#userName\").shadowRoot.querySelector(\"input#kils\")");

        inputboxPizza.sendKeys("Dominoz_Mushroom");
        userName.sendKeys("Adarsh");


    }

}
