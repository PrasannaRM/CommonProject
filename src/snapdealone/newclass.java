package snapdealone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class newclass {
	
public static void main(String[] args) 
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\subbian\\eclipse-workspace\\Arch\\WindowsHandling\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.snapdeal.com/");
	WebElement search=driver.findElement(By.xpath("//input[@id='inputValEnter']"));
	search.sendKeys("iphone 7");
	WebElement enter=driver.findElement(By.xpath("//button[@class='searchformButton col-xs-4 rippleGrey']"));
	enter.click();	


}

}
