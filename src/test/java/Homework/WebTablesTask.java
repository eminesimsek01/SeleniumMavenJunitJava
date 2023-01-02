package Homework;

import Utilities.BaseTest;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class WebTablesTask<list> extends BaseTest {
    /*
    Go to URL: https://the-internet.herokuapp.com/tables
    Print the entire table
    Print All Rows
    Print Last row data only
    Print column 5 data in the table body
    Write a method that accepts 2 parameters
    parameter 1 = row number
    parameter 2 = column number
    printData(3,4); => prints
    parameter 3 = table id
    printData(3,4,"table1") => prints data in 3rd row 4th Column with table id
     */
    WebElement table1;
    WebElement table2;
    @Test
    public void webtablesTest() {
        driver.get("https://the-internet.herokuapp.com/tables");
        WebElement table1=driver.findElement(By.id("table1"));
        System.out.println(table1.getText());
        WebElement table2=driver.findElement(By.id("table2"));
        System.out.println(table2.getText());
        List<WebElement> table1Rows= table1.findElements(By.xpath(".//tr"));
        List<WebElement> table2Rows= table2.findElements(By.xpath(".//tr"));

        System.out.println("------TABLE 1------");
        for(WebElement each:table1Rows){
            System.out.println(each.getText());
        }
        System.out.println("-------TABLE2-------");
        table2Rows.forEach(x-> System.out.println(x.getText()));

        //    Print Last row data only
        System.out.println("-----Last Row-----");
        System.out.println((table1Rows.get(table1Rows.size()-1).getText()));

        //  Print column 5 data in the table body
        System.out.println("----Beşinci Sütun----");
        List<WebElement> sütunBesinci=table1.findElements(By.xpath(".//td[5]"));
        sütunBesinci.forEach(x-> System.out.println(x.getText()));

        //Method calls
        ikiParametreliMethod(2,3,"table1");
    }
    @Test
    public void ikiParametreliMethod(int row, int column, String tableid) {
        // Write a method that accepts 2 parameters

        WebElement table = driver.findElement(By.id(""+tableid+""));
            WebElement data = table.findElement(By.xpath(".//tr["+row+"]//td["+column+"]"));
    }

}
