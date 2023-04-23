package findElements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementByXpath {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("file:///C:/Users/theghost/IdeaProjects/seleniumCourse/src/test/resources/index.html");

        //Xpath
        //*Xpath Expression
        // this the global expression//tagName[@attribute='value'] you can verify it in the console of the browser
       //1- String element=driver.findElement(By.xpath("//h1[@class='titleClass']")).getText();


        // the absolut xPath = $x("//html/body/header/h1[@class='titleClass']") test in the browser
       //2- String element=driver.findElement(By.xpath("//html/body/header/h1[@class='titleClass']")).getText();

      //  String element=driver.findElement(By.xpath("//html/body/article/ul/li[1]")).getText();
     //   System.out.println(element);


        //3  $x("//*[contains(@class,'order-')]")
        //this meaning that you want to search using xpath a class that contains order-
        // we use this because the second part of the class or id can be generated automatically
      //  WebElement element= driver.findElement(By.xpath("//*[contains(@class,'order-')]"));

        //4 we use this method to avoid working with classes that can be changes or id that are generated
        // automatically

        // String elementText= driver.findElement(By.xpath("//*[@data-testid='welcomeTitle']")).getText();
        // System.out.println(elementText);



        driver.quit();
    }
}
