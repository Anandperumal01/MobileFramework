package com.at.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.net.MalformedURLException;

public interface iDriver {

    // Interfaces give you skeleton

    // if we create abstarct class.issue is we cannot extend two class.so intead of that we created that abstract Method

    public WebDriver getDriver() throws MalformedURLException;
}
