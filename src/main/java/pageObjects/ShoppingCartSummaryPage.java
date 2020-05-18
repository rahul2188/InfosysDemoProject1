package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.TestBase;

public class ShoppingCartSummaryPage extends TestBase {
	
	@FindBy(xpath="//span[text()='Proceed to checkout']")
	WebElement proceedToCheckOut;
	
	@FindBy(xpath="//span[text()='Proceed to checkout']")
	WebElement proceedToCheckOutAddressSection;
	
	@FindBy(id="cgv")
	WebElement TandCcheckbox;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement proceedToCheckOutShippingSection;
	
	@FindBy(xpath="//a[@class='bankwire']")
	WebElement payBybankWire;
	
	
	@FindBy(xpath="//span[text()='I confirm my order']")
	WebElement confirmTheOrderButton;

	public ShoppingCartSummaryPage() throws IOException {
		PageFactory.initElements(driver,this);
	}

	public void proceedingCheckout() {
		proceedToCheckOut.click();
	}
	
	public void proceedingCheckoutOnAddressSection() {
		proceedToCheckOutAddressSection.click();
	}
	
	public void termsAndConditionsChecking() {
		TandCcheckbox.click();
	}
	
	/*public void proceedingCheckoutOnShippingSection() {
		WebDriverWait w=new WebDriverWait(driver, 15);
		w.until(ExpectedConditions.elementToBeClickable(proceedToCheckOutShippingSection));
		proceedToCheckOutShippingSection.click();
	}
	
	public void payOption() {
		WebDriverWait w=new WebDriverWait(driver, 15);
		w.until(ExpectedConditions.elementToBeClickable(payBybankWire));
		payBybankWire.click();
	}
	
	public void confirmationOrder() {
		confirmTheOrderButton.click();
	}*/
	
	public void signOut() {
		driver.findElement(By.className("logout")).click();
		driver.quit();
	}
}
