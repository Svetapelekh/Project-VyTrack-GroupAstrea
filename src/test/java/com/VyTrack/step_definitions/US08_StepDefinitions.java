package com.VyTrack.step_definitions;

import com.VyTrack.pages.US08_MainPage;
import com.VyTrack.utilities.BrowserUtils;
import com.VyTrack.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class US08_StepDefinitions {

    US08_MainPage page = new US08_MainPage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));

    @Given("User hovers over dropdown Activities and clicks button Calendar Events")
    public void user_hovers_over_dropdown_activities_and_clicks_button_calendar_events() {
        wait.until(ExpectedConditions.titleIs("Dashboard"));
        page.dropdownActivities.click();
        page.buttonCalendarEvents.click();
        BrowserUtils.sleep(5);
    }
    @When("User clicks button Create Calendar Event")
    public void user_clicks_button_create_calendar_event() {
        page.buttonCreateCalendarEvent.click();
        BrowserUtils.sleep(5);
    }
    @When("User clicks checkbox Repeat")
    public void user_clicks_checkbox_repeat() {
        page.checkboxRepeat.click();
    }
    @Then("User should see the number 1 by default in the Repeat Every input.")
    public void user_should_see_the_number_by_default_in_the_repeat_every_input() {
        int actualInt = Integer.valueOf(page.windowRepeatEvery.getAttribute("value"));
        Assert.assertEquals(actualInt, 1);
    }
}
