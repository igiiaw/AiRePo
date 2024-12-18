class Flight {
    private String flightNumber;
    private String departure;
    private String destination;

    public Flight(String flightNumber, String departure, String destination) {
        this.flightNumber = flightNumber;
        this.departure = departure;
        this.destination = destination;
    }

    public void displayFlight() {
        System.out.println("Flight: " + flightNumber + " | From: " + departure + " | To: " + destination);
    }
}

class Passenger {
    private String name;
    private int age;

    public Passenger(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayPassenger() {
        System.out.println("Passenger: " + name + " | Age: " + age);
    }
}

class Booking {
    private Flight flight;
    private Passenger passenger;

    public Booking(Flight flight, Passenger passenger) {
        this.flight = flight;
        this.passenger = passenger;
    }

    public void displayBooking() {
        System.out.println("=== Booking Details ===");
        passenger.displayPassenger();
        flight.displayFlight();
        System.out.println();
    }
}

public class AirlineReservationPortal {
    public static void main(String[] args) {
        // Create Flights
        Flight flight1 = new Flight("FL123", "New York", "London");
        Flight flight2 = new Flight("FL456", "Tokyo", "Paris");

        // Create Passengers
        Passenger passenger1 = new Passenger("John Doe", 26);
        Passenger passenger2 = new Passenger("Jane Smith", 25);

        // Create Bookings
        Booking booking1 = new Booking(flight1, passenger1);
        Booking booking2 = new Booking(flight2, passenger2);

        // Display Bookings
        booking1.displayBooking();
        booking2.displayBooking();
    }
}
