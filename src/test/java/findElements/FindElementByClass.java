package findElements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementByClass {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();

        driver.get("file:///C:/Users/theghost/IdeaProjects/seleniumCourse/src/test/resources/index.html");
        driver.manage().window().maximize();

        //Example of Finding element by declare it first using the type By then get the element that you want
        By welcomeHeader= By.xpath("//header/h1[@data-testid=\"welcomeTitle\"]");

        WebElement el=driver.findElement(welcomeHeader);
        String element=el.getText();
        System.out.println(element);


        driver.quit();
    }
}
