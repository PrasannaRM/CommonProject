package snapdealone;

import java.io.File;
import java.util.Set;

import org.apache.commons.exec.util.DebugUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.seleniumhq.jetty9.server.DebugListener;
import org.seleniumhq.jetty9.server.handler.DebugHandler;

public class newclass {
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "H:\\Programs\\july930final\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		WebElement username=driver. findElement(By.id("og-url"));
		username.sendKeys("7834893890");
		System.out.println("Done");
		WebElement username1=driver. findElement(By.id("mail"));
		username1.sendKeys("sgs.vkl@gmail.com");
		TakesScreenshot tk = (TakesScreenshot)driver;
		File s = tk.getScreenshotAs(OutputType.FILE);
		System.out.println(s);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
			
}
}
