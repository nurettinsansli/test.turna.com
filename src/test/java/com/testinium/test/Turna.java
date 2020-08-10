package com.testinium.test;

import org.apache.log4j.*;
import com.testinium.page.RezervationPage;
import com.testinium.page.SearchTicketPage;
import com.testinium.base.BaseWebDriverTest;
import com.testinium.page.SelectTicketPage;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(OrderAnnotation.class)
public class Turna extends BaseWebDriverTest {
    final static Logger log = LogManager.getLogger(Turna.class.getName());
    SearchTicketPage search_ticketing;
    SelectTicketPage select_ticketing;
    RezervationPage rezervation_ticketing;
    @BeforeClass
    public static void setup()  {

        driver.navigate().to("https://www.turna.com/");

    }
    @Test
    @Order(1)
    public void searchTicket() throws InterruptedException {
        System.out.println("searchTicket method running...");

        //search_ticketing = new SearchTicketPage(driver);
        //search_ticketing.Ticket_Search();
        System.out.println("searchTicket method finish...");

    }
    @Test
    @Order(2)
    public void selectTicket() throws InterruptedException {
        System.out.println("selectTicket method running...");

        //select_ticketing = new SelectTicketPage(driver);
        //select_ticketing.chooseTicket();
        //log.info("selectTicket senaryosu çalıştı.");
        System.out.println("selectTicket method finish...");

    }
    @Test
    @Order(3)
    public void rezerveTicket() throws InterruptedException {
        System.out.println("rezerveTicket method running...");

        //rezervation_ticketing = new RezervationPage(driver);
        //log.info("rezerveTicket senaryosu çalıştı.");

        System.out.println("rezerveTicket method finish...");

    }

}
