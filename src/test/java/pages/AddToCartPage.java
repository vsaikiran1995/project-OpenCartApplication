package pages;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddToCartPage {

	WebDriver driver;
	WebDriverWait wait;
	By mp3PlayerTab = By.xpath("//a[text()='MP3 Players']");
	By mp3PlayerTabAll = By.xpath("//a[text()='Show All MP3 Players']");
	By product = By.xpath("//div[@class='product-thumb']//div[@class='caption']//a[text()='iPod Classic']");
	By addToCartBtn = By.xpath("//button[@id='button-cart']");
	By cartBtn = By.xpath("//span[@id='cart-total']");
	By productInCart = By.xpath("//table[@class='table table-striped']//a[text()='iPod Classic']");
	By product2 = By.xpath("//a[text()='iPod Nano']");
	By productInCart2 = By.xpath("//table[@class='table table-striped']//a[text()='iPod Nano']");
	By deleteProduct2 = By.xpath("//table/tbody/tr[1]/td/a/parent::td/following-sibling::td/button");
	By clickViewCart = By.xpath("//strong[text()=' View Cart']");
	By verifyViewCart = By.xpath("//h1[contains(text(),'1.00kg')]");
	By deleteProduct1 = By.xpath("//table/tbody/tr[1]/td/a/parent::td/following-sibling::td/button");
	By emptyCart = By.xpath("//p[text()='Your shopping cart is empty!']");
	By checkoutBtn = By.xpath("//strong[text()=' Checkout']");
	By checkOutPage = By.xpath("//h1[text()='Checkout']");

	public AddToCartPage(WebDriver driver) {
		this.driver = driver;
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

	public void verifyProductAddedInCart() {
		driver.findElement(productInCart).isDisplayed();
	}

	public void selectProduct2() {
		driver.findElement(product2).click();
	}

	public void verifyProductAddedInCart2() {
		driver.findElement(productInCart2).isDisplayed();
	}

	public void deleteProduct2() {
		driver.findElement(deleteProduct2).click();
	}

	public void clickViewCart() {
		driver.findElement(clickViewCart).click();
	}

	public void verifyViewCart() {
		driver.findElement(verifyViewCart).isDisplayed();
	}

	public void deleteProduct1() {
		driver.findElement(deleteProduct1).click();
	}

	public void verifyEmptyCart() {
		wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.presenceOfElementLocated(emptyCart));
		String actual = driver.findElement(emptyCart).getText();
		String expected = "Your shopping cart is empty!";
		Assert.assertEquals(expected, actual);
	}
	
	public void clickCheckOutBtn() {
		driver.findElement(checkoutBtn).click();
	}
	
	public void verifyCheckOutpage() {
		wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.presenceOfElementLocated(checkOutPage));
		String actual = driver.findElement(checkOutPage).getText();
		String expected = "Checkout";
		Assert.assertEquals(expected, actual);
	}

}
