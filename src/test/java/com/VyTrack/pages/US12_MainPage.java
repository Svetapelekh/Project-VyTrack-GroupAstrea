package com.VyTrack.pages;

import com.VyTrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class US12_MainPage {

    public US12_MainPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[@class='title title-level-1']//i[@class='fa-users menu-icon']/..")
    public WebElement customersDropdown;

    @FindBy(xpath = "//a[@href='/account']/span")
    public WebElement accountsButton;

    @FindBy(xpath = "//a[@title='Filters']")
    public WebElement filtersButton;

    @FindBy(xpath = "//div[contains(text(), 'Account name')]")
    public WebElement accountNameFilter;

    @FindBy(xpath = "//div[contains(text(), 'Contact name')]")
    public WebElement contactNameFilter;

    @FindBy(xpath = "//div[contains(text(), 'Contact email')]")
    public WebElement contactEmailFilter;

    @FindBy(xpath = "//div[contains(text(), 'Contact phone')]")
    public WebElement contactPhoneFilter;

    @FindBy(xpath = "//div[contains(text(), 'Owner')]")
    public WebElement ownerFilter;

    @FindBy(xpath = "//div[contains(text(), 'Business Unit')]")
    public WebElement businessUnitFilter;

    @FindBy(xpath = "//div[contains(text(), 'Created At')]")
    public WebElement createdAtFilter;

    @FindBy(xpath = "//div[contains(text(), 'Updated At')]")
    public WebElement updatedAtFilter;

    public static boolean filtersAreDisplayed(){
        US12_MainPage page = new US12_MainPage();
        List<WebElement> listOfFilters = new ArrayList<>();
        listOfFilters.addAll(Arrays.asList(page.accountNameFilter, page.contactNameFilter, page.contactEmailFilter,
                page.contactPhoneFilter, page.ownerFilter, page.businessUnitFilter, page.createdAtFilter, page.updatedAtFilter));
        for (WebElement each : listOfFilters) {
            if (!each.isDisplayed()){
                return false;
            }
        }
        return true;
    }

}
