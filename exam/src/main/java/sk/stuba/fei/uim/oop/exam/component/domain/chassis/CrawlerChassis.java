package sk.stuba.fei.uim.oop.exam.component.domain.chassis;

public class CrawlerChassis extends Chassis {
    private double chassisWidth;

    public CrawlerChassis(String name, double carryingCapacity, double rotationSpeed, double maxSpeed, double chassisWidth) {
        super(name, carryingCapacity, rotationSpeed, maxSpeed);
        setChassisWidth(chassisWidth);
    }

    public double getChassisWidth() {
        return chassisWidth;
    }

    @Override
    public String toString() {
        return super.toString()+"CrawlerChassis{" +
                "chassisWidth=" + chassisWidth +
                '}';
    }

    public void setChassisWidth(double chassisWidth) {
        if(chassisWidth <= 0){
            throw new IllegalArgumentException("Wrong argument");
        }
        this.chassisWidth = chassisWidth;
    }
}
