package com.cydeo.tests.day11_actions_jsexcutor_pratice;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class T1_DragAndDrop {

    @Test
    public void dragAndDrop_test(){
//        1. Go to https://demos.telerik.com/kendo-ui/dragdrop/index
        Driver.getDriver().get("https://demos.telerik.com/kendo-ui/dragdrop/index ");

        //Locate "Accept Cookies"button and click
        WebElement acceptCookieButton =Driver.getDriver().findElement(By.id("onetrust-accept-btn-handler"));
        acceptCookieButton.click();

//       Locate small and big circles to be able to drag them around
        WebElement smallCircle=Driver.getDriver().findElement(By.id("draggable"));
        WebElement bigCircle=Driver.getDriver().findElement(By.id("droptarget"));

 //       2. Drag and drop the small circle to bigger circle.
        Actions actions=new Actions(Driver.getDriver());
        actions.dragAndDrop(smallCircle,bigCircle).perform();

//        3. Assert:
//        -Text in big circle changed to: “You did great!”
    }
}
