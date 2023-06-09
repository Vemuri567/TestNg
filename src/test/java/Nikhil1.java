import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Nikhil1
{
    @Test
    public void Letskode() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\TestNg\\src\\test\\resources\\Drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.letskodeit.com/");
        Thread.sleep(2000);
        WebElement signin= driver.findElement(By.xpath("//a[text()=\"Sign In\"]"));
        signin.click();
        Thread.sleep(2000);
        WebElement username=driver.findElement(By.xpath("//input[@class=\"form-control input-md\"]"));
        username.sendKeys("nalepogulanikhil@gmail.com");
        Thread.sleep(2000);
        WebElement password=driver.findElement(By.xpath("//input[@id=\"login-password\"]"));
        password.sendKeys("abc@123");
        Thread.sleep(2000);
        WebElement loginbutton= driver.findElement(By.xpath("//button[@id=\"login\"]"));
        loginbutton.click();
        Thread.sleep(8000);
        driver.quit();

    }
}
