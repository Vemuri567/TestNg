package Utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Multipleselect {
    WebDriver driver;
    String url;
    @BeforeTest
    public void Setup(){
        driver=new ChromeDriver();
        url="https://www.letskodeit.com/practice";
        driver.manage().window().maximize();
    }
    @Test
    public void Test() throws InterruptedException {
        driver.get(url);
        WebElement element=driver.findElement(By.id("carselect"));
        Select sel=new Select(element);
        sel.selectByIndex(2);
        Thread.sleep(2000);
        sel.selectByVisibleText("BMW");
        Thread.sleep(2000);
        sel.selectByValue("benz");
        Thread.sleep(2000);
    }
    @AfterTest
    public void tear(){
        driver.quit();
    }
}
