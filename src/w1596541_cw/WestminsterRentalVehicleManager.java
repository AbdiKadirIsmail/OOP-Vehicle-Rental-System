package w1596541_cw;

import java.io.*;
import java.util.*;

public class WestminsterRentalVehicleManager implements RentalVehicleManager {

    private final ArrayList<Vehicle> vehicleList;
    private final int numObject;
    
    Scanner s = new Scanner(System.in);
    
    public WestminsterRentalVehicleManager(int listLength) {
        this.numObject = listLength;
        vehicleList = new ArrayList<>();
    }

    @Override
    public void addVehicle(Vehicle Veh) {

        if (vehicleList.size() < numObject) {
            vehicleList.add(Veh);
        } else {
            System.out.println("No more space in the list.\n");
        }
    }

    @Override
    public void deleteVehicle() {
        System.out.println("Enter a plate number you wish to remove: ");
        String plate = s.next();
        
        int count = 0;
        
        for (int i = 0; i < vehicleList.size(); i++) {
            if (plate.equals(vehicleList.get(i).getplatenum())){
                vehicleList.remove(i);
            }
        }
        
        if (count == vehicleList.size()){
            System.out.println("This vehicle was unable to be found.\n");
        }
    }

    @Override
    public void printVehicle() {

        for (int i = 0; i < vehicleList.size(); i++) {

            if (vehicleList.get(i).getVehicle().equals("Car")) {
                System.out.println("Vehicle : Car" + vehicleList.get(i).toString());
                System.out.println("");
            }

            if (vehicleList.get(i).getVehicle().equals("Bike")) {
                System.out.println("Vehicle : Bike" + vehicleList.get(i).toString());
                System.out.println("");
            }
        }

    }

    @Override
    public void saveList() {
        try {
            PrintWriter file = new PrintWriter("saved.txt", "UTF-8");  //saving the file/date into a separate document into the "data.txt"
            for (int i = 0; i < vehicleList.size(); i++) {

                if (vehicleList.get(i).getVehicle().equals("Car")) {
                    file.write("Vehicle : Car" + vehicleList.get(i).toString());
                }

                if (vehicleList.get(i).getVehicle().equals("Bike")) {
                    file.write("Vehicle : Bike" + vehicleList.get(i).toString());
                }

            }
            System.out.println("Data saved to 'saved.txt' \n");    //confirmed save                 

        } catch (Throwable de) {
            System.out.println("File not found\n");
        }
    }
    @Override
    public void vehicleGUI() {
        VehicleGUI list = new VehicleGUI(vehicleList);
        list.setVisible(true);
    }
    public boolean runMenu() {

        boolean exit = false;

        System.out.println("Press 1 To Add a Vehicle.");
        System.out.println("Press 2 To Print the list of Vehicles.");
        System.out.println("Press 3 To Delete the desired input.");
        System.out.println("Press 4 To Save the entered Data.");
        System.out.println("Press 5 To Open the GUI.");
        System.out.println("Press 6 To Exit the program.");

        int choice = number();
        
        switch (choice) {
            case 1:
                System.out.println("Press 1 if you want to add a Car\n");
                System.out.println("Press 2 if you want to add a MotorBike\n");

                int choice2 = s.nextInt();
                System.out.println("Insert the make: \n");
                String Make = s.next();
                System.out.println("Insert the plate number: \n");
                String platenum = s.next();

                switch (choice2) {
                    case 1:
                        // designated Car option
                        
                        
                        System.out.println("Insert the Capacity: \n");
                        int Capacity = s.nextInt();
                        System.out.println("Insert the Number of Doors: \n");
                        int Doors = s.nextInt();

                        car Car = new car(Make, platenum, Capacity, Doors);
                        this.addVehicle(Car);
                        break;

                    case 2:
                        // designated MotorBike option

                        System.out.println("Insert the Type: \n");
                        String Type = s.next();
                        System.out.println("Insert the number of Wheels: \n");
                        int Wheels = s.nextInt();

                        MotorBike MotorBike = new MotorBike(Make, platenum, Wheels, Type);
                        this.addVehicle(MotorBike);
                        break;

                }
                break;

            case 2:
                this.printVehicle();
                break; 
                
            case 3:
                this.deleteVehicle();
                break;

            case 4:
                saveList();
                break;
                
            case 5:
                this.vehicleGUI();
                break;

            case 6:
                exit = true;
                break;

        }

        return exit;

    }

    
    //validation rule to prevent mistaken options/choices entered
    public int number(){
        int number;
        while(true){
            try{
                number = s.nextInt();
                if (number <= 6 && number >= 1){
                    return number;
                } else {
                    System.err.println("This is an invalid input. Please try again, choosing an option from 1 to 6: ");
                }
            }catch(InputMismatchException e){
                System.err.println("This is an invalid input. Please try again: ");
                s.next();
            }
        }
    }
    

}
