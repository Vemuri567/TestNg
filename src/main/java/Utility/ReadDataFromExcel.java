package Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javafx.scene.control.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class ReadDataFromExcel {
    public static void main(String[] args) throws Exception {
        File file=new File("D:\\VFC project\\Feb2023Batch\\src\\main\\resources\\Test.xlsx");
        FileInputStream fs=new FileInputStream(file);
        XSSFWorkbook wb=new XSSFWorkbook(fs);
        XSSFSheet sheet=wb.getSheet("Sheet1");
        /*XSSFRow row=sheet.getRow(1);
        XSSFCell username=row.getCell(0);
        System.out.println(username.getStringCellValue());
        XSSFCell password=row.getCell(1);
        System.out.println(password.getStringCellValue());*/
        //** Get Noof Rows**/
        int noofrows=sheet.getPhysicalNumberOfRows();
        System.out.println(noofrows);
        int lastrowno=sheet.getLastRowNum();
        System.out.println(lastrowno);
        //** Get Noof Columns**/
       for(int i=1;i<=lastrowno;i++)
       {
           XSSFRow row=sheet.getRow(i);
           //** Get Noof Columns**/
           for(int j=0;j<=row.getPhysicalNumberOfCells()-1;j++)
           {
               XSSFCell cell=row.getCell(j);
              // System.out.println(cell.getCellType());
               if(cell.getCellType().equals(CellType.STRING))
               {
                   System.out.println(cell.getStringCellValue());
               }
               else if(cell.getCellType().equals(CellType.NUMERIC)){
                   System.out.println(cell.getNumericCellValue());
               }
               else if(cell.getCellType().equals(CellType.BOOLEAN)){
                   System.out.println(cell.getBooleanCellValue());
               }
               else {
                   throw new Exception("Celltype not matched");
               }
           }

       }
    }
}
