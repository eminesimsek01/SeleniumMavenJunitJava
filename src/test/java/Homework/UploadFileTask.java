package Homework;

import Utilities.BaseTest;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class UploadFileTask extends BaseTest {
    /*
    Go to URL: https://www.monsterindia.com/seeker/registration
    Upload file.
     */

    @Override
    public void tearDown() {
    }

    @Test
    public void test() {
        driver.get("https://www.monsterindia.com/seeker/registration");
        WebElement uploadfile=driver.findElement(By.id("file-upload"));
        uploadfile.sendKeys("C:\\Users\\mehmet\\Desktop\\Robot.txt");
        WebElement filename=driver.findElement(By.className("message-box"));
        System.out.println(filename.getText());
    }
}
