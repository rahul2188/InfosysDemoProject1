package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import base.TestBase;

public class HomePage extends TestBase {
	
	@FindBy(xpath="//a[@class='login']")
	WebElement signInButton;
	
	@FindBy(id="email")
	WebElement emailId;
	
	@FindBy(id="passwd")
	WebElement password;
	
	@FindBy(id="SubmitLogin")
	WebElement loginButton;
	
	
	public HomePage() throws IOException {
		PageFactory.initElements(driver, this);
	}
	
	public void ClickOnSignIn() {
		signInButton.click();
	}
	
	public void enterEmailAddress() {
		emailId.sendKeys(prop.getProperty("username"));
	}
	
	public void enterPassword() {
		password.sendKeys(prop.getProperty("password"));
	}
	
	public void login() {
		loginButton.click();
	}
	
	public void clickOnTshirts() {
		//driver.findElement(By.linkText("T-shirts")).click();
		driver.findElement(By.xpath("//a[@title='Women']")).click();
	}
	
	public void makeTshirtSeclection() {
		driver.findElement(By.xpath("//a[@title='Faded Short Sleeve T-shirts']")).click();
	}
	
	public void addToCart() {
		WebDriverWait w=new WebDriverWait(driver,15);
	    w.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//span[text()='Add to cart']"))));
		driver.findElement(By.xpath("//span[text()='Add to cart']")).click();
	}
	
	public void proceedToCheckOut() throws IOException {
		WebElement w=driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(w)); 
		driver.findElement(By.xpath("//a[@title='Proceed to checkout']")).click();
		
	}
}
