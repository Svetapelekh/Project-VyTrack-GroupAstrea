package com.VyTrack.pages;

import com.VyTrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US9_calenderMsgPage extends  BasePage {
    public US9_calenderMsgPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//span[@class='title title-level-1'][normalize-space()='Activities']")
    public WebElement activitiesButton;
    @FindBy(xpath = "//span[@class='title title-level-2'][normalize-space()='Calendar Events']")
    public WebElement calendarEventLink;

    @FindBy(xpath = "//a[@title='Create Calendar event']")
    public  WebElement createCalendarEventButton;
    //div[@class='pull-right title-buttons-container']

     @FindBy(xpath = "//input[@data-name=\"recurrence-repeat\"]")
    public  WebElement repeatCheckBox;

     @FindBy(xpath = "//label[@data-role='control-section-switcher']//input[@value='1']")
    public WebElement repeatEveryBox;

     @FindBy(xpath = "//span[@id='temp-validation-name-318-error']")
    public WebElement errorMsg1;
}
