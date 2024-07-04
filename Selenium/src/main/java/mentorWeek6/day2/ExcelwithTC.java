 package mentorWeek6.day2;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelwithTC {


	//step2 create input args and pass into workbook
	public static String[][] excelData(String filedata) throws IOException {
	
		XSSFWorkbook wb=new XSSFWorkbook("./data/"+filedata+".xlsx");
			
		XSSFSheet sheet=wb.getSheetAt(0);	
		XSSFRow row=sheet.getRow(1);
	int rowcount = sheet.getLastRowNum();
	int cellcount= row.getLastCellNum();

	//step 1 create string[][] with row and cell count
	String[][] data=new String[rowcount][cellcount];
	
	
	for (int i = 1; i <=rowcount; i++) {
		for (int j = 0; j < cellcount; j++) {
			String datavalue = sheet.getRow(i).getCell(j).getStringCellValue();
			
			data[i-1][j]=datavalue;
		
		}	
	}
	wb.close();
	
	//step3
	return data;
	}

}
