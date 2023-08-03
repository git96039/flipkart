package com.xtrazcon.cloud.test.Steps;

import com.xtrazcon.cloud.test.cache.Cache;
import com.xtrazcon.cloud.test.pageactions.loginpage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDef extends Cache {
//    Common common;
    public StepDef(){
//        this.common=new Common(DriverFactor.driver);
        super();
    }
       loginpage l=super.getLoginPage();

    @Given("User opens flipkart site")
    public void userOpensFlipkartSite() throws Exception {

    }

    @When("User clicks on search")
    public void userClicksOnSearch() throws Exception {
        l.clickOnSearch();
    }

    @And("enter text {string}")
    public void enterText(String ProductName) throws Exception {
        l.enterText(ProductName);

    }

    @Then("User should be able to see desired results")
    public void userShouldBeAbleToSeeDesiredResults() {
    }
}
