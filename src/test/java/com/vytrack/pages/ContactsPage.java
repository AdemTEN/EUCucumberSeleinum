package com.vytrack.pages;

import com.vytrack.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactsPage extends BasePage {

    @FindBy(css=".input-widget")
    public WebElement pageNumber;

    @FindBy(xpath = "//td[@class='string-cell editable view-mode prevent-text-selection-on-dblclick grid-cell grid-body-cell grid-body-cell-email'][contains(.,'mike.jorden@hotmail.comEdit')]")
    public WebElement emailMike;


    public WebElement getContactEmail(String email){
        String xpath = "//*[contains(text(), '"+email+"') and @data-column-label='Email']";
        return Driver.get().findElement(By.xpath(xpath));
    }


}

