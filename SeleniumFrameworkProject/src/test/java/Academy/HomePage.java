package Academy;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.io.IOException;

import org.testng.annotations.Test;

//import org.junit.Test;

import Academy.MainClassFile;
import pageObjects.LandingPage;
import pageObjects.LoginPage;

public class HomePage extends MainClassFile {

	/*@BeforeTest
	public void initialize() throws IOException {
		driver = initializeDriver();

		driver.get("http://www.qaclickacademy.com/");
	}*/

	@Test
	public void basePageNavigation() throws IOException {
		driver = initializeDriver();
		driver.get("http://www.qaclickacademy.com/");
		// Taking url1 from MainClassFile prop porperty1 via text file(data.properties)
		// driver.get(prop.getProperty("url"));

		// To access landing page there are two methods. One is inheritance
		// second is creating object to that class and invoke methods of it. we will use
		// this method
		LandingPage l = new LandingPage(driver);
		l.getLogin().click(); // it is similar to driver.findElement(By.css())

		// Passing the login page class in homepage
		LoginPage lp = new LoginPage(driver);
		lp.getEmail().sendKeys("charushila.awhad@gmail.com");
		lp.getPassword().sendKeys("charu123");
		lp.getLogin().click();

	}

	@AfterTest
	public void teardown() {
		driver.close();
	}

}
