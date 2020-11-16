package sk.stuba.fei.uim.oop.exam.component.domain.cannon;

public class BigCannon extends Cannon {
    private double explosionRadius;


    public BigCannon(String name, double caliber, double cadence, double spread, double explosionRadius) {
        super(name, caliber, cadence, spread);
       setExplosionRadius(explosionRadius);
    }

    @Override
    public String toString() {
        return super.toString()+"BigCannon{" +
                "explosionRadius=" + explosionRadius +
                '}';
    }

    public double getExplosionRadius() {
        return explosionRadius;
    }

    public void setExplosionRadius(double explosionRadius) {
        if (explosionRadius<= 0 ){
                throw new IllegalArgumentException("Wrong argument");
        }
        this.explosionRadius = explosionRadius;
    }
}
