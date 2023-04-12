import java.util.ArrayList;
import java.util.Scanner;

public class Runner {

    private ArrayList<Passenger> passengers = new ArrayList<>();
    private ArrayList<Flight> flights = new ArrayList<>();

    public void addNewPassenger(){
        Scanner scanner = new Scanner(System.in);
        String passengerName = scanner.nextLine();
        System.out.println("Please enter your name");

        Integer passengerNumber = scanner.nextInt();
        System.out.println("Please enter your phone number");

        String passengerEmail = scanner.nextLine();
        System.out.println("Please enter your email address");

        Integer passportNumber = scanner.nextInt();
        System.out.println("Please enter your passport number");

        Passenger passenger = new Passenger(passengerName, passengerNumber, passengerEmail, passportNumber);
        passengers.add(passenger);
    }

    public void addNewFlight(){
        Scanner scanner = new Scanner(System.in);
        String destination = scanner.nextLine();
        System.out.println("Where would you like to fly to? (>^_^)>");
        Integer flightId = scanner.nextInt();
        System.out.println("What is your flight number <(^_^<)");

        Flight flight = new Flight(destination, flightId);
        flights.add(flight);
    }

    public void displayFlights(){
        Scanner scanner = new Scanner(System.in);
        if (flights.size() == 0) {
            System.out.println("No available flights Q_Q");
        }   else {
            for (Flight flight : flights) {
                System.out.println(flight.getDestination());
            }
        }
    }
    public static void main(String[] args) {

//        TODO: ADD A NEW FLIGHT
//        ask passenger what flight they want to be, has to follow format of flight constructor
//        this should create the flight object?

//        TODO: DISPLAY ALL AVAILABLE FLIGHT
//        viewing the arrayList? we will come to this later.

//        TODO: ADD A NEW PASSENGER
//        adding the passenger to the app aka creating a passenger object
//        scanner to read the information
//        variable to store passenger information

//        TODO: BOOK A PASSENGER ONTO A FLIGHT
//        passenger object is added to a flight (method exists under flight)

//        TODO: CANCEL A FLIGHT
//        airline cancels the flight not the passenger
    }
}
