package com.thetestingacademy.ex_02_Selenium_Basics2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSelenium14_Close_Vs_Quit {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.msn.com/en-in");
        driver.manage().window().maximize();
        try {
            Thread.sleep(9000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        //driver.close();
        //Close-will close the current tab only, not the session
        //->session id!=null

        driver.quit();
        //Quit-It will close all the tabs-session id == null

    }
}
