package co.com.automation.endava.utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import static org.openqa.selenium.Keys.ENTER;
import static org.openqa.selenium.Keys.TAB;

public class ClearCacheDriver {
    public static void clearCache() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("chrome://settings/clearBrowserData");
        Thread.sleep(1000);
        Actions actions = new Actions(driver);
        actions.sendKeys(TAB,TAB,TAB,TAB,TAB,TAB,ENTER);
        actions.perform();
        driver.close();
    }
}
