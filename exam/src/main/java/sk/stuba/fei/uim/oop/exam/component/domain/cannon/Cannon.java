package sk.stuba.fei.uim.oop.exam.component.domain.cannon;

import sk.stuba.fei.uim.oop.exam.component.domain.Component;

public abstract class Cannon extends Component {
    private double caliber;
    private double cadence;
    private double spread;

    public Cannon(String name, double caliber, double cadence, double spread) {
        super(name);
        setCadence(cadence);
        setCaliber(caliber);
        setSpread(spread);
    }

    @Override
    public String toString() {
        return super.toString()+ "Cannon{" +
                "caliber=" + caliber +
                ", cadence=" + cadence +
                ", spread=" + spread +
                '}';
    }

    public double getCaliber() {
        return caliber;
    }

    public void setCaliber(double caliber) {
        if(caliber <= 0 ){
            throw new IllegalArgumentException("Wrong argument");
        }
        this.caliber = caliber;
    }

    public double getCadence() {
        return cadence;
    }

    public void setCadence(double cadence) {
        if(cadence <= 0){
            throw new IllegalArgumentException("Wrong argument");
        }
        this.cadence = cadence;
    }

    public double getSpread() {
        return spread;
    }

    public void setSpread(double spread) {
        if(spread <= 0){
            throw new IllegalArgumentException("Wrong argument");
        }
        this.spread = spread;
    }
}
