package curs10;

import org.testng.annotations.*;

public class BeforeAfterExample {

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("Before Suite");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("Before Class");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Before Method");
    }

    @Test
    public void testOne(){
        System.out.println("Test one");
    }

    @Test
    public void testTwo(){
        System.out.println("Test two");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("After Suite");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("After Class");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("After Method");
    }

}
