package com.VyTrack.step_definitions;

import com.VyTrack.pages.BasePage;
import com.VyTrack.pages.US05_VehicleModelPage;
import com.VyTrack.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class US05_step_definitions extends BasePage {

    @When("user navigate to {string}")
    public void user_navigate_to(String string) {

        navigateToModule("Fleet", "Vehicles Model");

    }


    @Then("user see below column names on the Vehicle Model page")
    public void userSeeBelowColumnNamesOnTheVehicleModelPage(List<String> expectedColumnNames) throws IOException {

        System.out.println("expectedColumnNames = " + expectedColumnNames);

        US05_VehicleModelPage US05VehicleModelPage = new US05_VehicleModelPage();

        List<WebElement> webElementList = Arrays.asList(US05VehicleModelPage.modelName_Header, US05VehicleModelPage.make_Header, US05VehicleModelPage.canBeRequested_Header,
                US05VehicleModelPage.CVVI_Header, US05VehicleModelPage.CO2Fee_Header, US05VehicleModelPage.costDepreciated_Header,
                US05VehicleModelPage.totalCostDepreciated_Header, US05VehicleModelPage.CO2Emissions_Header, US05VehicleModelPage.fuelType_Header, US05VehicleModelPage.vendors_Header);

        String textFromWebElements = "";

        for (WebElement element : webElementList)
        {
            textFromWebElements += " " + element.getText();
        }

        List<String> actualColumnNames = new ArrayList<String>();

        for(WebElement element : webElementList){

            String text = element.getText();

            actualColumnNames.add(text);
        }

        System.out.println("actualColumnNames = " + actualColumnNames);

        Assert.assertEquals(actualColumnNames,expectedColumnNames);

    }

    @Then("user see {string} message")
    public void userSeeMessage(String errorMessage) {

        BrowserUtils.verifyElementDisplayed(By.xpath("//div[text()='You do not have permission to perform this action.']"));
    }
}
//
//    Get number of columns for a web table in Selenium
//
//        num_cols = len (driver.find_elements_by_xpath
//
//        (""))


//
//
