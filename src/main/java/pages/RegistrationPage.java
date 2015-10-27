package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPage {
private WebDriver driver;
	
	public RegistrationPage(WebDriver driver){
		this.driver = driver;
	}
	
	By nameLocator = By.id("name");
	By emailLocator = By.id("email");
	By passwordLocator = By.id("password");
	By password2Locator = By.id("password2");
	By go_signupLocator = By.id("go_signup");
	
}
