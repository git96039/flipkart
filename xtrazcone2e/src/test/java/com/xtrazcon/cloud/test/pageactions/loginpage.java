package com.xtrazcon.cloud.test.pageactions;

import com.xtrazcon.cloud.test.pageobject.pageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import test.Common;

import java.util.Map;
import java.util.logging.Logger;

public class loginpage extends Common {
    private static final Logger log = Logger.getLogger(loginpage.class.getName());
    Map<String, String> login = super.readFileWithJavaProperties(pageObject.corporate);
//    Common common;

    public loginpage(WebDriver driver)  {
        super(driver);
    }

    public void clickOnSearch() throws Exception {
        super.elementClick(retriveLocators(login.get("searchButton")));
    }

    public void enterText(String ProductName) throws Exception {
        super.enterText(retriveLocators(login.get("searchButton")),ProductName);
        super.elementClick(retriveLocators(login.get("enterClick")));
    }

    public void validateProduct() throws Exception {
        try{
        WebElement ele= driver.findElement(By.xpath("//div[@data-id='MOBGZEUUWYKXPGDW']//div[@class='_4rR01T'][normalize-space()='REDMI 12C (Royal Blue, 64 GB)']"));
       String text= super.getText(ele);
        Assert.assertEquals(text,"REDMI 12C (Royal Blue, 64 GB)");
        }
        catch(Exception e){
            throw new RuntimeException(e);
        }
    }





}

