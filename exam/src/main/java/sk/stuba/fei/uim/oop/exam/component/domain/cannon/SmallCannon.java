package sk.stuba.fei.uim.oop.exam.component.domain.cannon;

public class SmallCannon extends Cannon {
    private int numberOfAmmo;

    public SmallCannon(String name, double caliber, double cadence, double spread, int numberOfAmmo) {
        super(name, caliber, cadence, spread);
        setNumberOfAmmo(numberOfAmmo);
    }

    public int getNumberOfAmmo() {
        return numberOfAmmo;
    }

    @Override
    public String toString() {
        return super.toString()+ "SmallCannon{" +
                "numberOfAmmo=" + numberOfAmmo +
                '}';
    }

    public void setNumberOfAmmo(int numberOfAmmo) {
        if(numberOfAmmo <= 0){
            throw new IllegalArgumentException("Wrong argument");
        }
        this.numberOfAmmo = numberOfAmmo;
    }
}
