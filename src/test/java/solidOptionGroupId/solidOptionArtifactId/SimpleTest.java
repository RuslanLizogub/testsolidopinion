package solidOptionGroupId.solidOptionArtifactId;

import org.testng.annotations.Test;

import pages.RegistrationPage;
import pages.WelcomePage;
import settings.FirefoxSettings;

public class SimpleTest extends FirefoxSettings {

	@Test
	public void SimpleRegistration() throws InterruptedException{
		RegistrationPage registrationPage = new RegistrationPage(driver);
		registrationPage.typeName(userName);
		registrationPage.typeEmail(userEmail);
		registrationPage.typePassword(userPassword);
		registrationPage.typePassword2(userPassword2);
		registrationPage.clickGo_signupElement();
		
		Thread.sleep(5000);
		WelcomePage welcomePage = new WelcomePage(driver);
		welcomePage.assertUserName(userName);
	}

}
