package Homework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_LocatorsHomework
{
    //Navigate to https://testpages.herokuapp.com/styled/index.html
    // Click on Calculate under Micro Apps.
    // Type any number in the first input.
    // Type any number in the second input.
    // Click on Calculate.
    // Get the result.
    // Print the result.
    WebDriver driver;
    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
    }
    @Test
    public void calculatingTest (){
        driver.navigate().to("https://testpages.herokuapp.com/styled/index.html");
        driver.findElement(By.xpath("//a[@id='calculatetest']")).click();
        WebElement firstnumber=driver.findElement(By.xpath("//input[@id='number1']"));
        firstnumber.sendKeys("45");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebElement secondnumber=driver.findElement(By.xpath("//input[@id='number2']"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        secondnumber.sendKeys("25");
        //input[@id='calculate']
        driver.findElement(By.xpath("//input[@id='calculate']")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebElement result=driver.findElement(By.id("answer"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        System.out.println(result.getText());
    }
    @After
    public void tearDown(){
        driver.quit();
    }

}
