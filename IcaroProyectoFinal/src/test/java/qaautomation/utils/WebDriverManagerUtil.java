package qaautomation.utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverManagerUtil {

    public static WebDriver initializeDriver() {
        // Configura WebDriverManager para el controlador de Chrome
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver();
    }

    public static void setupDriver() {
    }
}




