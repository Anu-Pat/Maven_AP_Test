package Priority;

import org.testng.annotations.Test;

public class PriorityExample {

    @Test (priority = 1)
    public void PriorityDemo_A() {
        System.out.println(" PriorityDemo_A");
    }

    @Test (priority = 2)
    public void PriorityDemo_X() {
        System.out.println(" PriorityDemo_X");
    }

    @Test (priority = 3)
    public void PriorityDemo_B() {
        System.out.println(" PriorityDemo_B");
    }

    @Test (priority = 4)
    public void PriorityDemo_Y() {
        System.out.println(" PriorityDemo_Y");
    }

    @Test (priority = 5)
    public void PriorityDemo_C() {
        System.out.println(" PriorityDemo_C");
    }

    @Test (priority = 6)
    public void PriorityDemo_Z() {
        System.out.println(" PriorityDemo_Z");
    }
}
