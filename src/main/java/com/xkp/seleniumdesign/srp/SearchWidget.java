package com.xkp.seleniumdesign.srp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SearchWidget extends AbstractComponent{


    @FindBy(name="q")
    private WebElement searchBox;

    public SearchWidget(final WebDriver driver){
        super(driver);
    }
    public void enter(String keyWord){
        this.searchBox.click();
        this.searchBox.sendKeys(keyWord);

    }

    @Override
    public boolean isDisplayed() {
//        this.wait.until(ExpectedConditions.visibilityOf(this.searchBox));
//        return this.searchBox.isDisplayed();
        return this.wait.until(d -> this.searchBox.isDisplayed());
    }
}
