package testcase;

import org.testng.annotations.Test;

import base.Basefile;
import pages.HomePage;

public class FindFlights extends Basefile {
@Test
public void searchFlights() throws InterruptedException {
	new HomePage().clickFlights().enterFlightDetails().searchResultsCount().selectRouteStops();
}

}
