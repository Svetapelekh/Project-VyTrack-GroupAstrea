package com.VyTrack.step_definitions;

import com.VyTrack.pages.US12_MainPage;
import com.VyTrack.utilities.BrowserUtils;
import com.VyTrack.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class US12_StepDefinitions {

    US12_MainPage page = new US12_MainPage();
    //WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
    @When("the user hovers over Customers dropdown and clicks Accounts button")
    public void the_user_hovers_over_customers_dropdown_and_clicks_accounts_button() {
        BrowserUtils.sleep(5);
        page.customersDropdown.click();
        page.accountsButton.click();
        BrowserUtils.sleep(5);
    }
    @When("the user turns on Filters")
    public void the_user_turns_on_filters_if_they_were_turned_off() {
        page.filtersButton.click();
        BrowserUtils.sleep(5);
    }
    @Then("the user sees Expected filter names")
    public void the_user_sees_expected_filter_names() {
        Assert.assertTrue(US12_MainPage.filtersAreDisplayed());
    }
}
