package com.VyTrack.step_definitions;

import com.VyTrack.pages.BasePage;
import com.VyTrack.utilities.BrowserUtils;
import com.VyTrack.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class US04_Step_Definitions extends BasePage {

    @Then("the user hovers over {string} module and clicks on {string}")
    public void the_user_hovers_over_module_and_clicks_on(String string1, String string2) {
       navigateToModule("Fleet", "Vehicle Contracts");

       BrowserUtils.sleep(3);
    }

//    @Then("the user hovers over Fleet module")
//    public void the_user_hovers_over_fleet_module() {
//        WebElement fleetModule = Driver.getDriver().findElement(By.xpath("//ul[@class='nav-multilevel main-menu']/li[2]"));
//        Actions action = new Actions(Driver.getDriver());
//        action.moveToElement(fleetModule).perform();
//
//    }
//    @Then("the user clicks on Vehicle Contracts")
//    public void the_user_clicks_on_vehicle_contracts() {
//
//        WebElement contractsLink = Driver.getDriver().findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[2]/div/div/ul/li[6]"));
//        contractsLink.click();
//    }

    @Then("the sales manager should be able to see expected URL")
    public void the_sales_manager_should_be_able_to_see_expected_url() {

        String expectedURL = "https://qa1.vytrack.com/entity/Extend_Entity_VehicleContract";
        String actualURL = Driver.getDriver().getCurrentUrl();

        System.out.println("expectedURL = " + expectedURL);
        System.out.println("actualURL = " + actualURL);

        Assert.assertTrue(actualURL.contains(expectedURL));

    }

    @Then("the store manager should be able to see expected URL")
    public void the_store_manager_should_be_able_to_see_expected_url() {

        String expectedURL = "https://qa1.vytrack.com/entity/Extend_Entity_VehicleContract";
        String actualURL = Driver.getDriver().getCurrentUrl();

        System.out.println("expectedURL = " + expectedURL);
        System.out.println("actualURL = " + actualURL);

        Assert.assertTrue(actualURL.contains(expectedURL));

    }

    @Then("the user should be able to see expected title")
    public void the_user_should_be_able_to_see_expected_title() {
        String expectedTitle = "All - Vehicle Contract - Entities - System - Car - Entities - System";
        String actualTitle = Driver.getDriver().getTitle();

        System.out.println("expectedTitle = " + expectedTitle);
        System.out.println("actualTitle = " + actualTitle);

        Assert.assertEquals(expectedTitle, actualTitle);
    }

    @Then("the user should see “You do not have permission to perform this action.”")
    public void the_user_should_see_you_do_not_have_permission_to_perform_this_action() {

        WebElement popUpWindow = Driver.getDriver().findElement(By.xpath("//*[@id=\"flash-messages\"]/div/div/div[2]/div"));
        popUpWindow.getText().equals("You do not have permission to perform this action.");

    }

    }
