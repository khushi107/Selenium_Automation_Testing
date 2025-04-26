//for switching window and alert

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.Iterator;
import java.util.Set;

public class SwitchWindowTest {
    public static void main(String[] args) throws InterruptedException {
        // Automatically Downloads and configures ChromeDriver
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://formy-project.herokuapp.com/switch-window");
        Thread.sleep(2000);
        
        // Find the "Launch new window" button and click it
        WebElement button = driver.findElement(By.id("button"));
        if (button.isEnabled()) {
            button.click();
        }
        
        Thread.sleep(2000);
        
        // Get the current window handle (the original window)
        String originalWindow = driver.getWindowHandle();
        
        // Get all window handles
        Set<String> allWindows = driver.getWindowHandles();
        
        // Iterate over the window handles and switch to the new window
        Iterator<String> iterator = allWindows.iterator();
        while (iterator.hasNext()) {
            String windowHandle = iterator.next();
            if (!windowHandle.equals(originalWindow)) {
                // Switch to the new window
                driver.switchTo().window(windowHandle);
                break;
            }
        }
        
        // Perform an action in the new window (e.g., click on an element)
        Thread.sleep(2000);
        
        // Switch back to the original window
        driver.switchTo().window(originalWindow);
        
        Thread.sleep(2000);
        driver.quit();
    }
}
