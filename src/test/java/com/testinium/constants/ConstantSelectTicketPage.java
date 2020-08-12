package com.testinium.constants;

import org.openqa.selenium.By;

public class ConstantSelectTicketPage extends ConstantMainPage{
    public static final By airline_name = By.cssSelector(".airline-name");
    public static final By fromBtn = By.xpath("//div[@class='airline-name' and contains(., 'Pegasus')]//parent::div//parent::div//parent::div//parent::div//div[@class=\"col-sm-4 text-right amount-wrapper\"]//div[@class=\"button\"]//input[@class=\"from-in-button\"]");
    public static final By toBtn = By.cssSelector(".to-in-button");
    public static final By DevamBtn = By.cssSelector(".bt-choose");
}
