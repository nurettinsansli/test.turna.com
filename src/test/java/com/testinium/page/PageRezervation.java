package com.testinium.page;

import com.testinium.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static com.testinium.constants.ConstantRezervationPage.*;

public class PageRezervation extends BasePage{

    public PageRezervation(WebDriver driver) {
        super(driver);
    }
    public void fillPersonInfo() throws InterruptedException {
        WebElement Scrollmale= findElement(male);
        scrollDown(Scrollmale);
        clickElement(male);
        sendKeys(name,"Test");
        sendKeys(surname,"User");
        hoverElement(dayOfDate);
        clickElement(popup_close);
        clickElement(dayOfDate);
        clickElement(dvalue1);
        hoverElement(monthOfDateValue);
        clickElement(monthOfDateValue);
        clickElement(dvalue2);
        clickElement(yearOfBirthValue);
        clickElement(dvalue3);
        clickElement(Nationality);
        clickElement(Nationality);
        sendKeys(ID,"84740103658");
        sendKeys(HesCode,"1234567890");
        clickElement(PhoneNo);
        sendKeys(PhoneNo,"5393751299");
        sendKeys(eMail,"testuser@gmail.com");
        hoverElement(SigortaRed);
        clickElement(SigortaRed);

        clickElement(OdemeyeIlerle);



    }
}
