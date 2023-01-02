package Homework;

import Utilities.BaseTest;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Log4JHomework extends BaseTest {
/*
    Tasktaki her bir step icin lutfen log mesajlarini yazdirarak ilerleyiniz :)
    Go to URL: https://healthunify.com/bmicalculator/
    Entring weight
    Selecting kilograms
    Selecting height in feet
    Selecting height in inchs
    Clicking on calculate
    Getting SIUnit value
    Getting USUnit value
    Getting UKUnit value
    Getting overall description
     */
    @Override
    public void tearDown() {
    }
    @Test
    public void log4J() {
        driver.get("https://healthunify.com/bmicalculator/");
        WebElement agırlıkGirme=driver.findElement(By.xpath("//input[@name='wg']"));
        agırlıkGirme.sendKeys("60");
        WebElement agırlıkBirimSecmeMenu=driver.findElement(By.xpath("//select[@name='opt1']"));
        Select select=new Select(agırlıkBirimSecmeMenu);
        select.selectByIndex(1);
        WebElement boyMetreMenu=driver.findElement(By.xpath("//select[@name='opt1']"));
        Select select1=new Select(boyMetreMenu);
        select1.selectByIndex(1);
        WebElement boyCmMenu=driver.findElement(By.xpath("//select[@name='opt3']"));
        Select select2=new Select(boyCmMenu);
        select2.selectByIndex(3);
        WebElement hesaplaButton=driver.findElement(By.xpath("//input[@name='cc']"));
        hesaplaButton.click();
        WebElement sıUnit=driver.findElement(By.xpath("(//input[@type='text'])[3]"));
        System.out.println(sıUnit.getText());
        WebElement usUnit=driver.findElement(By.xpath("(//input[@type='text'])[4]"));
        System.out.println(usUnit.getText());
        WebElement ukUnit=driver.findElement(By.xpath("(//input[@type='text'])[5]"));
        System.out.println(ukUnit.getText());


    }
}
