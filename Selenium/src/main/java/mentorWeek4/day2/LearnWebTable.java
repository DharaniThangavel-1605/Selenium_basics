package mentorWeek4.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWebTable {

	public static void main(String[] args) {
		// https://www.leafground.com/table.xhtml

		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.leafground.com/table.xhtml");
		
		String firstRowData = driver.findElement(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody/tr/td")).getText();
		System.out.println("first row first data : "+firstRowData);
		
		
		String data = driver.findElement(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody/tr[5]/td[2]")).getText();
		System.out.println("specific row and col :"+ data);
		
		
		//get specific row data
		
		List<WebElement> rowValue = driver.findElements(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody/tr[2]/td"));
		int colsize = rowValue.size();
		System.out.println("Column size : "+colsize);
		for (int i = 0; i < rowValue.size(); i++) {
			String rowdata = rowValue.get(i).getText();
			System.out.println(rowdata);
		}
		
	//get specific col data -//div[@class='ui-datatable-scrollable-body']/table/tbody/tr/td[1]
		

		List<WebElement> colValue = driver.findElements(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody/tr/td[1]"));
		int rowsize = colValue.size();
		System.out.println("row size :"+rowsize);
		for (int i = 0; i < colValue.size(); i++) {
			String coldata = colValue.get(i).getText();
			System.out.println(coldata);
		}
		
		
		//print all rows and cols
		
		for (int i = 1; i <=rowsize ; i++) {
			
			for (int j = 1; j <=colsize ; j++) {
				
				String allvalues = driver.findElement(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody/tr["+i+"]/td["+j+"]")).getText();
System.out.println(allvalues);				
			}
		}
	}

}
