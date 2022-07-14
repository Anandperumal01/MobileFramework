package com.at.testcases;

import com.at.driver.Driver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseTest {
    @BeforeMethod
    public void setup() throws MalformedURLException {
        Driver.initDriver();


    }

    @AfterMethod
    public void teardown(){

        Driver.quitDriver();

    }

}
