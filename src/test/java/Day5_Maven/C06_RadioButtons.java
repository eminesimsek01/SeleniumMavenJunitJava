package Day5_Maven;

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
import java.util.List;

public class C06_RadioButtons {
    //    Go to URL:  https://www.facebook.com/
    //    Click on Create an Account button.
    //    Then click on the radio buttons.
    //    Validate 'Kadin' is not selected and 'Erkek' is selected.
    //    Verify
    WebDriver driver;//Deklarasyon-açıkladı
    @Before//Annotations
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
    }
    @Test//Annotations
    public void radioButtons() throws InterruptedException {
        driver.get(" https://www.facebook.com/");
        WebElement hesapolustur=driver.findElement(By.xpath("//a[contains(@data-testid,'open-registration-form-button')]"));
        hesapolustur.click();
        WebElement kadınbutton=driver.findElement(By.xpath("//input[@name='sex'and @value='1']"));
        kadınbutton.click();
        Thread.sleep(3000);
        WebElement erkekbutton=driver.findElement(By.xpath("//input[@name='sex'and @value='2']"));
        erkekbutton.click();
        Thread.sleep(3000);

        Assert.assertTrue(erkekbutton.isSelected());
        Assert.assertTrue(!kadınbutton.isSelected());



        ////input[@name='sex'and @value='1']
    }
    @After//Annotations
    public void tearDown(){
        driver.quit();
    }

}
