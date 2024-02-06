package com.metlife.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import java.time.Duration;

public class WebDriverUtils
{
    static WebDriver driver;
    //static WebDriverWait wait;
    public static void initialize(String browser)
    {
        switch(browser)
        {
            case "ff": case "firefox":
                driver = new FirefoxDriver();
                break;
            case "edge":
                driver = new EdgeDriver();
                break;
            default:
                ChromeOptions option=new ChromeOptions();
                option.addArguments("--disable-notifications");
                driver = new ChromeDriver(option);
                break;
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        //wait = new WebDriverWait(driver,Duration.ofSeconds(30));

    }
    public static void quitBrowser()
    {
        driver.quit();
    }

    public static void launchUrl(String url)
    {
      driver.get(url);
    }

    public static void type(By locator, String value)
    {
       //wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
        WebElement e = driver.findElement(locator);
        e.clear();
        e.sendKeys(value);
    }

    public static void click(By locator)
    {
      //wait.until(ExpectedConditions.presenceOfElementLocated(locator));
      //wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
      //wait.until(ExpectedConditions.elementToBeClickable(locator));
      driver.findElement(locator).click();
    }
    public static String getTexture(By locator)
    {
       String str= driver.findElement(locator).getText();
       return  str;
    }
    public static String getWebSource()
    {
      String str=driver.getPageSource();
      return  str;
    }
    public static void assertion(String errorValue,String actualValue)
    {
        Assert.assertEquals(errorValue,actualValue);
    }
}