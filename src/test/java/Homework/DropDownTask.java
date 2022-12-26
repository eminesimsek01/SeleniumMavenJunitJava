package Homework;

import Utilities.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDownTask extends BaseTest {
    /*
    Go to URL: https://the-internet.herokuapp.com/dropdown
    Create method selectByIndexTest and Select Option 1 using index .
    Create method selectByValueTest Select Option 2 by value.
    Create method selectByVisibleTextTest Select Option 1 value by visible text.
    Create method printAllTest Print all dropdown value.
    Verify the dropdown has Option 2 text.
    Create method printFirstSelectedOptionTest Print first selected option.
    Find the size of the dropdown, Print "Expected Is Not Equal Actual" if there are not 3 elements in the dropdown.
     */
    @Test
    public void selectByIndextest() {
        driver.get("https://the-internet.herokuapp.com/dropdown ");
        WebElement dropDownMenu=driver.findElement(By.xpath("//select[@id='dropdown']"));
        Select select=new Select(dropDownMenu);
        select.selectByIndex(1);
    }

    @Test
    public void selectByValueTest() {
        driver.get("https://the-internet.herokuapp.com/dropdown ");
        WebElement dropDownMenu=driver.findElement(By.xpath("//select[@id='dropdown']"));
        Select select=new Select(dropDownMenu);
        select.selectByValue("2");
    }
    @Test
    public void selectByVisibleTextTest() {
        driver.get("https://the-internet.herokuapp.com/dropdown ");
        WebElement dropDownMenu=driver.findElement(By.xpath("//select[@id='dropdown']"));
        Select select=new Select(dropDownMenu);
        select.selectByVisibleText("Option 1");
    }
    @Test
    public void printAllTest() {
        driver.get("https://the-internet.herokuapp.com/dropdown ");
        WebElement dropDownMenu=driver.findElement(By.xpath("//select[@id='dropdown']"));
        Select select=new Select(dropDownMenu);
        List<WebElement> bütünSecenekler =select.getOptions();
        for(WebElement each:bütünSecenekler){
            System.out.println(each.getText());
        }
    }
    @Test
    public void verifyTest(){
        driver.get("https://the-internet.herokuapp.com/dropdown ");
        WebElement dropDownMenu=driver.findElement(By.xpath("//select[@id='dropdown']"));
        Select select=new Select(dropDownMenu);
        Assert.assertEquals("Option 2",select.getOptions().get(2).getText());

    }
    @Test
    public void firstSelectedOption(){
        driver.get("https://the-internet.herokuapp.com/dropdown ");
        WebElement dropDownMenu=driver.findElement(By.xpath("//select[@id='dropdown']"));
        Select select=new Select(dropDownMenu);
        select.selectByValue("1");
        select.selectByIndex(2);
        System.out.println(select.getFirstSelectedOption().getText());

        //Dropdown Size
        List<WebElement> bütünSecenekler =select.getOptions();
        System.out.println(bütünSecenekler.size());
        Assert.assertTrue("Expected Is Not Equal Actual",bütünSecenekler.size()==3);
    }


}
