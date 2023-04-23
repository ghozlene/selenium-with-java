package findElements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementByDeclareWebElement {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("file:///C:/Users/theghost/IdeaProjects/seleniumCourse/src/test/resources/index.html");
        driver.manage().window().maximize();

        WebElement welcomeHeader=driver.findElement(By.xpath("//*[@data-testid=\"welcomeTitle\"]"));
        String element=welcomeHeader.getText();

        System.out.println(element);
        driver.quit();
    }
}
