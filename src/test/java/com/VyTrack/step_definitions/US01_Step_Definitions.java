package com.VyTrack.step_definitions;

import com.VyTrack.pages.BasePage;
import com.VyTrack.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class US01_Step_Definitions extends BasePage {


    @Then("store managers sees below modules:")
    public void store_managers_sees_below_modules(List<String> expectedModuleListForStoreManagers) {
        BrowserUtils.waitFor(10);
        List<String> actualModuleListForStoreManagers = BrowserUtils.getElementsText(menuOptions);

        System.out.println("expectedModuleListStore = " + expectedModuleListForStoreManagers);
        System.out.println("actualModuleListStore = " + actualModuleListForStoreManagers);

        Assert.assertEquals(actualModuleListForStoreManagers,expectedModuleListForStoreManagers);
    }

    @Then("sales managers sees below modules:")
    public void sales_managers_sees_below_modules(List<String> expectedModuleListForSalesManagers) {
        BrowserUtils.waitFor(5);
        List<String> actualModuleListForSalesManagers = BrowserUtils.getElementsText(menuOptions);

        System.out.println("expectedModuleListSales = " + expectedModuleListForSalesManagers);
        System.out.println("actualModuleListSales = " + actualModuleListForSalesManagers);

        Assert.assertEquals(actualModuleListForSalesManagers,expectedModuleListForSalesManagers);
    }

    @Then("drivers sees below modules:")
    public void driversSeesBelowModules(List<String> expectedModuleListForDrivers) {

        BrowserUtils.waitFor(5);
        List<String> actualModuleListForDrivers = BrowserUtils.getElementsText(menuOptions);

        System.out.println("expectedModuleListDrivers = " + expectedModuleListForDrivers);
        System.out.println("actualModuleListDrivers = " + actualModuleListForDrivers);

        Assert.assertEquals(actualModuleListForDrivers,expectedModuleListForDrivers);
    }
}
