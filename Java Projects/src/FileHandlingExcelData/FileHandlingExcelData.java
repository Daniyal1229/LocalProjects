package FileHandlingExcelData;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class FileHandlingExcelData {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("D:\\projects\\java projects\\Java Projects\\resources\\java\\daniyal.xlsx    ");
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        XSSFSheet sheet = workbook.getSheet("Sheet1");
        int rowCount = sheet.getLastRowNum();
        int columnCount = sheet.getRow(1).getLastCellNum();

        //System.out.println("Rows: " + rowCount );
        //System.out.println("Columns: " + columnCount);

        for (int i=1; i<=rowCount; i++){  // Skipping the Heading (Starting from row 1)
            XSSFRow currentRow = sheet.getRow(i);
            for (int j=0;j<columnCount; j++){
                String cellValue = currentRow.getCell(j).toString();
                System.out.print("\t\t" + cellValue);
            }
            System.out.println();
        }
        workbook.close(); // Always close the workbook after using it.
    }
}
