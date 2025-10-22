package selenium;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {

	public static void main(String[] args) {
		
		String fileLocation = "./src/test/resources/testdata/OpenCartTestData.xlsx";
			
		readExcel(fileLocation, 0);

	}
	
	public static void readExcel(String filePath, int sheetIndex) 
	{
		DataFormatter formatter = new DataFormatter();
		
		try {
			FileInputStream fis = new FileInputStream(filePath);
			
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			
			XSSFSheet sheet = wb.getSheetAt(sheetIndex);
			
			int lastRow = sheet.getLastRowNum();
			int lastCell = sheet.getRow(0).getLastCellNum();
			
			for(int i =1; i<=lastRow; i++)
			{
				Row row = sheet.getRow(i);
				
				if (row == null) continue;
				
				for(int j=0; j<lastCell; j++)
				{
					Cell cell = row.getCell(j);
					
					String value = formatter.formatCellValue(cell);
					System.out.println(value + "\t");
					
				}
				System.out.println();
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
