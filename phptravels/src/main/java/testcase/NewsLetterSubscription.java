package testcase;

import org.testng.annotations.Test;

import base.Basefile;
import pages.HomePage;

public class NewsLetterSubscription extends Basefile{
	@Test
	
public void subscribenewsletter() throws InterruptedException {
	
	new HomePage().clickMyAccounts().newsLogin().enterEmail().enterPassword().clickLogin()
	.clickNewsletter().sliderSubscription().enterEmailToSubscribe().clickSubscribe().readResponse();
	
	
	
}
	



}
