package com.testinium.page;

import com.testinium.base.BasePage;
import org.openqa.selenium.WebDriver;

import static com.testinium.constants.ConstantSearchTicketPage.*;

public class SearchTicketPage extends BasePage {
    public SearchTicketPage(WebDriver driver) {super(driver);}

    public void Ticket_Search() throws InterruptedException {
        clickElement(flightType);

        findElement(origin).clear();
        sendKeys(origin,"SAW");


        Thread.sleep(10000);

        //sendKeys(origin,"ATY");

        //sendKeys(fromDate,"18-08-2020");

        //sendKeys(returnDate,"23-08-2020");

        //findElement(searchBtn).click();

    }
}
