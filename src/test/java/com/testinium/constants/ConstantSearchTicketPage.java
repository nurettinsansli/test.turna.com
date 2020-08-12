package com.testinium.constants;

import org.openqa.selenium.By;

public class ConstantSearchTicketPage extends ConstantMainPage{
    public static final By flightType = By.id("lb-way");
    public static final By origin = By.id("flight-from");
    //public static final By subOrigin = By.id("flight_origincode");
    public static final By dest = By.id("flight-to");
    public static final By fromDate = By.name("fromdate");
    public static final By fromDay = By.linkText("16");
    public static final By toDay = By.linkText("23");
    public static final By returnDate = By.id("dp1596866167866");
    public static final By searchBtn = By.id("btnSearch");



}
