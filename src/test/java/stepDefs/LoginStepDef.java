package stepDefs;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class LoginStepDef {
	WebDriver driver = Hooks.driver;
	LoginPage lp;

	@When("As a user I will enter UserName as {string} and Password as {string}")
	public void as_a_user_I_will_enter_UserName_as_and_Password_as(String username, String password)
			throws InterruptedException {
		lp = new LoginPage(driver);
		lp.clickMyAccountBtn();
		lp.clickLogin();
		lp.setUserName(username);
		lp.setPwd(password);
		Thread.sleep(3000);
		lp.clickSubmitBtn();
	}

	@Then("As a user validate login is successfull")
	public void as_a_user_validate_login_is_successfull() throws InterruptedException {
		lp = new LoginPage(driver);
		lp.verifyLoginSuccess();
		Thread.sleep(5000);
	}

	@Then("As a user validate login is unsuccessfull")
	public void as_a_user_validate_login_is_unsuccessfull() throws InterruptedException {
		lp = new LoginPage(driver);
		lp.verifyUnsuccessLogin();
	}

	// ***********login with invalid username**************//

	@When("user enter invalid username {string} and valid password as {string}")
	public void user_enter_invalid_username_and_valid_password_as(String username, String password) {
		lp = new LoginPage(driver);
		lp.clickMyAccountBtn();
		lp.clickLogin();
		lp.setUserName(username);
		lp.setPwd(password);
	}

	@When("user click on login button")
	public void user_click_on_login_button() {
		lp = new LoginPage(driver);
		lp.clickSubmitBtn();
	}

	@Then("user should see an error message indicating invalid username")
	public void user_should_see_an_error_message_indicating_invalid_username() {
		lp = new LoginPage(driver);
		lp.verifyUsernameErrorMsg();

	}
	
	//***********login with valid username and invalid password
	
	@When("user enter valid username {string} and invalid password as {string}")
	public void user_enter_valid_username_and_invalid_password_as(String username, String password) {
		lp = new LoginPage(driver);
		lp.clickMyAccountBtn();
		lp.clickLogin();
		lp.setUserName(username);
		lp.setPwd(password);
	}

	@Then("user should see an error message indicating invalid password")
	public void user_should_see_an_error_message_indicating_invalid_password() {
		lp = new LoginPage(driver);
		lp.verifyUsernameErrorMsg();
	}

}
