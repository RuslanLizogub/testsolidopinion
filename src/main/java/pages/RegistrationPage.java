package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

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
	
	public void typeName(String userName){
		WebElement name = driver.findElement(nameLocator);
		name.click();
		name.clear();
		name.sendKeys(userName);
	}
	
	public void typeEmail(String userEmail){
		WebElement email = driver.findElement(emailLocator);
		email.click();
		email.clear();
		email.sendKeys(userEmail);
	}
	
	public void typePassword(String userPassword){
		WebElement password = driver.findElement(passwordLocator);
		password.click();
		password.clear();
		password.sendKeys(userPassword);
	}
	
	public void typePassword2(String userPassword2){
		WebElement password2 = driver.findElement(password2Locator);
		password2.click();
		password2.clear();
		password2.sendKeys(userPassword2);
	}
	
	public void clickGo_signupElement(){
		driver.findElement(go_signupLocator).click();
	}
	
}
