package Days7_iFrame;

import Utilities.BaseTest;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class C03_WindowHandles extends BaseTest {
    @Test
    public void windowHandles (){
        //    Go to URL: c
        //    Print the existing windowHandles ids by clicking all the links on the page.
        //    Click on the links that open a new page.
        //    Close other pages other than the home page.
        //    Set the driver back to the main page.
        driver.get(" https://www.toolsqa.com/selenium-webdriver/window-handle-in-selenium/");
        String homePageId=driver.getWindowHandle();
        List<WebElement>links=driver.findElements(By.xpath(""));

    }
}
