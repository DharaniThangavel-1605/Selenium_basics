package marathon;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v115.tethering.model.Accepted;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class tataCliq {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.tatacliq.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//button[@id='wzrk-confirm']")).click();
		Actions ac= new Actions(driver);
		WebElement brand=driver.findElement(By.xpath("//div[text()='Brands']"));
		ac.moveToElement(brand).perform();
		WebElement watch = driver.findElement(By.xpath("//div[text()='Watches & Accessories']"));
		ac.moveToElement(watch).perform();
		WebElement casio=driver.findElement(By.xpath("//div[text()='Casio']"));
		ac.click(casio).perform();
		WebElement selec = driver.findElement(By.xpath("//select[@class='SelectBoxDesktop__hideSelect']"));
		Select sort=new Select(selec);
		sort.selectByIndex(3);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",driver.findElement(By.xpath("//div[text()='Men']")));
		List<WebElement> price = driver.findElements(By.xpath("//div[contains(@class,'Description__priceHolder')]/h3"));
		for (int i = 1; i <= price.size(); i++)
		{
			//System.out.println(price.get(i).getText());
			String text = driver.findElement(By.xpath("(//div[contains(@class,'Description__priceHolder')]/h3)["+ i +"]")).getText();
			System.out.println(text);
		}
		Thread.sleep(3000);
		String text2 = driver.findElement(By.xpath("(//div[@class='ProductDescription__priceHolder'])[1]")).getText();
		Pattern p = Pattern.compile("\\d+");
        Matcher m = p.matcher(text2);
        while(m.find()) {
        	String num=m.group();
            System.out.println(num);
        }
		driver.findElement(By.xpath("(//div[@class='ProductModule__dummyDiv'])[1]")).click();	
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> allLink =new ArrayList<String>(windowHandles);
		driver.switchTo().window(allLink.get(1));	
		String text3 = driver.findElement(By.xpath("//div[@class='ProductDetailsMainCard__price']/h3")).getText();	
		Pattern p1 = Pattern.compile("\\d+");
        Matcher m1 = p1.matcher(text3);
        while(m1.find()) {
        	String num1=m1.group();
            System.out.println(num1);
        }
		driver.findElement(By.xpath("(//div[@class='Button__base']/span)[3]")).click();	
		String text = driver.findElement(By.xpath("//span[@class='DesktopHeader__cartCount']")).getText();
		System.out.println("Cart count"+text);
		driver.findElement(By.xpath("//div[@class='DesktopHeader__myBagShow']")).click();	
		Thread.sleep(3000);
		File snapShot= driver.getScreenshotAs(OutputType.FILE);
        File location=new File("./snap/shot.png");
        FileUtils.copyFile(snapShot, location);
        driver.switchTo().window(allLink.get(1)).close();
        driver.switchTo().window(allLink.get(0)).close();
	}

}
