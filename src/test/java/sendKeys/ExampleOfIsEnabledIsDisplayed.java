package sendKeys;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class ExampleOfIsEnabledIsDisplayed {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);
        driver.get("file:///C:/Users/theghost/IdeaProjects/seleniumCourse/src/test/resources/index.html");
        driver.manage().window().maximize();

        //1- using isDisplay to check if the element exist or not
        //if the element is not included in the html file it will automatically return error because
        //findElement method will not find the element that we want to search
        //this used to find for example a spinner (loading element after charging a page)
        //if the spinner in css (display:none) then isDisplay return false
        boolean emailDisplayed= driver.findElement(By.xpath("//*[@id=\"email\"]")).isDisplayed();
        System.out.println("Display Status: "+ emailDisplayed);


        //2- using isEnabled to check if the element Enabled or not
        //if the element is not Enabled then you can't for example tap inside of the input text

        boolean emailEnabled= driver.findElement(By.xpath("//*[@id=\"email\"]")).isEnabled();
        System.out.println("Enabled status: "+ emailEnabled);


        //3- using isSelect to check if the element is selected or not
        driver.findElement(By.xpath("/html/body/div/div[1]/input[2]")).click();

       boolean checked= driver.findElement(By.xpath("/html/body/div/div[1]/input[2]")).isSelected();
        System.out.println("is the value checked :" + checked);

        //4-  We get the attribute by using getAttribute()
        String attributeContent= driver.findElement(By.xpath("/html/body/div/div[1]/input[2]")).getAttribute("data-testid");
        System.out.println("the attribute value is : " +attributeContent );

        //5-  We can use getTagName to get the tagName of the element that we find
        //it need to be used always after the FindElement
        String tagName=driver.findElement(By.xpath("//*/div[1]/input[2]")).getTagName();
        System.out.println("the TagName of the element is: " + tagName);


        //6- we can use GetCssValue to get the value of the css element
        //it returns the value of the css of the element that you specify
        //for example here it returns the value of the margin of the element because the element has a margin
        String cssValue= driver.findElement(By.xpath("//*/div[1]/input[2]")).getCssValue("margin");
        System.out.println("the value of the css(margin): "+cssValue);

        //another example of the GetCssValue: with the background color that contain hexadecimal code
        //the result will show in rgba by the way
        String cssBackgroundValue=driver.findElement(By.xpath(("//*[@id=\"post\"]"))).getCssValue("background-color");
        System.out.println(cssBackgroundValue);

        //7 using getLocation it return the position of the element compared with x axis and y axis of the page
        // you can show the ruler by going to the setting of the developer mode and searh
        //for Show rules on hover (in the second column)
        Point locationPoint =driver.findElement(By.xpath(("//*[@id=\"post\"]"))).getLocation();
        System.out.println(" the location on the x axis: "+locationPoint.x +"\n the location y axis: "+ locationPoint.y);


        //8 using getSize it return the dimension(the width and the height of the element)
        Dimension dimensionElement=driver.findElement(By.xpath("/html/body/div/div[1]/input[1]")).getSize();
        System.out.println("the height of the element Radio btn is : "+dimensionElement.height);
        System.out.println("the width of the element Radio btn is : "+dimensionElement.width);

        //9 using getRec this method is general it returns both the dimension and the position of the element
        //check the methods of the Rectangle object and you will find all the methods of Dimension & getSize
        Rectangle recElement=driver.findElement(By.xpath("/html/body/div/div[1]/input[1]")).getRect();
        System.out.println("the full dimension is : "+ recElement.getDimension());




    }
}
