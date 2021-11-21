import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
public class TC2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Desktop\\drivers\\chromedriver.exe");
		//access the url case
		ChromeOptions option = new ChromeOptions ();
	    option.addArguments("--disable-notifications");
		WebDriver w = new ChromeDriver(option);
	
		w.get("https://www.eazydiner.com/");
		//search case
		WebElement ws=w.findElement(By.id("home-search"));
		ws.click();
    	ws.sendKeys("Moonlight");
    	Thread.sleep(2000);
    	ws.submit();
     	w.findElement(By.xpath("//button[@id='apxor_search']")).click();	
    	
    	}
	}