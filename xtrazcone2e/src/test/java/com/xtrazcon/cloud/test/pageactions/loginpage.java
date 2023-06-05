package com.xtrazcon.cloud.test.pageactions;

import com.xtrazcon.cloud.test.pageobject.pageObject;
import org.openqa.selenium.WebDriver;
import test.Common;

import java.io.IOException;
import java.util.Map;

public class loginpage extends Common {

    Map<String, String> login = super.readFileWithJavaProperties(pageObject.siteAdmin);
    Common common;

    public loginpage(WebDriver driver) throws IOException {
        super(driver);
    }

    }

