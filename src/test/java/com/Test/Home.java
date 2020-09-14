package com.Test;

import com.ui.Pageobject.Homepage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Home {

    @Test
    public void facebook(){
        //System.setProperty("webdriver.chrome.driver", "./driver/chromedriver");
        System.setProperty("webdriver.chrome.driver","//Users//rashmi.j//Downloads//chromedriver");
        WebDriver driver = new ChromeDriver();
        //driver.manage().window().maximize();
        driver.get("https://www.facebook.com");
    }

   @Test
    public void loginPage(){
        System.setProperty("webdriver.chrome.driver","//Users//rashmi.j//Downloads//chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.linkedin.com");
        Homepage hp = new Homepage(driver);
        hp.emailid().sendKeys("hello");
        hp.password().sendKeys("password");
        hp.submit().click();

    }
}


