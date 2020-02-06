# phptravels

All the scenarios are tested using Selenium
1.Run the cases from Testcases->Run As-> testNG file
2. For parallel , we should select the four test cases and convert to TestNG file 
3. Edit the testNG file and give parallel and threadcount parameters.
4. Then Run all the class files from TestNG.


Used Page Object Model for the Framework
Created a Maven project named phptravels
Add dependencies in pom.xml
Create package and class
I am using Page Object Model , hence i create classfile for LoginPage/HomePage/MyAccountPage with methods for each elements  under <pages> package
and classfile Login to call the methods  under <testcase> package

BaseFile created and maintained under base package :
contains 
@Before methods ( to launch browser, maximize, load url & implicitly wait)
@Dataprovider ( test data - 5 login accounts)
@After methods ( close browser)

SCENARIOS :
Assignment
Sample website - https://www.phptravels.net/
Assumptions: Data on the site is static

1. Automate the Login page
a. Verify several login credentials (around 5 accounts) using data-driven/parameterization approach
Pages :
1.HomePage ( click accounts->login)
2.Loginpage ( enter email, password and click login)
3.MyAccountPage 
Testcase :
Run case from testcase package
Login extends basefile( run Homepage and implements all the methods until click login)

2. Automate Newsletter subscription scenarios. The newsletter subscription is placed in the footer.
Pages :
1.HomePage ( click accounts->login)
2.LoginNewsLetter ( enter email, password and click login)
3.MyAccountPage ( click newsletter, slider subscription, enter email to subscribe, click subscribe, read already subscribed)
Testcase :
Run case from testcase package
NewsletterSubscription extends basefile and calls the methods in classfiles under Pages

3.Automate Flight search and Search results page scenarios
a. Apply Route stop filter and verify the results
b. Apply Airlines filter and verify the results

Pages :
1.HomePage ( select Flights and enter FROM/TO, Date, Adults and Search)
2.ResultPage ( print count of the results, click RouteStop ( 3 stop) and print the count, select Air india Airlines and print the count)
Testcase :
Run case from testcase package
FindFlights extends basefile and calls the methods in classfiles under Pages

4. Navigate to any Featured tour displayed under the Featured Tours section on the homepage. For example - Check this link (https://www.phptravels.net/tours/egypt/alexandria/Spectaculars-Of-The-Nile-3-Nights?date=27/01/2020&adults=2). Automate the scenarios for:
a. Validate the Social media sharing options
b. Validate the Booking Options section
c. Complete the booking by clicking on Book Now button *

Page :
HomePage featuredTours()
click on featured tours link using Actions class, click on facebook link, handle the windows using getWindowHandles, switch to windows, perform booking options and click book.
Test case :
FeaturedTours run the case by calling the featuredTours method from HomePage file.
	
