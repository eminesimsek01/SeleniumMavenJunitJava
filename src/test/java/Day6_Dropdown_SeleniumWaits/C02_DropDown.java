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
import java.util.List;

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
        driver.get("https://demo.guru99.com/test/newtours/register.php\n");
        WebElement dropDown=driver.findElement(By.name("country"));
        Select select=new Select(dropDown);
        select.selectByValue("TURKEY");
    }
    @Test
    public void selectByVisibleText(){
        driver.get("https://demo.guru99.com/test/newtours/register.php\n");
        WebElement dropDown=driver.findElement(By.name("country"));
        Select select=new Select(dropDown);
        select.selectByVisibleText("BELARUS");

    }
    @Test
    public void multipleSelect(){
        driver.get("https://output.jsbin.com/osebed/2");
        Select select =new Select(driver.findElement(By.id("fruits")));
        System.out.println("select.isMultiple() = " + select.isMultiple());
        select.selectByValue("apple");
        select.selectByIndex(3);
    }
    @Test
    public void getOptions(){
        driver.get("https://demo.guru99.com/test/newtours/register.php");
        Select select =new Select(driver.findElement(By.name("country")));
        List<WebElement>options=select.getOptions();
        for(WebElement option:options){
            System.out.println("option.getText() = " + option.getText());
        }
    }
    @Test
    public void getFirstSelectedOption(){
        //GetFirstSelectedOption metodu seçilmiş olan optionlardan ilk seçili olanı verir.
        driver.get("https://output.jsbin.com/osebed/2");
        Select select=new Select(driver.findElement(By.id("fruits")));
        select.selectByIndex(3);//Garape
        select.selectByIndex(2);//Orange
        WebElement selectedfirstoption=select.getFirstSelectedOption();
        System.out.println("selectedfirstoption = " + selectedfirstoption.getText());

    }
    @After
    public void tearDown(){
        driver.quit();
    }

}
