import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginPage extends Base{
	@BeforeTest
	public void initialize() throws IOException
	{
	
		 driver =initializeDriver();

	}
	@Test
	public void loginValidation(){
		
		
		driver.findElement(By.id("identifierId")).clear();
		driver.findElement(By.id("identifierId")).sendKeys("priyakumar2997@gmail.com");
		driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		//driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("        ")).sendKeys("         ");
		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		String actual = driver.getTitle();
		Assert.assertEquals(actual, "Gmail");
		System.out.println("Successfully logged in!!");
		
	}
	@AfterTest
	 public void terminateBrowser(){
       driver.close();
   }
	}


