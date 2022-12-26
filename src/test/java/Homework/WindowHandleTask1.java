package Homework;

import Utilities.BaseTest;
import org.junit.Test;
import org.openqa.selenium.By;

public class WindowHandleTask1 extends BaseTest {
            /*
            Go to URL: https://testproject.io/
            Selenium’s 4 newWindow() method to open a new Window for TestProject’s Blog page.
            https://blog.testproject.io/
            */

    @Override
    public void tearDown() {
    }
    @Test
    public void WindowHandleTask() {
        driver.get("https://testproject.io/");
        String homePageId=driver.getWindowHandle();//An sayfanın id'sini aldık
        driver.findElement(By.linkText("Blog")).click();
        driver.switchTo().window(homePageId);

    }
}
