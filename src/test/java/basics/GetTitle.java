package basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://selenium.dev");
        //Getting the title of the page
        String pageTitle=driver.getTitle();
        System.out.println("the title of the page is :"+ pageTitle);
    }
}
