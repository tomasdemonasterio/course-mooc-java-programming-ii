package FlightControl.ui;

import FlightControl.logic.FlightControl;

/**
 *
 * @author set
 */
import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;
    private FlightControl fc;

    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
        this.fc = new FlightControl();
    }

    public void startAssetControl() {
        System.out.println("Airport Asset Control");
        System.out.println("--------------------");
        System.out.println();
        while (true) {
            System.out.print("Choose an action:\n[1] Add an airplane\n[2] Add a flight\n[x] Exit Airport Asset Control\n");
            String command = scanner.nextLine();
            if (command.equals("x")) {
                break;
            }
            if (command.equals("1")) {
                this.addPlane();
            }
            if (command.equals("2")) {
                this.addFlight();
            }
        }
    }

    public void startFlightControl() {
        System.out.println("Flight Control");
        while (true) {
            System.out.print("[1] Print airplanes\n[2] Print flights\n[3] Print airplane details\n[x] Quit\n");
            String command = scanner.nextLine();
            if (command.equals("x")) {
                break;
            }
            if (command.equals("1")) {
                this.printAirplanes();
            }
            if (command.equals("2")) {
                
                this.printFlights();
            }
            if (command.equals("3")) {
                this.printAirplaneDetails();
            }
        }
    }

    public void addPlane() {
        System.out.println("Give the airplane id:");
        String ID = scanner.nextLine();
        System.out.println("Give the airplane capacity:");
        int capacity = Integer.valueOf(scanner.nextLine());
        this.fc.addAirplane(ID, capacity);
    }

    public void addFlight() {
        System.out.println("Give the airplane id:");
        String ID = scanner.nextLine();
        System.out.println("Give the departure airport id: ");
        String departure = scanner.nextLine();
        System.out.println("Give the target airport id: ");
        String target = scanner.nextLine();
        fc.addFlight(ID, departure, target);
    }

    public void printAirplanes() {
        fc.printPlanes();
    }

    public void printFlights() {
        fc.printFlights();
    }

    public void printAirplaneDetails() {
        System.out.println("Give the airplane id:");
        String ID = scanner.nextLine();
        fc.printPlaneByID(ID);
    }

}