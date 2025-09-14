package com.thetestingacademy.ex_08_SVG_Elements;

import com.thetestingacademy.Utils.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class Lab32_SVG_Maps extends CommonToAll {

    @Test
    public void test_India_map_SVG() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amcharts.com/svg-maps/?map=india");
        driver.manage().window().maximize();

        Thread.sleep(4000);

        List<WebElement> states= driver.findElements(By.xpath("//*[name()='svg']/*[name()='g'][7]/*[name()='g']/*[name()='g']/*[name()='path']"));
        for (WebElement state: states){
            System.out.println(state.getDomAttribute("aria-label"));
            if (state.getDomAttribute("aria-label").contains("Mizoram")){
                state.click();
            }
        }
        closebrowser(driver);
    }


    //*[name()='svg']/*[name()='g'][7]/*[name()='g']/*[name()='g']/*[name()='path']
}
