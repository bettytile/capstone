package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	
	public WebDriver driver;
	 By registrationBtn = By.xpath("//input[@value='Register']");
	 
	 public LandingPage(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		 this.driver= driver2;
	}

	public WebElement getRegBtn() {
		 return driver.findElement(registrationBtn);
	 }
	 
	

}
