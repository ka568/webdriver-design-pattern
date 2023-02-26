package com.xkp.seleniumdesign.srp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public abstract class AbstractComponent {
    protected abstract boolean isDisplayed();
    public WebDriverWait wait;
    public AbstractComponent(final WebDriver driver){
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(30L));
        PageFactory.initElements(driver, this);
    }


}
