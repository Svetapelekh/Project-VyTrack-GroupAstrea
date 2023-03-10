package com.VyTrack.step_definitions;

import com.VyTrack.pages.BasePage;
import com.VyTrack.pages.US11_Page;
import com.VyTrack.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US11_step_definitions extends BasePage {

    US11_Page us11_page = new US11_Page();

    @When("the user navigates to {string} - {string}")
    public void the_user_navigates_to(String string, String string2) {
        navigateToModule("Fleet","Vehicle Odometer");
    }
    @When("when user on “Vehicle Odometer” module see {string}")
    public void when_user_on_vehicle_odometer_module_see(String expectedResult) {
    String TextPermissionMessage = us11_page.PermissionMessage.getText();

    Assert.assertEquals(expectedResult,TextPermissionMessage);
    }


    @And("when user on “Vehicle Odometer” module see the default page as {string}.")
    public void whenUserOnVehicleOdometerModuleSeeTheDefaultPageAs(String expectedNumber) {
        String  actualNumber = us11_page.DefaultPageNumber.getAttribute("value");
        Assert.assertEquals(expectedNumber,actualNumber);
    }

    @And("when user on “Vehicle Odometer” module see the View Per Page is {string} by default.")
    public void whenUserOnVehicleOdometerModuleSeeTheViewPerPageIsByDefault(String expected) {
            String actualValue = us11_page.getValueViewPerPage();
            BrowserUtils.sleep(1);
            Assert.assertEquals(expected,actualValue);

    }}

