package Annotations;

import org.testng.annotations.*;

public class BeforeSuiteAfterSuite {

    @BeforeSuite
    public void BeforeSuiteDemo() {
        System.out.println("Before Suite");
    }

    @AfterSuite
    public void AfterSuiteDemo() {
        System.out.println("After Suite");
    }


    @BeforeMethod
    public void BeforeMethodDemo() {
        System.out.println("Before Method");
    }

    @Test(groups = {"Smoke Testcase"})
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

