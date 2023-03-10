package com.xkp.seleniumdesign.srp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ResultStat extends AbstractComponent{

    @FindBy(id = "resultStats")
    private WebElement stat;

    public String getStat(){
        return this.stat.getText();
    }

    public ResultStat(WebDriver driver){
        super(driver);
    }

    @Override
    protected boolean isDisplayed() {
        return this.wait.until(driver -> this.stat.isDisplayed());
    }
}
