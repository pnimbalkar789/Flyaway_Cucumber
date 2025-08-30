package Stepdefs;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Then;

public class Flight_Booking_Stepdefs {
	
	WebDriver driver = Hooks.driver;
	
	@Then("I click on the Home link")
	public void i_click_on_the_Home_link() {
	    // Write code here that turns the phrase above into concrete actions
		WebElement HomeLink = driver.findElement(By.xpath("//a[@href= 'home']"));
		HomeLink.click();
		 
	}

	@Then("I select bangalore location in From dropdown")
	public void i_select_bangalore_location_in_From_dropdown() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		
		WebElement FromDD = driver.findElement(By.xpath("//select[@name= 'source']"));
		FromDD.click();
		Select sel =new Select(FromDD);
		sel.selectByIndex(2);
		
		
	}

	@Then("I select Chennai location in To dropdown")
	public void i_select_Chennai_location_in_To_dropdown() {
	    // Write code here that turns the phrase above into concrete actions
		WebElement ToDropdown = driver.findElement(By.xpath("//select[@name= 'destination']"));
		ToDropdown.click();
		Select sel1 =new Select(ToDropdown);
		sel1.selectByIndex(3);
	}

	@Then("I click on the submit Button")
	public void i_click_on_the_submit_Button() {
	    // Write code here that turns the phrase above into concrete actions
		WebElement SubmitBtn = driver.findElement(By.xpath("//button[contains(text(), 'Submit')]"));
		SubmitBtn.click();
	}

	@Then("I click on the Book Flight Button")
	public void i_click_on_the_Book_Flight_Button() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		WebElement BookFlightBtn = driver.findElement(By.xpath("//a[contains(text(), 'Book Flight')]"));
		BookFlightBtn.click();
		Thread.sleep(5000);
	}

	@Then("I click on the complete booking link")
	public void i_click_on_the_complete_booking_link() {
	    // Write code here that turns the phrase above into concrete actions
		WebElement CompleteBookingLink = driver.findElement(By.xpath("//a[contains(text(), 'Click to complete booking')]"));
		CompleteBookingLink.click();
	}

	@Then("I should be able to see the booking confirmation {string}")
	public void i_should_be_able_to_see_the_booking_confirmation(String message) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);
		WebElement BookingConfirmTitle = driver.findElement(By.xpath("//h3[contains(text(), ' FLYAWAY - BOOKING CONFIRMATION ')]"));
		String actTitle = BookingConfirmTitle.getText();
		System.out.println(actTitle);
		Assert.assertEquals(message, actTitle); 
	}

	@Then("I click on Your Booking link")
	public void i_click_on_Your_Booking_link() {
	    // Write code here that turns the phrase above into concrete actions
		WebElement YourBookingLink = driver.findElement(By.xpath("//a[contains(text(), 'Your Bookings')]"));
		YourBookingLink.click();  
	
	}

	
	
	@Then("I should be able to see the source as {string}")
	public void i_should_be_able_to_see_the_source_as(String source) {
	    // Write code here that turns the phrase above into concrete actions
		WebElement Source = driver.findElement(By.xpath("(//td[contains(text(), 'Bangalore')])[1]"));
		String SourceText = Source.getText();
		System.out.println(SourceText);
		Assert.assertEquals(source, SourceText); 
	}

	
	@Then("I should be able to see the destination as {string}")
	public void i_should_be_able_to_see_the_destination_as(String destination) {
	    // Write code here that turns the phrase above into concrete actions
		WebElement Destination = driver.findElement(By.xpath("(//td[contains(text(), 'Chennai')])[1]"));
		String DestText = Destination.getText();
		System.out.println(DestText);
		Assert.assertEquals(destination, DestText);
	}
	
	
	
	
	
	
	
	
	
	
	
	

}













































