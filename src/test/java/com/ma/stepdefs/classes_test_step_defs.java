package com.ma.stepdefs;

import org.openqa.selenium.support.ui.Select;

import com.ma.utilities.BrowserUtils;
import com.ma.utilities.Driver;

import caom.ma.pages.Ebru;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class classes_test_step_defs {

	Ebru ebru = new Ebru();

	@Given("user is on the home page")
	public void user_is_on_the_home_page() {
	}

	@When("user hovers over classes menu on top navigation bar")
	public void user_hovers_over_classes_menu_on_top_navigation_bar() {
		BrowserUtils.hover(ebru.classes);
		BrowserUtils.waitFor(1);
	}

	@Then("user hovers over art")
	public void user_hovers_over_art() {
		BrowserUtils.hover(ebru.art);
		BrowserUtils.waitFor(1);
	}

	@Then("clicks on Ebru – Water Marbling Classes")
	public void clicks_on_Ebru_Water_Marbling_Classes() {
		ebru.ebru.click();
	}

	@Then("clicks on select a date")
	public void clicks_on_select_a_date() {
		Driver.getDriver().switchTo().frame(ebru.iframe);
		Select select = new Select(ebru.selectDate);
		select.selectByIndex(3);
		BrowserUtils.waitFor(5);
	}

	@Then("user selects random date")
	public void user_selects_random_date() {
	}

	@Then("user clicks on Ticket button")
	public void user_clicks_on_Ticket_button() {
		ebru.ticket.click();
	}

	@Then("user selects {int} regular tickets")
	public void user_selects_regular_tickets(Integer int1) {
	//	String price = ebru.
	}

	@Then("user should see total price as {string}")
	public void user_should_see_total_price_as(String string) {
	}

}