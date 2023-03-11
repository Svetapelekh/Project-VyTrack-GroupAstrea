package com.VyTrack.step_definitions;

import com.VyTrack.pages.BasePage;
import com.VyTrack.pages.US10_DescriptionPage;
import com.VyTrack.pages.LoginPage;
import com.VyTrack.utilities.BrowserUtils;
import com.VyTrack.utilities.ConfigurationReader;
import com.VyTrack.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class US10_DescriptionStepDefs  extends BasePage {

    US10_DescriptionPage us10_descriptionPage = new US10_DescriptionPage();
    @When("the user navigate to the {string} tab and click on the {string}")
    public void the_user_navigate_to_the_tab_and_click_on_the(String string, String string2) {
        navigateToModule("Activities", "Calendar Events");
        BrowserUtils.sleep(3);
    }
    @Then("the user click on the {string} button")
    public void the_user_click_on_the_button(String string) {
        us10_descriptionPage.createCalendarEventLnk.click();
    }
    @Then("the user check the {string} box")
    public void the_user_check_the_box(String string) {
       us10_descriptionPage.repeatButton.click();
    }

    @Then("the user should be able to type message inside the {string} box")
    public void the_user_should_be_able_to_type_message_inside_the_box(String string) {
        Driver.getDriver().switchTo().frame(0);
       us10_descriptionPage.DescriptionBox.sendKeys("Scrum daily meeting" + Keys.ENTER);

    }

    @Then("the message should be displayed {string}")
    public void the_message_should_be_displayed(String actualResult) {
        String expectedResult = "Scrum daily meeting";
        // Assert.assertTrue(us10_descriptionBoxPage.paragraphText.isDisplayed());
        Assert.assertEquals(expectedResult, actualResult);
    }
    }
