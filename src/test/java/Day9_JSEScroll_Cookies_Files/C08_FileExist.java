package Day9_JSEScroll_Cookies_Files;

import org.junit.Assert;
import org.junit.Test;

import java.io.File;

public class C08_FileExist {
    @Test
    public void test() {
        //C:\Users\mehmet\Desktop\fileExist.png
        System.out.println(System.getProperty("user.home"));//Home yolunu yazdırdık
        String homePath=System.getProperty("user.home");//Home yolunu atadık
        String filePath="C:\\Users\\mehmet\\Desktop\\fileExist.png";//Dosyanın kalan yolunu atadık
        String fullPath=homePath+filePath;//FullPath elde ettik
        File image= new File(fullPath);//Pathimizi file'a çevirdik
        Assert.assertTrue(image.exists());

    }
}
