package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.IOException;

public class DriverFactor {
    public static WebDriver m_driver;
    public static String browser="chrome";

    DriverFactor(WebDriver driver){
        this.m_driver=driver;
    }
    public WebDriver lunchBrowser() throws IOException {
        System.out.println("chrome broser started");
//        String browserType = readPropertesFail("src/test/resources/application.properties", "browser");
        String browserType=browser;
        if (browserType.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.addArguments("--remote-allow-origins=*");
            m_driver = new ChromeDriver(chromeOptions);
            m_driver.manage().window().maximize();
        } else if (browserType.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            m_driver = new FirefoxDriver();
        }
        return m_driver;
    }
    public WebDriver getDriver() {
        try{
            if (m_driver == null)
                m_driver = lunchBrowser();
        }
        catch (IOException e){

        }
        return m_driver;
    }
}
