package settings;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class FirefoxSettings {
	protected WebDriver driver;
	protected String userName = "testName";
	protected String userPassword = "testPassword";
	protected String userPassword2 = "testPassword";
	
	@BeforeClass
	public void setUp(){
		driver = new FirefoxDriver();
		driver.get("https://my-release.solidopinion.com/signup");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@AfterClass
	public void tearDown(){
		driver.close();
	}

}
