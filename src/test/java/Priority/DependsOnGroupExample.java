package Priority;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnGroupExample {

    @Test (groups = {"smoke"})
    public void VerifySignInDemo() {
        Assert.assertTrue(false);
        System.out.println("SignIn");
    }

    @Test (dependsOnGroups = {"smoke"})
    public void VerifyNewSignInDemo() {
        System.out.println("New SignIn");
    }

    @Test
    public void VerifyNewDashboardDemo() {
        System.out.println("New Dashboard");
    }

}
