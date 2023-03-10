package com.VyTrack.pages;

import com.VyTrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US3_PinbarPage {
    public US3_PinbarPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//a[.='Learn how to use this space']")
    public WebElement link;


    @FindBy(xpath = "//h3[.='How To Use Pinbar']")
    public WebElement linkHowUsePinbar;

    @FindBy(xpath  ="//p[contains(text(),'Use pin icon on the right top corner ')]")
    public WebElement linkUsePinIcon;

    @FindBy (css = "img[src='/bundles/oronavigation/images/pinbar-location.jpg']")
    public WebElement actualImage;
}
