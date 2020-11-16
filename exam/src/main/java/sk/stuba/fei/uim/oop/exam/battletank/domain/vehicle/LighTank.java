package sk.stuba.fei.uim.oop.exam.battletank.domain.vehicle;


import sk.stuba.fei.uim.oop.exam.battletank.domain.enumeration.Nationality;
import sk.stuba.fei.uim.oop.exam.component.domain.chassis.WheelChasis;
import sk.stuba.fei.uim.oop.exam.component.domain.tower.TowerWithSmallCannon;

public class LighTank extends Tank {
    private WheelChasis wheelChasis;
    private TowerWithSmallCannon tower;

    public LighTank(String name, Nationality nationality, double price, WheelChasis wheelChasis, TowerWithSmallCannon tower) {
        super(name, nationality, price);
        setTower(tower);
        setWheelChasis(wheelChasis);
    }

    @Override
    public String toString() {
        return super.toString() + "LighTank{" +
                "wheelChasis=" + wheelChasis +
                ", tower=" + tower +
                '}';
    }

    public WheelChasis getWheelChasis() {
        return wheelChasis;
    }

    public void setWheelChasis(WheelChasis wheelChasis) {
        if (wheelChasis == null){
            throw new IllegalArgumentException("Wrong argument");
        }
        this.wheelChasis = wheelChasis;
    }

    public TowerWithSmallCannon getTower() {
        return tower;
    }

    public void setTower(TowerWithSmallCannon tower) {
        if (tower == null)
            throw new IllegalArgumentException("Wrong argument");
        this.tower = tower;
    }
}
