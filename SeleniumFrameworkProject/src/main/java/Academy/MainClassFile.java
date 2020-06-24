package Academy;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.core.util.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MainClassFile {

	public static WebDriver driver;
	public Properties prop;

	// Create a driver method
	public WebDriver initializeDriver() throws IOException {

		// connect data.properties file that have all browsers
		Properties prop = new Properties();
		//FileInputStream fis = new FileInputStream(
		//		"/Users/surajkute/eclipse-workspace/SeleniumFrameworkProject/src/main/java/Academy/data.properties");
         //dynamically giving the file location without complete path
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"/src/main/java/Academy/data.properties");
		
		
		prop.load(fis);
		String browserName = prop.getProperty("browser");

		if (browserName.equals("chrome")) {
			// Chrome driver

			System.setProperty("webdriver.chrome.driver",
					"/Users/surajkute/eclipse-workspace/SeleniumFrameworkProject/drivers/chromedriver");
			/*making chromedriver1 headless
			ChromeOptions options = new ChromeOptions();
			options.addArguments("headless");*/
			
			
			driver = new ChromeDriver();
		} else if (browserName.equals("firefox")) {
			// Firefox driver
			driver = new FirefoxDriver();

		} else if (browserName.equals("IE")) {

			// Internet Explorer driver
		}

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}

	

	/*public void getScreenshots() {
		// TODO Auto-generated method stub
		//for taking the screenshot and putting it in the file
				File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				//taking the screenshot from src1 to the computer
				FileUtils.getFileExtension(src);
		
	}*/

}
