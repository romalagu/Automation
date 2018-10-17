package Utility;

import Utility.CommonFields;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;

public class UtilityMethods {

    private static File file;
    private static FileInputStream is;
    private static XSSFWorkbook workbook;
    private static XSSFSheet sheet;
    private static XSSFCell cell;
    private static XSSFRow row;
    private static int rowNum;
    private static int colNum;
    private static String filePath;
    private static String currentDir;
    private static String cellData;


    public static void createFilePath(){

    }

    public static void setExcelFile(String sheetName) {
        try {
            currentDir = System.getProperty("user.dir");
          //  filePath = currentDir + CommonFields.Path_TestData+CommonFields.FileName_TestData;
            // Open the Excel file
            FileInputStream excelFile = new FileInputStream(filePath);
            // Access the required test data sheet
            workbook = new XSSFWorkbook(excelFile);
            sheet = workbook.getSheet(sheetName);
        } catch (Exception e){
            e.printStackTrace();
        }

    }

    public static void getCellData() {
        try {
            rowNum = sheet.getPhysicalNumberOfRows();
            for (int i = 1; i < rowNum; i++) {

                colNum = sheet.getRow(i).getLastCellNum();
                for (int j = 0; j < colNum; j++) {

                   // System.out.println(rowNum+" "+colNum);
                    cell =  sheet.getRow(i).getCell(j);
                    cell.setCellType(CellType.STRING);
                    cellData = sheet.getRow(i).getCell(j).getStringCellValue();
                    System.out.println(cellData);
                }
            }




        } catch (Exception e) {
            e.printStackTrace();

        }
    }

    public static void main(String a[]){


    }
}
