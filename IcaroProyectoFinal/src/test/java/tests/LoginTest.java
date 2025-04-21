package qaautomation.tests;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import qaautomation.utils.WebDriverManagerUtil;

import java.time.Duration;

public class LoginTest {

    private static WebDriver driver;

    @BeforeAll
    public static void setup() {
        WebDriverManagerUtil.setupDriver(); // Llamada correcta al método setupDriver()
        driver = new ChromeDriver();
    }

    @Test
    public void loginTest() {
        driver.get("https://qa-practice.netlify.app/auth_ecommerce");

        // Maximizar la ventana
        driver.manage().window().maximize();

        // Ingresar el email
        WebElement emailInput = driver.findElement(By.id("email"));
        emailInput.sendKeys("admin@admin.com");

        // Ingresar la contraseña
        WebElement passwordInput = driver.findElement(By.id("password"));
        passwordInput.sendKeys("admin123");

        // Hacer click en el botón Submit
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        WebElement submitButton;
        submitButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("submitLoginBtn")));
        submitButton.click();

        // Puedes agregar más validaciones después de este paso

        driver.quit();
    }
}