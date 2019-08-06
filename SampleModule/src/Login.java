import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        // Create Chrome browser instance
        System.setProperty("webdriver.chrome.driver", "E:\\Balaji\\Balaji\\Testing Software\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();

        // Navigate to the mentioned Url
        driver.get("https://test3.icoreemr.com");
        driver.manage().window().maximize(); // Window handler to maximize the browser window

        // Giving Credentials to the iMedicor Login
        driver.findElement(By.id("username")).sendKeys("daneil");
        driver.findElement(By.id("password")).sendKeys("12345678");
        driver.findElement(By.id("login")).click();

        Thread.sleep(3000);
        driver.quit();

    }
}
