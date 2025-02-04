package parallel;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;

import com.practice.form.methods.PracticeFormMethods;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class PracticeFormSteps {
	
	ThreadLocal<WebDriver> threadLocalDriver;

	public PracticeFormSteps() {
		threadLocalDriver =  Hooks.threadLocalDriver;

	}

	@Given("User is on registration page {string}")
	public void user_is_on_registration_page(String url) throws InterruptedException {
		PracticeFormMethods.launchBrowser(threadLocalDriver, url );

	}
	
	@And("User enters firstName as {string}, Last name as {string} and email as {string}")
	public void enter_and(String fname, String lname, String email ) throws Throwable {
		
		
		PracticeFormMethods.enterFnameLnameEmail(threadLocalDriver, fname, lname, email );

	}

	@When("User click on gender as {string}")
	public void user_click_on_gender_as(String gender) throws AWTException {
		
		PracticeFormMethods.selectGender(threadLocalDriver);

	}

	@When("Enter Mobile number as {string}")
	public void enter_mobile_number_as(String mobileNumber) throws InterruptedException {
		PracticeFormMethods.enterPhone(threadLocalDriver, mobileNumber);
		

	}

	@When("User Enters Subject as {string}, Hobbies as {string}, Select Date and address as {string}")
	public void enter_date_and(String subject, String hobbies, String address) throws InterruptedException, AWTException {
		PracticeFormMethods.enterSubject(threadLocalDriver, subject);
		PracticeFormMethods.selectHobbies(threadLocalDriver, hobbies);
		PracticeFormMethods.selectDate(threadLocalDriver);
		PracticeFormMethods.enteraddress(threadLocalDriver, address);

	}

	@When("Upload the picture")
	public void upload_the_picture() throws InterruptedException {
		PracticeFormMethods.uploadImage(threadLocalDriver);

	}

	@When("Select state as {string} and city as {string}")
	public void select_state_as_and_city_as(String state, String city) {
		PracticeFormMethods.selectState(threadLocalDriver, state);
		PracticeFormMethods.selectcity(threadLocalDriver, city);
	}

	@When("Click on the submit button")
	public void click_on_the_submit_button() throws InterruptedException {
		PracticeFormMethods.Submit(threadLocalDriver);
	}

	@Then("User should register successfully into the portal")
	public void user_should_register_successfully_into_the_portal() throws InterruptedException {
		PracticeFormMethods.confirmRegister(threadLocalDriver);

	}


}
