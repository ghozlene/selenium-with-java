package basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaximizeFullScreen {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();

        driver.get("file:///C:/Users/theghost/IdeaProjects/seleniumCourse/src/test/resources/index.html");
        //make the website maximize
    //       driver.manage().window().maximize();
    // make the website full screen
        driver.manage().window().fullscreen();

    }

}
