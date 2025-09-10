package Stepdefs;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Stepdefs.Hooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_Stepdefs {
	
	WebDriver driver = Hooks.driver;

	@Given("I have launched the flyaway application")
	public void i_have_launched_the_flyaway_application() {
		driver.get("http://localhost:8081/FlyAway/");
	}

	@When("I click on the Login Link")
	public void i_click_on_the_Login_Link() {
		WebElement LoginLink = driver.findElement(By.xpath("//a[@href = 'login']"));
		LoginLink.click();

	}

	@When("I enter the Username {string}")
	public void i_enter_the_Username(String UserNameVal) {
		WebElement UserName = driver.findElement(By.name("email_id"));
		UserName.sendKeys(UserNameVal);
	    
	}

	@When("I enter the Password {string}")
	public void i_enter_the_Password(String PasswordVal) {
		WebElement Password = driver.findElement(By.name("pwd"));
		Password.sendKeys(PasswordVal);
	}

	@When("I click on the Login Button")
	public void i_click_on_the_Login_Button() throws InterruptedException {
		WebElement LoginBtn = driver.findElement(By.xpath("//button[contains(text(), 'Login')]"));
		LoginBtn.click();
		Thread.sleep(2000);
	}


	@Then("I should be able to see the home page {string}")
	public void i_should_be_able_to_see_the_home_page(String ExpTitle) throws InterruptedException {
		Thread.sleep(2000);
		WebElement HomePageTitle = driver.findElement(By.xpath("//h3[contains(text(), 'FLYAWAY - DASHBOARD')]"));
		String actTitle = HomePageTitle.getText();
		System.out.println(actTitle);
		Assert.assertEquals(ExpTitle, actTitle);
	}

	


		@Then("I should be able to see the password field")
		public void i_should_be_able_to_see_the_password_field() {
			WebElement Password = driver.findElement(By.name("pwd"));
			Boolean result= Password.isDisplayed();
			if(result= true)
			{
				System.out.println("User is not able to login with wrong credentials");
			}
			else
			{
				System.out.println("User is able to login with wrong credentials");	
			}   
          }

	
	
	
	
	
	
	
	
	
	
	
	
	
	}



	
	
	
	

