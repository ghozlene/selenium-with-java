package clickElement;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class LeftRightClick {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("file:///C:/Users/theghost/IdeaProjects/seleniumCourse/src/test/resources/index.html");

        //we need always to send the driver to the actions to know which driver you use
        Actions actions= new Actions(driver);

        //we need always to add .preform() to execute the action or you can use .build()
        //if you have more the one action
        actions.click(driver.findElement(By.xpath("//*[@id=\"link-google\"]"))).perform();
        //using this just for now to accept the alert
        driver.switchTo().alert().accept();

        //navigate to the previous page
        driver.navigate().back();
        // using contextClick to simulate right-click on the mouse
        actions.contextClick(driver.findElement(By.xpath("//*[@id=\"link-youtube\"]"))).perform();



    }
}
