package mentorWeek2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnSelectClass {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/select.xhtml");
		
		//create webelement-if using same code multiple times
		//crtl+2->L
		//findElement return type is WebElement
		
		//step 1
		WebElement selec = driver.findElement(By.className("ui-selectonemenu"));
		
		//Select class syntax
		
		//step 2
		Select op=new Select(selec);
		
		
		//step 3
		//op.selectByIndex(3);
		
		op.selectByVisibleText("Playwright");
		
		//get title of the page 
		String title =driver.getTitle();
		
		System.out.println(title);
		
	}

}
