import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {
    Developer developer;

    @Before
    public void before(){
        developer = new Developer("Alex", "AL111F",100000.00);
    }



    @Test
    public void canRaiseSalary(){
        developer.raiseSalary(0.02);
        assertEquals(102000.00, developer.getSalary(),0);
    }

    @Test
    public void canPayBonus(){
        assertEquals(1000, developer.payBonus(),0);
    }


}

