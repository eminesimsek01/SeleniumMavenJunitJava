package Day2_SeleniumMaven;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;
public class C01_Locators {
    WebDriver driver;
    @Before
    public void setUp(){
        //Driver oluşturuldu
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        //sayfanın yüklenmesi beklendi
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Linkedin sitesine gidildi
        driver.get("https://tr.linkedin.com/");
        driver.manage().window().maximize();
    }
    @After
    public void teardown (){
        //driverımız kapatıldı
        //driver.quit();
    }
    @Test
    public void idLocator(){
        //idlocator-> session_key
        WebElement email=driver.findElement(By.id("session_key"));
        email.sendKeys("Clarusway selenium dersinden selamlar");
    }
    @Test
    public void nameLocator(){
        //name locator->"session_password"
        WebElement password =driver.findElement(By.name("session_password"));
        password.sendKeys("sifre");
    }
    @Test
    public void classLocator() {
        //class locator--> input__input
    WebElement email=driver.findElement(By.className("input__input"));
    email.sendKeys("classLocator çalıştı");
    }
    @Test
    public void tagLocator() {
        //tag locator-->"input"
        List<WebElement> emailList=driver.findElements(By.tagName("input"));
        //email.sendKeys("Tag locator test");

        //2. elementimiz email text alanımız. Bu yüzden bu elemanı email degişkenine asign ettik
        WebElement email1=emailList.get(1);
        email1.sendKeys("Tag locator test");
    }
    @Test
    public void linkTextLocator(){
        //link test --> Şifrenizi mi unutunuz

        WebElement forgotpw=driver.findElement(By.linkText("Şifrenizi mi unuttunuz?"));
        forgotpw.click();
    }
    @Test
    public void partialLinkTextLocator(){
        //link test--> Şifrenizi
        WebElement pwd=driver.findElement(By.partialLinkText("Şifrenizi"));
        pwd.click();
    }
    @Test
    public void absoluteXpath(){
        WebElement email=driver  //Absolute x path tavsiye edilmez, relative x path tavsiye edilir
            .findElement(By.xpath("/html/body/main/section[1]/div/div/form/div[2]/div[1]/input"));
        email.sendKeys("Absloute X path konusu başarı ile tamalandı");
    }
    @Test
    public void relativeXpath(){
        WebElement email=driver.findElement(By.xpath("//input[@name=\"session_key\"]"));//Absolute x path tavsiye edilmez, relative x path tavsiye edilir
        email.sendKeys("RelativeX path konusu başarı ile tamalandı");
        // //*[@id="session_key"]
    }
    @Test
    public void multipleAttributeXpath (){
        WebElement email=driver.findElement(By.xpath("//input[@class='input__input'][@type='text']"));
        email.sendKeys("RelativeX path konusu başarı ile tamalandı");

        //Tek attribute ile bir sonuca ulaşamazsak birden fazla attribute yazılabilir.
        ////input[@class='input__input'][@type='text']
        ////input[@class='input__input'and @type='text']
    }
    @Test
    public void andOrXpath (){
        WebElement email=driver.findElement(By.xpath("//input[@class='input__input'and @type='text']"));
        email.sendKeys("And, or RelativeX path konusu başarı ile tamalandı");

        //Tek attribute ile bir sonuca ulaşamazsak birden fazla attribute yazılabilir.
        ////input[@class='input__input'][@type='text']
        ////input[@class='input__input'and @type='text']
    }
    @Test
    public void containsXPath (){
        //xpath locator-->//input[contains(@id,session)]
        //contains Xpath metodlarından birisidir
        WebElement email=driver.findElement(By.xpath("//input[contains(@id,'session')]"));
        email.sendKeys("ContainsX path konusu başarı ile tamamlandı");
    }
    @Test
    public void startsWithXPath (){
        //xpath locator-->//input[starts-with(@id,session)]
        //starts-with Xpath metodlarından birisidir
        WebElement email=driver.findElement(By.xpath("//input[starts-with(@id,'session')]"));
        email.sendKeys("starts-with path konusu başarı ile tamamlandı");
    }
    @Test
    public void textXPath (){
        //xpath locator-->////button[contains(text(),'Oturum açın')]
        //text Xpath metodlarından birisidir
        WebElement email=driver.findElement(By.xpath("//button[contains(text(),'Oturum açın')]"));
        email.sendKeys("text path konusu başarı ile tamamlandı");
    }
    @Test
    public void noktaTextXPath (){
        WebElement email=driver.findElement(By.xpath("//button[cotains(.,'Oturum açın')]"));
        email.sendKeys("nokta text path konusu başarı ile tamamlandı");
        //text() yerine nokta yazarsak bu da tag'deki textlerin içine bakar ama text() sadece button
        // taginin olduğu yere bakarken, (.) alt taglere de bakar
    }
    }





