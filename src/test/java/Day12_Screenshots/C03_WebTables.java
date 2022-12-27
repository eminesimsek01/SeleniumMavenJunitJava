package Day12_Screenshots;

import Utilities.BaseTest;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class C03_WebTables extends BaseTest {
    /*
    Go to URL: http://demo.guru99.com/test/web-table-element.php
    To find third row of table
    To get 3rd row's 2nd column data
    Get all the values of a Dynamic Table
     */

    @Override
    @After
    public void tearDown() {

    }

    @Test
    public void test() {
        driver.get("http://demo.guru99.com/test/web-table-element.php");
        //Tablomuzu locate ettik
        WebElement table = driver.findElement(By.className("dataTable"));
        WebElement row3 = table.findElement(By.xpath(".//tr[3]"));
        //3. satır locate edildi
        System.out.println(row3.getText());
        //3.satır 3. sütun hücre locate edildi
        WebElement row3cell3 = row3.findElement(By.xpath(".//td[3]"));
        System.out.println(row3cell3.getText());

        //satır sayımızı bulduk
        int satırsayisi = table.findElements(By.xpath(".//tr")).size();
        System.out.println(satırsayisi);

        int sütunsayisi = row3.findElements(By.xpath(".//td")).size();
        System.out.println(sütunsayisi);

        for (int i = 1; i <= satırsayisi; i++) {
            //her bir satır
            for (int j = 1; j<=sütunsayisi; j++){
                // her satirin sutunu
                By locator = By.xpath(".//tr["+ i +"]//td[" + j + "]");
                WebElement tableData = table.findElement(locator);

                System.out.print(tableData.getText() + " ");
            }

            System.out.println();


        }
    }
}
