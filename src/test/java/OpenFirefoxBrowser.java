import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenFirefoxBrowser {
    public static void main(String[] args) {
        //webDriverManager responsible for installing the chromeDriver and making the necessary
        //configuration
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver= new FirefoxDriver();
        driver.get("https://www.google.com");

    }
}
