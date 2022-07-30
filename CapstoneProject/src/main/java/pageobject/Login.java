package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login {
	public WebDriver driver;
	
	By loginInput = By.name("userid");
	By loginBtn = By.className("btnSubmit");
	
	public Login(WebDriver driver2) {
		this.driver=driver2;
	}
	public WebElement getLoginInput() {
		return driver.findElement(loginInput);
		
	}
	public WebElement getLoginBtn() {
		return driver.findElement(loginBtn);
		
	}
			
}
