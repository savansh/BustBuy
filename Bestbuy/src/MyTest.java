import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class MyTest {

	WebDriver driver;
	
	@BeforeClass()
	public void SetUp() {
		System.out.println("Test");
		System.setProperty("webdriver.chrome.driver", "F:/SELENIUM/chromedriver.exe");
		driver=new ChromeDriver();

	}

	@Test()
	public void Test123(){
		System.out.println("Test Method");
	}
}
