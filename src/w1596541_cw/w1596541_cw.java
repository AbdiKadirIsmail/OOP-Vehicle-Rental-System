
package w1596541_cw;
 

public class w1596541_cw {
    
    public static void main(String [] args){
        RentalVehicleManager sys = new WestminsterRentalVehicleManager(50);
        boolean exit = false;
        
        while(!exit){
            sys.runMenu();
        }
    }
}


