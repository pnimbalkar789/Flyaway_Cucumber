package Stepdefs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.When;

public class Sign_Up_Stepdefs {
	
	WebDriver driver = Hooks.driver;
	
	@When("I click on signup link")
	public void i_click_on_signup_link() {
	    // Write code here that turns the phrase above into concrete actions
		WebElement SignUpLink = driver.findElement(By.xpath("//a[@href= 'signup']"));
		SignUpLink.click();
		
	}

	@When("I enter the Email {string}")
	public void i_enter_the_Email(String Email) {
	    // Write code here that turns the phrase above into concrete actions
		WebElement UserName = driver.findElement(By.name("email_id"));
		UserName.sendKeys(Email);
	}

	@When("I enter the pwd {string}")
	public void i_enter_the_pwd(String pwd) {
	    // Write code here that turns the phrase above into concrete actions
		WebElement password = driver.findElement(By.name("pwd"));
		password.sendKeys(pwd); 
	}

	@When("I enter the Confirm pwd {string}")
	public void i_enter_the_Confirm_pwd(String confirmpwd) {
	    // Write code here that turns the phrase above into concrete actions
		WebElement Confirmpassword = driver.findElement(By.name("pwd2"));
		Confirmpassword.sendKeys(confirmpwd);
	}

	@When("I enter the Name {string}")
	public void i_enter_the_Name(String Name) {
	    // Write code here that turns the phrase above into concrete actions
		WebElement NameTB = driver.findElement(By.name("name"));
		NameTB.sendKeys(Name); 
	}

	@When("I enter the Address {string}")
	public void i_enter_the_Address(String address) {
	    // Write code here that turns the phrase above into concrete actions
		WebElement AddressTB = driver.findElement(By.name("address"));
		AddressTB.sendKeys(address);
	}

	@When("I enter the City {string}")
	public void i_enter_the_City(String city) {
	    // Write code here that turns the phrase above into concrete actions
		WebElement CityTB = driver.findElement(By.name("city"));
		CityTB.sendKeys(city);
	}

	@When("I click on the SignUp Button")
	public void i_click_on_the_SignUp_Button() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		WebElement SignUpBtn = driver.findElement(By.xpath("//button[contains(text(), 'Signup')]"));
		SignUpBtn.click();
		Thread.sleep(2000);
	}

	@When("I click on the login to continue checking flights link")
	public void i_click_on_the_login_to_continue_checking_flights_link() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		WebElement ContinueBtn = driver.findElement(By.xpath("//a[contains(text(), 'Login to continue checking flights')]"));
		ContinueBtn.click();
		Thread.sleep(2000); 
	}


	
	
	
	
	
	
	
	
	
	
}
