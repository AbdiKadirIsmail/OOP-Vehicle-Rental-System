/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w1596541_cw;

/**
 *
 * @author MoradOriginal
 */
public interface RentalVehicleManager {
    public abstract void addVehicle(Vehicle vehicle);
    public abstract void printVehicle();
    public abstract boolean runMenu();
    public abstract void deleteVehicle();
    public abstract void vehicleGUI();
    public abstract void saveList();
}
