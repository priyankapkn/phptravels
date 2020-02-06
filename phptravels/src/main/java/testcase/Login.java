package testcase;

import org.testng.annotations.Test;

import base.Basefile;
import pages.HomePage;

public class Login extends Basefile{
	@Test(dataProvider="sendData")
	
public void Loginuser(String email,String pass) {
	
	new HomePage().clickMyAccounts().clickLogin().enterEmail(email).enterPassword(pass).clickLogin(); 
	
	
	
}
	



}
