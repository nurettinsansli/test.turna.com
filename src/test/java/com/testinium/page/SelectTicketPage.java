package com.testinium.page;

import com.testinium.base.BasePage;
import org.openqa.selenium.WebDriver;

import static com.testinium.constants.ConstantSelectTicketPage.*;
public class SelectTicketPage extends BasePage {

    public SelectTicketPage(WebDriver driver) {
        super(driver);
    }
    public void chooseTicket()
    {
        findElement(fromBtn).click();

        findElement(toBtn).click();

        findElement(DevamBtn).click();
    }
}
