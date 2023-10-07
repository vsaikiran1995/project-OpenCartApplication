package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class PurchaseProductE2EFlowPage {
	WebDriver driver;
	By mp3PlayerTab = By.xpath("//a[text()='MP3 Players']");
	By mp3PlayerTabAll = By.xpath("//a[text()='Show All MP3 Players']");
	By product = By.xpath("//div[@class='product-thumb']//div[@class='caption']//a[text()='iPod Classic']");
	By addToCartBtn = By.xpath("//button[@id='button-cart']");
	By cartBtn = By.xpath("//span[@id='cart-total']");
	By checkoutBtn = By.xpath("//strong[text()=' Checkout']");
	By firtName = By.xpath("//input[@name='firstname']");
	By lastName = By.xpath("//input[@name='lastname']");
	By company = By.xpath("//input[@name='company']");
	By address1 = By.xpath("//input[@name='address_1']");
	By city = By.xpath("//input[@name='city']");
	By postcode = By.xpath("//input[@name='postcode']");
	By countryDD = By.xpath("//select[@name='country_id']");
	By stateDD = By.xpath("//select[@name='zone_id']");
	By continueBtn = By.xpath("//input[@id='button-payment-address']");
	By continueBtn2 = By.xpath("//input[@id='button-shipping-address']");
	By textArea = By.xpath("//textarea[@name='comment']");
	By continueBtn3 = By.xpath("//input[@id='button-shipping-method']");
	By checkBox = By.xpath("//input[@type='checkbox']");
	By continueBtn4 = By.xpath("//input[@id='button-payment-method']");
	By confirmBtn = By.xpath("//input[@id='button-confirm']");
	By orderConfirmText = By.xpath("//h1[text()='Your order has been placed!']");
	By continueBtn5 = By.xpath("//a[text()='Continue']");
	  
	
	public PurchaseProductE2EFlowPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void clickMp3PlayersTab() {
		driver.findElement(mp3PlayerTab).click();
	}
	public void clickMpePlayersAll() {
		driver.findElement(mp3PlayerTabAll).click();
	}
	public void selectProduct() {
		driver.findElement(product).click();
	}
	public void clickAddtoCart() {
		driver.findElement(addToCartBtn).click();
	}
	public void clickCartBtn() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(cartBtn).click();
	}
	public void clickCheckoutBtn() {
		driver.findElement(checkoutBtn).click();
	}
	public void setFirtName() {
		driver.findElement(firtName).sendKeys("Test05");
	}
	public void setLastName() {
		driver.findElement(lastName).sendKeys("Test05");
	}
	public void setCompany() {
		driver.findElement(company).sendKeys("Test05");
	}
	public void setAddress() {
		driver.findElement(address1).sendKeys("Test05");
	}
	public void setCity() {
		driver.findElement(city).sendKeys("Hyderabad");
	}
	public void setPostalCode() {
		driver.findElement(postcode).sendKeys("Test05");
	}
	public void setCountryDD() {
		WebElement countrys = driver.findElement(countryDD);
		Select s = new Select(countrys);
		s.selectByVisibleText("India");
	}
	public void setStateDD() {
		WebElement states = driver.findElement(stateDD);
		Select s = new Select(states);
		s.selectByVisibleText("Telangana");
	}
	public void clickContinueBtn() {
		driver.findElement(continueBtn).click();
	}
	public void clickContineuBtn2() {
		driver.findElement(continueBtn2).click();
	}
	public void setTextArea() {
		driver.findElement(textArea).sendKeys(null);
	}
	public void clickContinueBtn3() {
		driver.findElement(continueBtn3).click();
	}
	public void setCheckbox() {
		driver.findElement(checkBox).click();
	}
	public void clickContinueBtn4() {
		driver.findElement(continueBtn4).click();
	}
	public void clickConfirmBtn() {
		driver.findElement(confirmBtn).click();
	}
	public void verifyOrderConfirmText() {
		driver.findElement(orderConfirmText).isDisplayed();
	}
	public void clickContinueBtn5() {
		driver.findElement(continueBtn5).click();
	}
}
