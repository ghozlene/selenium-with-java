package basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitAndCloseSelenium {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://selenium.dev");
        String titlePage=driver.getTitle();
        System.out.println(titlePage);

        //quit the window
       // driver.quit(); //Close all the windows and tabs
        //close the window
        driver.close(); //Close only the current tab
    }
}
