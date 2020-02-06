package pages;

import base.Basefile;

public class MyAccountPage extends Basefile{
	public MyAccountPage clickNewsletter() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElementByXPath("(//a[@onclick='mySelectUpdate()'])[4]").click();
		return this;
		
	}

	public MyAccountPage sliderSubscription() {
		driver.findElementByXPath("(//input[@class='newsletter']//following::span)[1]").click();
		return this;
	}
	
	public MyAccountPage enterEmailToSubscribe() {
		driver.findElementByXPath("//input[@id='exampleInputEmail1']").sendKeys("nishavenkat@gmail.com");
		return this;
	}
	
	public MyAccountPage clickSubscribe() {
		driver.findElementByXPath("(//button[@type='submit'])[2]").click();
		return this;
	}
	public MyAccountPage readResponse() {
		String value=driver.findElementByXPath("//a[@class='newstext']/div").getText();
		System.out.println(value);
		return this;
	}
}
