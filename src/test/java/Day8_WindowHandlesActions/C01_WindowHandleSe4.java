package Day8_WindowHandlesActions;

import Utilities.BaseTest;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;

import java.util.Iterator;
import java.util.Set;

public class C01_WindowHandleSe4 extends BaseTest {
    @Override
    public void tearDown(){

    }
    @Test
    public void newWindow(){
        //Ana sekmemizde url'i ziyaret ediyoruz
        driver.get("https://testproject.io/");
        //Yeni pencere oluşturup o pencereye switch ediyoruz
        driver.switchTo().newWindow(WindowType.WINDOW);//Driverla yeni bir pencere oluşturduk
        //Yeni penceremizde url'imizi ziyaret ediyoruz
        driver.get(" https://blog.testproject.io/");
    }
    @Test
    public void newTab(){
        //Ana sekmemizden testproject açıldı
        driver.get("https://testproject.io/");
        //Yeni bir sekme oluşturuldu
        WebDriver newTab=driver.switchTo().newWindow(WindowType.TAB);
        //Yeni sekmeden Amazona gidildi
        newTab.get("https://www.amazon.com/");
        //Aktif tabın title'ı yazdırıldı--> aktif tabımız=yeni oluşturulan tab
        System.out.println(driver.getTitle());
    }

    @Test
    public void handleWindows(){
        //Ana sekmemizde amazon açılıyor
        driver.get("https://www.amazon.com/");
        //getwindowHandle
        String homePageHandle=driver.getWindowHandle();
        driver.switchTo().newWindow(WindowType.TAB);

        //Yeni sekmede amazon tr'yi açcık
        driver.get("https://www.amazon.com.tr/");

        //Yeni pencere oluşturduk
        driver.switchTo().newWindow(WindowType.WINDOW);

        //Yeni pencerede testprojecti kapattık
        driver.get("https://testproject.io/");

        Set<String> handles=driver.getWindowHandles();//Tüm pencerelerin id'lerinin olduğu bir collection
        Iterator<String> i=handles.iterator();//Iterator oluşturduk, set üzerinde gezinmek için

        while(i.hasNext()){
            String currentTab=i.next();
            driver.switchTo().window(currentTab);
            System.out.println(driver.getTitle());
            //1yol
            /*
            if(!driver.getWindowHandle().equals(homePageHandle)){
                driver.close();
            };//Anasayfa dışındakiler kapanır
            //driver.close();//Ana sayfa dahil hepsini kapatır
             */
            //2.yol
            if(!driver.getTitle().contains("Spend")){
                driver.close();
            }
        }
    }

}
