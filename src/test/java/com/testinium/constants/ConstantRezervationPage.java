package com.testinium.constants;

import org.openqa.selenium.By;

public class ConstantRezervationPage extends ConstantMainPage {
    public static final By male = By.id("lb-male");
    public static final By name = By.cssSelector(".firstname");
    public static final By surname = By.cssSelector(".lastname");
    public static final By dayOfDate = By.cssSelector(".day-of-birth");
    public static final By monthOfDate = By.cssSelector("month-of-birth");
    public static final By yearOfBirth = By.cssSelector("year-of-birth");
    public static final By NationalID = By.id("passenger-nationality");
    public static final By ID = By.cssSelector(".citizenno ");
    public static final By HesCode = By.name("hesCode");
    public static final By PhoneNo = By.id("txtPhone");
    public static final By eMail = By.id("txtEmail");
    public static final By SigortaNo = By.cssSelector(".lb-do-not-want-insurance");
    public static final By OdemeyeIlerle = By.cssSelector(".to-booking");
}
