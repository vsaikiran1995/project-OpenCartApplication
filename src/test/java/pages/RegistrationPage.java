package pages;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class RegistrationPage {
	 WebDriver driver;
	 WebDriverWait wait;
	 By MyAccountBtn = By.xpath("//a[@title='My Account']");
	 By RegisterBtn = By.xpath("//a[text()='Register']");
	 By firstNameInput = By.xpath("//input[@name='firstname']");
	 By lastNameInput = By.xpath("//input[@name='lastname']");
	 By emailInput = By.xpath("//input[@name='email']");
	 By phoneInput = By.xpath("//input[@name='telephone']");
	 By pwdInput = By.xpath("//input[@name='password']");
	 By pwd2Input = By.xpath("//input[@name='confirm']");
	 By newsLetterRadioBtn = By.xpath("//label[@class='radio-inline'][1]");
	 By checkBox = By.xpath("//input[@type='checkbox']");
	 By submitBtn =  By.xpath("//input[@type='submit']");
	 By regTextBody = By.xpath("//h1[text()='Your Account Has Been Created!']");
	 By errorMessage = By.xpath("//div[@class='alert alert-danger alert-dismissible']");
	 By firtstNameErrorMsg = By.xpath("//div[text()='First Name must be between 1 and 32 characters!']");
	 By lastnameErrorMsg = By.xpath("//div[text()='Last Name must be between 1 and 32 characters!']");
	 By emailErrorMsg = By.xpath("//div[text()='E-Mail Address does not appear to be valid!']");
	 By phoneNumErrorMsg = By.xpath("//div[text()='Telephone must be between 3 and 32 characters!']");
	 By pwdErrorMsg = By.xpath("//div[text()='Password must be between 4 and 20 characters!']");
	 By ppolicyErrMsg = By.xpath("//div[text()=' Warning: You must agree to the Privacy Policy!']");
	 By phoneErrMsg = By.xpath("//div[text()='Telephone must be between 3 and 32 characters!']");
	 By reconfirmPwdErrMsg = By.xpath("//div[text()='Password confirmation does not match password!']");
	 
	public RegistrationPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void clickMyAccountBtn() {
		driver.findElement(MyAccountBtn).click();
	}
	public void clickRegister() {
		driver.findElement(RegisterBtn).click();
	}
	public void setFirtName(String firstName) {
		driver.findElement(firstNameInput).sendKeys(firstName);
	}
	public void setLastName(String lastName) {
		driver.findElement(lastNameInput).sendKeys(lastName);
	}
	public void setEmail(String email) {
		driver.findElement(emailInput).sendKeys(email);
	}
	public void setPhone(String phone) {
		driver.findElement(phoneInput).sendKeys(phone);
	}
	public void setPwd(String pwd) {
		driver.findElement(pwdInput).sendKeys(pwd);
	}
	public void setPwd2(String pwd2) {
		driver.findElement(pwd2Input).sendKeys(pwd2);
	}
	public void clickNewsLetterBtn() {
		driver.findElement(newsLetterRadioBtn).click();
	}
	public void clickCheckBox() {
		driver.findElement(checkBox).click();
	}
	public void clickSubmitBtn() {
		driver.findElement(submitBtn).click();
	}
	public void verifyRegTextBody() {
		System.out.println(driver.findElement(regTextBody).isDisplayed());
		String actualText = driver.findElement(regTextBody).getText();
		String expectedText = "Your Account Has Been Created!";
		Assert.assertEquals(actualText, expectedText);
	}
	public void verifyErrorMessage() {
		// Wait for the error message element to be present
	    wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.presenceOfElementLocated(errorMessage));
		String actualError = driver.findElement(errorMessage).getText();
		String expectedError = "Warning: E-Mail Address is already registered!";
		Assert.assertEquals(expectedError, actualError);
	}
	public void verifyFirtNameError() {
		String actualError = driver.findElement(firtstNameErrorMsg).getText();
		String expectedError = "First Name must be between 1 and 32 characters!";
		Assert.assertEquals(expectedError, actualError);
	}
	public void verifyLastNameError() {
		String actualError = driver.findElement(lastnameErrorMsg).getText();
		String expectedError = "Last Name must be between 1 and 32 characters!";
		Assert.assertEquals(expectedError, actualError);
	}
	public void verifyppolicyError() {
		String actualError = driver.findElement(ppolicyErrMsg).getText();
		String expectedError = "Warning: You must agree to the Privacy Policy!";
		Assert.assertEquals(expectedError, actualError);
	}
	public void verifyphoneError() {
		wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.presenceOfElementLocated(phoneNumErrorMsg));
		String actualError = driver.findElement(phoneNumErrorMsg).getText();
		String expectedError = "Telephone must be between 3 and 32 characters!";
		Assert.assertEquals(expectedError, actualError);
	}
	public void verifyreconfirmPwdError() {
		wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.presenceOfElementLocated(reconfirmPwdErrMsg));
		String actualError = driver.findElement(reconfirmPwdErrMsg).getText();
		String expectedError = "Password confirmation does not match password!";
		Assert.assertEquals(expectedError, actualError);
	}


}
