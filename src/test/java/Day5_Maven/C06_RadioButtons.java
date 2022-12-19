package Day5_Maven;

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
import java.util.List;

public class C06_RadioButtons {
    //    Go to URL:  https://www.facebook.com/
    //    Click on Create an Account button.
    //    Then click on the radio buttons.
    WebDriver driver;
    @Before
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
    }
    @Test
    public void radioButtons() {
        driver.get(" https://www.facebook.com/");
        WebElement hesapolustur=driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
        hesapolustur.click();
        WebElement kadınRadio=driver.findElement(By.xpath("//input[@name='sex'and @value='1']"));
        WebElement erkekRadio=driver.findElement(By.xpath("//input[@name='sex'and @value='2']"));
        kadınRadio.click();
        erkekRadio.click();
        Assert.assertTrue(!kadınRadio.isSelected());
        Assert.assertTrue(erkekRadio.isSelected());

    }
    @After
    public void tearDown(){
        driver.quit();
    }
}
