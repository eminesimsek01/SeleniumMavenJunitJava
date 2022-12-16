package Day3_SeleniumMaven;

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

public class C01_Locator_Practice {
     //    Go to https://www.linkedin.com/
     //    When we write an e-mail without the @ sign in the e-mail box and press enter.
    //    Let's test the "Invalid email address" warning.
    WebDriver driver;
    @Before
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @After
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
    @Test
    public void xpathPractice(){
        //1.adım: Linkedin sitesine gidildi
    driver.get("https://www.linkedin.com/");

    //2.adım --> email alanında @ olmayan bir email adresi gir
        driver.findElement(By.xpath("//input[@id='session_key']"))
                .sendKeys("Karl.clarusway.com"+ Keys.ENTER);
    //3. adım--> Hata mesajının görüntülendiğini doğrula
        WebElement alertmessage=driver.findElement(By.xpath("//p[@class='alert-content']"));
        Assert.assertTrue(alertmessage.isDisplayed());
        //Assert.assertEquals(true,alertmessage.isDisplayed());
        //Assert.assertFalse(!alertmessage.isDisplayed());
    }

}
