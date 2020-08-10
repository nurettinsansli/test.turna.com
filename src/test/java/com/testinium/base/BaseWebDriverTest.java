package com.testinium.base;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;

public abstract class BaseWebDriverTest {
    public enum DriverType{
        CHROME, FIREFOX;
    }
    protected static WebDriver driver;
    protected static DriverType driverType= DriverType.CHROME;
    protected final static String CHROME_PATH = "properties/driver/chrome/84/chromedriver.exe";
    protected final static String FIREFOX_PATH = "properties/driver/geckodriver/79/geckodriver.exe";
    protected static DesiredCapabilities capabilities = new DesiredCapabilities();


    @BeforeClass
    public static void prepareDriver() throws Exception {
       ChromeOptions chrop;
       switch (driverType){
           case CHROME:
               System.setProperty("webdriver.chrome.driver",CHROME_PATH);
               chrop = new ChromeOptions().merge(capabilities);
               chrop.addArguments("start-maximized");
               chrop.addArguments("kiosk");
               chrop.addArguments("test-type");
               chrop.addArguments("disable-translate");
               chrop.addArguments("disable-popup-blocking");
               driver = new ChromeDriver(chrop);
               break;
           case FIREFOX:
               System.setProperty("webdriver.gecko.driver",FIREFOX_PATH);
               capabilities.setBrowserName(BrowserType.FIREFOX);
               driver = new FirefoxDriver(new FirefoxOptions(capabilities));
               break;
       }
    }

    @AfterClass
    public static void cleanup() {
        driver.quit();
    }

}
