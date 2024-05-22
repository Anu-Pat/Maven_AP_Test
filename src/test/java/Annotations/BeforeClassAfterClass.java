package Annotations;

import org.testng.annotations.*;

import java.security.PublicKey;

public class BeforeClassAfterClass {

    @BeforeClass
    public void BeforeClassDemo(){
        System.out.println("Before Class");
    }

    @AfterClass
    public void AfterClassDemo(){
        System.out.println("After Class");
    }

    @BeforeMethod
    public void BeforeMethodDemo() {
        System.out.println("Before Method");
    }

    @Test
    public void Testcase1() {
        System.out.println("TestCase 1");
    }

    @Test
    public void Testcase2() {
        System.out.println("TestCase 2");
    }

    @Test
    public void Testcase3() {
        System.out.println("TestCase 3");
    }

    @AfterMethod
    public void AfterMethodDemo() {
        System.out.println("After Method");
    }
}