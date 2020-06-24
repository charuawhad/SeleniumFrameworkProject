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

public class ValidateTitle extends MainClassFile {

	@BeforeTest
	public void initialize() throws IOException {
		driver = initializeDriver();

		driver.get("http://www.qaclickacademy.com/");
	}

	@Test
	public void basePageNavigation() throws IOException {
		// driver = initializeDriver();
		// driver.get("http://www.qaclickacademy.com/");
		// Taking url1 from MainClassFile prop porperty1 via text file(data.properties)
		// driver.get(prop.getProperty("url"));

		// To access landing page there are two methods. One is inheritance
		// second is creating object to that class and invoke methods of it. we will use
		// this method
		LandingPage l = new LandingPage(driver);
		// l.getTitle().getText();

		// Compare the text from the browser with actual text-Error
		AssertJUnit.assertEquals(l.getTitle().getText(), "FEATURED COURSES");
		

	}
	
	@Test
	public void validateHeader() throws IOException {
		
		LandingPage l = new LandingPage(driver);
		
		AssertJUnit.assertEquals(l.getHeader().getText(), "AN ACADEMY TO LEARN EVERYTHING ABOUT TESTING");
		

	}


	@AfterTest
	public void teardown() {
		driver.close();
	}

}
