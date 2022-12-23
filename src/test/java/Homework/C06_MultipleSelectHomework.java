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
       Select select=new Select(driver.findElement(By.id("cars")));
       System.out.println(select.isMultiple());
       select.selectByIndex(1);
       Thread.sleep(3000);
       select.selectByValue("audi");
       Thread.sleep(3000);
       select.selectByVisibleText("Opel");
       Thread.sleep(3000);
   }
}
