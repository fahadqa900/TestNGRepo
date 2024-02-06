package com.metlife.pageobjects;

import org.openqa.selenium.By;

public class HomePage
{
    public static By source=By.id("src");
    public static By first_list_item=By.xpath("//*[text()='Jaipur (Rajasthan)']");
    public static By destination=By.id("dest");
    public static By second_list_item=By.xpath("//*[text()='Chennai']");
    public static By dateText=By.xpath("//div[@class='DayNavigator__IconBlock-qj8jdz-2 iZpveD'][2]");
    public static By dateIconForNextMonth=By.xpath("//div[@class='DayNavigator__IconBlock-qj8jdz-2 iZpveD'][3]");
    public static By dateSelection=By.xpath("//div[starts-with(@class,'DatePicker__CalendarContainer')]//span[text()='4']");
   public static By explore_button=By.id("search_button");
   public static By error = By.xpath("//div[@class='oops-wrapper new_oops_wrapper']");
}
