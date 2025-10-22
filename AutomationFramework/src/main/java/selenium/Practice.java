package selenium;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Practice {

	public static void main(String[] args) throws Exception {
		
		String fileLocation = "./src/test/resources/testdata/OpenCartTestData.xlsx";
		
		readExcel(fileLocation, 0);

	}
	
	public static void readExcel(String filePath, int sheetIndex) throws Exception
	{
		DataFormatter formatter = new DataFormatter();
		
		FileInputStream fis = new FileInputStream(filePath);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sheet = wb.getSheetAt(sheetIndex);
		
		int lastRow = sheet.getLastRowNum();
		
		int lastCell = sheet.getRow(0).getLastCellNum();
		
		for(int i=1; i<=lastRow; i++)
		{
			XSSFRow row = sheet.getRow(i);
			
			if(row == null) continue;
			
			for(int j=0; j<lastCell; j++)
			{
				XSSFCell cell = row.getCell(j);
				
				String value = formatter.formatCellValue(cell);
				
				System.out.println(value+"\t");
			}
			System.out.println();	
		} 
		
	}

}
