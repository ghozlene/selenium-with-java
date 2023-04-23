import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChromeDriverUsingDriverManager {
    public static void main(String[] args) {

        //webDriverManager responsible for installing the chromeDriver and making the necessary
        //configuration
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.google.com");
    }
}
