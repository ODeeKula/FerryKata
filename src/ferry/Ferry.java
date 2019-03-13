package ferry;

public class Ferry implements FerryInt{
    private int maxParking;
    private int maxSeats;
    private int currentSeats = 0;
    private int currentParking = 0;

    public Ferry(int parkingSpace, int seatingSpace){
        this.maxParking = parkingSpace;
        this.maxSeats = seatingSpace;
    }

    @Override
    public String board(Car car) {
        if(currentParking < maxParking){
            if(currentSeats < maxSeats){
                currentSeats += car.getPassengers();
                currentParking ++;
                return "accepted";
            }
            else{
                return "rejected";
            }
        }

        else{
            return "rejected";
        }
    }

    @Override
    public int getParking() {
        return maxParking;

    }

    @Override
    public int getSeats() {
        return maxSeats;
    }

    @Override
    public int getUsedParking() {
        return currentParking;
    }

    @Override
    public int getUsedSeats() {
        return currentSeats;
    }
}
