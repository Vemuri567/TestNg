package Utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Nikhil4
{
    @Test
    public void Switchwindow() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\TestNg\\src\\test\\resources\\Drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.letskodeit.com/practice");
        Thread.sleep(2000);
        WebElement a=driver.findElement(By.xpath("//button[@id=\"openwindow\"]"));
        a.click();
        Thread.sleep(2000);
        driver.quit();
    }
}