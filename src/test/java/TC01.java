import org.testng.Assert;
import org.testng.annotations.*;

public class TC01 {

    @BeforeSuite
    public void beforeSuite()
    {
        System.out.println("beforesuite executed");
    }

    @BeforeClass
    public void beforeClass()
    {
        System.out.println("beforeClass executed");
    }
    @BeforeTest
    public void beforeTest()
    {
        System.out.println("beforeTest executed");
    }

    @BeforeMethod
    public void beforeMethod()
    {
        System.out.println("beforeMethod executed");
    }

    @Test(enabled = false)
    public void tc01()
    {
        System.out.println("tc01 executed");
    }
    @Test(priority = 1,groups = {"Smoke"})
    public void login()
    {

        System.out.println("tc02 executed");
    }
    @Test(priority = 2,dependsOnMethods = "login",groups = {"Smoke"})
    public void homePage()
    {
        //Assert.fail("wantedly failig test case");
        System.out.println("tc03 executed");
    }
    @Test(priority = 3,dependsOnMethods = {"login","homePage"})
    public void validateResults()
    {
        System.out.println("tc04 executed");
    }
    @Test(enabled = false)
    public void validation()
    {
        System.out.println("tc05 executed");
    }

    @AfterSuite
    public void afterSuite()
    {
        System.out.println("aftersuite executed");
    }

    @AfterClass
    public void afterClass()
    {
        System.out.println("afterClass executed");
    }
    @AfterTest
    public void afterTest()
    {
        System.out.println("afterTest executed");
    }

    @AfterMethod
    public void afterMethod()
    {
        System.out.println("afterMethod executed");
    }
}
