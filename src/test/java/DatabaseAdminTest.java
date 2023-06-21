import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {
    DatabaseAdmin databaseAdmin;

    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("Alex", "AL111F",100000.00);
    }



    @Test
    public void canRaiseSalary(){
        databaseAdmin.raiseSalary(0.02);
        assertEquals(102000.00, databaseAdmin.getSalary(),0);
    }

    @Test
    public void canPayBonus(){
        assertEquals(1000, databaseAdmin.payBonus(),0);
    }


}


