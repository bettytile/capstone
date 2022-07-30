package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductPage {
	
	public WebDriver driver;
	
	By addItemOne = By.xpath("//tbody/tr[1]/td[1]/div[1]/div[4]/form[1]/button[1]");
	By addItemTwo  = By.xpath("//tbody/tr[1]/td[2]/div[1]/div[4]/form[1]/button[1]");
	By validate_header = By.xpath("//h3[contains(text(),'Craft Online Shopping')]");
	By cartLink = By.xpath("//body/nav[1]/div[1]/div[3]/ul[1]/li[1]/a[1]");
	By buyNowBtn = By.xpath("//input[contains(@value,'Buy Now')]");
	
	public ProductPage(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		
		this.driver = driver2;
	}
	public WebElement getCartlink() {
		return driver.findElement(cartLink);
		
	}
	public WebElement getItemOne() {
		return driver.findElement(addItemOne);
		
	}
	public WebElement getItemTwo() {
		return driver.findElement(addItemTwo);
		
	}
	public WebElement getValidate_header() {
		return driver.findElement(validate_header);
		
	}
	public WebElement getBuyNowBtn() {
		return driver.findElement(buyNowBtn);
		
	}

}
