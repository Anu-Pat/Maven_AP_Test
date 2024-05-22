package Priority;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.security.KeyStore;

public class DependsOnMethodExample {

    @Test
    public void VerifyLogin() {
        Assert.assertTrue (false);
        System.out.println("Verify Login");
    }

    @Test (dependsOnMethods = "VerifyLogin" )
    public void HomePage() {
        System.out.println("Home Page");
    }

    @Test
    public void Dashboard() {
        System.out.println("Dashboard");
    }
}
