package Homework;

import Utilities.BaseTest;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Iterator;
import java.util.Set;

public class WindowHandlesTask2 extends BaseTest {
    /*
    Go to URL: https://demoqa.com/browser-windows
    Click on the windows - "WindowButton"
    Click on all the child windows.
    Print the text present on all the child windows in the console.
    Print the heading of the parent window in the console.
     */

    @Override
    public void tearDown() {

    }

    @Test
    public void test() {
        driver.get("https://demoqa.com/browser-windows");
        String homePageId=driver.getWindowHandle();
        WebElement windowTabButton=driver.findElement(By.xpath("//button[@id='tabButton']"));
        windowTabButton.click();
        WebElement windowButton=driver.findElement(By.xpath("//button[@class='mt-4 btn btn-primary']"));
        windowButton.click();
        WebElement messageWindowButton=driver.findElement(By.id("messageWindowButton"));
        messageWindowButton.click();
        Set<String> windows=driver.getWindowHandles();
        System.out.println(windows.size());
        Iterator <String> iterator=windows.iterator();
        while(iterator.hasNext()){
            driver.switchTo().window(iterator.next());
            if(driver.getWindowHandle().equals(homePageId)){
                continue;
            } else driver.close();
        }
    }
}
