package mentorWeek6.day2;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromExcel {

	public static void main(String[] args) throws IOException {
		
		//Step1
		XSSFWorkbook wb=new XSSFWorkbook("./data/Createlead1.xlsx");
		
		//step2 -sheet index value or name of the sheet
		XSSFSheet sheet=wb.getSheetAt(0);
		//XSSFSheet sh=wb.getSheet("sheet1")
		
		//step3-get row data
		
		XSSFRow row=sheet.getRow(1);
	int rowcount = sheet.getLastRowNum();
	//in this not have header row
	System.out.println("row count :"+rowcount);
	
	//include header data also
	int phy = sheet.getPhysicalNumberOfRows();
	System.out.println("include the header row :"+phy);
	
	//step4:get into cell
	int cellcount= row.getLastCellNum();
	System.out.println("cell count :"+cellcount);

	//step5
	String datavalue = sheet.getRow(1).getCell(2).getStringCellValue();
	System.out.println("row-1+cell-2 :"+datavalue);
	
	
	//print all set data
	
	for (int i = 1; i <=rowcount; i++) {
		for (int j = 0; j < cellcount; j++) {
			String data = sheet.getRow(i).getCell(j).getStringCellValue();
			System.out.println(data);
		}
		
	}
	}

}
