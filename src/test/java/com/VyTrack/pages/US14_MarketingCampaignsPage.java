package com.VyTrack.pages;

import com.VyTrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US14_MarketingCampaignsPage extends BasePage{

    public US14_MarketingCampaignsPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//button[@type='button']")
    public WebElement manageFiltersButton;

    @FindBy (xpath = "//a[@title='Filters']")
    public WebElement filtersButton;

    @FindBy (xpath = "//input[@value='name']")
    public WebElement checkbox_Name;

    @FindBy (xpath = "//input[@value='code']")
    public WebElement checkbox_Code;

    @FindBy (xpath = "//input[@value='startDate']")
    public WebElement checkbox_StartDate;

    @FindBy (xpath = "//input[@value='endDate']")
    public WebElement checkbox_EndDate;

    @FindBy (xpath = "//input[@value='budget']")
    public WebElement checkbox_Budget;


}
