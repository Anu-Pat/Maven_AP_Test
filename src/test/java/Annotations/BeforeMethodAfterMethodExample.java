package Annotations;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeMethodAfterMethodExample {

    @BeforeMethod
    public void BeforeMethodDemo() {
        System.out.println("Before Method");
    }

    @Test (groups = {"Smoke Testcase"})
    public void Testcase1() {
        System.out.println("TestCase 1");
    }

    @Test
        public void Testcase2() {
        System.out.println("TestCase 2");
    }

    @Test (groups = {"Smoke Testcase"})
    public void Testcase3() {
        System.out.println("TestCase 3");
    }

    @AfterMethod
        public void AfterMethodDemo(){
        System.out.println("After Method");
    }
}
