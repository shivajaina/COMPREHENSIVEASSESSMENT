import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TC1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Desktop\\drivers\\chromedriver.exe");
		
		
		 ChromeOptions option = new ChromeOptions();
		 option.addArguments("--disable-notifications");
		 WebDriver driver = new ChromeDriver(option);
		 driver.manage().window().maximize();
		driver.get("https://www.eazydiner.com/");
		//driver.findElement(By.id("main-city"));
		driver.findElement(By.linkText("About Us")).click();
		Thread.sleep(5000L);
		//driver.findElement(By.id("help")).click();
		driver.findElement(By.xpath("/html/body/div[6]/div/div/div/ul/li[1]/a/span")).click();

		
		
	}
}
       // driver.findElement(By.xpath("/html/body/div[6]/div/div/div/ul/li[1]/a/span")).click();