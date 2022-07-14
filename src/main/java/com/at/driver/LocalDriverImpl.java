package com.at.driver;


import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class LocalDriverImpl implements iDriver{


    @Override
    public WebDriver getDriver() throws MalformedURLException {

        DesiredCapabilities capabilites = new DesiredCapabilities();
        capabilites.setCapability(MobileCapabilityType.APP,
                System.getProperty("user.dir") + "/src/test/resources/apkfiles/ApiDemos-debug.apk");
        capabilites.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
        capabilites.setCapability(MobileCapabilityType.DEVICE_NAME, "RZ8M740EBJT");
        return new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilites);
    }
}
