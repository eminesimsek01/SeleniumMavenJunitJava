package Day1_SeleniumMeaven;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class C03_JunitAssertions {
        //    Go to Amazon homepage.
        //    Do the following tasks by creating 3 different test methods.
        //    1- Test if the URL contains Amazon.
        //    2- Test if the title does not contain Facebook.
        //    3- Test that the Amazon logo appears in the upper left corner.
        WebDriver driver;
        @Before
        public void before(){
            WebDriverManager.chromedriver().setup();
            driver=new ChromeDriver();
            driver.manage().window().maximize();
        }
        @After
        public void after(){
                driver.quit();
        }
        @Test
        public void URLTest() {
                driver.get("https://www.amazon.com.tr");
                String currentUrl=driver.getCurrentUrl();
                //Url amazon kelimesini içeriyor mu, kontrol sağlanıyor.
                Assert.assertTrue("URL 'amazon' içermiyor",currentUrl.contains("amazon"));
        }
        @Test
        public void titleTest(){
                driver.get("https://www.amazon.com.tr");
                String title=driver.getTitle();
                Assert.assertFalse("title facebook içeriyoorr",title.contains("facebook"));
        }
        @Test
        public void amazonLogoPositionTest(){
                driver.get("https://www.amazon.com.tr");
                WebElement logo=  driver.findElement(By.id("nav-logo-sprites"));
                Point poisiton=logo.getLocation();
                System.out.println("poisiton = " + poisiton);
                WebElement logo1=  driver.findElement(By.id("nav-logo"));
                Point leftcorner=logo1.getLocation();
                System.out.println("leftcorner = " + leftcorner);
                Assert.assertTrue("Logo upper-cornerda değil",poisiton==leftcorner);
        }
        @Test
        public void amazonLogoSolUstKosedeGorunurMu(){
                driver.get("https://www.amazon.com.tr");
                WebElement logo=  driver.findElement(By.id("nav-logo-sprites"));
                Point poisiton=logo.getLocation();
                Assert.assertTrue("logo sol köşede görünmüyor",logo.isDisplayed());
        }
}
