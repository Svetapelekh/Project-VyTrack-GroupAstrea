package com.VyTrack.step_definitions;

import com.VyTrack.pages.BasePage;
import com.VyTrack.pages.US9_calenderMsgPage;
import com.VyTrack.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class US9_stepDefinitions extends BasePage {

    US9_calenderMsgPage us9_errorCalenderMsgPage = new US9_calenderMsgPage();

    @When("the user navigate to {string} tab and click on the {string}")
    public void theUserNavigateToTabAndClickOnThe(String string1, String string2) {
        //BrowserUtils.hover(us9_errorCalenderMsgPage.activitiesButton);
        navigateToModule("Activities", "Calendar Events");

        BrowserUtils.sleep(3);

    }

    @Then("the user click on the {string}")
    public void the_user_click_on_the(String string) {
        us9_errorCalenderMsgPage.createCalendarEventButton.click();
    }

    @And("the user click at {string}")
    public void theUserClickAt(String str) {
        //BrowserUtils.scrollToElement(us9_errorCalenderMsgPage.repeatCheckBox);
        us9_errorCalenderMsgPage.repeatCheckBox.click();
    }

    @Then("the user enter {string} inside the box")
    public void the_user_enter_inside_the_box(String string) {
        us9_errorCalenderMsgPage.repeatEveryBox.clear();
        us9_errorCalenderMsgPage.repeatEveryBox.sendKeys(string, Keys.ENTER);

    }


    @And("the user see error message1 {string}")
    public void the_user_see_error_message(String actualMessage) {
        String expectedMassage = "The value have not to be more than 99.";
        Assert.assertEquals(expectedMassage,actualMessage);
    }

    @And("the user see error message2 {string}")
    public void theUserSeeErrorMessage(String actualResult) {
        String expectedResult= "The value have not to be less than 1.";
        Assert.assertEquals(expectedResult,actualResult);
    }
}





