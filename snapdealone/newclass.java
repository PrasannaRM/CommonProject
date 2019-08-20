package snapdealone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class newclass {
	
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "D:\\Karthika\\git\\july930final\\Drivvvve\\chromedriver.exe");
	WebDriver d = new ChromeDriver();
	d.get("https://www.snapdeal.com/");
	WebElement t = d.findElement(By.id("inputValEnter"));
	t.sendKeys("iphone 6");
	
	WebElement cart= d.findElement(By.xpath("//span[text()='Cart']"));
		cart.click();
		


}

}
