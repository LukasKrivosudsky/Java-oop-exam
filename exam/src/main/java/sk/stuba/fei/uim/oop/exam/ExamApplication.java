package sk.stuba.fei.uim.oop.exam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import sk.stuba.fei.uim.oop.exam.battletank.domain.enumeration.Nationality;
import sk.stuba.fei.uim.oop.exam.battletank.domain.vehicle.Artillery;
import sk.stuba.fei.uim.oop.exam.battletank.domain.vehicle.HeavyTank;
import sk.stuba.fei.uim.oop.exam.battletank.domain.vehicle.LighTank;
import sk.stuba.fei.uim.oop.exam.battletank.domain.vehicle.Tank;
import sk.stuba.fei.uim.oop.exam.battletank.service.TankService;
import sk.stuba.fei.uim.oop.exam.component.domain.cannon.BigCannon;
import sk.stuba.fei.uim.oop.exam.component.domain.cannon.SmallCannon;
import sk.stuba.fei.uim.oop.exam.component.domain.chassis.CrawlerChassis;
import sk.stuba.fei.uim.oop.exam.component.domain.chassis.WheelChasis;
import sk.stuba.fei.uim.oop.exam.component.domain.tower.Tower;
import sk.stuba.fei.uim.oop.exam.component.domain.tower.TowerWithBigCannon;
import sk.stuba.fei.uim.oop.exam.component.domain.tower.TowerWithSmallCannon;
import sk.stuba.fei.uim.oop.exam.component.service.ComponentService;

import java.time.LocalDate;

@SpringBootApplication
public class ExamApplication implements CommandLineRunner {
    private final ComponentService componentService;
    private final TankService tankService;


    public ExamApplication(TankService tankService, ComponentService componentService){
        this.tankService = tankService;
        this.componentService = componentService;
    }

    public static void main(String[] args) {
        SpringApplication.run(ExamApplication.class, args);
    }


    @Override
    public void run(String... args){
        //Vytvorenie pozadovanych komponentov a tankov
        CrawlerChassis crawlerChassis = new CrawlerChassis("IS-3M",126,56165,250,50);
        BigCannon bigCannon = new BigCannon("122mm BL-9",122,150,5000,150);
        TowerWithBigCannon towerWithBigCannon = new TowerWithBigCannon("IS-3",150,1500,bigCannon);
        HeavyTank heavyTank = new HeavyTank("IS-3",Nationality.ZSSR,1500000,crawlerChassis,towerWithBigCannon);
        Artillery artillery = new Artillery("NICITEL",Nationality.Germany,1515151515,crawlerChassis,bigCannon);


        tankService.addTank(heavyTank);
        tankService.addTank(artillery);
        componentService.addComponent(crawlerChassis);
        componentService.addComponent(bigCannon);
        componentService.addComponent(towerWithBigCannon);

    }


}
