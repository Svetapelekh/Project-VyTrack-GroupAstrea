package com.VyTrack.step_definitions;

import com.VyTrack.pages.BasePage;
import com.VyTrack.pages.US14_MarketingCampaignsPage;
import com.VyTrack.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class US14_step_definitions extends BasePage {

    US14_MarketingCampaignsPage US14_MarketingCampaignsPage = new US14_MarketingCampaignsPage();

    @When("manager navigate to {string}")
    public void store_manager_navigate_to(String module) {

        navigateToModule("Marketing", "Campaigns");
    }

    @And("manager click on Manage filters button")
    public void managerClickOnManageFiltersButton() {

        US14_MarketingCampaignsPage.filtersButton.click();
        US14_MarketingCampaignsPage.manageFiltersButton.click();
    }

    @Then("see all filter options are checked by default")
    public void see_all_filter_options_are_checked_by_default() {

        System.out.println("checkbox_Name.isSelected() " + US14_MarketingCampaignsPage.checkbox_Name.isSelected());
        System.out.println("checkbox_Code.isSelected() " + US14_MarketingCampaignsPage.checkbox_Code.isSelected());
        System.out.println("checkbox_StartDate.isSelected() " + US14_MarketingCampaignsPage.checkbox_StartDate.isSelected());
        System.out.println("checkbox_EndDate.isSelected() " + US14_MarketingCampaignsPage.checkbox_EndDate.isSelected());
        System.out.println("checkbox_Budget.isSelected() " + US14_MarketingCampaignsPage.checkbox_Budget.isSelected());


    }


    @Then("any amount of boxes can be unchecked")
    public void anyAmountOfBoxesCanBeUnchecked() {

        US14_MarketingCampaignsPage us_14MarketingCampaignsPage = new US14_MarketingCampaignsPage();


        BrowserUtils.selectCheckBox(us_14MarketingCampaignsPage.checkbox_Name, true);
        BrowserUtils.selectCheckBox(us_14MarketingCampaignsPage.checkbox_Code, true);
        BrowserUtils.selectCheckBox(us_14MarketingCampaignsPage.checkbox_StartDate, true);
        BrowserUtils.selectCheckBox(us_14MarketingCampaignsPage.checkbox_EndDate, true);
        BrowserUtils.selectCheckBox(us_14MarketingCampaignsPage.checkbox_Budget, true);

        BrowserUtils.selectCheckBox(us_14MarketingCampaignsPage.checkbox_Name, false);
        BrowserUtils.sleep(2);
        BrowserUtils.selectCheckBox(us_14MarketingCampaignsPage.checkbox_Code, false);
        BrowserUtils.sleep(2);
        BrowserUtils.selectCheckBox(us_14MarketingCampaignsPage.checkbox_StartDate, false);
        BrowserUtils.sleep(2);
        BrowserUtils.selectCheckBox(us_14MarketingCampaignsPage.checkbox_EndDate, false);
        BrowserUtils.sleep(2);
        BrowserUtils.selectCheckBox(us_14MarketingCampaignsPage.checkbox_Budget, false);

//        List<WebElement> checkboxCollection = Arrays.asList(us_14MarketingCampaignsPage.checkbox_Name,
//                us_14MarketingCampaignsPage.checkbox_Code,us_14MarketingCampaignsPage.checkbox_StartDate,
//                us_14MarketingCampaignsPage.checkbox_EndDate,us_14MarketingCampaignsPage.checkbox_Budget);
//
//        for (int i = 0; i < checkboxCollection.size(); i++) {
//
//            if(!checkboxCollection.get(i).isSelected())checkboxCollection.get(i).click();
//
//        }
//
//
//        for (int i = 0; i < checkboxCollection.size(); i++) {
//
//            if(checkboxCollection.get(i).isSelected())checkboxCollection.get(i).click();
//
//        }


//        US14MarketingCampaignsPage.checkbox_Name.click();
//        US14MarketingCampaignsPage.checkbox_Code.click();
//        US14MarketingCampaignsPage.checkbox_StartDate.click();
//        US14MarketingCampaignsPage.checkbox_EndDate.click();
//        US14MarketingCampaignsPage.checkbox_Budget.click();
//
//        System.out.println("checkbox_Name.isSelected(), EXPECTING FALSE --> " + US14MarketingCampaignsPage.checkbox_Name.isSelected());
//        System.out.println("checkbox_Code.isSelected(), EXPECTING FALSE --> " + US14MarketingCampaignsPage.checkbox_Code.isSelected());
//        System.out.println("checkbox_StartDate.isSelected(), EXPECTING FALSE --> " + US14MarketingCampaignsPage.checkbox_StartDate.isSelected());
//        System.out.println("checkbox_EndDate.isSelected(), EXPECTING FALSE --> " + US14MarketingCampaignsPage.checkbox_EndDate.isSelected());
//        System.out.println("checkbox_Budget.isSelected(), EXPECTING FALSE --> " + US14MarketingCampaignsPage.checkbox_Budget.isSelected());
    }
}
