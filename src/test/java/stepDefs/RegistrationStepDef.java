package stepDefs;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.RegistrationPage;

public class RegistrationStepDef {

	WebDriver driver = Hooks.driver;
	RegistrationPage rp;

	@Given("As a user I will Navigate to Registration URL {string}")
	public void as_a_user_I_will_Navigate_to_Registration_URL(String url) {
		driver.get(url);
	}

	@When("As a user I will enter required details for registration")
	public void as_a_user_I_will_enter_required_details_for_registration(io.cucumber.datatable.DataTable table)
			throws InterruptedException {
		List<Map<String, String>> data = table.asMaps(String.class, String.class);

		String firstName = data.get(0).get("FirstName");
		String lastName = data.get(0).get("LastName");
		String email = data.get(0).get("Email");
		String telephone = data.get(0).get("Telephone");
		String pwd = data.get(0).get("Pwd");
		String pwd2 = data.get(0).get("Pwd2");
		rp = new RegistrationPage(driver);
		rp.clickMyAccountBtn();
		rp.clickRegister();
		rp.setFirtName(firstName);
		rp.setLastName(lastName);
		rp.setEmail(email);
		rp.setPhone(telephone);
		rp.setPwd(pwd);
		rp.setPwd2(pwd2);
		rp.clickNewsLetterBtn();
		rp.clickCheckBox();
		rp.clickSubmitBtn();
		Thread.sleep(5000);

	}

	@Then("As a user validate registration is successful")
	public void as_a_user_validate_registration_is_successful() throws InterruptedException {
		rp = new RegistrationPage(driver);
		rp.verifyRegTextBody();
		Thread.sleep(5000);
	}

	// ********Registration with existing email address******//

	@When("the user provides and existing email address with requried details")
	public void the_user_provides_and_existing_email_address_with_requried_details(
			io.cucumber.datatable.DataTable table) {
		List<Map<String, String>> data = table.asMaps(String.class, String.class);

		String firstName = data.get(0).get("FirstName");
		String lastName = data.get(0).get("LastName");
		String email = data.get(0).get("Email");
		String telephone = data.get(0).get("Telephone");
		String pwd = data.get(0).get("Pwd");
		String pwd2 = data.get(0).get("Pwd2");
		rp = new RegistrationPage(driver);
		rp.clickMyAccountBtn();
		rp.clickRegister();
		rp.setFirtName(firstName);
		rp.setLastName(lastName);
		rp.setEmail(email);
		rp.setPhone(telephone);
		rp.setPwd(pwd);
		rp.setPwd2(pwd2);
		rp.clickNewsLetterBtn();
		rp.clickCheckBox();
		rp.clickSubmitBtn();

	}

	@Then("they should see an error message indicating the email is already in use")
	public void they_should_see_an_error_message_indicating_the_email_is_already_in_use() {
		rp = new RegistrationPage(driver);
		rp.verifyErrorMessage();
	}

	// *******************Registration with empty fields******************

	@When("the user click's on submit with empty fields")
	public void the_user_click_s_on_submit_with_empty_fields() throws InterruptedException {
		rp = new RegistrationPage(driver);
		rp.clickMyAccountBtn();
		rp.clickRegister();
		rp.clickNewsLetterBtn();
		rp.clickCheckBox();
		rp.clickSubmitBtn();
		Thread.sleep(3000);
	}

	@Then("they should see an error messages for empty fields")
	public void they_should_see_an_error_messages_for_empty_fields() {
		rp = new RegistrationPage(driver);
		rp.verifyFirtNameError();
		rp.verifyLastNameError();
	}

	// **************Registration without checkin privacy policy************//

	@When("the user provides an new email address with requried details")
	public void the_user_provides_an_new_email_address_with_requried_details(io.cucumber.datatable.DataTable table) {
		List<Map<String, String>> data = table.asMaps(String.class, String.class);

		String firstName = data.get(0).get("FirstName");
		String lastName = data.get(0).get("LastName");
		String email = data.get(0).get("Email");
		String telephone = data.get(0).get("Telephone");
		String pwd = data.get(0).get("Pwd");
		String pwd2 = data.get(0).get("Pwd2");
		rp = new RegistrationPage(driver);
		rp.clickMyAccountBtn();
		rp.clickRegister();
		rp.setFirtName(firstName);
		rp.setLastName(lastName);
		rp.setEmail(email);
		rp.setPhone(telephone);
		rp.setPwd(pwd);
		rp.setPwd2(pwd2);
		rp.clickNewsLetterBtn();
		rp.clickSubmitBtn();
	}

	@Then("they should see an error message indicating you must agree to privacy policy")
	public void they_should_see_an_error_message_indicating_you_must_agree_to_privacy_policy() {
		rp = new RegistrationPage(driver);
		rp.verifyppolicyError();
	}

	// ************Registration with missing phone number details********//

	@When("the user provides and existing email address with missing phone detail")
	public void the_user_provides_and_existing_email_address_with_missing_phone_detail(
			io.cucumber.datatable.DataTable table) throws InterruptedException {
		List<Map<String, String>> data = table.asMaps(String.class, String.class);

		String firstName = data.get(0).get("FirstName");
		String lastName = data.get(0).get("LastName");
		String email = data.get(0).get("Email");
		String pwd = data.get(0).get("Pwd");
		String pwd2 = data.get(0).get("Pwd2");
		rp = new RegistrationPage(driver);
		rp.clickMyAccountBtn();
		rp.clickRegister();
		rp.setFirtName(firstName);
		rp.setLastName(lastName);
		rp.setEmail(email);
		rp.setPwd(pwd);
		rp.setPwd2(pwd2);
		rp.clickNewsLetterBtn();
		rp.clickCheckBox();
		rp.clickSubmitBtn();
		Thread.sleep(5000);
		
	}

	@Then("they should see an error message phone number must be present")
	public void they_should_see_an_error_message_phone_number_must_be_present() {
		rp = new RegistrationPage(driver);
		rp.verifyphoneError();
	}
	
	//*********Registratoin with incorrect re-confirm password
	
	@When("the user provides an existing email address with incorrect re-confirm password")
	public void the_user_provides_an_existing_email_address_with_incorrect_re_confirm_password(io.cucumber.datatable.DataTable table) throws InterruptedException {
		List<Map<String, String>> data = table.asMaps(String.class, String.class);

		String firstName = data.get(0).get("FirstName");
		String lastName = data.get(0).get("LastName");
		String email = data.get(0).get("Email");
		String telephone = data.get(0).get("Telephone");
		String pwd = data.get(0).get("Pwd");
		String pwd2 = data.get(0).get("Pwd2");
		rp = new RegistrationPage(driver);
		rp.clickMyAccountBtn();
		rp.clickRegister();
		rp.setFirtName(firstName);
		rp.setLastName(lastName);
		rp.setEmail(email);
		rp.setPhone(telephone);
		rp.setPwd(pwd);
		rp.setPwd2(pwd2);
		rp.clickNewsLetterBtn();
		rp.clickCheckBox();
		rp.clickSubmitBtn();
		Thread.sleep(5000);
	}

	@Then("they should see an error message password does not match")
	public void they_should_see_an_error_message_password_does_not_match() {
	    rp = new RegistrationPage(driver);
	    rp.verifyreconfirmPwdError();
	    
	}

}
