package Day9_JSEScroll_Cookies_Files;

import Utilities.BaseTest;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.awt.*;
import java.awt.event.KeyEvent;

public class C03_RobotClass extends BaseTest {
    @Test
    public void test() throws AWTException, InterruptedException {
        driver.get("https://demo.guru99.com/test/upload/");
        WebElement input=driver.findElement(By.id("uploadfile_0"));
        input.sendKeys("C:\\Users\\mehmet\\IdeaProjects\\CWJunitSelenium\\src\\test\\java\\resources\\robot.txt");
        Robot robot=new Robot();
        robot.keyPress(KeyEvent.VK_CONTROL);//keyPress tusa basılı tutar, ctrl'ye bastık.
        robot.keyPress(KeyEvent.VK_S);//s tuşuna baktık
        Thread.sleep(3000);
        robot.keyRelease(KeyEvent.VK_CONTROL);//keyRelease tusu serbest bırakır
        Thread.sleep(3000);
        robot.keyPress(KeyEvent.VK_ENTER);//enter tusuna bastık
        robot.keyRelease(KeyEvent.VK_ENTER);//enter tusunu bıraktık
        Thread.sleep(3000);

        robot.keyPress(KeyEvent.VK_LEFT);//sol ok
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyPress(KeyEvent.VK_LEFT);
        robot.keyPress(KeyEvent.VK_ENTER);

    }
}
