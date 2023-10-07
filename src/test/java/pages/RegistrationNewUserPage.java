package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationNewUserPage {
	 WebDriver driver;
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
	
	public RegistrationNewUserPage(WebDriver driver) {
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

}
