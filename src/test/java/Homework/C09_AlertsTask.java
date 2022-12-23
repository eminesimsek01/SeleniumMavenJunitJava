package Homework;

import Utilities.BaseTest;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class C09_AlertsTask extends BaseTest {
    /*
    Go to URL: http://demo.automationtesting.in/Alerts.html
    Click "Alert with OK" and click 'click the button to display an alert box:’
    Accept Alert(I am an alert box!) and print alert on console.
    Click "Alert with OK & Cancel" and click 'click the button to display a confirm box’
    Cancel Alert  (Press a Button !)
    Click "Alert with Textbox" and click 'click the button to demonstrate the prompt box’
    And then sendKeys «BootcampCamp» (Please enter your name)
    Finally print on console this message "Hello BootcampCamp How are you today" assertion these message.
     */
    @Test
    public void alertTask(){
        driver.get("http://demo.automationtesting.in/Alerts.html");
        WebElement alertButton=driver.findElement(By.xpath("//a[@href='#OKTab']"));
        alertButton.click();
        driver.switchTo().alert().accept();

        WebElement alertButtonWithOk=driver.findElement(By.xpath("//a[@href='#OKTab']"));
        alertButtonWithOk.click();
        alertButton.click();
        driver.switchTo().alert().accept();
        WebElement alertButtonwithOKandCancel=driver.findElement(By.xpath("//a[@href='#CancelTab']"));
        alertButton.click();
        driver.switchTo().alert().accept();
        System.out.println(alertButton.getText());

        //a[@class='analystic'and @aria-expanded='true']
    }//a[@href='#OKTab']



}
