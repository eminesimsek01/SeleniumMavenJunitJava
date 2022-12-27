package Day11_ApachePoi;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.Test;

import java.io.*;

public class C02_WriteExcelExample {
    /*
    Create an object of File class to open xlsx file.
    Create an object of FileInputStream class to read excel file.
    Create an object of FileInputStream class to read excel file.
    Creating workbook instance that refers to .xlsx file.
    Creating a Sheet object.
    Get all rows in the sheet.
    Create a row object to retrieve row at index 3.
    Create a cell object to enter value in it using cell Index.
    Write the data in excel using output stream.
     */

    @Test
    public void changeExcelData() throws IOException {
        //Dosyamızın pathini aldık
        String filePath="src/test/java/resources/excelData.xlsx";

        //Pathimzden file aldık
        File file=new File(filePath);

        //File'ımızı açtık
        FileInputStream fis=new FileInputStream(file);

        Workbook wb= WorkbookFactory.create(fis);

        Sheet InformationData=wb.getSheet("informationData");
        int totalRowsUsed=InformationData.getLastRowNum()-InformationData.getFirstRowNum();
        System.out.println(totalRowsUsed);

        //Yeni bir row oluşturup row içerisindeki celleri de oluşturarak değerleri atadık
        Row row5=InformationData.createRow(4);

        row5.createCell(0).setCellValue("Emine");
        row5.createCell(1).setCellValue("Simsek");
        row5.createCell(2).setCellValue("eminesarikaya.com");
        row5.createCell(3).setCellValue("Female");
        row5.createCell(4).setCellValue("0123456789");
        row5.createCell(5).setCellValue("Address");

        //Dosyamıza yazma işlemini gerçekleştirdik
        FileOutputStream fos=new FileOutputStream(file);
        wb.write(fos);
        //Objelerimizi kapattık
        fis.close();
        fos.close();
        wb.close();


    }

}
