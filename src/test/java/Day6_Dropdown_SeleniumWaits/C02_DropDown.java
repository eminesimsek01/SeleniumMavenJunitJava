package Day6_Dropdown_SeleniumWaits;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class C02_DropDown {
    WebDriver driver;
    @Before
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
    }
    @Test
    public void selectbyIndex(){
        driver.get("https://demo.guru99.com/test/newtours/register.php\n");

        //Dropdown locate edildi
        WebElement dropDown=driver.findElement(By.name("country"));

        //Locate edilen dropdown select objesine dönüştürüldü
        Select select=new Select(dropDown);

        select.selectByIndex(1);//ALGERIA
        //selectByIndex() metodu 0 ile başlar


    }
    @Test
    public void selectbyValue(){

    }
    @Test
    public void test03(){

    }


    @After
    public void tearDown(){
        driver.quit();
    }

}
