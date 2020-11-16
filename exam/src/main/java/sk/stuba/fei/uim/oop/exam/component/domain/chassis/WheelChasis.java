package sk.stuba.fei.uim.oop.exam.component.domain.chassis;

public class WheelChasis extends Chassis {
    private int numberOfWheels;

    public WheelChasis(String name, double carryingCapacity, double rotationSpeed, double maxSpeed, int numberOfWheels) {
        super(name, carryingCapacity, rotationSpeed, maxSpeed);
        setNumberOfWheels(numberOfWheels);
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }


    @Override
    public String toString() {
        return super.toString()+"WheelChasis{" +
                "numberOfWheels=" + numberOfWheels +
                '}';
    }

    public void setNumberOfWheels(int numberOfWheels) {
        if(numberOfWheels <= 0){
            throw new IllegalArgumentException("Wrong argument");
        }
        this.numberOfWheels = numberOfWheels;
    }
}
