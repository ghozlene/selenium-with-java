package screenShot;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

public class ScreenShot {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.youtube.com");

        //Convert web driver object to TakeScreenshot
        TakesScreenshot screenshot=((TakesScreenshot)driver );

        //Call getScreenshotAs method to create image file
        File srcFile=screenshot.getScreenshotAs(OutputType.FILE);
        
        // Save the screenshot to a file
        try {
            FileUtils.copyFile(srcFile, new File("C:/Users/theghost/IdeaProjects/seleniumCourse/src/test/resources/img/screenshot.png"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
