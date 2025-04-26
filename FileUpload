//Test Code For: "https://formy-project.herokuapp.com/fileupload"

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUploadTest {
    public static void main(String[] args) throws InterruptedException {
        // Automatically Downloads and configures ChromeDriver
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://formy-project.herokuapp.com/fileupload");
        Thread.sleep(2000);
        
        WebElement uploadField = driver.findElement(By.id("file-upload-field"));
        uploadField.sendKeys("C:\\path\\to\\your\\file.txt"); // Update the path to an actual file on your machine
        Thread.sleep(2000);
        
        WebElement uploadButton = driver.findElement(By.className("btn"));
        if(uploadButton.isEnabled()) {
            Thread.sleep(2000);
            uploadButton.click();
        }
        
        Thread.sleep(2000);
        driver.quit();
    }
}
