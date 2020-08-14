package com.testinium.page;

import com.testinium.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static com.testinium.constants.ConstantSelectTicketPage.*;
public class PageTicketSelect extends BasePage {

    public PageTicketSelect(WebDriver driver) {
        super(driver);
    }
    public void chooseTicket() throws InterruptedException {
        WebElement airlinename= findElement(airline_name);
        scrollDown(airlinename);
        clickElement(airlineAj);
        clickElement(airlinePc);
        clickElement(airlineMultiple);
        clickElement(fromBtn);
        clickElement(toBtn);
        clickElement(DevamBtn);

    }
}
