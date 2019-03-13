package ferry;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class carTests {

    @Test
    public void testCar(){
        Car car = new Car("red", 5);
        assertEquals("red", car.getColor());
        assertEquals(5, car.getPassengers());
    }
}
