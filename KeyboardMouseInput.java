//keyboard and mouse input testing:

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyboardMouseInput {
    public static void main(String[] args) throws InterruptedException {
        // Automatically Downloads and configures ChromeDriver
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        
        // Navigate to the page
        driver.get("https://formy-project.herokuapp.com/keypress");
        Thread.sleep(2000);
        
        // Find the name input field and interact with it
        WebElement name = driver.findElement(By.id("name"));
        name.click();
        name.sendKeys("Raygun");
        Thread.sleep(2000);
        
        // Find the button and click if enabled
        WebElement button = driver.findElement(By.id("button"));
        if (button.isEnabled()) {
            Thread.sleep(2000);
            button.click();
        }
        
        // Wait for a while before quitting
        Thread.sleep(2000);
        driver.quit();
    }
}

