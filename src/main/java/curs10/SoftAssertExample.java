package curs10;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertExample {

    String one = "Test";
    String two = "Test1";

    @Test
    public void checkIfEqual(){
        SoftAssert softAssert = new SoftAssert();
        System.out.println("Start here");
        softAssert.assertEquals(one,two);
        System.out.println("End here");
        softAssert.assertAll();
    }

}
