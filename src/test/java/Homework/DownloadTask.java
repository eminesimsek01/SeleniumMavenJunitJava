package Homework;

import Utilities.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.nio.file.Files;
import java.nio.file.Paths;

public class DownloadTask extends BaseTest {
    /*
    // Go to https://the-internet.herokuapp.com/download
    //  Download sample.png file
    //  Then verify if the file downloaded successfully
     */
    @Test
    public void downloadTest(){
        driver.get("https://the-internet.herokuapp.com/download");
        WebElement linkTest=driver.findElement(By.xpath("//a[@href='download/sample.pdf']"));
        linkTest.click();
        String path="C:\\Users\\mehmet\\Downloads\\sample.pdf";
        Assert.assertTrue("Dosya bulunamadı", Files.exists(Paths.get(path)));

    }

}
