import java.util.ArrayList;

public class Flight {

    private String destination;
    private int flightId;
    private ArrayList<Passenger> passengers;

    public Flight(String destination, int id) {
        this.destination = destination;
        this.flightId = id;
        this.passengers = new ArrayList<>();
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getId() {
        return flightId;
    }

    public void setId(int id) {
        this.flightId = id;
    }

    public void addNewPassenger(Passenger passenger) {
        this.passengers.add(passenger);
    }
}
