package snapdealone;

import java.util.Set;

import org.apache.commons.exec.util.DebugUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.seleniumhq.jetty9.server.DebugListener;
import org.seleniumhq.jetty9.server.handler.DebugHandler;

public class newclass {
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Balaji\\eclipse-workspace2\\Balaji\\src\\org\\cts\\july930final\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		WebElement search=driver.findElement(By.xpath("//input[@id='inputValEnter']"));
		search.sendKeys("iphone 7");
		WebElement enter=driver.findElement(By.xpath("//button[@class='searchformButton col-xs-4 rippleGrey']"));
		enter.click();	
		String par = driver.getWindowHandle();
	    Set<String> All= driver.getWindowHandles();
		System.out.println(par+"\n"+All);
		for(String M:All){
			if(!M.equals(par)){
				driver.switchTo().window(M);
				WebElement crt=driver.findElement(By.id("add-cart-button-id"));
				crt.click();
				WebElement chck=driver.findElement(By.xpath("//a[@class='btn marR5']"));
			chck.click();
			}
}}}
