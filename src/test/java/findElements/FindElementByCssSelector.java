package findElements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementByCssSelector {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("file:///C:/Users/theghost/IdeaProjects/seleniumCourse/src/test/resources/index.html");

        //1-  using #id  inside of cssSelector to search for element with id
        //example : #title
        // String element= driver.findElement(By.cssSelector("#title")).getText();

        //2-  using .class  inside of cssSelector to search for element with class
        //example : .title
       // String element= driver.findElement(By.cssSelector(".titleClass")).getText();


        //3-  using [attribute=value]  inside of cssSelector to search for element with the attribute and value
        //example : [data-testid="welcomeTitle"]
        String element= driver.findElement(By.cssSelector("[data-testid=\"welcomeTitle\"]")).getText();
        System.out.println(element);

        //!important : if you want to check cssSelector in the browser you need
        // to enter for example : $("[data-testid=\"welcomeTitle\"]")
        driver.quit();
    }
}
