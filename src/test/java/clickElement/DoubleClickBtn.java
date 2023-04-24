package clickElement;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickBtn {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();


        driver.manage().window().maximize();
        driver.get("https://www.plus2net.com/javascript_tutorial/ondblclick-demo.php");

        //we need always to send the driver to the actions to know which driver you use
        Actions actions= new Actions(driver);

        //we need always to add .preform() to execute the action or you can use .build()
        //if you have more the one action
        actions.doubleClick(driver.findElement(By.xpath("/html/body/div/input"))).perform();

        //other example for the same above just declaring the variable before making the action
        WebElement doubleClickBtn= driver.findElement(By.xpath("/html/body/div/input"));
        actions.doubleClick(doubleClickBtn).perform();
    }
}
