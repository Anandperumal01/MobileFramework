package com.at.driver;

import org.openqa.selenium.WebDriver;

import java.net.MalformedURLException;

public final class Driverfactory {

    private Driverfactory(){

    }

    /**
     *
     * @param mode
     * @return
     * @throws MalformedURLException
     */

    public static WebDriver get(Modes mode) throws MalformedURLException {


        WebDriver driver=null;

        if(mode.equals(Modes.LOCAL)) {
            driver=new LocalDriverImpl().getDriver();

        }
        else if(mode.equals(Modes.BS)){

            driver=new BrowserStackImpl().getDriver();

        }else if(mode.equals(Modes.SAUCELABS)){
            driver=new SauceLabsImpl().getDriver();
        }
        return driver;
    }
}
