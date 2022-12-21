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

public class C03_RadioButtoHomework {
    //Go to URL: https://demoqa.com/radio-button
    //Soruya verilen 3 seçeneğin de seçilme durumlarını doğrulayınız.
    //Her bir seçenek seçildiğinde aşağıda çıkan text’leri konsolda yazdırınız.
    WebDriver driver;
    @Before
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().window().maximize();
    }
    @Test
    public void radioButtonTest() throws InterruptedException {
            driver.get("https://demoqa.com/radio-button");
            WebElement yesButton=driver.findElement(By.xpath("//input[@type='radio'and@id='yesRadio']"));
                 if (yesButton.isSelected()) {
                 yesButton.click();}
            WebElement yesButtonText=  driver.findElement(By.xpath("//p[@class='mt-3']"));
        System.out.println(yesButtonText.getText());


        WebElement noButton=driver.findElement(By.xpath("//input[@type='radio'and@id='noRadio']"));
            if (noButton.isSelected()) {
            noButton.click();}
            Thread.sleep(3000);
            System.out.println(noButton.getText());

            WebElement impressiveButton=driver.findElement(By.xpath("//input[@type='radio'and@id='impressiveRadio']"));
            if(impressiveButton.isSelected())
            {
                impressiveButton.click();
            }
            Thread.sleep(3000);
            System.out.println(impressiveButton.getText());
    }

    @After
    public void tearDown(){
        driver.quit();
    }

}
