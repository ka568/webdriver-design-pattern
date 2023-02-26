package com.xkp.seleniundesign.test.srp;

import com.xkp.seleniumdesign.srp.GoogleMainPage;
import com.xkp.seleniumdesign.srp.GoogleResultPage;
import com.xkp.seleniundesign.test.BaseTest;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GoogleTest extends BaseTest {
    // two pages;
    private GoogleMainPage googleMainPage;
    private GoogleResultPage googleResultPage;

    @BeforeTest
    public void setupPages(){
        this.googleMainPage = new GoogleMainPage(driver);
        this.googleResultPage = new GoogleResultPage(driver);
    }

    @Test
    public void googleWorkFlow(){

        String keyword = "shopee";
        int index = 3;

        googleMainPage.goTo();
        // assert the true;
        Assert.assertTrue(googleMainPage.getSearchWidget().isDisplayed());
        googleMainPage.getSearchWidget().enter(keyword);
        Assert.assertTrue(googleMainPage.getSearchSuggestion().isDisplayed());

        googleMainPage.getSearchSuggestion().clickSuggestionByIndex(index);
        Assert.assertTrue(googleResultPage.getNavigationBar().isDisplayed());


        // do the same thing
        googleResultPage.getSearchWidget().enter(keyword);
        Assert.assertTrue(googleResultPage.getSearchSuggestion().isDisplayed());

        googleResultPage.getSearchSuggestion().clickSuggestionByIndex(index);

        googleResultPage.getNavigationBar().goToImages();

        System.out.println(
                googleResultPage.getResultStat().getStat()
        );

    }



}
