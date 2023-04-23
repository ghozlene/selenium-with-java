package basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowSize {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("file:///C:/Users/theghost/IdeaProjects/seleniumCourse/src/test/resources/index.html");

        //We just need to declare dimension then use it in the setSize
        Dimension iphoneXR= new Dimension(500,800);
        Dimension ipadAir= new Dimension(820,1080);
        driver.manage().window().setSize(ipadAir);


    }
}
