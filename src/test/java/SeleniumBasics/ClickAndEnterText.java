package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

public class ClickAndEnterText {
    @Test
    public void clickAndText()
    {
        //***initialization of Driver***//
       System.setProperty("webdriver.chrome.driver","D:\\VFC project\\Feb2023Batch\\src\\test\\resources\\Drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        //To maximize web browser
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
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
        WebElement btn_Pratice=driver.findElement(By.xpath("(//a[text()='PRACTICE'])[1]"));
        btn_Pratice.click();
        String currentwindow=driver.getWindowHandle();
        /**Switch to window by using title**/
       /* Set<String> allwindows=driver.getWindowHandles();
        for(String window:allwindows)
        {
            driver.switchTo().window(window);
            String title=driver.getTitle();
            if(title.equals("Practice Page"))
            {
                break;
            }
        }*/
        /**switch to window by using arraylist**/
        //ArrayList<String> obj=new ArrayList<>(2);
        ArrayList<String> windows=new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(windows.get(1));
        boolean displayed=driver.findElement(By.xpath("//legend[text()='Radio Button Example']")).isDisplayed();
        Assert.assertTrue(displayed,"radio button example is not displaying");
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='benzradio']")));
        WebElement radiobtn_benz=driver.findElement(By.xpath("//input[@id='benzradio']"));
        radiobtn_benz.click();
        boolean selected=radiobtn_benz.isSelected();
        Assert.assertTrue(selected,"benz radio button is not selected");
        WebElement radiobtn_bmw=driver.findElement(By.xpath("//input[@id='bmwradio']"));
        boolean bmwselected=radiobtn_bmw.isSelected();
        Assert.assertFalse(bmwselected,"bmw radio button not selected");
        /***Switch to current window***/
        //driver.switchTo().window(currentwindow);
        /***close current window**/
        driver.close();
        /***to close all opened browsers***/
        driver.quit();
    }
}
