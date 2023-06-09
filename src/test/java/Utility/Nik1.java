package Utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Nik1 {
    WebDriver driver;
    String url;
    @BeforeTest
    public void Setup(){
        driver=new ChromeDriver();
        url="https://www.letskodeit.com/";
        driver.manage().window().maximize();
    }
    @Test
    public void test(){
        driver.get(url);
        driver.findElement(By.xpath("//div[@data-component=\"button\"]")).click();
        driver.findElement(By.xpath("//input[@tabindex=\"4\"]")).sendKeys("nalepogulanikhil@gmail.com");
        driver.findElement(By.xpath("//input[@tabindex=\"5\"]")).sendKeys("abc@123");
        driver.findElement(By.xpath("//button[@tabindex=\"7\"]")).click();
    }
    @AfterTest
    public void tear(){
        driver.quit();
        System.out.println();
    }


}
