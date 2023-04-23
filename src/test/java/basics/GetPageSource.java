package basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPageSource {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();


        driver.manage().window().maximize();
        driver.get("https://selenium.dev")
        ;
        //Getto,g the source of the page
        String pageSource=driver.getPageSource();
        System.out.println("page Source = \n" +pageSource);



    }
}
