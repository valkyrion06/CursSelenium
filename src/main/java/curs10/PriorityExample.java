package curs10;

import org.testng.annotations.Test;

public class PriorityExample {
    @Test(priority = 1)
    public void one(){
        System.out.println("First");
    }

    @Test(priority = 2)
    public void two(){
        System.out.println("Second");
    }

    @Test(priority = 3)
    public void three(){
        System.out.println("Third");
    }

    @Test
    public void abc(){
        System.out.println("ABC");
    }

    //Ordine alfabetica
    //Metode fara prioritate > metode cu prioritate

}
