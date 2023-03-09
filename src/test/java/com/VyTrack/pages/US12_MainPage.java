package com.VyTrack.pages;

import com.VyTrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US12_MainPage {

    public US12_MainPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[@class='title title-level-1']//i[@class='fa-users menu-icon']/..")
    public WebElement customersDropdown;

    @FindBy(xpath = "//a[@href='/account']")
    public WebElement accountsButton;

    @FindBy(xpath = "//a[@title='Filters']")
    public WebElement filtersButton;


}
