package Academy;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.io.IOException;

import org.testng.annotations.Test;

//import org.junit.Test;

import Academy.MainClassFile;
import pageObjects.LandingPage;
import pageObjects.LoginPage;

public class ValidateNavigationBar extends MainClassFile {

	@BeforeTest
	public void initialize() throws IOException {
		driver = initializeDriver();

		driver.get("http://www.qaclickacademy.com/");
	}

	@Test
	public void basePageNavigation() throws IOException {

		// Taking url1 from MainClassFile prop porperty1 via text file(data.properties)
		// driver.get(prop.getProperty("url"));

		// To access landing page there are two methods. One is inheritance
		// second is creating object to that class and invoke methods of it. we will use
		// this method
		LandingPage l = new LandingPage(driver);

		// l.getNavigationBar().isDisplayed();
		// If we pass this we will always expect whatever we pass is the argument is
		// true
		AssertJUnit.assertTrue(l.getNavigationBar().isDisplayed());

		// to show whatever argument we passed should be false
		AssertJUnit.assertFalse(false);

	}

	@AfterTest
	public void teardown() {
		driver.close();
	}

}
