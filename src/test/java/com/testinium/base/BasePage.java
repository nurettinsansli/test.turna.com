package com.testinium.base;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage extends BaseWebDriverTest {
    WebDriverWait wait;
    final static Logger log = Logger.getLogger(BasePage.class);
    JavascriptExecutor jse= (JavascriptExecutor)driver;;
    public BasePage(WebDriver driver) {
        PropertyConfigurator.configure("properties/log4j.properties");
        this.driver = driver;
        this.wait = new WebDriverWait(driver,10);
    }
    public void hoverElement(By by) {
        Actions actions = new Actions(driver);
        actions.moveToElement(findElement(by)).build().perform();
    }
    public WebElement findElement(By by) {
        untilElementAppear(by);
        return driver.findElement(by);
    }
    public void  scrollDown(WebElement id) {
        jse.executeScript("arguments[0].scrollIntoView(true);",id);

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
        log.info(by+" elementinin var olması bekleniyor...");
        wait.until(ExpectedConditions.presenceOfElementLocated(by));
    }

    public void untilElementClickable(By by) {
        log.info(by+" elementinin tıklanabilir olması bekleniyor...");
        wait.until(ExpectedConditions.elementToBeClickable(by));
    }
}
