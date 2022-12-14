package Day1_SeleniumMeaven;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_WebDriverManagerTest {
   // Set Path.
   // Create chrome driver.
   // Maximize the window.
   // Open google home page https://www.google.com/
   // Verify that you are Google in the title.
   public static void main(String[] args) throws InterruptedException {
       //WebDriver Manager classını kullanarak chromedriver binary lerimizi indirdik.
       WebDriverManager.chromedriver().setup();

       //Driver objemizi oluşturduk
       WebDriver driver=new ChromeDriver();

       //windowu maximize ettik
       driver.manage().window().maximize();

       Thread.sleep(3000);
       //google anasayfamızı açtık
       driver.get("https://ww.google.com");

       //title'ımızı aldık
       String title=driver.getTitle();

       //title'ımızı doğruladık
       if(title.equals("Google")){
           System.out.println("test PASSED");
       }
       else System.out.println("test FAILED");

       Thread.sleep(3000);

       //driverımızı kapattık
       driver.quit();




   }

}
