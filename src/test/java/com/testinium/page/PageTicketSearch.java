package com.testinium.page;

import com.testinium.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import static com.testinium.constants.ConstantSearchTicketPage.*;

public class PageTicketSearch extends BasePage {
    public PageTicketSearch(WebDriver driver) {super(driver);}

    public void Ticket_Search() throws InterruptedException {

        clickElement(flightType);
        findElement(origin).clear();
        sendKeys(origin,"IST");
        findElement(origin).sendKeys(Keys.ENTER);
        sendKeys(dest,"AYT");
        findElement(origin).sendKeys(Keys.ENTER);
        clickElement(fromDate);
        clickElement(fromDay);
        clickElement(toDay);
        clickElement(popup_close);
        clickElement(searchBtn);

    }
}
