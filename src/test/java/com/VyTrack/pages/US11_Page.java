package com.VyTrack.pages;

import com.VyTrack.utilities.BrowserUtils;
import com.VyTrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US11_Page {

    public US11_Page(){PageFactory.initElements(Driver.getDriver(), this);}

    @FindBy(xpath = "//div[.='You do not have permission to perform this action.']")
    public WebElement PermissionMessage;

    @FindBy(xpath = "//input[@data-bound-input-widget='no-name']")
    public WebElement DefaultPageNumber;

    @FindBy(xpath = "//a[@data-size='25']")
    public WebElement DefaultViewPerPageNumber;

    @FindBy(xpath = "//button[@class='btn dropdown-toggle ']")
    public WebElement ToGoDefaultViewPerPageNumber2;

    public String getValueViewPerPage(){
        BrowserUtils.hover(ToGoDefaultViewPerPageNumber2);
        BrowserUtils.waitForClickablility(ToGoDefaultViewPerPageNumber2,25);
        BrowserUtils.waitForVisibility(ToGoDefaultViewPerPageNumber2,10);
        return ToGoDefaultViewPerPageNumber2.getText();
}}
