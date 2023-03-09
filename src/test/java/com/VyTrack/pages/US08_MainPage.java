package com.VyTrack.pages;

import com.VyTrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US08_MainPage {

    public US08_MainPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[@class='title title-level-1']//i[@class='fa-puzzle-piece menu-icon']")
    public WebElement dropdownActivities;

    @FindBy(xpath = "//span[text()='Calendar Events']")
    public WebElement buttonCalendarEvents;

    @FindBy(xpath = "//a[@title='Create Calendar event']")
    public WebElement buttonCreateCalendarEvent;

    @FindBy(id = "recurrence-repeat-view3009")
    public WebElement checkboxRepeat;

    @FindBy(name = "temp-validation-name-3060")
    public WebElement windowRepeatEvery;

}
