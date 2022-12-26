package Day9_JSEScroll_Cookies_Files;
import Utilities.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class C10_FileUpload extends BaseTest {

    @Test
    public void fileUpload(){

        driver.get("https://the-internet.herokuapp.com/upload");

        //Upload edilecek dosyamizi seciyoruz
        WebElement dosyaSec = driver.findElement(By.id("file-upload"));
        dosyaSec.sendKeys("C:\\Users\\user\\Desktop\\fileExist.png");

        // Upload butonuna basiyoruz
        WebElement uploadFile = driver.findElement(By.id("file-submit"));
        uploadFile.click();

        // Upload edilme mesajinin goruntulendigini dogruluyoruz
        WebElement uploadedMessage = driver.findElement(By.tagName("h3"));

        Assert.assertTrue(uploadedMessage.isDisplayed());
        Assert.assertEquals("File Uploaded!" ,uploadedMessage.getText());

    }

}