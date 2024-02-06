package com.metlife.stepdefinitions;

import com.metlife.pageobjects.HomePage;
import com.metlife.utility.WebDriverUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TicketBookingDefinition
{
    @Given("I log into redbus.in as a user")
    public void i_log_into_redbus_in_as_a_user()
    {
        // Write code here that turns the phrase above into concrete actions
        WebDriverUtils.initialize();
        WebDriverUtils.launchUrl("https://www.redbus.in");
    }
    @When("I update the source as {string}")
    public void i_update_the_source_as(String string)
    {
        // Write code here that turns the phrase above into concrete actions
        WebDriverUtils.type(HomePage.source,string);
    }
    @When("I update the destination as {string}")
    public void i_update_the_destination_as(String string)
    {
        // Write code here that turns the phrase above into concrete actions
        WebDriverUtils.type(HomePage.destination,string);
    }
    @When("I choose the date as 4th of next month")
    public void i_choose_the_date_as_4th_of_next_month()
    {
        // Write code here that turns the phrase above into concrete actions
        String month=WebDriverUtils.getTexture(HomePage.dateText);
        while (!month.contains("Apr 2024"))
        {
            //driver.findElement(HomePage.dateIconForNextMonth).click();
            WebDriverUtils.click(HomePage.dateIconForNextMonth);
            month=WebDriverUtils.getTexture(HomePage.dateText);
        }
        System.out.println(month);
        //driver.findElement(HomePage.dateSelection).click();
        WebDriverUtils.click(HomePage.dateSelection);
    }
    @When("I click on Search Busses")
    public void i_click_on_search_busses()
    {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("I should get the message as {string}")
    public void i_should_get_the_message_as(String string)
    {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
