package sk.stuba.fei.uim.oop.exam.component.domain.tower;

import sk.stuba.fei.uim.oop.exam.component.domain.Component;

public abstract class Tower extends Component {
    private double rotationSpeed;
    private double overSight;

    public Tower(double rotationSpeed, double overSight, String name) {
        super(name);
        setOverSight(overSight);
        setRotationSpeed(rotationSpeed);
    }

    @Override
    public String toString() {
        return super.toString()+ "Tower{" +
                "rotationSpeed=" + rotationSpeed +
                ", overSight=" + overSight +
                '}' ;
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

    public double getOverSight() {
        return overSight;
    }

    public void setOverSight(double overSight) {
        if(overSight <= 0){
            throw new IllegalArgumentException("Wrong argument");
        }
        this.overSight = overSight;
    }
}
