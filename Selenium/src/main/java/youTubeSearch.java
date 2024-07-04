import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class youTubeSearch {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("RD Automation Learning");
		driver.findElement(By.id("search-icon-legacy")).click();
	}

}
