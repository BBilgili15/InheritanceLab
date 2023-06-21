import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {
    Director director;

    @Before
    public void before(){
        director = new Director("Alex", "AL111F",100000.00, "Finance", 10000.00);
    }



    @Test
    public void canRaiseSalary(){
        director.raiseSalary(0.02);
        assertEquals(102000.00, director.getSalary(),0);
    }

    @Test
    public void canPayBonus(){
        assertEquals(1000, director.payBonus(),0);
    }


}



