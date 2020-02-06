package pages;

import org.testng.annotations.Test;

import base.Basefile;

public class LoginPage extends Basefile{
	@Test(dataProvider="sendData")
	public LoginPage enterEmail(String email) {
		driver.findElementByXPath("//input[@name='username']").sendKeys(email);
		return this;
	}

	public LoginPage enterPassword(String pass) {
		driver.findElementByXPath("//input[@name='password']").sendKeys(pass);
		return this;
	}
public MyAccountPage clickLogin() {
	driver.findElementByXPath("//button[@type='submit']").click();
	return new MyAccountPage();
}

}
