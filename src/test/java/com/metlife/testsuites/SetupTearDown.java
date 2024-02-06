package com.metlife.testsuites;

import com.metlife.utility.WebDriverUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.time.Duration;

public class SetupTearDown
{
    @Parameters({"browser"})
    @BeforeClass
    public void setup(String browser)
    {
     WebDriverUtils.initialize(browser);
    }
    @BeforeMethod
    public void browserUrlLaunch()
    {
    WebDriverUtils.launchUrl("https://www.redbus.in/");
    }
  // @AfterMethod
 //    public void teardown()
 //    {
 //        WebDriverUtils.quitBrowser();
 //    }
 }
