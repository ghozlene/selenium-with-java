package window;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class GetWindowHandler {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("file:///C:/Users/theghost/IdeaProjects/seleniumCourse/src/test/resources/window.html");
        WebElement element=driver.findElement(By.xpath("/html/body/div/a[1]"));
        element.click();

        //Finding the id of the parent window the first window that appear in the browser
        String parent = driver.getWindowHandle();
        System.out.println("the id of the parent Window:  "+ parent);

    //Finding all the ids of the opening window
       Set<String> window= driver.getWindowHandles();
        System.out.println("all window = " +window);


    }
}
