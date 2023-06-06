package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.IOException;

public class DriverFactor {
    public static WebDriver driver;
    public static String browser="chrome";

     DriverFactor(WebDriver driver){
        DriverFactor.driver=driver;
    }
    public WebDriver lunchBrowser() throws IOException {
        System.out.println("chrome broser started");
//        String browserType = readPropertesFail("src/test/resources/application.properties", "browser");
        String browserType=browser;
        if (browserType.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.addArguments("--remote-allow-origins=*");
            driver = new ChromeDriver(chromeOptions);
            driver.manage().window().maximize();
        } else if (browserType.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }
        return driver;
    }
    public WebDriver getDriver() {
        try{
            if (driver == null)
                driver = lunchBrowser();
        }
        catch (IOException e){

        }
        return driver;
    }
}
