package testcase;

import org.testng.annotations.Test;

import base.Basefile;
import pages.HomePage;

public class FeaturedTours extends Basefile {
@Test
public void testfeaturedTours() {
	new HomePage().featuredTours();
}

	
}
