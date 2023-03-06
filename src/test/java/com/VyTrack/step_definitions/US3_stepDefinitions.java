package com.VyTrack.step_definitions;


import com.VyTrack.pages.US3_PinbarPage;
import com.VyTrack.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class US3_stepDefinitions {
    US3_PinbarPage us3PinbarPage = new US3_PinbarPage();

    @When("the user click on {string} on the homepage")
    public void the_user_click_on_on_the_homepage(String str) {
        BrowserUtils.sleep(2);
        us3PinbarPage.link.click();
    }

    @Then("the user should see header {string}")
    public void theUserShouldSeeHeader(String actualHeader) {
        String expectedResult = "How To Use Pinbar";
        Assert.assertEquals(expectedResult, actualHeader);
    }

    @And("the user should see {string}")
    public void theUserShouldSee(String actualResult) {
        String expectedResult = "Use the pin icon on the right top corner of the page to create fast access link in the pinbar.";
        Assert.assertEquals(expectedResult, actualResult);
    }


    @Then("the user should see image {string}")
    public void the_user_should_see_image(String actualImage) {

        String expectedImage = "bundles/oronavigation/images/pinbar-location.jpg";
        Assert.assertEquals(actualImage, expectedImage);
    }


}
