package Day9_JSEScroll_Cookies_Files;

import java.nio.file.Files;
import java.nio.file.Paths;

public class C07_FileExist {
    public static void main(String[] args) {
        System.out.println(System.getProperty("user.dir"));//projenmizin rootunun yolunu verir
        String projectRoot=System.getProperty("user.dir");//Bulmak istediğimiz file proje içerisinde olduğundan proje yolunu aldık
        String filePath="\\src\\test\\java\\resources\\fileExist.jpg";//Bulmak istediğimiz dosyanın proje kalsöründen sonraki yolunu aldık
        filePath=projectRoot+filePath;//Almış olduğumuz iki yolu birleştirdik
        System.out.println(Files.exists(Paths.get(filePath)));//Bu basamakta bir dosya olup olmadığını doğruladık
        if(Files.exists(Paths.get(filePath))){
            System.out.println("Dosya bulundu");//Varsa bulundu yazdırdık
        } else {
            System.out.println("Dosya bulunamadı");//Yoksa bulunamadı yazdırdık
        }

    }


}
