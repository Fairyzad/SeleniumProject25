package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DynamicControlIsPage {

    public DynamicControlIsPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }
    //@FindBy(xpath = "//button[.='Remove']
    @FindBy(css = "form#checkbox-example > button")
    public WebElement removeButton;

}
