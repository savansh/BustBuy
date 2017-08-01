import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class Bustbuy {
	
	static WebDriver driver;

	@BeforeClass(alwaysRun=true)
	public void SetUp() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:/SELENIUM/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.bestbuy.com");
		Thread.sleep(5000);

	}
	
	@Test
	public static void Test1() throws InterruptedException {
	  driver.findElement(By.name("select_locale")).sendKeys("United States - English");
	  driver.findElement(By.className("go_button")).click();
	  Thread.sleep(5000);
	  driver.switchTo().activeElement().findElement(By.className("close")).click();
	  
	  //Start Test
	  
		
		
	}
	

}
