package com.at.driver;

import org.openqa.selenium.WebDriver;

public final class DriverManager {

    private DriverManager(){

        private static ThreadLocal<WebDriver> threadlocalDriver=new ThreadLocal<>();

        public static WebDriver getDriver() {

            return threadlocalDriver.get();
        }

        public static void setDriver(WebDriver driver){
            threadlocalDriver.set(driver);
        }

    }
}
