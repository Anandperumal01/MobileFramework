package com.at.driver;

import com.at.utils.PropertyUtils;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Driver {
  // schedling my constructor with private so that no body will access it.
    // i am going to create all static methods

    // class should be closed for modification and open for extension

    // factory pattern ---> generating child classes  for super class or an interface
    public static WebDriver driver;


    private Driver(){

    }

    public static void initDriver() throws MalformedURLException {
      String modevalue= PropertyUtils.getValue("mode");

       driver=Driverfactory.get(Modes.valueOf(modevalue));


    }

    public static void quitDriver(){

        // logic to quit
        driver.quit();


    }


}
