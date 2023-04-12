import java.util.ArrayList;

public class Flight {

    private String destination;
    private int id;
    private ArrayList<Passenger> passengers;

    public Flight(String destination, int id) {
        this.destination = destination;
        this.id = id;
        this.passengers = new ArrayList<>();
    }

    public void addNewPassenger(Passenger passenger) {
        this.passengers.add(passenger);
    }
}
