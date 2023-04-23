package findElements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindElements {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();

        driver.get("file:///C:/Users/theghost/IdeaProjects/seleniumCourse/src/test/resources/index.html");
        driver.manage().window().maximize();

        //Example of Finding elements
        //Get element by Index
      // 1- WebElement el=driver.findElements(By.cssSelector(".order-list li")).get(1);
      //  String element=el.getText();

        //Example of finding elements
        //2- Return list of elements
        List<WebElement> listElements=driver.findElements(By.cssSelector(".order-list li"));

        for(WebElement e :listElements){
            //printing every element of the listElements
            System.out.println(e.getText());
        }
        //printing the size of the listElement
        System.out.println(listElements.size());


       // System.out.println(element);

        driver.quit();

    }
}
