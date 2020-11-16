package sk.stuba.fei.uim.oop.exam.battletank.domain.vehicle;

import sk.stuba.fei.uim.oop.exam.component.domain.chassis.CrawlerChassis;
import sk.stuba.fei.uim.oop.exam.battletank.domain.enumeration.Nationality;
import sk.stuba.fei.uim.oop.exam.component.domain.tower.Tower;
import sk.stuba.fei.uim.oop.exam.component.domain.tower.TowerWithBigCannon;

public class HeavyTank extends Tank {
    private CrawlerChassis crawlerChassis;
    private TowerWithBigCannon tower;

    public HeavyTank(String name, Nationality nationality, double price, CrawlerChassis crawlerChassis, TowerWithBigCannon tower) {
        super(name, nationality, price);
        setCrawlerChassis(crawlerChassis);
        setTower(tower);
    }

    @Override
    public String toString() {
        return super.toString()+ "HeavyTank{" +
                "crawlerChassis=" + crawlerChassis +
                ", tower=" + tower +
                '}';
    }

    public CrawlerChassis getCrawlerChassis() {
        return crawlerChassis;
    }

    public void setCrawlerChassis(CrawlerChassis crawlerChassis) {
        if (crawlerChassis == null){
            throw new IllegalArgumentException("Wrong argument");
        }
        this.crawlerChassis = crawlerChassis;
    }

    public Tower getTower() {
        return tower;
    }

    public void setTower(TowerWithBigCannon tower) {
        if (tower == null){
            throw new IllegalArgumentException("Wrong argument");
        }
        this.tower = tower;
    }
}
