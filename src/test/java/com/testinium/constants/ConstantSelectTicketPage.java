package com.testinium.constants;

import org.openqa.selenium.By;

public class ConstantSelectTicketPage extends ConstantMainPage{
    public static final By airline_name = By.cssSelector(".airline-name");
    //public static final By fromBtn = By.xpath("//div[@class='airline-name' and contains(., 'Pegasus')]//parent::div//parent::div//parent::div//parent::div//div[@class=\"col-sm-4 text-right amount-wrapper\"]//div[@class=\"button\"]//input[@class=\"from-in-button\"]");
    public static final By airlineAj = By.cssSelector("#airline-AJ  .check-box-wrapper > input");
    public static final By airlinePc = By.cssSelector("#airline-PC  .check-box-wrapper > input");
    public static final By airlineMultiple = By.cssSelector("#airline-multiple  .check-box-wrapper > input");
    public static final By fromBtn = By.cssSelector(".from-in-button");
    public static final By toBtn = By.cssSelector(".to-in-button");
    public static final By DevamBtn = By.cssSelector(".bt-choose");
}
