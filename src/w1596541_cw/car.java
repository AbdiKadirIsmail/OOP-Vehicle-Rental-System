package w1596541_cw;

public class car extends Vehicle {
//variables identified 
    protected int Doors;
    protected int Capacity;
    
//constructors below
    public car(String Make, String PlateNum, int Capacity, int Doors) {
        super(Make, PlateNum);
        this.Capacity = Capacity;
        this.Doors = Doors;
    }
    
//get and set methods below 
    public void setDoors(int Doors) {
        this.Doors = Doors;
    }

    @Override
    public int getDoors() {
        return Doors;
    }

    @Override
    public int getCapacity() {
        return Capacity;
    }

    @Override
    public String getVehicle() {
        return "Car";
    }

    @Override
    public int getWheels() {
        return 4;
    }

    @Override
    public String getType() {
        return null;
    }
}
