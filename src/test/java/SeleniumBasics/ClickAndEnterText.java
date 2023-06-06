package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ClickAndEnterText {
    @Test
    public void clickAndText()
    {
        //***initialization of Driver***//
       System.setProperty("webdriver.chrome.driver","D:\\VFC project\\Feb2023Batch\\src\\test\\resources\\Drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        //To maximize web browser
        driver.manage().window().maximize();
        //Navigating to URL
        driver.get("https://www.letskodeit.com/practice");
        //clicking on webelement
        WebElement btn_signin=driver.findElement(By.xpath("(//a[text()='Sign In'])[1]"));
        btn_signin.click();
        WebElement txt_username=driver.findElement(By.xpath("//form[@name='loginform']//input[@id='email']"));
        //Enter text in textbox
        txt_username.sendKeys("naveenchowdaryvemuri@gmail.com");
        WebElement txt_password=driver.findElement(By.xpath("//form[@name='loginform']//input[@id='login-password']"));
        txt_password.sendKeys("Naveen@143");
        WebElement btn_login=driver.findElement(By.xpath("//form[@name='loginform']//button[text()='Login']"));
        btn_login.click();

        //to close all opened browsers

        driver.quit();
    }
}
