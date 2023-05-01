package clickElement;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class ClickAndHoldAndReleaseWebsite {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://jqueryui.com/droppable/");

        Actions action= new Actions(driver);
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"content\"]/iframe")));
        WebElement source= driver.findElement(By.xpath("//div[@id=\"draggable\"]"));
        WebElement destination= driver.findElement(By.cssSelector(".ui-droppable"));

        //Action drag and drop alternative
        //if we use more than 1 action we need to use build() method to make the methods
        //work together
        action.clickAndHold(source).moveToElement(destination).release().build().perform();
    }
}
