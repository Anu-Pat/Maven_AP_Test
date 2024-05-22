package Annotations;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BeforeTestAfterTest2 {
    @BeforeTest
    public void BeforeTestDemo(){
        System.out.println("Before Test Demo for BeforeAfterTestExample class");
    }

    @AfterTest
    public void AfterTestDemo(){
        System.out.println("After Test Demo BeforeAfterTestExample class");
    }

    @Test
    public void verifyTestCases_1(){
        System.out.println("Verify test cases 1");
    }

    @Test
    public void verifyTestCases_2(){
        System.out.println("Verify test cases 2");
    }

}

