package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegistrationPage {
	
	public WebDriver driver;
	
	By usernames = By.name("username");
	By email = By.name("email");
	By regbtn = By.className("btnSubmit");
	
	public RegistrationPage(WebDriver driver2) {
		this.driver=driver2;
	}

	public WebElement getUserName() {
		return driver.findElement(usernames);
		
	}
	
	public WebElement getEmail() {
		return driver.findElement(email);
		
	}
	public WebElement getSubmitBtn() {
		return driver.findElement(regbtn);
		
	}

}
