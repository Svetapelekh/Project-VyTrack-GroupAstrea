package com.VyTrack.pages;

import com.VyTrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US05_VehicleModelPage extends BasePage {

    public US05_VehicleModelPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[@class='title title-level-1'][normalize-space()='Fleet']")

    public WebElement fleetDropdownMenu;


    @FindBy(xpath = "//span[normalize-space()='Vehicles Model']")

    public WebElement vechiclesModel;


    @FindBy(xpath = "//span[@class='grid-header-cell__label']")

    public WebElement gridHeaderRow;

    @FindBy(xpath = "//span[.='Model Name']")
    public WebElement modelName_Header;

    @FindBy(xpath = "//span[.='Make']")
    public WebElement make_Header;

    @FindBy(xpath = "//span[.='Can be requested']")
    public WebElement canBeRequested_Header;

    @FindBy(xpath = "//span[.='CVVI'] ")
    public WebElement CVVI_Header;

    @FindBy(xpath = "//span[.='CO2 Fee (/month)'] ")
    public WebElement CO2Fee_Header;

    @FindBy(xpath = "//span[.='Cost (Depreciated)'] ")
    public WebElement costDepreciated_Header;

    @FindBy(xpath = "//span[.='Total Cost (Depreciated)'] ")
    public WebElement totalCostDepreciated_Header;

    @FindBy(xpath = "//span[.='CO2 Emissions'] ")
    public WebElement CO2Emissions_Header;

    @FindBy(xpath = "//span[.='Fuel Type'] ")
    public WebElement fuelType_Header;

    @FindBy(xpath = "//span[.='Vendors']")
    public WebElement vendors_Header;
    }

