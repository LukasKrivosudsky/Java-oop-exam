package sk.stuba.fei.uim.oop.exam.battletank.domain.vehicle;

import sk.stuba.fei.uim.oop.exam.battletank.domain.enumeration.Nationality;
import sk.stuba.fei.uim.oop.exam.component.domain.cannon.BigCannon;
import sk.stuba.fei.uim.oop.exam.component.domain.chassis.CrawlerChassis;
import sk.stuba.fei.uim.oop.exam.component.domain.tower.TowerWithBigCannon;

public class Artillery extends Tank {
    private CrawlerChassis crawlerChassis;
    private BigCannon bigCannon;

    public Artillery(String name, Nationality nationality, double price, CrawlerChassis crawlerChassis, BigCannon bigCannon) {
        super(name, nationality, price);
        setCrawlerChassis(crawlerChassis);
        setBigCannon(bigCannon);
    }

    @Override
    public String toString() {
        return super.toString()+ "Artillery{" +
                "crawlerChassis=" + crawlerChassis +
                ", bigCannon=" + bigCannon +
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

    public BigCannon getTowerWithBigCannon() {
        return bigCannon;
    }

    public void setBigCannon(BigCannon bigCannon) {
        if (bigCannon == null){
            throw new IllegalArgumentException("Wrong argument");
        }
        this.bigCannon = bigCannon;
    }
}
