//Test for radio buttons:

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButtonTest {
    public static void main(String[] args) throws InterruptedException {
        // Automatically Downloads and configures ChromeDriver
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://formy-project.herokuapp.com/radiobutton");
        Thread.sleep(2000);
        
        // Find and select the radio button
        WebElement radioButton1 = driver.findElement(By.id("radio-button-1"));
        if (radioButton1.isEnabled()) {
            radioButton1.click(); // Click on the first radio button
        }
        Thread.sleep(2000);
        
        // Find the submit button and click it
        WebElement button = driver.findElement(By.id("button"));
        if (button.isEnabled()) {
            Thread.sleep(2000);
            button.click();
        }
        
        Thread.sleep(2000);
        driver.quit();
    }
}
