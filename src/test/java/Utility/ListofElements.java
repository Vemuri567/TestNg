package Utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

public class ListofElements
{
    WebDriver driver;
    String baseurl;
    @BeforeTest
    public void setup() throws InterruptedException {
        driver=new ChromeDriver();
        baseurl="https://www.letskodeit.com/practice";
        driver.manage().window().maximize();
        driver.get(baseurl);
    }
    @Test
    public void test(){
        boolean flag=false;
        List<WebElement> radiobuttons=driver.findElements(By.xpath("//input[contains(@type,\"radio\") and contains(@name,\"cars\")]"));
        int a=radiobuttons.size();
        for (int i=0;i<a;i++){
            radiobuttons.get(i).isSelected();

            if (!flag){
                radiobuttons.get(i).click();
            }

        }
    }
    @AfterTest
    public void tear(){
        driver.quit();
    }
}
