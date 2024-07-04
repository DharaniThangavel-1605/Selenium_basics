package mentorWeek3.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindNoLinks {

	public static void main(String[] args) {

		ChromeDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		//list concept
		//findElements -return type -List<WebElement>
		List<WebElement> links = driver.findElements(By.tagName("a"));
		int size = links.size();
		System.out.println("total number of link : "+size);
		
		for (int i = 0; i < links.size(); i++) {
			
			String data = links.get(i).getText();
			
			System.out.println(data);
			//System.out.println(links.get(i));
		}
	}

}
