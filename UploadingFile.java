package MyFirstSeleniumCode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadingFile {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
		driver.manage().window().maximize();
		WebElement ele = driver.findElement(By.xpath("//input[@id='photo']"));
		ele.sendKeys("C:\\Users\\udhai\\OneDrive\\Documents\\Document.docx");
		
		
		

	}

}
