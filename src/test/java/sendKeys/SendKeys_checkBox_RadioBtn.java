package sendKeys;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class SendKeys_checkBox_RadioBtn {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        //this is used to make sure that selenium wait until page loaded
        //because selenium doesn't wait
        driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);
        driver.get("https://facebook.com");
        driver.manage().window().maximize();


        driver.findElement(By.xpath("//*[@data-testid=\"open-registration-form-button\"]")).click();


        driver.findElement(By.name("firstname")).sendKeys("achref");
        driver.findElement(By.name("lastname")).sendKeys("ghozlene");
        driver.findElement(By.name("reg_email__")).sendKeys("5555555");
        driver.findElement(By.name("reg_passwd__")).sendKeys("aaaaa");

        //to select the Radio btn you can use contains to find the text of the radio btn and click it
        driver.findElement(By.xpath("//*[contains(text(),'Homme')]")).click();

        //select option from dropdown menu
        WebElement dropDownDays=driver.findElement(By.xpath("//*[@id=\"day\"]"));

        //using Select class from selenium to select the element(the tag must be select)
        //otherwise it will return error
        Select selectDay= new Select(dropDownDays);
        //selecting the day using index of the day index start from 0
        selectDay.selectByIndex(6);

        //Selecting the month (using selectByValue
        WebElement dropDownMonth=driver.findElement(By.xpath("//*[@id=\"month\"]"));
        Select selectMonth= new Select(dropDownMonth);
        selectMonth.selectByValue("1");

        //selecting the year
        WebElement dropDownYear=driver.findElement(By.xpath("//*[@id=\"year\"]"));
        Select selectYear= new Select(dropDownYear);
        //selecting byvisibleText mean the text inside the option tag
        selectYear.selectByVisibleText("1995");
    }
}
