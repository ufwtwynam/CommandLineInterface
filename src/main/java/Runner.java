import javax.script.ScriptContext;
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
//        Scanner scanner = new Scanner(System.in);
//        we need to ask a question here
        if (flights.size() == 0) {
            System.out.println("No available flights Q_Q");
        }   else {
            for (Flight flight : flights) {
                System.out.println(flight.getDestination());
            }
        }
    }

    public void bookPassenger(Flight flight, Passenger passenger){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter passport number please");
        Integer passengerId = scanner.nextInt();

        System.out.println("Enter flight ID please");
        Integer flightId = scanner.nextInt();

        if (passenger.getId() == passengerId && flight.getId() == flightId) {
            flight.addPassengerToFlight(passenger);
        }   else {
            System.out.println("Please enter valid details"); }
    }

    public void cancelFlight(Flight flight){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your flight number");
        Integer flightId = scanner.nextInt();
        if(flightId == flight.getId()){
            flights.remove(flight);
            System.out.println("Your flight has been cancelled");
        } else {
            System.out.println("Please enter valid flight ID");
        }
    }

    public void main(String[] args) {
        boolean running = true;
        while (running){
            System.out.println("Please select an option:");
            System.out.println("1. Add Passenger");
            System.out.println("2. Add a New Flight");
            System.out.println("3. Display Flights");
            System.out.println("4. Book Passengers");
            System.out.println("5. Cancel Flight");
            System.out.println("6. Exit");

            Scanner scanner = new Scanner(System.in);
            Integer choice = scanner.nextInt();

            switch(choice){
                case 1:
                    addNewPassenger();
                    break;
                case 2:
                    addNewFlight();
                    break;
                case 3:
                    displayFlights();
                    break;
                case 4:
                    bookPassenger();
                    break;
                case 5:
                    cancelFlight(); //uh oh
                    break;
                case 6:
                    System.out.println("Goodbye, Thank you for using our app hehe");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }

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
