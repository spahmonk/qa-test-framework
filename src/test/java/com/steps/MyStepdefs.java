package com.steps;

import com.pages.BasePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.springframework.beans.factory.annotation.Autowired;


public class MyStepdefs {

    @Autowired
    BasePage basePage;

    @Given("^I start test$")
    public void iStartTest(){
        basePage.open();
        assert true;
    }

    @Then("^I see result$")
    public void iSeeResult(){
        assert true;
    }
}
