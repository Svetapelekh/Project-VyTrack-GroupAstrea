package com.VyTrack.pages;

import com.VyTrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US04 {

    public US04(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "//span[@class='title title-level-1'][normalize-space()='Fleet']")
    public WebElement fleetModule;

    @FindBy (xpath = "//span[normalize-space()='Vehicle Contracts']")
    public WebElement vehicleContracts;
}
