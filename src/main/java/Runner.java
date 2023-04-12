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
