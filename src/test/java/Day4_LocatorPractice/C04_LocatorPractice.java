package Day4_LocatorPractice;

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

public class C04_LocatorPractice {
    //Navigate to website https://testpages.herokuapp.com/styled/index.html
    // Under the ORIGINAL CONTENTS
    // Click on Alerts
    // Print the URL
    // Navigate back
    // Print the URL
    // Click on Basic Ajax
    // Print the URL
    // Enter value  20 and Enter
    // And then verify Submitted Values is displayed open page
    // Close driver.
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
        driver.quit();
    }
    @Test
    public void test() throws InterruptedException {
        //Alerts link locate edildi ve tıklandı
        driver.get("https://testpages.herokuapp.com/styled/index.html");
        Thread.sleep(3000);

        WebElement alertsLink=driver.findElement(By.xpath("//a[@id='alerts']"));
        alertsLink.click();
        Thread.sleep(3000);

        //Current URL yazdırıldı
        String alertsurl=driver.getCurrentUrl();
        System.out.println("alertsurl = " + alertsurl);

        //back=geri
        driver.navigate().back();
        Thread.sleep(3000);

        //Current URL print edildi
        String homeUrl=driver.getCurrentUrl();
        System.out.println("homeUrl = " + homeUrl);

        //Basic Ajax linki locate edildi ve tıklandı
        WebElement basicAjaxLink=driver.findElement(By.id("basicajax"));
        basicAjaxLink.click();
        Thread.sleep(3000);

        //Basic Ajax URL print edildi
        String basicAjaxUrl=driver.getCurrentUrl();
        System.out.println("basicAjaxUrl = " + basicAjaxUrl);

        //Text alanına 20 yazılıp ENTER a basıldı.
        driver.findElement(By.id("lteq30")).sendKeys("20"+ Keys.ENTER);
        Thread.sleep(3000);

        //Submitted Values yazısının görüntülendiğini doğrula
        WebElement submittedValuesText=driver.findElement(By.xpath("//p[text()='Submitted Values']"));
        Assert.assertTrue(submittedValuesText.isDisplayed());

    }
}
