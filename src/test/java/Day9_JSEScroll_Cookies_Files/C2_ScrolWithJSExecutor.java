package Day9_JSEScroll_Cookies_Files;

import Utilities.BaseTest;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class C2_ScrolWithJSExecutor extends BaseTest {
    /*
    go to url : https://api.jquery.com/dblclick/
    double click on the blue square at the bottom of the page and then write the changed color.
     */

    @Test
    public void doubleclickMethod() {
        driver.get("https://api.jquery.com/dblclick/");
        driver.switchTo().frame(0);

        WebElement bluBox=driver.findElement(By.xpath("//span[text()='Double click the block']"));
        JavascriptExecutor jse=(JavascriptExecutor)driver;
        System.out.println("colour before"+bluBox.getCssValue("background-color"));
        jse.executeScript("arguments[0].scrollIntoView();",bluBox);
        bluBox.getCssValue("background-color");
        Actions act=new Actions(driver);
        act.doubleClick(bluBox).perform();
        System.out.println("colour after"+bluBox.getCssValue("background-color"));


    }
}
