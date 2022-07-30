package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage {
	
	public WebDriver driver;
	By buyNowBtn = By.xpath("//input[contains(@value,'Buy Now')]");
	
	public CartPage(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		
		this.driver = driver2;
	}

	public WebElement getBuyNowBtn() {
		return driver.findElement(buyNowBtn);
		
	}

}
