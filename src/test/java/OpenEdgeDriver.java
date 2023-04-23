import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class OpenEdgeDriver {
    public static void main(String[] args) {
        //webDriverManager responsible for installing the EdgeDriver and making the necessary
        //configuration
        WebDriverManager.chromedriver().setup();
        WebDriverManager.edgedriver().setup();
        WebDriver driver= new EdgeDriver();
        driver.get("https://www.google.com");


    }
}
