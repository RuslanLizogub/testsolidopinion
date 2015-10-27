package solidOptionGroupId.solidOptionArtifactId;

import org.testng.annotations.Test;

import pages.RegistrationPage;
import settings.FirefoxSettings;

public class SmokeTest extends FirefoxSettings {

	@Test
	public void SimpleRegistration(){
		RegistrationPage registrationPage = new RegistrationPage(driver);
		registrationPage.typeName(userName);
		
		String userEmail = Math.random()*99999 + "@gmail.com";
		registrationPage.typeEmail(userEmail);
		
		registrationPage.typePassword(userPassword);
		registrationPage.typePassword2(userPassword2);
		registrationPage.clickGo_signupElement();
	}

}
