package com.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Sample {

    @Test
    public void facebook(){
        //System.setProperty("webdriver.chrome.driver", "./driver/chromedriver");
        System.setProperty("webdriver.chrome.driver","//Users//rashmi.j//Downloads//chromedriver");
        WebDriver driver = new ChromeDriver();
        //driver.manage().window().maximize();
        driver.get("https://www.facebook.com");
    }
}


