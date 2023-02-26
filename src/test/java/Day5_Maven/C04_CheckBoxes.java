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
import org.openqa.selenium.support.locators.RelativeLocator;

import java.time.Duration;
import java.util.List;
public class C04_CheckBoxes {
    //    Go to https://the-internet.herokuapp.com/checkboxes
    //    Locate the elements of checkboxes.
    //    Then click on checkbox 1 if box is not selected.
    //    Then click on checkbox 2 if box is not selected.
    //    Then verify that checkbox 1 and checkbox 2 is checked.
    WebDriver driver;
    @Before
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
    }
    @Test
    public void checkboxes() throws InterruptedException {
        //Checkboxeslar locate edildi
        driver.get("https://the-internet.herokuapp.com/checkboxes");
        List<WebElement> checkboxes=driver.findElements(By.xpath("//input[@type='checkbox']"));
        WebElement checkbox1=checkboxes.get(0);
        WebElement checkbox2=checkboxes.get(1);

        if(!checkbox1.isSelected()){
            checkbox1.click();
            Thread.sleep(3000);
        }
        if(!checkbox2.isSelected()){
            checkbox2.click();
            Thread.sleep(3000);
        }
        //Checkbox'ların seçili olduğunun kontrolü gerçekleştirildi
        Assert.assertTrue(checkbox1.isSelected());
        Assert.assertTrue(checkbox1.isSelected());
    }
    @After
    public void tearDown(){
        driver.quit();
    }
}
