package frames;

import findElements.FindElements;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class SwtichToFrame {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);

        driver.get("file:///C:/Users/theghost/IdeaProjects/seleniumCourse/src/test/resources/frame2.html");
        //Store the web element
        WebElement iframe = driver.findElement(By.cssSelector("#modal>#buttonframe"));
        System.out.println(driver.getWindowHandle());

        //Switch to the frame
        driver.switchTo().frame(iframe);
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        //Now we can click the button
        driver.findElement(By.tagName("button")).click();


       WebElement element=  driver.findElement(By.xpath("//*[@id=\"navbarDropdown\"]"));
     element.click();
     driver.findElement(By.cssSelector(".dropdown-item")).click();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        //return to the main frame
        // or we can use this one too
        // driver.switchTo().parentFrame();
        driver.switchTo().defaultContent();
        String title= driver.findElement(By.xpath("/html/body/h1")).getText();
        System.out.println(title);
       //switch the second frame
        WebElement frame2 = driver.findElement(By.xpath("//*[@id=\"gogoanime\"]"));
        driver.switchTo().frame(frame2);
        driver.findElement(By.xpath("//*[@id=\"wrapper_bg\"]/header/section/div[1]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"wrapper_bg\"]/header/section/div[3]/nav/ul/li[4]")).click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"wrapper_bg\"]/section/section[1]/div/div[1]/div/div/ul/li[2]/a")).click();


    }
}
