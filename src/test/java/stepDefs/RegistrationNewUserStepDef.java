package stepDefs;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.RegistrationNewUserPage;

public class RegistrationNewUserStepDef{
	
	WebDriver driver=Hooks.driver;
	RegistrationNewUserPage rp;
	
	@Given("As a user I will Navigate to Registration URL {string}")
	public void as_a_user_I_will_Navigate_to_Registration_URL(String url) {
	    driver.get(url);
	}

	@When("As a user I will enter required details for registration")
	public void as_a_user_I_will_enter_required_details_for_registration(io.cucumber.datatable.DataTable table) throws InterruptedException {
		List<Map<String, String>> data = table.asMaps(String.class, String.class);

        String firstName = data.get(0).get("FirstName");
        String lastName = data.get(0).get("LastName");
        String email = data.get(0).get("Email");
        String telephone = data.get(0).get("Telephone");
        String pwd = data.get(0).get("Pwd");
        String pwd2 = data.get(0).get("Pwd2");
        rp = new RegistrationNewUserPage(driver);
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
		rp = new RegistrationNewUserPage(driver);
		rp.verifyRegTextBody();
		Thread.sleep(5000);
	}
	
	

}
