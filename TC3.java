import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TC3 {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Desktop\\drivers\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions ();
	    option.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(option);
		
		driver.get("https://www.eazydiner.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Book a Table']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='restaurants']/div[3]/div/div[3]/div[2]/div[2]/a")).click();
		
		driver.findElement(By.xpath("//button[contains(text(),'Continue to book a table')]")).click();
		driver.findElement(By.xpath("//*input[@id='guest_name']")).sendKeys("SHIVATEJA");
		driver.findElement(By.xpath("//*[@id='guest-form']/div/div[2]/div/div/input")).sendKeys("8008862790");
		driver.findElement(By.xpath("//*input[@id='guest_email']")).sendKeys("shivajaina0745@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='checkout-button'")).click();
	}
		
}
