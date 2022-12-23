package Homework;

import Utilities.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class C07_GetSelectMethods extends BaseTest {
    /*
    - https://demoqa.com/select-menu sitesine gidin
    - multiple <select> elementini locate edin
    - getOptions(), getFirstSelectedOption(), getAllSelected() methodlarini kullanmak adina:
    * Farkli secimler yaparak methodlarinizi kullanin ve Assertion yapmayi unutmayin
     */
    @Test
    public void getAllSelectedMethods(){
        driver.get("https://demoqa.com/select-menu");
        Select select=new Select(driver.findElement(By.id("cars")));
        List<WebElement> options=select.getOptions();
        System.out.println(select.getOptions());
        for(WebElement option:options){
            System.out.println(option.getText());
        }
        System.out.println(".....SelectedOptions....");
        select.selectByIndex(2);
        select.selectByVisibleText("Audi");
        select.selectByValue("saab");
        select.selectByValue("volvo");
        select.selectByIndex(3);
        WebElement firstselected=select.getFirstSelectedOption();
        System.out.println(firstselected.getText());
        Assert.assertEquals("Volvo",firstselected);
        List<WebElement>AllSelected=select.getAllSelectedOptions();
        for (WebElement option:AllSelected){
            System.out.println(option.getText());
        }



    }



}
