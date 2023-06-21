import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {
    Manager manager;

    @Before
    public void before(){
        manager = new Manager("Alex", "AL111F",100000.00,"Finance");
    }

    @Test
    public void canGetDeptName(){
        assertEquals("Finance", manager.getDeptName());
    }

    @Test
    public void canRaiseSalary(){
        manager.raiseSalary(0.02);
        assertEquals(102000.00, manager.getSalary(),0);
    }

    @Test
    public void canPayBonus(){
        assertEquals(1000, manager.payBonus(),0);
    }


}
