package com.xtrazcon.cloud.test.pageactions;

import com.xtrazcon.cloud.test.pageobject.pageObject;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import test.Common;

import java.util.Map;

public class loginpage extends Common {

    Map<String, String> login = super.readFileWithJavaProperties(pageObject.corporate);
//    Common common;

    public loginpage(WebDriver driver)  {
        super(driver);
    }

public void selectLoginType(String loginType) throws Exception {
        try{

            System.out.println("hem"+retriveLocators(dynamicXpathGenerator(login.get("loginAsCorporate"),loginType)));
            super.elementClick(retriveLocators(dynamicXpathGenerator(login.get("loginAsCorporate"),loginType)));
        }
        catch(Exception e){

        }
}
    public void setUserName(String userName) {
        try {
            super.enterText(retriveLocators(login.get("emailtbx")), userName);
        } catch (Exception e) {

        }

    }
    public void setPassword(String password){
            try{
                super.enterText(retriveLocators(login.get("password")), password);


            } catch(Exception e){

            }
    }
    public void clickLoginbtn(){
        try{
            System.out.println("hemadrirrexjdsjzxlkxlk");
            super.elementClick(retriveLocators(login.get("loginbtn")));
            if(!super.isElementVisible(retriveLocators(login.get("siteLogo"))));{
                driver.findElement(retriveLocators(login.get("password"))).sendKeys(Keys.ENTER);
            }

        }catch (Exception e){

        }
}





}

