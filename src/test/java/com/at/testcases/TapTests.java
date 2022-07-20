package com.at.testcases;

import com.at.driver.Driver;
import com.at.driver.DriverManager;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.URL;

public class TapTests extends BaseTest{

    /*
      1.Never Hardcoding
      2.Try to reuse the code but inheritance is the last solution
      3.Make it easy for others to follow or write new tests
      4.clean code
      5.keep right things at right places
     */

   // AndroidDriver driver;

   @Test
    public void tapTest(){
       WebElement views= .findElement(By.xpath("//android.widget.TextView[@text='Views']"));

       views.click();


    }

    @Test
    public void swipeTest(){
        WebElement views=Driver.getDriver().findElement(By.xpath("//android.widget.TextView[@text='Views']"));

        views.click();

    }

    /*

   // @Test
    public void tapTest(){


        DesiredCapabilities capabilites =new DesiredCapabilities();
        capabilites.setCapability(MobileCapabilityType.APP,
                System.getProperty("user.dir")+"/src/test/resources/apkfiles/ApiDemos-debug.apk");
        capabilites.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");
        capabilites.setCapability(MobileCapabilityType.DEVICE_NAME,"RZ8M740EBJT");


        driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilites);

        System.out.println(" end of  api demos");

        WebElement views=driver.findElement(By.xpath("//android.widget.TextView[@text='Views']"));

        views.click();

    }

   // @Test
    public void swipeTest(){


        DesiredCapabilities capabilites =new DesiredCapabilities();
        capabilites.setCapability(MobileCapabilityType.APP,
                System.getProperty("user.dir")+"/src/test/resources/apkfiles/ApiDemos-debug.apk");
        capabilites.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");
        capabilites.setCapability(MobileCapabilityType.DEVICE_NAME,"RZ8M740EBJT");


        driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilites);

        System.out.println(" end of  api demos");

        WebElement views=driver.findElement(By.xpath("//android.widget.TextView[@text='Views']"));

        views.click();

    }


     */
}
