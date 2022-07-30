package craftsoftware;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageobject.CartPage;
import pageobject.LandingPage;
import pageobject.Login;
import pageobject.ProductPage;
import pageobject.RegistrationPage;

public class Testone extends Base {
	@Test
	public void initBrowser() throws IOException {
		driver = initializeBrowser();
		driver.get("http://shop.icraftsoft.net:8095/");
		
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
		
		//2504
		
		
	}
	
	@Test
	public void landingPage() {
		LandingPage lp = new LandingPage(driver);
		System.out.println(lp.getRegBtn().isDisplayed());
		lp.getRegBtn().click();
		driver.navigate().back();
	}
	@Test
	public void registrationPage() {
		RegistrationPage rp = new RegistrationPage(driver);
		rp.getUserName().sendKeys("capstoneqa14");
		
		rp.getEmail().sendKeys("capstoneqa14@gmail.com");
		rp.getSubmitBtn().click();
		
	}
	
	@Test
	public void loginPage() {
		Login login = new Login(driver);
		login.getLoginInput().sendKeys("2504");
		login.getLoginBtn().click();
		
		
	}
	@Test
	public void productPage() {
		ProductPage pg =new ProductPage(driver);
		pg.getValidate_header().getText();
		Assert.assertEquals("Craft Online Shopping", pg.getValidate_header().getText());
		pg.getItemOne().click();
		pg.getItemTwo().click();
		pg.getCartlink().click();
		System.out.println(pg.getBuyNowBtn().isDisplayed());
		System.out.println(pg.getBuyNowBtn().isEnabled());
		
		Assert.assertTrue(pg.getBuyNowBtn().isDisplayed());
		Assert.assertTrue(pg.getBuyNowBtn().isEnabled());
		pg.getBuyNowBtn().click();
		
	}
	
	//@Test
	public void cartPage()  {
		
		
		CartPage ct = new CartPage(driver);
//		System.out.println(ct.getBuyNowBtn().isDisplayed());
//		System.out.println(ct.getBuyNowBtn().isEnabled());
//		
//		Assert.assertTrue(ct.getBuyNowBtn().isDisplayed());
//		Assert.assertTrue(ct.getBuyNowBtn().isEnabled());
		ct.getBuyNowBtn().click();
	}

}









