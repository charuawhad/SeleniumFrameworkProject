package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	//it is also know as page object class where we will write the xpath of all elements
	public WebDriver driver;
	
	private By signin=By.xpath("//div[@class='tools']//li[4]//a[1]");
	private By title=By.xpath("//h2[contains(text(),'Featured Courses')]");
	private By NavBar=By.xpath("//*[@id=\"homepage\"]/header/div[2]/div/nav/ul");
	private By header = By.xpath("//h3[contains(text(),'An Academy to learn Everything about Testing')]");
	
	
	

	public LandingPage(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		this.driver=driver2;
	}


   //signin method
	public WebElement getLogin() {
		return driver.findElement(signin);
	}
	
	//title method
	public WebElement getTitle() {
		return driver.findElement(title);
	}
	
	//navigation bar method
	public WebElement getNavigationBar() {
		return driver.findElement(NavBar);
	}
	
	//header method
		public WebElement getHeader() {
			return driver.findElement(NavBar);
		}
	

}
