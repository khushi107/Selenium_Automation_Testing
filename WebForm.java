//for web form

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FormTest {
    public static void main(String[] args) throws InterruptedException {
        // Automatically Downloads and configures ChromeDriver
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://formy-project.herokuapp.com/form");
        Thread.sleep(2000);
        
        // Fill in the name field
        WebElement nameField = driver.findElement(By.id("first-name"));
        nameField.sendKeys("John");

        // Fill in the last name field
        WebElement lastNameField = driver.findElement(By.id("last-name"));
        lastNameField.sendKeys("Doe");
        
        // Fill in the job title field
        WebElement jobTitleField = driver.findElement(By.id("job-title"));
        jobTitleField.sendKeys("Software Engineer");

        // Select the education radio button (example of radio button interaction)
        WebElement radioButton = driver.findElement(By.id("radio-button-1"));
        radioButton.click();
        
        // Select the gender checkbox (example of checkbox interaction)
        WebElement checkbox = driver.findElement(By.id("checkbox-1"));
        checkbox.click();
        
        // Select the dropdown for "Country"
        WebElement dropdown = driver.findElement(By.id("select-menu"));
        dropdown.click();
        WebElement option = driver.findElement(By.xpath("//option[@value='1']")); // Choose the first country
        option.click();
        
        // Fill out the date field
        WebElement dateField = driver.findElement(By.id("datepicker"));
        dateField.sendKeys("12/25/2025");
        
        // Click on the submit button
        WebElement submitButton = driver.findElement(By.cssSelector(".btn.btn-lg.btn-primary"));
        if(submitButton.isEnabled()) {
            submitButton.click();
        }
        
        Thread.sleep(2000);
        driver.quit();
    }
}
