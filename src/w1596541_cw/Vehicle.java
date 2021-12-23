package w1596541_cw;

public abstract class Vehicle {
    //instance variables

    protected String platenum;
    protected String Make;

    //constructor below 
    public Vehicle(String Make, String platenum) {
        this.Make = Make;
        this.platenum = platenum;
    }

    //set and get methods for variables below
    public void setplatenum(String platenum) {
        this.platenum = platenum;
    }

    public String getplatenum() {
        return platenum;
    }

    public void setMake(String Make) {
        this.Make = Make;
    }

    public String getMake() {
        return Make;
    }

    @Override
    public String toString() {
        return "Make: " + getMake() + ", Plate Number: " + getplatenum() + ", Capacity:" + getCapacity() + ", Doors:" + getDoors() + ", Wheels: " + getWheels() + ", Type: " + getType();
    }

    public abstract String getVehicle();

    public abstract int getCapacity();

    public abstract int getDoors();

    public abstract int getWheels();

    public abstract String getType();

}
