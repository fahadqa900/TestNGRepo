package com.metlife.testsuites;

import com.metlife.data.BookingData;
import com.metlife.pageobjects.HomePage;
import com.metlife.utility.WebDriverUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.time.Duration;

public class TicketBooking extends SetupTearDown
{
    @Test(dataProviderClass = BookingData.class, dataProvider = "bookingData")
    public void no_buses_ticket(String src,String dest,String mnth) throws IOException
    {

       //picking source element with id locator and then using xpath text method:
       WebDriverUtils.type(HomePage.source,src);
       WebDriverUtils.click(HomePage.first_list_item);

       //picking destination element with id locator and then using xpath text method:
        WebDriverUtils.type(HomePage.destination,dest);
        WebDriverUtils.click(HomePage.second_list_item);

      //Calendar Handling:
      //wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("dPBSOp")));
        String source = WebDriverUtils.getWebSource();
        FileOutputStream fos = new FileOutputStream("Temp.html");
       fos.write(source.getBytes(StandardCharsets.UTF_8));
     //driver.findElement(By.id("Layer_1")).click();
     //driver.findElement(By.xpath("//*[text()='15']")).click();
     //We can also locate the above element as shown below:
     //div[starts-with(@class,'DatePicker__CalendarContainer')]//span[text()='4']

     //For Month Selection:
     //String month=driver.findElement(HomePage.dateText).getText();
     String month=WebDriverUtils.getTexture(HomePage.dateText);
     while (!month.contains(mnth))
     {
      //driver.findElement(HomePage.dateIconForNextMonth).click();
     WebDriverUtils.click(HomePage.dateIconForNextMonth);
     month=WebDriverUtils.getTexture(HomePage.dateText);
     }
    System.out.println(month);
    //driver.findElement(HomePage.dateSelection).click();
    WebDriverUtils.click(HomePage.dateSelection);
    WebDriverUtils.click(HomePage.explore_button);
    String Error=WebDriverUtils.getTexture(HomePage.error);
    WebDriverUtils.assertion(Error,"Oops! No buses found.\n"+
            "Oops! No buses found.");
    }
}