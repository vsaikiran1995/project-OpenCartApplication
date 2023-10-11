package stepDefs;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AddToCartPage;

public class AddToCartSetpDef {
	WebDriver driver = Hooks.driver;
	AddToCartPage ap;

	@When("the user selects a product")
	public void the_user_selects_a_product() {
		ap = new AddToCartPage(driver);
		ap.clickMp3PlayersTab();
		ap.clickMpePlayersAll();
		ap.selectProduct();

	}

	@When("they click the Add to cart button")
	public void they_click_the_Add_to_cart_button() {
		ap = new AddToCartPage(driver);
		ap.clickAddtoCart();
	}

	@Then("the product should be added to the cart")
	public void the_product_should_be_added_to_the_cart() {
		ap = new AddToCartPage(driver);
		ap.verifyProductAddedInCart();
	}

	// ***********Add multiple products to the cart*****************//

	@When("the user selects multiple products")
	public void the_user_selects_multiple_products() {
		ap = new AddToCartPage(driver);
		ap.clickMp3PlayersTab();
		ap.clickMpePlayersAll();
		ap.selectProduct();
		ap.clickAddtoCart();
		driver.navigate().back();
		ap.selectProduct2();
		ap.clickAddtoCart();
	}

	@When("they click the Add to Cart button for each product")
	public void they_click_the_Add_to_Cart_button_for_each_product() {
		ap = new AddToCartPage(driver);
		ap.clickCartBtn();

	}

	@Then("all selected products should be added to the cart")
	public void all_selected_products_should_be_added_to_the_cart() {
		ap = new AddToCartPage(driver);
		ap.verifyProductAddedInCart();
		ap.verifyProductAddedInCart2();
	}

	// *************Remove a product from the cart*********//

	@When("the user removes a product from the cart")
	public void the_user_removes_a_product_from_the_cart() {
		ap = new AddToCartPage(driver);
		ap.clickCartBtn();
		ap.deleteProduct2();
	}

	@Then("the product should be removed from the cart")
	public void the_product_should_be_removed_from_the_cart() {
		ap = new AddToCartPage(driver);
		ap.clickCartBtn();
		ap.clickViewCart();
		ap.verifyViewCart();
	}

	// ********Remove all the products from the cart*************//

	@When("the user removes all the productrs from the cart")
	public void the_user_removes_all_the_productrs_from_the_cart() {
		ap = new AddToCartPage(driver);
		ap.clickCartBtn();
		ap.deleteProduct1();
	}

	@Then("the cart should show zero items")
	public void the_cart_should_show_zero_items() {
		ap = new AddToCartPage(driver);
		ap.clickCartBtn();
		ap.verifyEmptyCart();
	}

	// ************proceed to checkout***********//

	@When("the user clicks the Checkout button in the cart")
	public void the_user_clicks_the_Checkout_button_in_the_cart() {
        ap =new AddToCartPage(driver);
        ap.clickCartBtn();
        ap.clickCheckOutBtn();
        
	}

	@Then("they should be taken to the checkout page")
	public void they_should_be_taken_to_the_checkout_page() {
          ap = new AddToCartPage(driver);
          ap.verifyCheckOutpage();
	}

}
