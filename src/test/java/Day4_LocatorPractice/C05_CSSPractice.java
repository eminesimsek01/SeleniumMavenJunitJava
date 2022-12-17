package Day4_LocatorPractice;

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

public class C05_CSSPractice {

        //http://the-internet.herokuapp.com/add_remove_elements/
        // Click on the "Add Element" button 100 times.
        // Write a function that takes a number, and clicks the "Delete" button.
        // Given number of times, and then validates that given number of buttons was deleted.
        // 1. Method: createButtons(100)
        // 2. Method: DeleteButtonsAndValidate()
    WebDriver driver;
        @Before
        public void setup(){
            //Driverla ilgili her türlü initial(başlangıç) işlemi burada yapılır.
            WebDriverManager.chromedriver().setup();
            driver=new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
            driver.manage().window().maximize();
        }
        @After
        public void tearDown(){
            //test sonrasında driver kapatmak (varsa raporları dosyalamak) için kullanılır.
            //driver.quit();
        }
        @Test
    public void cssSelectorTest(){
            //site linkimize gidiyoruz
            driver.get("http://the-internet.herokuapp.com/add_remove_elements/");
            createElements(120);
            deleteButtonsAndValues(40);
        }

     public void createElements(int amount){
            WebElement addElementButton=driver.findElement(By.cssSelector("button[onclick='addElement()']"));
            for (int i=0; i<amount; i++){
                addElementButton.click();
            }
     }
     public void deleteButtonsAndValues(int amount){
            //Sayfadaki delete buton sayısını saklarız
         List<WebElement> deleteButonList=driver.findElements(By.cssSelector("button[onclick='deleteElement()']"));
         int silinmedenÖnceDeleteButtonSayısı=deleteButonList.size();
             //Bizden istenen sayı kadar butonu sileriz
        for(int i=0; i<amount; i++){
            deleteButonList.get(i).click();
        }
            //Silindikten sonraki buton sayısını buluruz

         List<WebElement>deletebuttonListAfter=driver.findElements(By.cssSelector("button[onclick='deleteElement()']"));
        int silinmedensonrakibuttonsayısı=deletebuttonListAfter.size();
            //İlk sayı ile son sayı arasındaki farkı doğrularız.
        Assert.assertEquals(silinmedenÖnceDeleteButtonSayısı-amount,silinmedensonrakibuttonsayısı);
     }
    }

