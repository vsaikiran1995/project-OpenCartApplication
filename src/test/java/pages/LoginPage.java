package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;

import junit.framework.Assert;

public class LoginPage {
	
	WebDriver driver;
	By myAccountBtn = By.xpath("//span[text()='My Account']");
	By loginBtn = By.xpath("//a[text()='Login']");
	By username = By.xpath("//input[@name='email']");
	By pwd = By.xpath("//input[@name='password']");
	By submitBtn = By.xpath("//input[@type='submit']");
	By accounttab = By.xpath("//a[text()='Account']");
	By loginError = By.xpath("//div[text()=' Warning: No match for E-Mail Address and/or Password.']");
	By loginErrorMulti = By.xpath("//div[text()=' Warning: Your account has exceeded allowed number of login attempts. Please try again in 1 hour.']");
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	public void clickMyAccountBtn() {
		driver.findElement(myAccountBtn).click();
	}
	public void clickLogin() {
		driver.findElement(loginBtn).click();
	}
	public void setUserName(String name) {
		driver.findElement(username).sendKeys(name);
	}
	public void setPwd(String password) {
		driver.findElement(pwd).sendKeys(password);
	}
	public void clickSubmitBtn() {
		driver.findElement(submitBtn).click();
	}
	public void verifyLoginSuccess() {
		String currentUrl = "https://naveenautomationlabs.com/opencart/index.php?route=account/account";
		String actualUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl, actualUrl);
	}
	public void verifyUnsuccessLogin() throws InterruptedException,TimeoutException {
		try{	
		System.out.println("try block "+driver.findElement(loginErrorMulti).isDisplayed());	
		}
		catch(NoSuchElementException e){
			System.out.println("catch block "+driver.findElement(loginError).isDisplayed());
		}
	}
	
}
	


