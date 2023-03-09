package com.VyTrack.pages;

import com.VyTrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US06_Page {

    public US06_Page(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@class='dropdown-toggle'][1]")
    public WebElement threeDots;

    @FindBy(xpath = "//td[@class='action-cell grid-cell grid-body-cell'][1]")
    public WebElement toHoverOver;

    @FindBy(xpath = "//i[@class='fa-eye hide-text']/..")
    public WebElement viewIcon;

    @FindBy(xpath = "//i[@class='fa-pencil-square-o hide-text']/..")
    public WebElement pencilIcon;

    @FindBy(xpath = "//i[@class='fa-trash-o hide-text']/..")
    public WebElement deleteIcon;

}
