package com.xtrazcon.cloud.test.Steps;

import com.xtrazcon.cloud.test.pageobject.pageObject;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;
import test.Common;


public class BeforeTag {
    public static boolean RMStatus = true;
    Common common;
    public BeforeTag(){
        this.common=new Common(Common.driver);
    }

    @Before("@na")
    public void NavigateNaukriLoginPageUrl() throws Exception {
        common.getDriver();
        String url = common.readPropertesFail("src/test/resources/application.properties", "url");
        System.out.println("hemadri"+ pageObject.siteAdmin);
        common.naviagteToUrl(url);
    }
//    @After("@na")
//    public void RMDataFailureCheck() {
//        if (scenario.isFailed()) {
//            RMStatus = false;
//            System.out.println("data creation status-------------------" + RMStatus);
//        }
//    }
    @After
    public void teardown(Scenario scenario) {
        if(scenario.isFailed()) {
            try {
                byte[] screenshot = ((TakesScreenshot)common).getScreenshotAs(OutputType.BYTES);
                scenario.attach(screenshot, "image/png", "screenshot");
            } catch (WebDriverException noSupportScreenshot) {
                System.err.println(noSupportScreenshot.getMessage());
            }
        }
        common.quitBrowser();
    }

}
