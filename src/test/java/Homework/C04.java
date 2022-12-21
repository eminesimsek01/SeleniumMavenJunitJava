package Homework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04 {
    WebDriver driver;

    @Before
    public void setUp(){

        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().window().maximize();

    }
    @After
    public void tearDowvn(){

        driver.quit();

    }
    @Test
    public void demogatest() throws InterruptedException {
        driver.get("https://demoqa.com/radio-button");
        Thread.sleep(2000);
        WebElement yesButton = driver.findElement(By.xpath("//div[@class='custom-control custom-radio custom-control-inline'][1]"));
        yesButton.click();



        WebElement yesButtonText = driver.findElement(By.xpath("//p[@class='mt-3']"));
        System.out.println(yesButtonText.getText());

        WebElement impressiveButton = driver.findElement(By.xpath("//div[@class='custom-control custom-radio custom-control-inline'][2]"));
        impressiveButton.click();



        WebElement impressiveButtonText = driver.findElement(By.xpath("//p[@class='mt-3']"));
        System.out.println(impressiveButtonText.getText());

        WebElement noButton = driver.findElement(By.xpath("//input[@id='noRadio']"));
        Assert.assertFalse("NoButton is not selected", noButton.isSelected());

    }
}
