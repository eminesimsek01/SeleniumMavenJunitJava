package Homework;

import Utilities.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class C08_SelectMethodHomework extends BaseTest {
    /*
    Launch the browser.
    Open "https://demoqa.com/select-menu".
    Select the Standard Multi-Select using the element id.
    Verifying that the element is multi-select.
    Select 'Opel' using the index and deselect the same using index.
    Select 'Saab' using value and deselect the same using value.
    Deselect all the options.
    Close the browser.
     */
    @Test
    public void selectMethdos(){
        driver.get("https://demoqa.com/select-menu");
        Select select=new Select(driver.findElement(By.id("cars")));
        Assert.assertTrue(select.isMultiple());
        select.selectByIndex(3);
        select.deselectByIndex(3);
        select.selectByValue("saab");
        select.deselectByValue("saab");
        select.deselectAll();
    }

}
