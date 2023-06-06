package Utility;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertions {

    @Test(groups = {"Smoke"})
    public void equalVaidation() {
        String actual="Naveen";
        String expected="Nikhil";
        Assert.assertEquals(actual,expected);
    }
    @Test(groups = {"Smoke"})
    public void containsValidations() {
        String actual="Naveen";
        String expected="VemuriNaveen";
        Assert.assertTrue(expected.contains(actual));
    }
    @Test(groups = {"Regression"})
    public void containsFalseValidations() {
        String actual="Naven";
        String expected="VemuriNaveen";
        Assert.assertFalse(expected.contains(actual));
    }

    @Test(groups = {"Regression"})
    public void containsFalseValidationsWithMessage() {
        String actual="Naveen";
        String expected="VemuriNaveen";
        //Assert.fail("actual and expected not matched");
        Assert.assertFalse(expected.contains(actual),"Actual value:"+actual+":is not matched with:"+expected);

    }
}
