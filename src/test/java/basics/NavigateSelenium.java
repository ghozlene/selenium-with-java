package basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateSelenium {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://google.com");
        driver.navigate().to("https://selenium.dev");
        //navigate to the previous website
        driver.navigate().back();
        //navigate forward
        driver.navigate().forward();
        //refresh the page
        driver.navigate().refresh();


    }

}
