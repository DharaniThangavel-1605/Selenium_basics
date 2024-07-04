package addExcel;

import java.io.IOException;

import org.apache.poi.xssf.streaming.SXSSFRow;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class integrateExcel {

	public static String[][] excelData(String fileData) throws IOException 
	{
		// TODO Auto-generated method stub
		XSSFWorkbook wb=new XSSFWorkbook("./data/"+fileData+".xlsx");
		XSSFSheet sheet=wb.getSheetAt(0);
		XSSFRow row=sheet.getRow(1);
		int rowCount = sheet.getLastRowNum();
		int cellCount = row.getLastCellNum();	
		String[][] data=new String[rowCount][cellCount];
		
		for (int i = 1; i <= rowCount; i++) 
		{
			for (int j = 0; j <cellCount; j++) {
				String dataValue = sheet.getRow(i).getCell(j).getStringCellValue();
				data[i-1][j]=dataValue;
			}
		}
		wb.close();
		
		return data;
		
	}

}
