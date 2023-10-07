package stepDefs;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class LoginStepDef {
	WebDriver driver=Hooks.driver;
	LoginPage lp;

	@When("As a user I will enter UserName as {string} and Password as {string}")
	public void as_a_user_I_will_enter_UserName_as_and_Password_as(String username, String password) throws InterruptedException {
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

}
