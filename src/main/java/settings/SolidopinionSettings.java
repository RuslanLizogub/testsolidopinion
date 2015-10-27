package settings;

import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class SolidopinionSettings {
	protected WebDriver driver;
	protected DesiredCapabilities cap;
	
	@BeforeSuite
	public static void login() throws MalformedURLException, FileNotFoundException, InterruptedException {
		
    }
	
	@BeforeMethod
	public void runAplication() throws InterruptedException, MalformedURLException{
		
	}
	
	@AfterMethod
	public void tearDown() throws InterruptedException{
		
	}
	

	@AfterSuite
	public static void logout() throws InterruptedException {
		
    }
	
}
