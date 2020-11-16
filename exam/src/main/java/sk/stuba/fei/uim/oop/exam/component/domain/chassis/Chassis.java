package sk.stuba.fei.uim.oop.exam.component.domain.chassis;

import sk.stuba.fei.uim.oop.exam.component.domain.Component;

public abstract class Chassis extends Component {
    private double carryingCapacity;
    private double rotationSpeed;
    private double maxSpeed;

    public Chassis(String name, double carryingCapacity, double rotationSpeed, double maxSpeed) {
        super(name);
        setCarryingCapacity(carryingCapacity);
        setMaxSpeed(maxSpeed);
        setName(name);
        setRotationSpeed(rotationSpeed);
    }

    @Override
    public String toString() {
        return super.toString()+"Chassis{" +
                "carryingCapacity=" + carryingCapacity +
                ", rotationSpeed=" + rotationSpeed +
                ", maxSpeed=" + maxSpeed +
                '}';
    }

    public double getCarryingCapacity() {
        return carryingCapacity;
    }

    public void setCarryingCapacity(double carryingCapacity) {
        if(carryingCapacity <=0 ){
            throw new IllegalArgumentException("Wrong argument");
        }
        this.carryingCapacity = carryingCapacity;
    }

    public double getRotationSpeed() {
        return rotationSpeed;
    }

    public void setRotationSpeed(double rotationSpeed) {
        if(rotationSpeed <= 0){
            throw new IllegalArgumentException("Wrong argument");
        }
        this.rotationSpeed = rotationSpeed;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        if(maxSpeed <= 0){
            throw new IllegalArgumentException("Wrong argument");
        }
        this.maxSpeed = maxSpeed;
    }
}
