package com.testinium.test;

import org.apache.log4j.Logger;
import com.testinium.page.PageRezervation;
import com.testinium.page.PageTicketSearch;
import com.testinium.base.BaseWebDriverTest;
import com.testinium.page.PageTicketSelect;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(OrderAnnotation.class)
public class TestTurna extends BaseWebDriverTest {
    final static Logger log = Logger.getLogger(TestTurna.class);
    PageTicketSearch search_ticketing;
    PageTicketSelect select_ticketing;
    PageRezervation rezervation_ticketing;
    @BeforeAll
    public static void setup()  {
        log.info("setUp yapıldı.");
        driver.navigate().to("https://www.turna.com/");

    }
    @Test
    @Order(1)
    public void searchTicket() throws InterruptedException {
        log.info("searchTicket senaryosu çalıştı.");
        search_ticketing = new PageTicketSearch(driver);
        search_ticketing.Ticket_Search();

    }
    @Test
    @Order(2)
    public void selectTicket() throws InterruptedException {
        log.info("selectTicket senaryosu çalıştı.");
        select_ticketing = new PageTicketSelect(driver);
        select_ticketing.chooseTicket();


    }
    @Test
    @Order(3)
    public void rezerveTicket() throws InterruptedException {
        log.info("rezerveTicket senaryosu çalıştı.");
        rezervation_ticketing = new PageRezervation(driver);
        rezervation_ticketing.fillPersonInfo();
    }

}
