package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WelcomePage {
	private WebDriver driver;

	public WelcomePage(WebDriver driver){
		this.driver = driver;
	}

	By userNameLocator = By.id("user_name");
	
	public void assertUserName(){
		Assert.assertEquals("Wrong user name!", driver.findElement(userNameLocator).getText(), "testName");
		System.out.println("User name OK!");
	}
}
