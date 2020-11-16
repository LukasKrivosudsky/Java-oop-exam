package sk.stuba.fei.uim.oop.exam.component.domain.tower;


import sk.stuba.fei.uim.oop.exam.component.domain.cannon.BigCannon;

public class TowerWithBigCannon extends Tower {
    private BigCannon bigCannon;

    public TowerWithBigCannon(String name, double rotationSpeed, double overSight, BigCannon bigCannon) {
        super(rotationSpeed, overSight, name);
        setBigCannon( bigCannon);
    }

    @Override
    public String toString() {
        return super.toString()+"TowerWithBigCannon{" +
                "bigCannon=" + bigCannon +
                '}';
    }

    public BigCannon getBigCannon() {
        return bigCannon;
    }

    public void setBigCannon(BigCannon bigCannon) {
        if(bigCannon == null){
            throw new IllegalArgumentException("Wrong argument");
        }
        this.bigCannon = bigCannon;
    }
}
