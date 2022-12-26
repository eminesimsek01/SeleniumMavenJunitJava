package Homework;

import Utilities.BaseTest;
import org.junit.Test;
import org.openqa.selenium.interactions.Actions;

public class C06_Task extends BaseTest {
    /*
    1- https://html.com/tags/iframe/ sayfasına gidelim.
    2- Video'yu görecek kadar aşağı inin.
    3- Videoyu izlemek için Play tuşuna basın.
    4- Videoyu çalıştırdığınızı test edin.
    */

    @Test
    public void test() {
        driver.get("https://html.com/tags/iframe/");
        Actions action=new Actions(driver);
    }
}
