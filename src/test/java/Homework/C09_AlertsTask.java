package Homework;

import Utilities.BaseTest;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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

    @Override
    public void tearDown() {

    }

    @Test
    public void alertTask() throws InterruptedException {
        driver.get("http://demo.automationtesting.in/Alerts.html");
        WebElement alertOKbutton=driver.findElement(By.xpath("//a[@href='#OKTab']"));
        alertOKbutton.click();
        WebElement alertDisplayButton=driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
        alertDisplayButton.click();
        Thread.sleep(3000);
        driver.switchTo().alert().accept();

        WebElement alertButtonWithCancel=driver.findElement(By.xpath("//a[@href='#CancelTab']"));
        alertButtonWithCancel.click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
        driver.switchTo().alert().accept();
        WebElement alertButtonwithText=driver.findElement(By.xpath("//a[@href='#Textbox']"));
        alertButtonwithText.click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
        Thread.sleep(3000);
        driver.switchTo().alert().sendKeys("BootcamCamp");
        driver.switchTo().alert().accept();
        Thread.sleep(3000);
        WebElement demoYazı=driver.findElement(By.xpath("//p[@id='demo1']"));
        System.out.println(demoYazı.getText());
    }



}
