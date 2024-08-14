package firstPro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MyfirstTest {
	WebDriver driver = new ChromeDriver();
//	WebDriver driver2 = new EdgeDriver();   
	

	@BeforeTest
	public void mySetup() {
		
driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
	}
 
	
	
	
	@Test
	public void myFirstTest() {
		
driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys("Manar Baker linkedin");
		
	
driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]")).click();

driver.findElement(By.xpath("//*[@id=\"rso\"]/div[2]/div/div/div[1]/div/div/span/a/h3")).click();
	}

}
