package stepDefs;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.PurchaseProductE2EFlowPage;

public class PurchaseProductE2EFlowStepDef {
	PurchaseProductE2EFlowPage pp;
	WebDriver driver = Hooks.driver;
	
	@Given("As a user I will select desired product")
	public void as_a_user_I_will_select_desired_product() {
	    pp =new PurchaseProductE2EFlowPage(driver);
	    pp.clickMp3PlayersTab();
	    pp.clickMpePlayersAll();
	    pp.selectProduct();
	    pp.clickAddtoCart();
	    pp.clickCartBtn();
	    pp.clickCheckoutBtn();
	    pp.setFirtName();
	    pp.setLastName();
	    pp.setCompany();
	    pp.setAddress();
	    pp.setCity();
	    pp.setPostalCode();
	    pp.setCountryDD();
	    pp.setStateDD();
	    
	    
	}
	
	@When("As a user I will enter required details to complete the order")
	public void as_a_user_I_will_enter_required_details_to_complete_the_order() {
	    
	}

	@Then("As a user I will validate order is placed successfull")
	public void as_a_user_I_will_validate_order_is_placed_successfull() {
	   
	}

}
