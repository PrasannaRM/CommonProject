package snapdealone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class newclass {
	
public static void main(String[] args) {
	System.setProperty("Webdriver.chrome.driver", "C:\\Users\\Janakiram\\eclipse-workspace\\Selenium1\\src\\july930final\\driver\\chromedriver.exe");
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		WebElement s=driver.findElement(By.xpath("https://www.snapdeal.com/"));
		s.sendKeys("HP laptop");
		WebElement s1=driver.findElement(By.xpath("//span[@class='searchTextSpan']"));
		s1.click();

// Thiru adding this line again
		//Added
}

}
