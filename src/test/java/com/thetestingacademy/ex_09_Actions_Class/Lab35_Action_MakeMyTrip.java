package com.thetestingacademy.ex_09_Actions_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class Lab35_Action_MakeMyTrip {

    //span[@data-cy="closeModal"]

    @Test
    public void test_actions_MakeMyTrip() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.makemytrip.com");
        driver.manage().window().maximize();

        // We need to wait for the modal and close it

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@data-cy=\"closeModal\"]")));

        WebElement modal = driver.findElement(By.xpath("//span[@data-cy=\"closeModal\"]"));
        modal.click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        //input[@id="fromCity"]

        WebElement fromCity = driver.findElement(By.xpath("//input[@id=\"fromCity\"]"));
        WebElement toCity = driver.findElement(By.xpath("//input[@id=\"toCity\"]"));
        WebElement modal_2 = driver.findElement(By.xpath("//span[@data-cy=\"travel-card-close\"]"));

        Actions actions = new Actions(driver);
        actions.moveToElement(modal_2).click().build().perform();

        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id=\"fromCity\"]")));

        actions.moveToElement(fromCity).doubleClick().sendKeys("Mumbai").build().perform();

        Thread.sleep(4000);

        //ul[@class="react-autosuggest__suggestions-list"]/li

        List<WebElement> list_auto_complete = driver.findElements(By.xpath("//ul[@class=\"react-autosuggest__suggestions-list\"]/li"));

        for (WebElement e:list_auto_complete){
            if(e.getText().contains("Mumbai")){
                e.click();
            }
        }

//        WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(5));
//        wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id=\"toCity\"]")));

//        actions.moveToElement(toCity).click(toCity).sendKeys("Indore").build().perform();
//
//        List<WebElement> list_auto_complete_2 = driver.findElements(By.xpath("//ul[@class=\"react-autosuggest__suggestions-list\"]/li"));
//
//        try {
//            for (WebElement e1 :list_auto_complete_2){
//                if(e1.getText().contains("Indore")){
//                    e1.click();
//                }
//            }
//        } catch (Exception e1) {
//            throw new RuntimeException(e1);
//        }


    }
}
