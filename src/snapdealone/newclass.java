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

}
