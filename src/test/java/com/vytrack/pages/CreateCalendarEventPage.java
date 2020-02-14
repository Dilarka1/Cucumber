package com.vytrack.pages;

import com.vytrack.utilities.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class CreateCalendarEventPage extends BasePage{
    @FindBy(xpath = "//a[@class=\"select2-choice\"]/span[@class=\"select2-chosen\"]")
    public WebElement owner;
    public WebElement createCalendarEvent;
    public void clickToCreateCalendarEvent(){
        BrowserUtils.waitForVisibility(createCalendarEvent, 5);
        BrowserUtils.waitForClickablility(createCalendarEvent, 5);
        createCalendarEvent.click();
    }
}

