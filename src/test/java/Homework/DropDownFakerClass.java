package Homework;

import Utilities.BaseTest;
import com.github.javafaker.Faker;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDownFakerClass extends BaseTest {
    /*
    Go to URL: https://opensource-demo.orangehrmlive.com/
    Login with Username: Admin
    Login with Password: admin123
    Click login button
    Click on PIM
    Click on Employee List
    Employee Name -> Use Faker Class
    ID -> Use Faker Class
    Employment Status -> select by index: 2
    Include -> selectByVisibleText: Current and Past Employees
    Supervisor Name -> Use Faker Class
    Job Title ->selectByValue: IT Manager
    Sub Unit ->selectByValue: 3
    Click search button
    Verify text visible : "No Records Found"
     */

    @Test
    public void test() {
        driver.get("https://opensource-demo.orangehrmlive.com/");
        WebElement inputusername=driver.findElement(By.name("username"));
        inputusername.sendKeys("Admin");
        WebElement inputpassword=driver.findElement(By.xpath("//input[@class='oxd-input oxd-input--active'and@name='password']"));
        inputpassword.sendKeys("admin123");
        WebElement submitButton=driver.findElement(By.xpath("//button[@type='submit']"));
        submitButton.click();
        WebElement pımButton=driver.findElement(By.xpath("//li[@class='oxd-main-menu-item-wrapper'][2]"));
        pımButton.click();

        //İnput kısımları liste atandı
        Faker faker=new Faker();//Faker objesi oluşturuldu.Bilgiler faker objesi ile üretilerek girildi.
        Select select=new Select();
        List<WebElement> inputs = driver.findElements(By.className("oxd-grid-item oxd-grid-item--gutters"));
        inputs.get(0).sendKeys(faker.name().firstName());
        inputs.get(1).sendKeys((CharSequence) faker.idNumber());
        inputs.get(2).sendKeys(K);

    }
}
