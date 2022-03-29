package curs10;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;

public  class AssertionExample {

    String one = "Test";
    String two = "Test1";
   // @Test
    public void checkStringAreEqual(){
        if(one.equals(two)){
            System.out.println("Test Passed");
        } else{
            System.out.println("Test Failed");
        }
    }
    @Test
    public void checkStringEquality(){
        Assert.assertEquals(one, two);
    }


}
