package ferry;

public class Car implements CarInt{

    private String colour;
    private int passengers;

//    @Override
    public Car(String colour, int passengers) {
        this.colour = colour;
        this.passengers = passengers;
    }

    @Override
    public String getColor() {
        return this.colour;
    }

    @Override
    public int getPassengers() {
        return this.passengers;
    }
}
