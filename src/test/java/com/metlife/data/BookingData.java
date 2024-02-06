package com.metlife.data;

import com.metlife.utility.ExcelUtils;
import org.testng.annotations.DataProvider;

public class BookingData
{
    @DataProvider
    public Object[][]bookingData()
    {
//        return new Object[][]
//                {
//                   new Object[]{"Jaipur","Chennai","Apr 2024"}
//                };
        return ExcelUtils.readExcel("Book1.xlsx","Sheet1");
    }
}
