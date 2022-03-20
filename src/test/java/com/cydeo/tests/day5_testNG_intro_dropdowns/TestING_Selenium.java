package com.cydeo.tests.day5_testNG_intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class TestING_Selenium {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
        //Do browser driver setup
        //Open browser
       driver= WebDriverFactory.getDriver("chrome");
        //Maximize the page
        driver.manage().window().maximize();

        //Impilicit wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterMethod
    public void tearDownMethod(){
        driver.close();
    }



    public void selenium_test(){

        //Get"https://google.com
        driver.get("https://google.com");

        //Assert:title is "Google"

        String actualTitile = driver.getTitle();
        String expectedTitle ="Google";

        Assert.assertEquals(actualTitile,expectedTitle,"Title is not matching here.");

    }
}
