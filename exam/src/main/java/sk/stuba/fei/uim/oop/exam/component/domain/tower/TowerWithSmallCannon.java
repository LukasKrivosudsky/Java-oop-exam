package sk.stuba.fei.uim.oop.exam.component.domain.tower;


import sk.stuba.fei.uim.oop.exam.component.domain.cannon.SmallCannon;

public class TowerWithSmallCannon extends Tower {
    private SmallCannon smallCannon;

    public TowerWithSmallCannon(String name, double rotationSpeed, double overSight, SmallCannon smallCannon) {
        super(rotationSpeed, overSight, name);
        setSmallCannon(smallCannon);
    }


    @Override
    public String toString() {
        return super.toString()+ "TowerWithSmallCannon{" +
                "smallCannon=" + smallCannon +
                '}';
    }

    public SmallCannon getSmallCannon() {
        return smallCannon;
    }

    public void setSmallCannon(SmallCannon smallCannon) {
        if(smallCannon == null){
            throw new IllegalArgumentException("Wrong argument");
        }
        this.smallCannon = smallCannon;
    }
}
