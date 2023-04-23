package sendKeys;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeys {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.get("https://facebook.com");
        driver.manage().window().maximize();

        //find the element By xpath : data-testid="royal_email"
       WebElement elLogin= driver.findElement(By.xpath("//*[@data-testid=\"royal_email\"]"));
       //sendkeys to send data to the element
        elLogin.sendKeys("achref@gmail.com");

        //find element by cssSelector
        WebElement elPassword= driver.findElement(By.cssSelector("#pass"));
        elPassword.sendKeys("aaaa");

        WebElement btnloginIn= driver.findElement(By.xpath("//*[@data-testid=\"royal_login_button\"]"));

        btnloginIn.click();



    }
}
