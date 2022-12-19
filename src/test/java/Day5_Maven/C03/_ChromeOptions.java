package Day5_Maven.C03;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class _ChromeOptions
{
    @Test
    public void chromeOptions (){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options =new ChromeOptions();
        //options.addArguments("headless");
        options.addArguments("start-maximizied");
        WebDriver driver=new ChromeDriver();
    }
    }

