package com.ui.Pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {

    WebDriver driver;


    public Homepage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    //Following page object model for inspecting elements
    /*
    By username = By.xpath("//input[@id='session_key']");
    By password = By.xpath("//input[@id='session_password']");
    By submit = By.xpath("//button[@type='submit']");
     */

    //Following page object Factory for inspecting elements

    @FindBy(xpath ="//input[@id='session_key']")
    WebElement username;

    @FindBy(xpath ="//input[@id='session_password']")
    WebElement password;

    @FindBy(xpath ="//button[@type='submit']")
    WebElement submit;



    //Methods when we use Page object model
    /*public WebElement emailid()
    {
        return driver.findElement(username);

    }

    public WebElement password()
    {
        return driver.findElement(password);

    }

    public WebElement submit()
    {
        return driver.findElement(submit);

    }*/


    //Methods when we use page object factory
    public WebElement emailid()
    {
        return username;

    }

    public WebElement password()
    {
        return password;

    }

    public WebElement submit()
    {
        return submit;

    }


}
