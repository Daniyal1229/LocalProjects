package ReadDataFromExxcel;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadInputDataFromExcel {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("D:\\projects\\java projects\\Java Projects\\resources\\java\\daniyal.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        XSSFSheet sheet = workbook.getSheet("daniyal");
        int rowCount = sheet.getLastRowNum();
        int columnCount = sheet.getRow(1).getLastCellNum();
        for (int i=1; i<=rowCount;i++){
            XSSFRow currentRow = sheet.getRow(i);
            for (int j=0;j<columnCount; j++){
                String cellValue = currentRow.getCell(j).toString();
                System.out.println("\t\t" + cellValue);
            }
            System.out.println();
        }
        workbook.close();
    }
}
