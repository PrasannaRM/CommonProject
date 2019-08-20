package snapdealone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class newclass {
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shylaja\\eclipse-workspace\\july930final\\driver\\chromedriver76.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.snapdeal.com/login");
		WebElement username=driver. findElement(By.id("userName"));
		username.sendKeys("7824027045");
		System.out.println("Done");
		WebElement Continue = driver.findElement(By.id("checkUser"));
		Continue.click();
		WebElement email = driver.findElement(By.id("j_username_new"));
		email.sendKeys("sathishkumar@gmail.com");
		
			
}
}
