package automation_practise_concepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GenericGoogleSearch {
	
	

	
		
		public static void main(String[] args) throws Throwable {
			
			//By country=By.name("Country");
			
			WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://www.google.com/");
			
			driver.findElement(By.xpath("//input[@aria-label='Search']")).sendKeys("automation");
			
			List<WebElement> list=driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='wM6W7d WggQGd']//span"));
			
			System.out.println("total size of the list is:"+list.size());
			
			Thread.sleep(3000);
			
			
			
	        driver.close(); 

	}
		
	}


