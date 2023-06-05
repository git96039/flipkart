package com.xtrazcon.cloud.test.Steps;

import com.xtrazcon.cloud.test.cache.Cache;
import com.xtrazcon.cloud.test.pageactions.loginpage;
import test.Common;

public class StepDef extends Cache {
    Common common;
    public StepDef(){
        this.common=new Common(Common.driver);
    }
       loginpage l=super.getLoginPage();


}
