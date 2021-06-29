package co.com.automation.endava.utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GetDriver {
    public static WebDriver chrome() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("-disable-cache");
        WebDriver driver = new ChromeDriver(options);
        driver.get(new ReadProperties().urlPage());
        return driver;
    }
}
