package ferry;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ferryTest {
    @Test
    public void ferryTest(){
        Ferry ferry = new Ferry(20, 40);
        assertEquals(20, ferry.getParking());
        assertEquals(40,ferry.getSeats());

    }

    @Test
    public void ferryBoardMethodTest(){
        Ferry ferry = new Ferry(20, 40);
        Car car1 = new Car("blue", 10);
        assertEquals("accepted", ferry.board(car1));
    }


}
