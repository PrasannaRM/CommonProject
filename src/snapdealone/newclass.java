package snapdealone;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.File;
import java.util.Set;

import org.apache.commons.exec.util.DebugUtils;

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
		WebElement username1=driver. findElement(By.id("mail"));
		username1.sendKeys("sgs.vkl@gmail.com");
		TakesScreenshot tk = (TakesScreenshot)driver;
		File s = tk.getScreenshotAs(OutputType.FILE);
		System.out.println(s);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		WebElement cart = driver.findElement(By.xpath("//span[text()='Cart']"));
		cart.click();
		
		driver.close();
			driver.quit();
			
			

}
}
