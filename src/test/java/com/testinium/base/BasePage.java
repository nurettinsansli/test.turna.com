package com.testinium.base;
import com.testinium.test.Turna;
import org.apache.log4j.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.apache.log4j.Logger;

public class BasePage extends BaseWebDriverTest {
    WebDriverWait wait;
    final static Logger log = LogManager.getLogger(BasePage.class.getName());

    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver,10);
    }

    public WebElement findElement(By by) {
        untilElementAppear(by);
        return driver.findElement(by);
    }

    public void clickElement(By by) {
        untilElementClickable(by);
        findElement(by).click();
    }

    public void sendKeys(By by, String text) {
        isElementDisplayed(by);
        findElement(by).sendKeys(text);
    }

    public boolean isElementDisplayed(By by) {
        return findElement(by).isDisplayed();
    }

    public void untilElementAppear(By by) {
        log.info("Elementin var olması bekleniyor...");
        wait.until(ExpectedConditions.presenceOfElementLocated(by));
    }

    public void untilElementClickable(By by) {
        log.info("Elementin tıklanabilir olması bekleniyor...");
        wait.until(ExpectedConditions.elementToBeClickable(by));
    }







}
