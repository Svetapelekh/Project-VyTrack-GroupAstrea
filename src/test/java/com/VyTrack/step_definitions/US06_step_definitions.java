package com.VyTrack.step_definitions;

import com.VyTrack.pages.BasePage;
import com.VyTrack.pages.US06_Page;
import com.VyTrack.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class US06_step_definitions extends BasePage {

    US06_Page us06_page = new US06_Page();
    @When("The user hover over Fleet module and seeing the dropdown list")
    public void the_user_hover_over_fleet_module_and_seeing_the_dropdown_list() {
        navigateToModule("Fleet","Vehicles");
    }
    @Then("The user hover the mouse over the three dots “…”")
    public void the_user_hover_the_mouse_over_the_three_dots() {
        BrowserUtils.sleep(4);
        BrowserUtils.hover(us06_page.toHoverOver);
       }
    @Then("The user see following icons")
    public void the_user_see_following_icons(List<String> expectedOptions) {

        WebElement viewIcon = us06_page.viewIcon;
        WebElement pencilIcon = us06_page.pencilIcon;
        WebElement deleteIcon = us06_page.deleteIcon;

        BrowserUtils.waitForVisibility(viewIcon,3);
        BrowserUtils.waitForVisibility(pencilIcon,3);
        BrowserUtils.waitForVisibility(deleteIcon,3);

       List<WebElement> webElementList =new ArrayList<>();
       webElementList.addAll( Arrays.asList(viewIcon,pencilIcon,deleteIcon));

           List<String> textFromWebElements = new ArrayList<>();
        for (WebElement element : webElementList){
            BrowserUtils.waitForVisibility(element,3);
            textFromWebElements.add(element.getAttribute("title"));
        }
           Assert.assertEquals(expectedOptions,textFromWebElements);

   }
 }


