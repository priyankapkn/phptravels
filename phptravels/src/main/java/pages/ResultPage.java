package pages;

import base.Basefile;

public class ResultPage extends Basefile {
	
	public ResultPage searchResultsCount() {
		System.out.println(driver.findElementByXPath("//ul[@id='LIST']").getSize());
		return this;
	}
	
	public ResultPage selectRouteStops() {
		driver.findElementByXPath("//label[text()=' 3 Stop']").click();
		System.out.println(driver.findElementByXPath("//ul[@id='LIST']").getSize());
		return this;
		}
	public ResultPage selectAirlines() {
		driver.findElementByXPath("((//div[@class='box-content'])[3]/div)[3]").click();
		System.out.println(driver.findElementByXPath("//ul[@id='LIST']").getSize());
		return this;
	}

}
