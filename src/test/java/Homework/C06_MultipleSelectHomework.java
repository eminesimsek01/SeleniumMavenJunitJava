package Homework;

import Utilities.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class C06_MultipleSelectHomework extends BaseTest {
    /*
    - https://demoqa.com/select-menu sitesine gidin
    - Multiple select yapabileceginiz <select> elementini locate edin
    - Birden fazla secim yapip secimlerinizi DOGRULAyin
     */
   @Test
   public void multipleSelectTest () throws InterruptedException {
       driver.get("https://demoqa.com/select-menu");
       Select select=new Select(driver.findElement(By.xpath("(//div[@class=' css-1hwfws3'])[3]")));
       System.out.println(select.isMultiple());
       select.selectByIndex(2);
       Thread.sleep(3000);
       select.selectByValue("7");
       Thread.sleep(3000);
       select.selectByVisibleText("Purple");
       Thread.sleep(3000);

   }
}
