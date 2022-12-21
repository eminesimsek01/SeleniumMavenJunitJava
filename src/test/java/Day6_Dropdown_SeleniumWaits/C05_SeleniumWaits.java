package Day6_Dropdown_SeleniumWaits;

import Utilities.BaseTest;
import org.junit.Test;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class C05_SeleniumWaits extends BaseTest {
    //Explicit wait
    @Test
    public void webDriverWait(){
        //Adım1--> Webdriverwait objemiz oluşturuldu
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));

    }


}
