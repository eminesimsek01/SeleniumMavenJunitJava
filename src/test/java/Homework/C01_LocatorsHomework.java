package Homework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_LocatorsHomework {
    //https://id.heroku.com/login sayfasına gidiniz.
    //Bir mail adresi giriniz.
    //Bir password giriniz.
    //Login butonuna tıklayınız.
    //"There was a problem with your login." text görünür ise "Kayıt Yapılamadı" yazdırınız.
    //Eğer yazı görünür değilse "Kayıt Yapıldı" yazdırınız.
    //Tüm sayfaları kapatınız.
    WebDriver driver;
    @Before
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
    }
    @Test
    public void loginTest() throws InterruptedException {
        driver.get("https://id.heroku.com/login ");
        WebElement email =driver.findElement(By.xpath("//input[@id='email']"));
        email.sendKeys("sarikaya@gmail.com");
        WebElement password =driver.findElement(By.xpath("//input[@class='form-control password']"));
        Thread.sleep(3000);
        password.sendKeys("lllll"+ Keys.ENTER);
        //driver.findElement(By.id("commit")).click();
        WebElement alert=driver.findElement(By.xpath("//div[@role='alert']"));
        System.out.println("(alert.isDisplayed()?\"Kayıt Yapılmadı\":\"Kayıt Yapıldı\") = " + (alert.isDisplayed() ? "Kayıt Yapılmadı" : "Kayıt Yapıldı"));
    }

    @After
    public void tearDown(){
        driver.quit();
    }
}
