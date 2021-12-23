package w1596541_cw;

public class MotorBike extends Vehicle {

   //variables identified and specified.
    protected String Type;
    protected int Wheels;

   //constructors below for variables identified above 
    public MotorBike(String Make, String platenum, int Wheels, String Type) {
        super(Make, platenum);
        this.Wheels = Wheels;
        this.Type = Type;

    }

    //get and set methods below
    
    public void setWheels(int Wheels) {
        this.Wheels = Wheels;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    public int getWheels() {
        return Wheels;
    }

    public String getType() {
        return Type;
    }

    @Override
    public String getVehicle() {
        return "Bike";
    }

    @Override
    public int getCapacity() {
        return 0;
    }

    @Override
    public int getDoors() {
        return 0;
    }
}
