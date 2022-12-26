package Homework;

import Utilities.BaseTest;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class IframeTask extends BaseTest {
    /*
    Go to URL: http://demo.guru99.com/test/guru99home/
    Find the number of iframes on the page.
    Link to the fourth iframe (JMeter Made Easy) (https://www.guru99.com/live selenium project.html) click here.
    Exit the iframe and return to the main page.
     */

    @Override
    public void tearDown() {

    }

    @Test
    public void test() {
        driver.get("http://demo.guru99.com/test/guru99home/");

        List<WebElement>iframeler=driver.findElements(By.tagName("iframe"));//iframeler liste atıldı
        System.out.println(iframeler.size());//iframe sayısını bulmak için listin büyüklüğünü aldık

        String homePageId=driver.getWindowHandle();//ana sayfanın id'sini aldık
        driver.switchTo().frame("4");

        driver.switchTo().defaultContent();//İframe'den çıkaran normal moda geri döndük


    }
}
