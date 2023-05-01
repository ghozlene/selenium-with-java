package clickElement;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class DragAndDropFile {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("file:///C:/Users/theghost/IdeaProjects/seleniumCourse/src/test/resources/dragAndDrop.html");
        Thread.sleep(5000);
        Actions action= new Actions(driver);

        WebElement source= driver.findElement(By.xpath(("//*[@id='drag-card3']")));
        System.out.println(source.getText());

        WebElement destination= driver.findElement(By.xpath("//*[@id=\"progress\"]"));
        System.out.println(source.getText());


        action.dragAndDrop(source,destination).perform();
    }
}
