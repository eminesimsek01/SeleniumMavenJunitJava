package Day5_Maven;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_Task {
    //https://www.teknosa.com/ adresine gidiniz.
    // Arama çubuğuna ''oppo'’ yazıp ENTER tıklayınız.
    // Sonuç sayısını yazdırınız.
    // Çıkan ilk ürüne tıklayınız.
    // Sepete ekleyiniz.
    // Sepetime gite tıklayınız.
    // Konsolda "Sipariş Özeti" WebElement'inin text'ini yazdırınız.
    // Alışverişi tamamlayınız.
    // Son olarak "Teknosa'ya Hoş Geldiniz" WebElement'inin text'ini yazdırınız.
    // Driver'ı kapatınız.
    WebDriver driver;
    @Before
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
    }
    @Test
    public void teknosaTest() throws InterruptedException {
        //
        driver.get("https://www.teknosa.com/");

        //Arama alanı locate edilip istenen değer yazıldı.
        WebElement aramaAlani=driver.findElement(By.name("s"));//name='s'
        aramaAlani.sendKeys("oppo"+ Keys.ENTER);
        WebElement sonucSayısı=driver.findElement(By.className("plp-info"));
        System.out.println(sonucSayısı.getText());

        //İlk ürüne tıklanıp sepete eklendi
        WebElement ilkUrun=driver.findElement(By.className("prd-link"));
        ilkUrun.click();

        //Sepete ekle butonuna tıklandı
        WebElement sepeteEkleButton=driver.findElement(By.xpath("(//button[@id='addToCartButton'])[1]"));
        sepeteEkleButton.click();

        //Sepete git butonuna tiklandi
        WebElement sepeteGitButton = driver.findElement(By.xpath("//a[@class='btn btn-secondary']"));
        sepeteGitButton.click();

        //Siparis ozeti texti yazdirildi
        WebElement siparisOzet = driver.findElement(By.xpath("//div[@class='cart-sum-body']"));
        System.out.println(siparisOzet.getText());

        //Alisveris tamamla butonuna basildi
        WebElement alisverisTamamlaButton = driver.findElement(By.partialLinkText("Alışverişi Tamamla"));
        alisverisTamamlaButton.click();

        //Teknosaya hosgeldiniz texti yazdirildi
        WebElement hosgeldiniz = driver.findElement(By.xpath("//div[@class='lrp-title']"));
        System.out.println(hosgeldiniz.getText());
    }
    @After
    public void tearDown(){
        driver.quit();
    }
}
