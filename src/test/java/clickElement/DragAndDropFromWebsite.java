package clickElement;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class DragAndDropFromWebsite {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://jqueryui.com/droppable/");

        Actions action= new Actions(driver);

        //this is just need because we need to go to the frame that contain our elements
        //because our elements are inside of frame if we don't switch to goe inside the frame
        //the source and the destination elements will not be appear and an error will be return
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"content\"]/iframe")));
        WebElement source= driver.findElement(By.xpath("//div[@id=\"draggable\"]"));
        System.out.println(source.getText());

        WebElement destination= driver.findElement(By.cssSelector(".ui-droppable"));
        System.out.println(source.getText());


        action.dragAndDrop(source,destination).perform();




    }
}
