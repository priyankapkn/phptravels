package pages;

import org.testng.annotations.Test;

import base.Basefile;

public class LoginNewsLetter extends Basefile{
	@Test
	public LoginNewsLetter enterEmail() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElementByXPath("//input[@name='username']").sendKeys("kumar@gmail.com");
		return this;
	}

	public LoginNewsLetter enterPassword() {
		driver.findElementByXPath("//input[@name='password']").sendKeys("kumaran");
		return this;
	}
public MyAccountPage clickLogin() {
	driver.findElementByXPath("//button[@type='submit']").click();
	return new MyAccountPage();
}

}
