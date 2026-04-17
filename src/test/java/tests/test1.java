package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class test1 {
	
	@Test
	public void guidanz1() throws InterruptedException
	{
		WebDriver driver= new ChromeDriver();
		Thread.sleep(3000);
		driver.get("https://www.naukri.com/mnjuser/homepage");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		Reporter.log("guidanz1 is pass", true);	
	}
	
	
	@Test
	public void guidanz2() throws InterruptedException
	{
		WebDriver driver= new ChromeDriver();
		Thread.sleep(3000);
		driver.get("https://www.cummins.com/en-na/parts-and-service/digital-products-and-services/guidanz");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		Reporter.log("guidanz2 is pass", true);	
	}

}
