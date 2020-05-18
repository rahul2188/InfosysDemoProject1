package stepDefinition;

import java.io.IOException;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.TestBase;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.HomePage;
import pageObjects.ShoppingCartSummaryPage;

public class OrderCreation extends TestBase {

	HomePage hp;
	ShoppingCartSummaryPage scsp;
	
	public OrderCreation() throws IOException {
		super();
		
	}

	@Given("^user is on homepage$")
	public void user_is_on_homepage()  {
	    Initialization();
	}

	@When("^user logs in using valid credentials and makes an order$")
	public void user_logs_in_using_valid_credentials() throws IOException  {
	    hp=new HomePage();
	    hp.ClickOnSignIn();
	    hp.enterEmailAddress();
	    hp.enterPassword();
	    hp.login();
	    hp.clickOnTshirts();
	    hp.makeTshirtSeclection();
	    hp.addToCart();
	    hp.proceedToCheckOut();
	}
	
	@When("^user summarize the order till shipping section$")
	public void user_summarize_the_order() throws IOException  {
		scsp=new ShoppingCartSummaryPage();
	    scsp.proceedingCheckout();
	    scsp.proceedingCheckoutOnAddressSection();
	    scsp.termsAndConditionsChecking();
	    /*scsp.proceedingCheckoutOnShippingSection();
	    scsp.payOption();
	    scsp.confirmationOrder();*/
	    
	}


	@Then("^user signout and close the browser$")
	public void order_is_placed_and_confirmed_from_order_history_page() {
	    scsp.signOut();
	}
}
