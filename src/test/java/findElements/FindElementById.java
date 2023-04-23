package findElements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.xml.bind.Element;
import java.util.List;

public class FindElementById {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("file:///C:/Users/theghost/IdeaProjects/seleniumCourse/src/test/resources/index.html");

    // 1    //String element= driver.findElement(By.id("title")).getText();
    //2     // String element=driver.findElement(By.name("firstParagraph")).getText();
     //3   // String element=driver.findElement(By.className("nav")).getText();


        //this one is not recommended for using
        //return the first appearance of the li tagName
    //4    // String element= driver.findElement(By.tagName("li")).getText();


        //this one return the text of a link not a normal text
    //5   String element= driver.findElement(By.linkText("MDN Web Docs")).getText();

     //return the full text of the long text link just passing a part of the text link
    //6    String element= driver.findElement(By.partialLinkText("MDN W")).getText();



     //   System.out.println("the text is : " + element);
        driver.quit();
    }
}
