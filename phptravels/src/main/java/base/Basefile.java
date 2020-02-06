package base;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

public class Basefile {

	
		public static ChromeDriver driver;

		@BeforeMethod
		public void login() {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		   driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.phptravels.net/");
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}
		@DataProvider
		public String[][] sendData() throws IOException{
			String[][] read=new String[5][2];
			read[0][0]="nishavenkat@gmail.com";
			read[0][1]="999nisha";
			read[1][0]="rajvel@gmail.com";
			read[1][1]="raj2020";
			read[2][0]="gayu@gmail.com";
			read[2][1]="gayu1987";
			read[3][0]="priya@gmail.com";
			read[3][1]="pri1990";
			read[4][0]="kumar@gmail.com";
			read[4][1]="kumaran";
			return read;
		
		}
//		@AfterMethod
//		public void close() {
//			driver.close();
		}
	
	

