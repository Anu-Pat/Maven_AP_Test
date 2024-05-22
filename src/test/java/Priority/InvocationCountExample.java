package Priority;

import org.testng.annotations.Test;

public class InvocationCountExample {

    @Test (invocationCount = 7)
    public void invocationCountDeo(){
        System.out.println("Invocation Count Demo");
    }
}
