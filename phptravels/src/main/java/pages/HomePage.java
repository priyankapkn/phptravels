package pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import base.Basefile;

public class HomePage extends Basefile{

	public HomePage clickMyAccounts() {
		driver.findElementByXPath("(//a[@id='dropdownCurrency'])[2]").click();
		return this;
	}
	
	public LoginPage clickLogin() {
		driver.findElementByXPath("//a[text()='Login']").click();
		return new LoginPage();
	}
	public LoginNewsLetter newsLogin() {
		driver.findElementByXPath("//a[text()='Login']").click();
		return new LoginNewsLetter();
	}
	
	public HomePage clickFlights() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElementByXPath("//a[@class='text-center flights ']").click();
		return this;
	}
	
	public ResultPage enterFlightDetails() {
	driver.findElementByXPath("(//label[@class='custom-control-label'])[1]").click();
	driver.findElementByXPath("(//span[@class='select2-chosen'])[2]").click();
	driver.findElementByXPath("(//span[@class='select2-chosen'])[2]").sendKeys("MAA",Keys.TAB);
	driver.findElementByXPath("(//span[@class='select2-chosen'])[3]").sendKeys("Madurai");
	driver.findElementByXPath("(//i[@class='bx bx-calendar'])[3]").click();
	driver.findElementByXPath("datepicker--cell datepicker--cell-day -current-").click();
	driver.findElementByXPath("(//button[@class='btn btn-white bootstrap-touchspin-up '])[3]").click();
	driver.findElementByXPath("(//button[@class='btn btn-white bootstrap-touchspin-up '])[4]").click();
	driver.findElementByXPath("(//button[@type='submit'])[2]").click();
	return new ResultPage();
	}
	
	public HomePage featuredTours() {
		WebElement tour= driver.findElementByXPath("//h5[text()='Spectaculars Of The Nile 3 Nights']");
		Actions builder=new Actions(driver);
		builder.moveToElement(tour).pause(1000).click(driver.findElementByXPath("//span[text()='Book Now']")).perform();
		driver.findElementByXPath("(//span[text()='Share'])[1]").click();
		Set<String> windowHandles=driver.getWindowHandles();
		System.out.println(windowHandles.size());
		List<String> lisOfWindows=new ArrayList<>();
		lisOfWindows.addAll(windowHandles);
		driver.switchTo().window(lisOfWindows.get(1));
		driver.close();
		driver.switchTo().window(lisOfWindows.get(0));
		driver.findElementByXPath("(//input[@name='date'])[1]").sendKeys("//input[@name='date']");
		driver.findElementByXPath("//select[@id='selectedAdults']").sendKeys("3");
		driver.findElementByXPath("(//button[@type='submit'])[3]").click();
		System.out.println(driver.findElementByXPath("//h3[@class='heading-title']").getText()); 
	return this;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
