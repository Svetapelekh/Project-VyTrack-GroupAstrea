package com.VyTrack.pages;

import com.VyTrack.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class US10_DescriptionPage {

    public US10_DescriptionPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[@class='title title-level-1'][normalize-space()='Activities']")
    public WebElement activitiesTab;


    @FindBy(xpath = "//span[@class='title title-level-2'][normalize-space()='Calendar Events']")
    public WebElement calendarEventTab;

    @FindBy(xpath = "//a[@title='Create Calendar event']")
    public WebElement createCalendarEventLnk;


    @FindBy(xpath = "//input[@data-name=\"recurrence-repeat\"]")
    public WebElement repeatButton;

    @FindBy(xpath = "//body//p")
    public WebElement DescriptionBox;

    @FindBy(xpath = "//p[normalize-space()='Scrum daily meeting']")
    public WebElement paragraphText;

}

